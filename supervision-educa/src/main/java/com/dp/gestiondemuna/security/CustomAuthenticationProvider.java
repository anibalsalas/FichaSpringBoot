package com.dp.gestiondemuna.security;

import com.dp.gestiondemuna.entity.Demuna_EstablecimientosEntity;
import com.dp.gestiondemuna.entity.Demuna_EstablecimientosEntity2;
import com.dp.gestiondemuna.repository.Demuna_EstablecimientosRepository;
import com.dp.gestiondemuna.repository.Demuna_EstablecimientosRepository2;
import com.dp.gestiondemuna.service.UsuarioService;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private static final Logger logger = LogManager.getLogger(CustomAuthenticationProvider.class);

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UsuarioService usuarioService;
    
    @Autowired
    Demuna_EstablecimientosRepository demuna_stablecimientosRepository;
    
    @Autowired
    Demuna_EstablecimientosRepository2 demuna_stablecimientosRepository2;
    
    @Autowired
    HttpSession session;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

        String username = authentication.getName();
        String password = String.valueOf(authentication.getCredentials());
        String tipo_usuario = attr.getRequest().getParameter("tipo_usuario");
        String cod_unico = attr.getRequest().getParameter("cod_unico");
        String tipo_ficha = attr.getRequest().getParameter("tipo_ficha");

        UserDetails userDetails = null;

        if (tipo_usuario.equals("A") || tipo_usuario.equals("C")) { //validar usuario dp

            userDetails = userDetailsService.loadUserByUsername(username.trim());

            if (userDetails != null) {

                byte[] digest = null;
                byte[] buffer = password.getBytes();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                    messageDigest.reset();
                    messageDigest.update(buffer);
                    digest = messageDigest.digest();
                } catch (NoSuchAlgorithmException ex) {
                    System.out.println("Error creando Digest : Algoritmo SHA-512");
                }

                if (!toHexadecimal(digest).equals(userDetails.getPassword())) {
                    throw new BadCredentialsException("Contraseña erronea.");
                } else {

                    if (tipo_usuario.equals("A")) {//validar usuario dp

                        if (tipo_ficha.equals("1")) {//Buscar en Ficha 1

                            Demuna_EstablecimientosEntity ficha1 = demuna_stablecimientosRepository.buscarByCodEESSficha1(cod_unico.trim());

                            if (ficha1 == null) {
                                throw new UsernameNotFoundException("¡Ficha1 no existe!");
                            }

                        } else if (tipo_ficha.equals("2")) {

                            Demuna_EstablecimientosEntity2 ficha2 = demuna_stablecimientosRepository2.buscarByCodEESSficha2(cod_unico.trim());

                            if (ficha2 == null) {
                                throw new UsernameNotFoundException("¡Ficha2 no existe!");
                            }

                        }

                    }

                    session.setAttribute("session_tipo_usuario", tipo_usuario);
                    session.setAttribute("session_cod_unico", cod_unico);
                    session.setAttribute("session_tipo_ficha", tipo_ficha);

                    UsernamePasswordAuthenticationToken authenticationToken
                            = new UsernamePasswordAuthenticationToken(username, password, userDetails.getAuthorities());
                    return authenticationToken;

                }
            }

        } else {//validar usuario externo
             userDetails = loadUserExterno(username.trim(), tipo_ficha);

            if (userDetails != null) {
                if (!password.trim().equals(userDetails.getPassword().trim())) {
                    throw new BadCredentialsException("Contraseña erronea.");
                } else {

                    session.setAttribute("session_tipo_usuario", tipo_usuario);
                    session.setAttribute("session_cod_unico", cod_unico);
                    session.setAttribute("session_tipo_ficha", tipo_ficha);

                    UsernamePasswordAuthenticationToken authenticationToken
                            = new UsernamePasswordAuthenticationToken(username.trim(), password.trim(), userDetails.getAuthorities());
                    return authenticationToken;
                }
            }
        }

        throw new BadCredentialsException("Error!!");
    }

    @Override
    public boolean supports(Class<?> authentication
    ) {
        //return UsernamePasswordAuthenticationToken.class.equals(authenticationType);
        return authentication.equals(UsernamePasswordAuthenticationToken.class);

    }

    private static String toHexadecimal(byte[] digest) {
        String hash = "";
        for (byte aux : digest) {
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) {
                hash += "0";
            }
            hash += Integer.toHexString(b);
        }
        return hash;
    }

    public static boolean isNumerico(String s) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(s, pos);
        return s.length() == pos.getIndex();
    }

    public UserDetails loadUserExterno(String username) throws UsernameNotFoundException {

        List<GrantedAuthority> authList = null;
        User user = null;
        Demuna_EstablecimientosEntity autoridad = null;

        autoridad = usuarioService.buscarAutoridad(username.trim());

        if (autoridad == null) {
            throw new UsernameNotFoundException("¡Demuna no existe!");
        } else {
            authList = new ArrayList<GrantedAuthority>();

            user = new User(autoridad.getCod_unico().trim(), autoridad.getCod_unico().trim(), authList);
        }

        return user;
    }
    
    
     public UserDetails loadUserExterno(String username, String tipo_ficha) throws UsernameNotFoundException {

        List<GrantedAuthority> authList = null;
        User user = null;
        Demuna_EstablecimientosEntity ficha1 = null;
        Demuna_EstablecimientosEntity2 ficha2 = null;

        if (tipo_ficha.equals("1")) {//Buscar en ollas comunes

            ficha1 = demuna_stablecimientosRepository.buscarByCodEESSficha1(username.trim());

            if (ficha1 == null) {
                throw new UsernameNotFoundException("¡Ficha1 no existe!");
            }

        } else if (tipo_ficha.equals("2")) {//Buscar en comedores populares
            ficha2 = demuna_stablecimientosRepository2.buscarByCodEESSficha2(username.trim());

            if (ficha2 == null) {
                throw new UsernameNotFoundException("¡Ficha2 no existe!");
            }
        }

        authList = new ArrayList<GrantedAuthority>();

        user = new User(username.trim(), username.trim(), authList);

        return user;
    }

}
