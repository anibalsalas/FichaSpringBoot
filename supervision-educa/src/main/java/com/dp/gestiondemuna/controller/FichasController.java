package com.dp.gestiondemuna.controller;

import com.dp.gestiondemuna.dto.GepCuadroComparativoDTO;
import com.dp.gestiondemuna.dto.ParametroDTO;
import com.dp.gestiondemuna.entity.Demuna_ArchivoEntity;
import com.dp.gestiondemuna.entity.Demuna_ArchivoPk;
import com.dp.gestiondemuna.entity.Demuna_EstablecimientosEntity;
import com.dp.gestiondemuna.entity.Demuna_EstablecimientosEntity2;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S10Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S2Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S3Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S4Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S5Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S6Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S7Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S8Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S9Entity;
import com.dp.gestiondemuna.entity.Demuna_FichaEntity;
import com.dp.gestiondemuna.entity.Demuna_FichaEntity2;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S10Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S11Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S12Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S2Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S3Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S4Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S5Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S6Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S7Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S8Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S9Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_10Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_10PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_1Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_1PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_2Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_2PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_31Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_31PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_3Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_3PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_4Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_4PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_5Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_5PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_6Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_6PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_7Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_7PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_8Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_8PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_9Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_9PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S4_3Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S4_3PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_10Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_10PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_1Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_1PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_2Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_2PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_31Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_31PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_3Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_3PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_4Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_4PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_5Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_5PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_6Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_6PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_7Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_7PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_8Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_8PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_9Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_9PkEntity;

import com.dp.gestiondemuna.entity.Matm_personaEntity;
import com.dp.gestiondemuna.entity.XubigeoEntity;
import com.dp.gestiondemuna.entity.XubigeoEntityPk;
import com.dp.gestiondemuna.repository.Demuna_FichaRepository;
import com.dp.gestiondemuna.service.Demuna_FichaService;
import com.dp.gestiondemuna.service.VariableSistemaLocalService;
import com.dp.gestiondemuna.repository.Matm_persona_Repository;
import com.dp.gestiondemuna.service.VariableSistemaService;
import com.dp.gestiondemuna.util.Constantes;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;
import java.util.logging.Level;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author asalas
 */
@Controller
public class FichasController {

    private static final Logger logger = LogManager.getLogger(FichasController.class);

    @Autowired
    VariableSistemaLocalService variableSistemaLocalService;

    @Autowired
    VariableSistemaService variableSistemaService;

    @Autowired
    Demuna_FichaService demuna_FichaService;
 

    @Autowired
    Demuna_FichaRepository demuna_ficharepository;
//    @Autowired
//    UsuarioService usuarioService;
    @Autowired
    private Matm_persona_Repository matm_persona_repository;

    

    @RequestMapping("/demuna/usuario/ficha/listarFichas")
    public String listarFichas(Model model, HttpSession httpSession) {

        List<Demuna_FichaEntity> listaFichasDemuna = null;
        String usuario_usu = "";

        try {

            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            listaFichasDemuna = demuna_FichaService.listarFichasByComisionado(usuario_usu);

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaFichasDemuna", listaFichasDemuna);

        return "gestiondemuna/usuario/ListaFicha";
    }
    
    
    @RequestMapping("/demuna/usuario/ficha/listarFichas2")
    public String listarFichas2(Model model, HttpSession httpSession) {

            List<Demuna_FichaEntity2> listaFichasEduca2 = null;
            String usuario_usu = "";
            
     
            
        try {

            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            listaFichasEduca2 = demuna_FichaService.listarFichasByComisionado2(usuario_usu);

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaFichasEduca2", listaFichasEduca2);

        return "gestiondemuna/usuario/ListaFicha2";
    }

    @RequestMapping("/demuna/usuario/ficha/insertarFichas")
    public String insertarFichas(Model model, @RequestParam(name = "cod_unico", required = false) String cod_unico, Demuna_FichaEntity ficha, HttpSession httpSession) {
        String usuario_usu = (String) httpSession.getAttribute("rol_usuario");
        String codi_depe_tde = "";
        // String c_tipo_entidad = "";
System.out.println("ID de ficha recibido: " + ficha.getId_ficha());

        List<XubigeoEntity> listaDepartamento = new ArrayList<>();
        List<XubigeoEntity> listaProvincia = new ArrayList<>();
        List<Demuna_EstablecimientosEntity> listarEM = null;
        System.out.println("Valor de cod_unico recibido en insertarFichas: " + cod_unico);

        /**
         * Inicio Oswaldo
         */
        String tipo_usuario = (String) httpSession.getAttribute("session_tipo_usuario");
        Demuna_EstablecimientosEntity establecimiento = demuna_FichaService.buscarByCodEESSficha1(cod_unico.trim());

        if (tipo_usuario.equals("A")) {//usuario dp
            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu);
            ficha.setTxt_desc_depe_tde(variableSistemaLocalService.getDependencia(codi_depe_tde).getDesc_depe_tde());
            ficha.setTxt_comisionado(variableSistemaLocalService.getUsuario(usuario_usu).getNomb_cort_usu());
            ficha.setFch_supervision(variableSistemaLocalService.getFecha_hora_sistema());

            ficha.setDepartamento_educa(establecimiento.getDes_departament() != null ? establecimiento.getDes_departament().trim() : null);
            ficha.setProvincia_educa(establecimiento.getDes_provincia() != null ? establecimiento.getDes_provincia().trim() : null);
            ficha.setDistrito_educa(establecimiento.getDes_distrito() != null ? establecimiento.getDes_distrito().trim() : null);
            ficha.setNom_entidad(establecimiento.getNom_entidad() != null ? establecimiento.getNom_entidad().trim() : null);

            ficha.setCodi_depa_dpt(establecimiento.getCoddptox() != null ? establecimiento.getCoddptox().trim() : null);
            ficha.setCodi_prov_tpr(establecimiento.getCodprovx() != null ? establecimiento.getCodprovx().trim() : null);
            ficha.setCodi_dist_tdi(establecimiento.getCoddistx() != null ? establecimiento.getCoddistx().trim() : null);
            
              ficha.setP3_2(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
                ficha.setP3_3(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);
            listarEM = demuna_FichaService.listarEM();
        }

        // Buscar el establecimiento por el código único
        // Demuna_EstablecimientosEntity establecimiento = demuna_FichaService.buscarByCodEESS(cod_unico.trim());
        // Verificar si se encontró el establecimiento
        if (establecimiento != null && establecimiento.getId_sestablecmnt() != null) {
            System.out.println("El establecimiento se encontró y su id_sestablecmnt es válido.");
            // Obtener los valores necesarios del establecimiento y asignarlos a las variables

            ficha.setCod_unico(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);

            ficha.setNom_entidad(establecimiento.getNom_entidad() != null ? establecimiento.getNom_entidad().trim() : null);
 //           ficha.setC_tipo_entidad(establecimiento.getC_tipo_entidad() != null ? establecimiento.getC_tipo_entidad().trim() : null);
//            ficha.setNum_celular(establecimiento.getTelefono() != null ? establecimiento.getTelefono().trim() : null);
//            ficha.setCorreo_demuna(establecimiento.getCorreo() != null ? establecimiento.getCorreo().trim() : null);
            ficha.setDepartamento_educa(establecimiento.getDes_departament() != null ? establecimiento.getDes_departament().trim() : null);
            ficha.setProvincia_educa(establecimiento.getDes_provincia() != null ? establecimiento.getDes_provincia().trim() : null);
            ficha.setDistrito_educa(establecimiento.getDes_distrito() != null ? establecimiento.getDes_distrito().trim() : null);
            // ficha.setDni_funcionario(establecimiento.getDni() != null ? establecimiento.getDni().trim() : null);

            ficha.setCodi_depa_dpt(establecimiento.getCoddptox() != null ? establecimiento.getCoddptox().trim() : null);
            ficha.setCodi_prov_tpr(establecimiento.getCodprovx() != null ? establecimiento.getCodprovx().trim() : null);
            ficha.setCodi_dist_tdi(establecimiento.getCoddistx() != null ? establecimiento.getCoddistx().trim() : null);
            
            ficha.setP3_2(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
            ficha.setP3_3(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);

        }
        
       
       // ficha.setFlag_validar("0");

        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listarEM", listarEM);
        model.addAttribute("ficha", ficha);
        model.addAttribute("educa_ficha_s4_3", new Educa_Ficha_S4_3Entity());
        model.addAttribute("educa_ficha_s5_1", new Educa_Ficha_S5_1Entity());
        model.addAttribute("educa_ficha_s5_2", new Educa_Ficha_S5_2Entity());
        model.addAttribute("educa_ficha_s5_3", new Educa_Ficha_S5_3Entity());
        model.addAttribute("educa_ficha_s5_4", new Educa_Ficha_S5_4Entity());
        model.addAttribute("educa_ficha_s5_5", new Educa_Ficha_S5_5Entity());
        model.addAttribute("educa_ficha_s5_6", new Educa_Ficha_S5_6Entity());
        model.addAttribute("educa_ficha_s5_7", new Educa_Ficha_S5_7Entity());
        model.addAttribute("educa_ficha_s5_8", new Educa_Ficha_S5_8Entity());
        model.addAttribute("educa_ficha_s5_9", new Educa_Ficha_S5_9Entity());
         model.addAttribute("educa_ficha_s5_10", new Educa_Ficha_S5_10Entity());
           model.addAttribute("educa_ficha_s5_31", new Educa_Ficha_S5_31Entity());
        return "gestiondemuna/usuario/FormularioFichasDemuna";
    }
    
     ///INSERTA FICHA2///
    @RequestMapping("/demuna/usuario/ficha/insertarFichas2")
    public String insertarFichaso2(Model model, @RequestParam(name = "cod_unico", required = false) String cod_unico, Demuna_FichaEntity2 ficha, HttpSession httpSession) {
        String usuario_usu = (String) httpSession.getAttribute("rol_usuario");
        String codi_depe_tde = "";
        // String c_tipo_entidad = "";
System.out.println("ID de ficha recibido: " + ficha.getId_ficha());

        List<XubigeoEntity> listaDepartamento = new ArrayList<>();
        List<XubigeoEntity> listaProvincia = new ArrayList<>();
        List<Demuna_EstablecimientosEntity2> listarEM2 = null;
        System.out.println("Valor de cod_unico recibido en insertarFichas: " + cod_unico);

         String tipo_usuario = (String) httpSession.getAttribute("session_tipo_usuario");
        Demuna_EstablecimientosEntity2 establecimiento = demuna_FichaService.buscarByCodEESSficha2(cod_unico.trim());
        
        if (tipo_usuario.equals("A")) {//usuario dp
            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu);
            ficha.setTxt_desc_depe_tde(variableSistemaLocalService.getDependencia(codi_depe_tde).getDesc_depe_tde());
            ficha.setTxt_comisionado(variableSistemaLocalService.getUsuario(usuario_usu).getNomb_cort_usu());
            ficha.setFch_supervision(variableSistemaLocalService.getFecha_hora_sistema());

            ficha.setDepartamento_educa(establecimiento.getDes_departament() != null ? establecimiento.getDes_departament().trim() : null);
            ficha.setProvincia_educa(establecimiento.getDes_provincia() != null ? establecimiento.getDes_provincia().trim() : null);
            ficha.setDistrito_educa(establecimiento.getDes_distrito() != null ? establecimiento.getDes_distrito().trim() : null);
            ficha.setNom_entidad(establecimiento.getNom_entidad() != null ? establecimiento.getNom_entidad().trim() : null);

            ficha.setCodi_depa_dpt(establecimiento.getCoddptox() != null ? establecimiento.getCoddptox().trim() : null);
            ficha.setCodi_prov_tpr(establecimiento.getCodprovx() != null ? establecimiento.getCodprovx().trim() : null);
            ficha.setCodi_dist_tdi(establecimiento.getCoddistx() != null ? establecimiento.getCoddistx().trim() : null);
            
              ficha.setP3_2(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
            ficha.setP3_3(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);
//             ficha.setCod_unico(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
//             ficha.setCod_local(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);
             listarEM2 = demuna_FichaService.listarEM2();
        }

        if (establecimiento != null && establecimiento.getId_sestablecmnt() != null) {
            System.out.println("El establecimiento se encontró y su id_sestablecmnt es válido.");
            // Obtener los valores necesarios del establecimiento y asignarlos a las variables

            ficha.setCod_unico(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);

            ficha.setNom_entidad(establecimiento.getNom_entidad() != null ? establecimiento.getNom_entidad().trim() : null);
 //           ficha.setC_tipo_entidad(establecimiento.getC_tipo_entidad() != null ? establecimiento.getC_tipo_entidad().trim() : null);
//            ficha.setNum_celular(establecimiento.getTelefono() != null ? establecimiento.getTelefono().trim() : null);
//            ficha.setCorreo_demuna(establecimiento.getCorreo() != null ? establecimiento.getCorreo().trim() : null);
            ficha.setDepartamento_educa(establecimiento.getDes_departament() != null ? establecimiento.getDes_departament().trim() : null);
            ficha.setProvincia_educa(establecimiento.getDes_provincia() != null ? establecimiento.getDes_provincia().trim() : null);
            ficha.setDistrito_educa(establecimiento.getDes_distrito() != null ? establecimiento.getDes_distrito().trim() : null);
            // ficha.setDni_funcionario(establecimiento.getDni() != null ? establecimiento.getDni().trim() : null);

            ficha.setCodi_depa_dpt(establecimiento.getCoddptox() != null ? establecimiento.getCoddptox().trim() : null);
            ficha.setCodi_prov_tpr(establecimiento.getCodprovx() != null ? establecimiento.getCodprovx().trim() : null);
            ficha.setCodi_dist_tdi(establecimiento.getCoddistx() != null ? establecimiento.getCoddistx().trim() : null);
            
////             ficha.setCod_unico(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
////             ficha.setCod_local(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);

            ficha.setP3_2(establecimiento.getCod_unico() != null ? establecimiento.getCod_unico().trim() : null);
            ficha.setP3_3(establecimiento.getCod_local() != null ? establecimiento.getCod_local().trim() : null);

        }
        

        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listarEM2", listarEM2);
        model.addAttribute("ficha", ficha);
        model.addAttribute("educa_ficha2_s5_1", new Educa_Ficha2_S5_1Entity());
        model.addAttribute("educa_ficha2_s5_2", new Educa_Ficha2_S5_2Entity());
        model.addAttribute("educa_ficha2_s5_3", new Educa_Ficha2_S5_3Entity());
        model.addAttribute("educa_ficha2_s5_4", new Educa_Ficha2_S5_4Entity());
        model.addAttribute("educa_ficha2_s5_5", new Educa_Ficha2_S5_5Entity());
        model.addAttribute("educa_ficha2_s5_6", new Educa_Ficha2_S5_6Entity());
        model.addAttribute("educa_ficha2_s5_7", new Educa_Ficha2_S5_7Entity());
        model.addAttribute("educa_ficha2_s5_8", new Educa_Ficha2_S5_8Entity());
        model.addAttribute("educa_ficha2_s5_9", new Educa_Ficha2_S5_9Entity());
         model.addAttribute("educa_ficha2_s5_10", new Educa_Ficha2_S5_10Entity());
           model.addAttribute("educa_ficha2_s5_31", new Educa_Ficha2_S5_31Entity());
           
        return "gestiondemuna/usuario/FormularioFichasEduca2";
    }

//    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarProvincias")
//    public String ajaxBuscarProvincias(Model model, @RequestParam("codi_depa_dpt") String codi_depa_dpt) {
//
//        List<XubigeoEntity> listaProvincia = new ArrayList<>();
//
//        listaProvincia.add(new XubigeoEntity(new XubigeoEntityPk("", "", ""), "-- SELECCIONAR --"));
//
//        try {
//
//            listaProvincia.addAll(demuna_FichaService.findAllProvincia(codi_depa_dpt));
//
//        } catch (Exception e) {
//            logger.error("Error: " + e.getMessage());
//            e.printStackTrace();
//        }
//        System.out.println("provincia");
//        model.addAttribute("listaProvincia", listaProvincia);
//
//        return "gestiondemuna/usuario/FormularioFichasDemuna :: frac_provincia";
//    }
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarDistritos")
    public String ajaxBuscarDistritos(Model model, @RequestParam("codi_depa_dpt") String codi_depa_dpt, @RequestParam("codi_prov_tpr") String codi_prov_tpr) {

        List<XubigeoEntity> listaDistrito = new ArrayList<>();

        listaDistrito.add(new XubigeoEntity(new XubigeoEntityPk("", "", ""), "-- SELECCIONAR --"));

        try {

            listaDistrito.addAll(demuna_FichaService.findAllDistrito(codi_depa_dpt, codi_prov_tpr));

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaDistrito", listaDistrito);

        return "gestiondemuna/usuario/FormularioFichasDemuna :: frac_distrito";
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarMunicipalidades")
    public String ajaxBuscarMunicipalidades(Model model, @RequestParam("codi_depa_dpt") String codi_depa_dpt,
            @RequestParam("codi_prov_tpr") String codi_prov_tpr,
            @RequestParam(value = "codi_dist_tdi", required = false) String codi_dist_tdi) {

        System.out.println("Código de departamento recibido: " + codi_depa_dpt);
        System.out.println("Código de provincia recibido: " + codi_prov_tpr);
        System.out.println("Código de distrito recibido: " + codi_dist_tdi);

        List<Demuna_EstablecimientosEntity> listaMunicipalidades = new ArrayList<>();

        listaMunicipalidades.add(new Demuna_EstablecimientosEntity(("--SELECCIONAR--"), "-- SELECCIONAR --"));
//listaMunicipalidades.add(new Demuna_EstablecimientosEntity("nom_entidad", "cod_unico", "nom_autoridad", "telefono", "correo", "nresolu", "coddistx", "-- SELECCIONAR --"));

//    try {
//        listaMunicipalidades.addAll(demuna_FichaService.findMunicipalidadesByDepartamento(codi_depa_dpt, codi_prov_tpr));
//        
//        System.out.println("Resultados de la consulta: " + listaMunicipalidades);
//    } catch (Exception e) {
//        logger.error("Error: " + e.getMessage());
//        e.printStackTrace();
//    }
        try {
            if (codi_dist_tdi == null || codi_dist_tdi.isEmpty()) {
                listaMunicipalidades.addAll(demuna_FichaService.findMunicipalidadesByDepartamento(codi_depa_dpt, codi_prov_tpr));
            } else {
                listaMunicipalidades.addAll(demuna_FichaService.findMunicipalidadesByDepartamentoAndProvinciaAndDistrito(codi_depa_dpt, codi_prov_tpr, codi_dist_tdi));
            }

            System.out.println("Resultados de la consulta: " + listaMunicipalidades);
        } catch (DataAccessException e) {
            logger.error("Error de acceso a datos: " + e.getMessage(), e);
            return "error";
        } catch (ServiceException e) {
            logger.error("Error en el servicio: " + e.getMessage(), e);
            return "error";
        } catch (Exception e) {
            logger.error("Error inesperado: " + e.getMessage(), e);
            return "error";
        }

        model.addAttribute("listaMunicipalidades", listaMunicipalidades);

        return "gestiondemuna/usuario/FormularioFichasDemuna :: frac_municipalidades";
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarCodUnico")
    @ResponseBody
    public Map<String, Object> ajaxBuscarCodUnico(@RequestParam("cod_unico") String cod_unico) {
        Map<String, Object> response = new HashMap<>();
        System.out.println("Valor del cod_unico: " + cod_unico);
        try {
            // Verificar si el código único existe en la base de datos
            int count = demuna_ficharepository.existeCodUnico(cod_unico.trim());

            // Agregar el resultado a la respuesta
            boolean existe = count > 0;
            response.put("existe", existe);
            response.put("mensaje", existe ? "El código único ya existe" : "El código único no existe");
        } catch (Exception e) {
            // Manejar cualquier excepción y agregar un mensaje de error a la respuesta
            response.put("error", true);
            response.put("mensaje", "Ocurrió un error al buscar el código único: " + e.getMessage());
        }

        return response;
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarEESS")
    @ResponseBody
    public Map ajaxBuscarEESS(Model model,
            @RequestParam("cod_unico") String cod_unico) {

        Map<String, Object> elemento = new HashMap();

        XubigeoEntity departamento = null;
        XubigeoEntity provincia = null;
        XubigeoEntity distrito = null;
        String c_tipo_entidad = "";
        Integer id_sestablecmnt = null;
        String nom_alcalde = "";
        String titular_entidad = "";
        String nom_defensor = "";
        String num_celular = "";

        String departamento_educa = "";
        String provincia_educa = "";
        String distrito_educa = "";
        String correo_demuna = "";
        String nom_entidad = "";
        String ndocumento = "";
        //  String tipo_ficha = "";
        // String tip_depe_eess = "";
        // String tip_eess = ""; //AGREGADO

        try {

            Demuna_EstablecimientosEntity establecimiento = demuna_FichaService.buscarByCodEESSficha1(cod_unico.trim());

            if (establecimiento != null && establecimiento.getCod_unico() != null) {

                departamento_educa = establecimiento.getDes_departament() != null ? establecimiento.getDes_departament().trim() : "";
                provincia_educa = establecimiento.getDes_provincia() != null ? establecimiento.getDes_provincia().trim() : "";
                distrito_educa = establecimiento.getDes_distrito() != null ? establecimiento.getDes_distrito().trim() : "";
                nom_entidad = establecimiento.getNom_entidad() != null ? establecimiento.getNom_entidad().trim() : "";
                c_tipo_entidad = establecimiento.getC_tipo_entidad() != null ? establecimiento.getC_tipo_entidad().trim() : "";
                id_sestablecmnt = establecimiento.getId_sestablecmnt();
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        elemento.put("id_sestablecmnt", id_sestablecmnt);
        elemento.put("departamento_educa", departamento_educa);
        elemento.put("provincia_educa", provincia_educa);
        elemento.put("distrito_educa", distrito_educa);
        elemento.put("nom_entidad", nom_entidad);
        elemento.put("c_tipo_entidad", c_tipo_entidad);
        return elemento;
    }

    /////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/demuna/usuario/ficha/guardarFicha", method = {RequestMethod.POST, RequestMethod.GET})
    public String guardarFicha(Model model, @ModelAttribute("ficha") Demuna_FichaEntity ficha, HttpSession httpSession) {
            System.out.println("ennn");
            
                System.out.println("ID de ficha recibido: " + ficha.getId_ficha());

System.out.println("Datos recibidos: " + ficha);
        List<XubigeoEntity> listaDepartamento = null;
        List<XubigeoEntity> listaProvincia = null;
        List<XubigeoEntity> listaDistrito = null;
        List<Demuna_EstablecimientosEntity> listaMunicipalidades = null;
        List<Demuna_EstablecimientosEntity> listarEM = null;
String usr_archivo = variableSistemaService.userID().trim().toUpperCase();
        String usuario_usu = "";
        String codi_depe_tde = "";

        Date fecha_hora = null;
        String msg_modal = "";
        String txt_btn_guardado_parcial = "";
        boolean flag_duplicado = false;
        
  
    
        try {

            String rol_usuario = (String) httpSession.getAttribute("rol_usuario");
            txt_btn_guardado_parcial = ficha.getTxt_btn_guardado_parcial();

            System.out.println("J:" + ficha.getTxt_btn_guardado_parcial());
            System.out.println("h:" + txt_btn_guardado_parcial);

            if (ficha.getEstado() == null || ficha.getEstado().equals("I")) {

                if (!ficha.isFlag_guardado_parcial()) {

                    ficha.setEstado("C");
                }
            } else {
                ficha.setEstado("C");

            }

            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();
            if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {
                codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu.trim());
            }

            if (ficha.getCod_unico() != null) {
                ficha.setCod_unico(ficha.getCod_unico().trim());
            }

            if (ficha.isFlag_guardado_parcial()) {

                switch (ficha.getTxt_btn_guardado_parcial()) {
                    case "btn_guardar_sec_1":

                        if (ficha.getId_ficha() == null) {
                            //  if (ficha.getCod_unico() == null) {

                            List<Demuna_FichaEntity> listaDemunadAux = demuna_FichaService.buscarFichaByCodigoUnico(ficha.getCod_unico().trim());
                            System.out.println("Se encontraron " + listaDemunadAux.size() + " registros para el código único proporcionado.");

                            if (listaDemunadAux.isEmpty()) {
                                ficha.setId_ficha(demuna_FichaService.generarIdFicha());

                                ficha.setUsu_registro(usuario_usu);
                                ficha.setFch_registro(fecha_hora);
                                if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {
                                    ficha.setCodi_depe_tde(codi_depe_tde);
                                }
                                demuna_FichaService.guardarFicha(ficha);
                                //Crear las otras secciones
                                Demuna_Ficha_S2Entity educa_ficha_s2 = new Demuna_Ficha_S2Entity();
                                Demuna_Ficha_S3Entity educa_ficha_s3 = new Demuna_Ficha_S3Entity();
                                Demuna_Ficha_S4Entity educa_ficha_s4 = new Demuna_Ficha_S4Entity();
                                Demuna_Ficha_S5Entity educa_ficha_s5 = new Demuna_Ficha_S5Entity();
                                Demuna_Ficha_S6Entity educa_ficha_s6 = new Demuna_Ficha_S6Entity();
                                Demuna_Ficha_S7Entity educa_ficha_s7 = new Demuna_Ficha_S7Entity();
                                Demuna_Ficha_S8Entity educa_ficha_s8 = new Demuna_Ficha_S8Entity();
                                Demuna_Ficha_S9Entity educa_ficha_s9 = new Demuna_Ficha_S9Entity();
                                Demuna_Ficha_S10Entity educa_ficha_s10 = new Demuna_Ficha_S10Entity();
                                Demuna_Ficha_S11Entity educa_ficha_s11 = new Demuna_Ficha_S11Entity();
                                Demuna_Ficha_S12Entity educa_ficha_s12 = new Demuna_Ficha_S12Entity();
                                
                                educa_ficha_s2.setId_ficha_s2(ficha.getId_ficha());
                                educa_ficha_s2.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s2.setUsu_registro(usuario_usu);
                                educa_ficha_s2.setFch_registro(fecha_hora);

                                educa_ficha_s3.setId_ficha_s3(ficha.getId_ficha());
                                educa_ficha_s3.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s3.setUsu_registro(usuario_usu);
                                educa_ficha_s3.setFch_registro(fecha_hora);

                                educa_ficha_s4.setId_ficha_s4(ficha.getId_ficha());
                                educa_ficha_s4.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s4.setUsu_registro(usuario_usu);
                                educa_ficha_s4.setFch_registro(fecha_hora);

                                educa_ficha_s5.setId_ficha_s5(ficha.getId_ficha());
                                educa_ficha_s5.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s5.setUsu_registro(usuario_usu);
                                educa_ficha_s5.setFch_registro(fecha_hora);

                                educa_ficha_s6.setId_ficha_s6(ficha.getId_ficha());
                                educa_ficha_s6.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s6.setUsu_registro(usuario_usu);
                                educa_ficha_s6.setFch_registro(fecha_hora);

                                educa_ficha_s7.setId_ficha_s7(ficha.getId_ficha());
                                educa_ficha_s7.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s7.setUsu_registro(usuario_usu);
                                educa_ficha_s7.setFch_registro(fecha_hora);

                                educa_ficha_s8.setId_ficha_s8(ficha.getId_ficha());
                                educa_ficha_s8.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s8.setUsu_registro(usuario_usu);
                                educa_ficha_s8.setFch_registro(fecha_hora);

                                educa_ficha_s9.setId_ficha_s9(ficha.getId_ficha());
                                educa_ficha_s9.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s9.setUsu_registro(usuario_usu);
                                educa_ficha_s9.setFch_registro(fecha_hora);

                                educa_ficha_s10.setId_ficha_s10(ficha.getId_ficha());
                                educa_ficha_s10.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s10.setUsu_registro(usuario_usu);
                                educa_ficha_s10.setFch_registro(fecha_hora);

                                educa_ficha_s11.setId_ficha_s11(ficha.getId_ficha());
                                educa_ficha_s11.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s11.setUsu_registro(usuario_usu);
                                educa_ficha_s11.setFch_registro(fecha_hora);
                                
                                educa_ficha_s12.setId_ficha_s12(ficha.getId_ficha());
                                educa_ficha_s12.setId_ficha(ficha.getId_ficha());
                                educa_ficha_s12.setUsu_registro(usuario_usu);
                                educa_ficha_s12.setFch_registro(fecha_hora);

                                demuna_FichaService.guardarFichaS2(educa_ficha_s2);
                                demuna_FichaService.guardarFichaS3(educa_ficha_s3);
                                demuna_FichaService.guardarFichaS4(educa_ficha_s4);
                                demuna_FichaService.guardarFichaS5(educa_ficha_s5);
                                demuna_FichaService.guardarFichaS6(educa_ficha_s6);
                                demuna_FichaService.guardarFichaS7(educa_ficha_s7);
                                demuna_FichaService.guardarFichaS8(educa_ficha_s8);
                                demuna_FichaService.guardarFichaS9(educa_ficha_s9);
                                demuna_FichaService.guardarFichaS10(educa_ficha_s10);
                                demuna_FichaService.guardarFichaS11(educa_ficha_s11);
                                 demuna_FichaService.guardarFichaS12(educa_ficha_s12);

                            } else {
                                flag_duplicado = true;
                            }

                        } else {
                            ficha.setUsu_actualiza(usuario_usu);
                            ficha.setFch_actualiza(fecha_hora);
                            demuna_FichaService.guardarFicha(ficha);

                        }

                        break;
                    case "btn_guardar_sec_2":

                        if (ficha.getEduca_ficha_s2().getId_ficha_s2() == null) {
                            System.out.println("entro aqui btn_guardar_sec_2: genera nuevo id_ficha" + ficha.getEduca_ficha_s2().getId_ficha_s2());
                            ficha.getEduca_ficha_s2().setId_ficha_s2(demuna_FichaService.generarIdFichaS2());
                            ficha.getEduca_ficha_s2().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s2().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s2().setFch_registro(fecha_hora);

                        } else {
                            ficha.getEduca_ficha_s2().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s2().setFch_actualiza(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_2: actualiza nuevo id_ficha");
                        }

                        demuna_FichaService.guardarFichaS2(ficha.getEduca_ficha_s2());

                        break;

                    case "btn_guardar_sec_3":
                        System.out.println("xxx");
                        if (ficha.getEduca_ficha_s3().getId_ficha_s3() == null) {
                            System.out.println("eee");
                            ficha.getEduca_ficha_s3().setId_ficha_s3(demuna_FichaService.generarIdFichaS3());
                            ficha.getEduca_ficha_s3().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s3().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s3().setFch_registro(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_3: genera nuevo id_ficha");
                        } else {
                            System.out.println("rrrr");
                            ficha.getEduca_ficha_s3().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s3().setFch_actualiza(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_3: actualiza nuevo id_ficha");
                        }

                        demuna_FichaService.guardarFichaS3(ficha.getEduca_ficha_s3());

                        break;
                    case "btn_guardar_sec_4":
                        if (ficha.getEduca_ficha_s4().getId_ficha_s4() == null) {

                            ficha.getEduca_ficha_s4().setId_ficha_s4(demuna_FichaService.generarIdFichaS4());
                            ficha.getEduca_ficha_s4().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s4().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s4().setFch_registro(fecha_hora);

                        } else {

                            ficha.getEduca_ficha_s4().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s4().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS4(ficha.getEduca_ficha_s4());
                        break;
                    case "btn_guardar_sec_5":
                        if (ficha.getEduca_ficha_s5().getId_ficha_s5() == null) {

                            ficha.getEduca_ficha_s5().setId_ficha_s5(demuna_FichaService.generarIdFichaS5());
                            ficha.getEduca_ficha_s5().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s5().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s5().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s5().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s5().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS5(ficha.getEduca_ficha_s5());
                        break;
                    case "btn_guardar_sec_6":
                        if (ficha.getEduca_ficha_s6().getId_ficha_s6() == null) {

                            ficha.getEduca_ficha_s6().setId_ficha_s6(demuna_FichaService.generarIdFichaS6());
                            ficha.getEduca_ficha_s6().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s6().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s6().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s6().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s6().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS6(ficha.getEduca_ficha_s6());
                        break;
                    case "btn_guardar_sec_7":
                        if (ficha.getEduca_ficha_s7().getId_ficha_s7() == null) {

                            ficha.getEduca_ficha_s7().setId_ficha_s7(demuna_FichaService.generarIdFichaS7());
                            ficha.getEduca_ficha_s7().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s7().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s7().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s7().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s7().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS7(ficha.getEduca_ficha_s7());
                        break;
                    case "btn_guardar_sec_8":
                        if (ficha.getEduca_ficha_s8().getId_ficha_s8() == null) {

                            ficha.getEduca_ficha_s8().setId_ficha_s8(demuna_FichaService.generarIdFichaS8());
                            ficha.getEduca_ficha_s8().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s8().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s8().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s8().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s8().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS8(ficha.getEduca_ficha_s8());
                        break;
                    case "btn_guardar_sec_9":
                        if (ficha.getEduca_ficha_s9().getId_ficha_s9() == null) {

                            ficha.getEduca_ficha_s9().setId_ficha_s9(demuna_FichaService.generarIdFichaS9());
                            ficha.getEduca_ficha_s9().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s9().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s9().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s9().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s9().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS9(ficha.getEduca_ficha_s9());
                        break;
                    case "btn_guardar_sec_10":

                        if (ficha.getEduca_ficha_s10().getId_ficha_s10() == null) {

                            ficha.getEduca_ficha_s10().setId_ficha_s10(demuna_FichaService.generarIdFichaS10());
                            ficha.getEduca_ficha_s10().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s10().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s10().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s10().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s10().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS10(ficha.getEduca_ficha_s10());

                        break;
                    case "btn_guardar_sec_11":
                        if (ficha.getEduca_ficha_s11().getId_ficha_s11() == null) {

                            ficha.getEduca_ficha_s11().setId_ficha_s11(demuna_FichaService.generarIdFichaS11());
                            ficha.getEduca_ficha_s11().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s11().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s11().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s11().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s11().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS11(ficha.getEduca_ficha_s11());
                        break;
                    
                      case "btn_guardar_sec_12":
                        if (ficha.getEduca_ficha_s12().getId_ficha_s12() == null) {

                            ficha.getEduca_ficha_s12().setId_ficha_s12(demuna_FichaService.generarIdFichaS12());
                            ficha.getEduca_ficha_s12().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha_s12().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha_s12().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha_s12().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha_s12().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFichaS12(ficha.getEduca_ficha_s12());
                        break;    

                    default:
                        throw new AssertionError();
                }

            } else {

                demuna_FichaService.guardarFicha(ficha);
                demuna_FichaService.guardarFichaS2(ficha.getEduca_ficha_s2());
                demuna_FichaService.guardarFichaS3(ficha.getEduca_ficha_s3());
                demuna_FichaService.guardarFichaS4(ficha.getEduca_ficha_s4());
                demuna_FichaService.guardarFichaS5(ficha.getEduca_ficha_s5());
                demuna_FichaService.guardarFichaS6(ficha.getEduca_ficha_s6());
                demuna_FichaService.guardarFichaS7(ficha.getEduca_ficha_s7());
                demuna_FichaService.guardarFichaS8(ficha.getEduca_ficha_s8());
                demuna_FichaService.guardarFichaS9(ficha.getEduca_ficha_s9());
                demuna_FichaService.guardarFichaS10(ficha.getEduca_ficha_s10());
                demuna_FichaService.guardarFichaS11(ficha.getEduca_ficha_s11());
                  demuna_FichaService.guardarFichaS12(ficha.getEduca_ficha_s12());

            }

            listaDepartamento = demuna_FichaService.findAllDepartamento();
            listaProvincia = demuna_FichaService.findAllProvincia(ficha.getCodi_depa_dpt());
            listaMunicipalidades = demuna_FichaService.findMunicipalidadesByDepartamento(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
            listaDistrito = demuna_FichaService.findAllDistrito(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
            listarEM = demuna_FichaService.listarEM();

            if (flag_duplicado) {
                msg_modal = "La Demuna seleccionada ya se encuetra registrada. Por favor seleccionar otra entidad";
            } else {

                ficha = demuna_FichaService.getFichaByIdFicha(ficha.getId_ficha());

                ficha.setEduca_ficha_s2(demuna_FichaService.getFichaS2ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s3(demuna_FichaService.getFichaS3ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s4(demuna_FichaService.getFichaS4ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s5(demuna_FichaService.getFichaS5ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s6(demuna_FichaService.getFichaS6ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s7(demuna_FichaService.getFichaS7ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s8(demuna_FichaService.getFichaS8ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s9(demuna_FichaService.getFichaS9ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s10(demuna_FichaService.getFichaS10ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s11(demuna_FichaService.getFichaS11ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha_s12(demuna_FichaService.getFichaS12ByIdFicha(ficha.getId_ficha()));

                if (ficha.getEstado().equals("I")) {
                    msg_modal = "Sus respuestas han sido registradas correctamente.";
                } else {
                    msg_modal = "Su ficha ha sido registrada correctamente.";
                }
            }

            ficha.setFlag_modal("S");
            ficha.setMsg_modal(msg_modal);
            ficha.setFlag_guardado_parcial(false);
            ficha.setTxt_btn_guardado_parcial(txt_btn_guardado_parcial);

        } catch (Exception e) {
            ficha.setFlag_modal("S");
            ficha.setMsg_modal("Muchas Gracias por su participación");
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

       
        

        model.addAttribute("ficha", ficha);
//        model.addAttribute("listarDependenciaEESS", listarDependenciaEESS);
//        model.addAttribute("listarCategoriaEESS", listarCategoriaEESS);
        model.addAttribute("listaMunicipalidades", listaMunicipalidades);
        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listaDistrito", listaDistrito);
        model.addAttribute("listarEM", listarEM);
        
        model.addAttribute("educa_ficha_s4_3", new Educa_Ficha_S4_3Entity());
        model.addAttribute("lista_s4_3_preguntas", demuna_FichaService.listarS4_3ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_1", new Educa_Ficha_S5_1Entity());
        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listarS5_1ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_2", new Educa_Ficha_S5_2Entity());
        model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listarS5_2ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha_s5_3", new Educa_Ficha_S5_3Entity());
        model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listarS5_3ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha_s5_4", new Educa_Ficha_S5_4Entity());
        model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listarS5_4ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha_s5_5", new Educa_Ficha_S5_5Entity());
        model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listarS5_5ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha_s5_6", new Educa_Ficha_S5_6Entity());
        model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listarS5_6ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha_s5_7", new Educa_Ficha_S5_7Entity());
        model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listarS5_7ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_8", new Educa_Ficha_S5_8Entity());
        model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listarS5_8ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_9", new Educa_Ficha_S5_9Entity());
        model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listarS5_9ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_10", new Educa_Ficha_S5_10Entity());
        model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listarS5_10ByIdFicha(ficha.getId_ficha()));
        
           model.addAttribute("educa_ficha_s5_31", new Educa_Ficha_S5_31Entity());
        model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listarS5_31ByIdFicha(ficha.getId_ficha()));
        return "gestiondemuna/usuario/FormularioFichasDemuna";
    }

    
    
    
    /////////////////////////////////////////////////////////////////////
    @RequestMapping(value = "/demuna/usuario/ficha/guardarFicha2", method = {RequestMethod.POST, RequestMethod.GET})
    public String guardarFicha2(Model model, @ModelAttribute("ficha") Demuna_FichaEntity2 ficha, HttpSession httpSession) {
            System.out.println("ennn");
            
                System.out.println("ID de ficha recibido: " + ficha.getId_ficha());

System.out.println("Datos recibidos: " + ficha);
        List<XubigeoEntity> listaDepartamento = null;
        List<XubigeoEntity> listaProvincia = null;
        List<XubigeoEntity> listaDistrito = null;
        //List<Demuna_EstablecimientosEntity2> listaMunicipalidades = null;
        List<Demuna_EstablecimientosEntity2> listarEM2 = null;
String usr_archivo = variableSistemaService.userID().trim().toUpperCase();
        String usuario_usu = "";
        String codi_depe_tde = "";

        Date fecha_hora = null;
        String msg_modal = "";
        String txt_btn_guardado_parcial = "";
        boolean flag_duplicado = false;
        
  
    
        try {

            String rol_usuario = (String) httpSession.getAttribute("rol_usuario");
            txt_btn_guardado_parcial = ficha.getTxt_btn_guardado_parcial();

            System.out.println("J:" + ficha.getTxt_btn_guardado_parcial());
            System.out.println("h:" + txt_btn_guardado_parcial);

            if (ficha.getEstado() == null || ficha.getEstado().equals("I")) {

                if (!ficha.isFlag_guardado_parcial()) {

                    ficha.setEstado("C");
                }
            } else {
                ficha.setEstado("C");

            }

            usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();
            if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {
                codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu.trim());
            }

            if (ficha.getCod_unico() != null) {
                ficha.setCod_unico(ficha.getCod_unico().trim());
            }

            if (ficha.isFlag_guardado_parcial()) {

                switch (ficha.getTxt_btn_guardado_parcial()) {
                    case "btn_guardar_sec_1":

                        if (ficha.getId_ficha() == null) {
                            //  if (ficha.getCod_unico() == null) {

                            List<Demuna_FichaEntity2> listaDemunadAux = demuna_FichaService.buscarFichaByCodigoUnico2(ficha.getCod_unico().trim());
                            System.out.println("Se encontraron " + listaDemunadAux.size() + " registros para el código único proporcionado.");

                            if (listaDemunadAux.isEmpty()) {
                                ficha.setId_ficha(demuna_FichaService.generarIdFicha2());

                                ficha.setUsu_registro(usuario_usu);
                                ficha.setFch_registro(fecha_hora);
                                if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {
                                    ficha.setCodi_depe_tde(codi_depe_tde);
                                }
                                demuna_FichaService.guardarFicha2(ficha);
                                //Crear las otras secciones
                                Demuna_Ficha2_S2Entity educa_ficha2_s2 = new Demuna_Ficha2_S2Entity();
                                Demuna_Ficha2_S3Entity educa_ficha2_s3 = new Demuna_Ficha2_S3Entity();
                                Demuna_Ficha2_S4Entity educa_ficha2_s4 = new Demuna_Ficha2_S4Entity();
                                Demuna_Ficha2_S5Entity educa_ficha2_s5 = new Demuna_Ficha2_S5Entity();
                                Demuna_Ficha2_S6Entity educa_ficha2_s6 = new Demuna_Ficha2_S6Entity();
                                Demuna_Ficha2_S7Entity educa_ficha2_s7 = new Demuna_Ficha2_S7Entity();
                                Demuna_Ficha2_S8Entity educa_ficha2_s8 = new Demuna_Ficha2_S8Entity();
                                Demuna_Ficha2_S9Entity educa_ficha2_s9 = new Demuna_Ficha2_S9Entity();
                                Demuna_Ficha2_S10Entity educa_ficha2_s10 = new Demuna_Ficha2_S10Entity();
                      
                                
                                educa_ficha2_s2.setId_ficha_s2(ficha.getId_ficha());
                                educa_ficha2_s2.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s2.setUsu_registro(usuario_usu);
                                educa_ficha2_s2.setFch_registro(fecha_hora);

                                educa_ficha2_s3.setId_ficha_s3(ficha.getId_ficha());
                                educa_ficha2_s3.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s3.setUsu_registro(usuario_usu);
                                educa_ficha2_s3.setFch_registro(fecha_hora);

                                educa_ficha2_s4.setId_ficha_s4(ficha.getId_ficha());
                                educa_ficha2_s4.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s4.setUsu_registro(usuario_usu);
                                educa_ficha2_s4.setFch_registro(fecha_hora);

                                educa_ficha2_s5.setId_ficha_s5(ficha.getId_ficha());
                                educa_ficha2_s5.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s5.setUsu_registro(usuario_usu);
                                educa_ficha2_s5.setFch_registro(fecha_hora);

                                educa_ficha2_s6.setId_ficha_s6(ficha.getId_ficha());
                                educa_ficha2_s6.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s6.setUsu_registro(usuario_usu);
                                educa_ficha2_s6.setFch_registro(fecha_hora);

                                educa_ficha2_s7.setId_ficha_s7(ficha.getId_ficha());
                                educa_ficha2_s7.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s7.setUsu_registro(usuario_usu);
                                educa_ficha2_s7.setFch_registro(fecha_hora);

                                educa_ficha2_s8.setId_ficha_s8(ficha.getId_ficha());
                                educa_ficha2_s8.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s8.setUsu_registro(usuario_usu);
                                educa_ficha2_s8.setFch_registro(fecha_hora);

                                educa_ficha2_s9.setId_ficha_s9(ficha.getId_ficha());
                                educa_ficha2_s9.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s9.setUsu_registro(usuario_usu);
                                educa_ficha2_s9.setFch_registro(fecha_hora);

                                educa_ficha2_s10.setId_ficha_s10(ficha.getId_ficha());
                                educa_ficha2_s10.setId_ficha(ficha.getId_ficha());
                                educa_ficha2_s10.setUsu_registro(usuario_usu);
                                educa_ficha2_s10.setFch_registro(fecha_hora);

                                

                                demuna_FichaService.guardarFicha2S2(educa_ficha2_s2);
                                demuna_FichaService.guardarFicha2S3(educa_ficha2_s3);
                                demuna_FichaService.guardarFicha2S4(educa_ficha2_s4);
                                demuna_FichaService.guardarFicha2S5(educa_ficha2_s5);
                                demuna_FichaService.guardarFicha2S6(educa_ficha2_s6);
                                demuna_FichaService.guardarFicha2S7(educa_ficha2_s7);
                                demuna_FichaService.guardarFicha2S8(educa_ficha2_s8);
                                demuna_FichaService.guardarFicha2S9(educa_ficha2_s9);
                                demuna_FichaService.guardarFicha2S10(educa_ficha2_s10);
                              

                            } else {
                                flag_duplicado = true;
                            }

                        } else {
                            ficha.setUsu_actualiza(usuario_usu);
                            ficha.setFch_actualiza(fecha_hora);
                            demuna_FichaService.guardarFicha2(ficha);

                        }

                        break;
                    case "btn_guardar_sec_2":

                        if (ficha.getEduca_ficha2_s2().getId_ficha_s2() == null) {
                            System.out.println("entro aqui btn_guardar_sec_2: genera nuevo id_ficha" + ficha.getEduca_ficha2_s2().getId_ficha_s2());
                            ficha.getEduca_ficha2_s2().setId_ficha_s2(demuna_FichaService.generarIdFicha2S2());
                            ficha.getEduca_ficha2_s2().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s2().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s2().setFch_registro(fecha_hora);

                        } else {
                            ficha.getEduca_ficha2_s2().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s2().setFch_actualiza(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_2: actualiza nuevo id_ficha");
                        }

                        demuna_FichaService.guardarFicha2S2(ficha.getEduca_ficha2_s2());

                        break;

                    case "btn_guardar_sec_3":
                        System.out.println("xxx");
                        if (ficha.getEduca_ficha2_s3().getId_ficha_s3() == null) {
                            System.out.println("eee");
                            ficha.getEduca_ficha2_s3().setId_ficha_s3(demuna_FichaService.generarIdFicha2S3());
                            ficha.getEduca_ficha2_s3().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s3().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s3().setFch_registro(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_3: genera nuevo id_ficha");
                        } else {
                            System.out.println("rrrr");
                            ficha.getEduca_ficha2_s3().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s3().setFch_actualiza(fecha_hora);
                            System.out.println("entro aqui btn_guardar_sec_3: actualiza nuevo id_ficha");
                        }

                        demuna_FichaService.guardarFicha2S3(ficha.getEduca_ficha2_s3());

                        break;
                    case "btn_guardar_sec_4":
                        if (ficha.getEduca_ficha2_s4().getId_ficha_s4() == null) {

                            ficha.getEduca_ficha2_s4().setId_ficha_s4(demuna_FichaService.generarIdFicha2S4());
                            ficha.getEduca_ficha2_s4().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s4().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s4().setFch_registro(fecha_hora);

                        } else {

                            ficha.getEduca_ficha2_s4().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s4().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S4(ficha.getEduca_ficha2_s4());
                        break;
                    case "btn_guardar_sec_5":
                        if (ficha.getEduca_ficha2_s5().getId_ficha_s5() == null) {

                            ficha.getEduca_ficha2_s5().setId_ficha_s5(demuna_FichaService.generarIdFicha2S5());
                            ficha.getEduca_ficha2_s5().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s5().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s5().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s5().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s5().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S5(ficha.getEduca_ficha2_s5());
                        break;
                    case "btn_guardar_sec_6":
                        if (ficha.getEduca_ficha2_s6().getId_ficha_s6() == null) {

                            ficha.getEduca_ficha2_s6().setId_ficha_s6(demuna_FichaService.generarIdFicha2S6());
                            ficha.getEduca_ficha2_s6().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s6().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s6().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s6().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s6().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S6(ficha.getEduca_ficha2_s6());
                        break;
                    case "btn_guardar_sec_7":
                        if (ficha.getEduca_ficha2_s7().getId_ficha_s7() == null) {

                            ficha.getEduca_ficha2_s7().setId_ficha_s7(demuna_FichaService.generarIdFicha2S7());
                            ficha.getEduca_ficha2_s7().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s7().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s7().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s7().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s7().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S7(ficha.getEduca_ficha2_s7());
                        break;
                    case "btn_guardar_sec_8":
                        if (ficha.getEduca_ficha2_s8().getId_ficha_s8() == null) {

                            ficha.getEduca_ficha2_s8().setId_ficha_s8(demuna_FichaService.generarIdFicha2S8());
                            ficha.getEduca_ficha2_s8().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s8().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s8().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s8().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s8().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S8(ficha.getEduca_ficha2_s8());
                        break;
                    case "btn_guardar_sec_9":
                        if (ficha.getEduca_ficha2_s9().getId_ficha_s9() == null) {

                            ficha.getEduca_ficha2_s9().setId_ficha_s9(demuna_FichaService.generarIdFicha2S9());
                            ficha.getEduca_ficha2_s9().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s9().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s9().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s9().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s9().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S9(ficha.getEduca_ficha2_s9());
                        break;
                    case "btn_guardar_sec_10":

                        if (ficha.getEduca_ficha2_s10().getId_ficha_s10() == null) {

                            ficha.getEduca_ficha2_s10().setId_ficha_s10(demuna_FichaService.generarIdFicha2S10());
                            ficha.getEduca_ficha2_s10().setId_ficha(ficha.getId_ficha());
                            ficha.getEduca_ficha2_s10().setUsu_registro(usuario_usu);
                            ficha.getEduca_ficha2_s10().setFch_registro(fecha_hora);
                        } else {

                            ficha.getEduca_ficha2_s10().setUsu_actualiza(usuario_usu);
                            ficha.getEduca_ficha2_s10().setFch_actualiza(fecha_hora);
                        }

                        demuna_FichaService.guardarFicha2S10(ficha.getEduca_ficha2_s10());

                        break;
                    

                    default:
                        throw new AssertionError();
                }

            } else {

                demuna_FichaService.guardarFicha2(ficha);
                demuna_FichaService.guardarFicha2S2(ficha.getEduca_ficha2_s2());
                demuna_FichaService.guardarFicha2S3(ficha.getEduca_ficha2_s3());
                demuna_FichaService.guardarFicha2S4(ficha.getEduca_ficha2_s4());
                demuna_FichaService.guardarFicha2S5(ficha.getEduca_ficha2_s5());
                demuna_FichaService.guardarFicha2S6(ficha.getEduca_ficha2_s6());
                demuna_FichaService.guardarFicha2S7(ficha.getEduca_ficha2_s7());
                demuna_FichaService.guardarFicha2S8(ficha.getEduca_ficha2_s8());
                demuna_FichaService.guardarFicha2S9(ficha.getEduca_ficha2_s9());
                demuna_FichaService.guardarFicha2S10(ficha.getEduca_ficha2_s10());
        

            }

            listaDepartamento = demuna_FichaService.findAllDepartamento();
            listaProvincia = demuna_FichaService.findAllProvincia(ficha.getCodi_depa_dpt());
           // listaMunicipalidades = demuna_FichaService.findMunicipalidadesByDepartamento(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
            listaDistrito = demuna_FichaService.findAllDistrito(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
            listarEM2 = demuna_FichaService.listarEM2();

            if (flag_duplicado) {
                msg_modal = "La Demuna seleccionada ya se encuetra registrada. Por favor seleccionar otra entidad";
            } else {

                ficha = demuna_FichaService.getFicha2ByIdFicha(ficha.getId_ficha());

                ficha.setEduca_ficha2_s2(demuna_FichaService.getFicha2S2ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s3(demuna_FichaService.getFicha2S3ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s4(demuna_FichaService.getFicha2S4ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s5(demuna_FichaService.getFicha2S5ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s6(demuna_FichaService.getFicha2S6ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s7(demuna_FichaService.getFicha2S7ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s8(demuna_FichaService.getFicha2S8ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s9(demuna_FichaService.getFicha2S9ByIdFicha(ficha.getId_ficha()));
                ficha.setEduca_ficha2_s10(demuna_FichaService.getFicha2S10ByIdFicha(ficha.getId_ficha()));
                

                if (ficha.getEstado().equals("I")) {
                    msg_modal = "Sus respuestas han sido registradas correctamente.";
                } else {
                    msg_modal = "Su ficha ha sido registrada correctamente.";
                }
            }

            ficha.setFlag_modal("S");
            ficha.setMsg_modal(msg_modal);
            ficha.setFlag_guardado_parcial(false);
            ficha.setTxt_btn_guardado_parcial(txt_btn_guardado_parcial);

        } catch (Exception e) {
            ficha.setFlag_modal("S");
            ficha.setMsg_modal("Muchas Gracias por su participación");
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

       
        

        model.addAttribute("ficha", ficha);
//        model.addAttribute("listarDependenciaEESS", listarDependenciaEESS);
//        model.addAttribute("listarCategoriaEESS", listarCategoriaEESS);
//        model.addAttribute("listaMunicipalidades2", listaMunicipalidades2);
        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listaDistrito", listaDistrito);
        model.addAttribute("listarEM2", listarEM2);
        
     
        model.addAttribute("educa_ficha2_s5_1", new Educa_Ficha2_S5_1Entity());
        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listar2S5_1ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_2", new Educa_Ficha2_S5_2Entity());
        model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listar2S5_2ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha2_s5_3", new Educa_Ficha2_S5_3Entity());
        model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listar2S5_3ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha2_s5_4", new Educa_Ficha2_S5_4Entity());
        model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listar2S5_4ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha2_s5_5", new Educa_Ficha2_S5_5Entity());
        model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listar2S5_5ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha2_s5_6", new Educa_Ficha2_S5_6Entity());
        model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listar2S5_6ByIdFicha(ficha.getId_ficha()));

        model.addAttribute("educa_ficha2_s5_7", new Educa_Ficha2_S5_7Entity());
        model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listar2S5_7ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_8", new Educa_Ficha2_S5_8Entity());
        model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listar2S5_8ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_9", new Educa_Ficha2_S5_9Entity());
        model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listar2S5_9ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha2_s5_10", new Educa_Ficha2_S5_10Entity());
        model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listar2S5_10ByIdFicha(ficha.getId_ficha()));
        
           model.addAttribute("educa_ficha2_s5_31", new Educa_Ficha2_S5_31Entity());
        model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listar2S5_31ByIdFicha(ficha.getId_ficha()));
       
        return "gestiondemuna/usuario/FormularioFichasEduca2";
        
    }
////////////////////////////////////////////////////////////////////////
//////////////////////////////EDITAR////////////////////////////////////
    @RequestMapping(value = "/demuna/usuario/ficha/editarFichas", method = {RequestMethod.POST, RequestMethod.GET})
    public String editarFicha(Model model, @RequestParam("id_ficha") Integer id_ficha, HttpSession httpSession) {

        String codi_depe_tde = "";
        System.out.print("id_ficha: " + id_ficha);
//        List<ParametroDTO> listarCategoriaEESS = null;
//        List<ParametroDTO> listarDependenciaEESS = null;
String usr_archivo = variableSistemaService.userID().trim().toUpperCase();

        List<XubigeoEntity> listaDepartamento = null;
        List<XubigeoEntity> listaProvincia = null;
        List<XubigeoEntity> listaDistrito = null;
        List<Demuna_EstablecimientosEntity> listarEM = null;
        List<Demuna_EstablecimientosEntity> listaMunicipalidades = null;
        
        Demuna_FichaEntity ficha = null;

        try {
            ficha = demuna_FichaService.getFichaByIdFicha(id_ficha);
            String rol_usuario = (String) httpSession.getAttribute("rol_usuario");
            String usuario_usu = variableSistemaService.userID();

            System.out.println("rol_usuario: " + rol_usuario);
            if (ficha != null) {
                System.out.println("ficha: " + ficha);
                //  String codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu);
                if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {//Comisionado
                    ficha.setTxt_desc_depe_tde(variableSistemaLocalService.getDependencia(variableSistemaLocalService.dependencia_fisica_personal(usuario_usu)).getDesc_depe_tde());
                    ficha.setTxt_comisionado(variableSistemaLocalService.getUsuario(usuario_usu).getNomb_cort_usu());
                    ficha.setFch_supervision(variableSistemaLocalService.getFecha_hora_sistema());
                }

                System.out.println("ccccc: ");
                // ficha.setFch_supervision(Demuna_FichaEntity.getFch_supervision());
                //    ficha.setFch_supervision(Demuna_FichaEntity.getFch_supervision() != null ? Demuna_FichaEntity.getFch_supervision().trim() : null);
                //ficha = demuna_FichaService.getFichaByIdFicha(ficha.getId_ficha());

                // ficha = demuna_FichaService.getFichaByIdFicha(id_ficha);
                ficha.setEduca_ficha_s2(demuna_FichaService.getFichaS2ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s3(demuna_FichaService.getFichaS3ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s4(demuna_FichaService.getFichaS4ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s5(demuna_FichaService.getFichaS5ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s6(demuna_FichaService.getFichaS6ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s7(demuna_FichaService.getFichaS7ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s8(demuna_FichaService.getFichaS8ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s9(demuna_FichaService.getFichaS9ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s10(demuna_FichaService.getFichaS10ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s11(demuna_FichaService.getFichaS11ByIdFicha(id_ficha));
                ficha.setEduca_ficha_s12(demuna_FichaService.getFichaS12ByIdFicha(id_ficha));

//
                

                //  ficha.setTipo_ficha(demuna_FichaService.buscarByCodEESS(ficha.getCod_unico()).getTipo_ficha()); //AGREGADO ccortez 20240409
//            listarDependenciaEESS = educa_FichaService.listarDependenciaEESS();
//            listarCategoriaEESS = educa_FichaService.listarCategoriaEESS();
                listaDepartamento = demuna_FichaService.findAllDepartamento();
                listaProvincia = demuna_FichaService.findAllProvincia(ficha.getCodi_depa_dpt());
                listaMunicipalidades = demuna_FichaService.findMunicipalidadesByDepartamento(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
                listaDistrito = demuna_FichaService.findAllDistrito(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
                listarEM = demuna_FichaService.listarEM();

            }
//            }
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }
        if (ficha != null && ficha.getEduca_ficha() != null) {

            
        }
        model.addAttribute("ficha", ficha);
//        model.addAttribute("listarDependenciaEESS", listarDependenciaEESS);
//        model.addAttribute("listarCategoriaEESS", listarCategoriaEESS);
        model.addAttribute("listaMunicipalidades", listaMunicipalidades);
        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listaDistrito", listaDistrito);
        model.addAttribute("listarEM", listarEM);
        
   
  
        model.addAttribute("educa_ficha_s4_3", new Educa_Ficha_S4_3Entity());
        model.addAttribute("lista_s4_3_preguntas", demuna_FichaService.listarS4_3ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_1", new Educa_Ficha_S5_1Entity());
        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listarS5_1ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_2", new Educa_Ficha_S5_2Entity());
        model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listarS5_2ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_3", new Educa_Ficha_S5_3Entity());
        model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listarS5_3ByIdFicha(ficha.getId_ficha()));
          
        model.addAttribute("educa_ficha_s5_4", new Educa_Ficha_S5_4Entity());
        model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listarS5_4ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_5", new Educa_Ficha_S5_5Entity());
        model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listarS5_5ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_6", new Educa_Ficha_S5_6Entity());
        model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listarS5_6ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha_s5_7", new Educa_Ficha_S5_7Entity());
        model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listarS5_7ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_8", new Educa_Ficha_S5_8Entity());
        model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listarS5_8ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha_s5_9", new Educa_Ficha_S5_9Entity());
        model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listarS5_9ByIdFicha(ficha.getId_ficha()));
        
          model.addAttribute("educa_ficha_s5_10", new Educa_Ficha_S5_10Entity());
        model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listarS5_10ByIdFicha(ficha.getId_ficha()));
        
           model.addAttribute("educa_ficha_s5_31", new Educa_Ficha_S5_31Entity());
        model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listarS5_31ByIdFicha(ficha.getId_ficha()));
        
        if (ficha != null && ficha.getEduca_ficha() != null) {
            model.addAttribute("txt_desc_depe_tde", ficha.getEduca_ficha().getTxt_desc_depe_tde());
            model.addAttribute("txt_comisionado", ficha.getEduca_ficha().getTxt_comisionado());
            model.addAttribute("fch_supervision", ficha.getEduca_ficha().getFch_supervision());
        }


        return "gestiondemuna/usuario/FormularioFichasDemuna";
    }

    
    //////////////////////////////EDITAR////////////////////////////////////
    @RequestMapping(value = "/demuna/usuario/ficha/editarFichas2", method = {RequestMethod.POST, RequestMethod.GET})
    public String editarFicha2(Model model, @RequestParam("id_ficha") Integer id_ficha, HttpSession httpSession) {

        String codi_depe_tde = "";
        System.out.print("id_ficha: " + id_ficha);
//        List<ParametroDTO> listarCategoriaEESS = null;
//        List<ParametroDTO> listarDependenciaEESS = null;
        String usr_archivo = variableSistemaService.userID().trim().toUpperCase();

        List<XubigeoEntity> listaDepartamento = null;
        List<XubigeoEntity> listaProvincia = null;
        List<XubigeoEntity> listaDistrito = null;
        List<Demuna_EstablecimientosEntity2> listarEM2 = null;
     //   List<Demuna_EstablecimientosEntity2> listaMunicipalidades = null;
        
        Demuna_FichaEntity2 ficha = null;

        try {
            ficha = demuna_FichaService.getFicha2ByIdFicha(id_ficha);
            String rol_usuario = (String) httpSession.getAttribute("rol_usuario");
            String usuario_usu = variableSistemaService.userID();

            System.out.println("rol_usuario: " + rol_usuario);
            if (ficha != null) {
                System.out.println("ficha: " + ficha);
                //  String codi_depe_tde = variableSistemaLocalService.dependencia_fisica_personal(usuario_usu);
                if (rol_usuario.equals(Constantes.ROL_COMISIONADO)) {//Comisionado
                    ficha.setTxt_desc_depe_tde(variableSistemaLocalService.getDependencia(variableSistemaLocalService.dependencia_fisica_personal(usuario_usu)).getDesc_depe_tde());
                    ficha.setTxt_comisionado(variableSistemaLocalService.getUsuario(usuario_usu).getNomb_cort_usu());
                    ficha.setFch_supervision(variableSistemaLocalService.getFecha_hora_sistema());
                }

                System.out.println("ccccc: ");
                // ficha.setFch_supervision(Demuna_FichaEntity.getFch_supervision());
                //    ficha.setFch_supervision(Demuna_FichaEntity.getFch_supervision() != null ? Demuna_FichaEntity.getFch_supervision().trim() : null);
                //ficha = demuna_FichaService.getFichaByIdFicha(ficha.getId_ficha());

                // ficha = demuna_FichaService.getFichaByIdFicha(id_ficha);
                ficha.setEduca_ficha2_s2(demuna_FichaService.getFicha2S2ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s3(demuna_FichaService.getFicha2S3ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s4(demuna_FichaService.getFicha2S4ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s5(demuna_FichaService.getFicha2S5ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s6(demuna_FichaService.getFicha2S6ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s7(demuna_FichaService.getFicha2S7ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s8(demuna_FichaService.getFicha2S8ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s9(demuna_FichaService.getFicha2S9ByIdFicha(id_ficha));
                ficha.setEduca_ficha2_s10(demuna_FichaService.getFicha2S10ByIdFicha(id_ficha));
           

//
                

                //  ficha.setTipo_ficha(demuna_FichaService.buscarByCodEESS(ficha.getCod_unico()).getTipo_ficha()); //AGREGADO ccortez 20240409
//            listarDependenciaEESS = educa_FichaService.listarDependenciaEESS();
//            listarCategoriaEESS = educa_FichaService.listarCategoriaEESS();
                listaDepartamento = demuna_FichaService.findAllDepartamento();
                listaProvincia = demuna_FichaService.findAllProvincia(ficha.getCodi_depa_dpt());
          //      listaMunicipalidades = demuna_FichaService.findMunicipalidadesByDepartamento(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
                listaDistrito = demuna_FichaService.findAllDistrito(ficha.getCodi_depa_dpt(), ficha.getCodi_prov_tpr());
                listarEM2= demuna_FichaService.listarEM2();

            }
//            }
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }
        if (ficha != null && ficha.getEduca_ficha2() != null) {

            
        }
        model.addAttribute("ficha", ficha);
//        model.addAttribute("listarDependenciaEESS", listarDependenciaEESS);
//        model.addAttribute("listarCategoriaEESS", listarCategoriaEESS);
        //model.addAttribute("listaMunicipalidades", listaMunicipalidades);
        model.addAttribute("listaDepartamento", listaDepartamento);
        model.addAttribute("listaProvincia", listaProvincia);
        model.addAttribute("listaDistrito", listaDistrito);
        model.addAttribute("listarEM2", listarEM2);
        
   
  
      
         model.addAttribute("educa_ficha2_s5_1", new Educa_Ficha2_S5_1Entity());
        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listar2S5_1ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha2_s5_2", new Educa_Ficha2_S5_2Entity());
        model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listar2S5_2ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_3", new Educa_Ficha2_S5_3Entity());
        model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listar2S5_3ByIdFicha(ficha.getId_ficha()));
          
        model.addAttribute("educa_ficha2_s5_4", new Educa_Ficha2_S5_4Entity());
        model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listar2S5_4ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha2_s5_5", new Educa_Ficha2_S5_5Entity());
        model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listar2S5_5ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha2_s5_6", new Educa_Ficha2_S5_6Entity());
        model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listar2S5_6ByIdFicha(ficha.getId_ficha()));
        
         model.addAttribute("educa_ficha2_s5_7", new Educa_Ficha2_S5_7Entity());
        model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listar2S5_7ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_8", new Educa_Ficha2_S5_8Entity());
        model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listar2S5_8ByIdFicha(ficha.getId_ficha()));
        
        model.addAttribute("educa_ficha2_s5_9", new Educa_Ficha2_S5_9Entity());
        model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listar2S5_9ByIdFicha(ficha.getId_ficha()));
        
          model.addAttribute("educa_ficha2_s5_10", new Educa_Ficha2_S5_10Entity());
        model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listar2S5_10ByIdFicha(ficha.getId_ficha()));
        
           model.addAttribute("educa_ficha2_s5_31", new Educa_Ficha2_S5_31Entity());
        model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listar2S5_31ByIdFicha(ficha.getId_ficha()));
        
        if (ficha != null && ficha.getEduca_ficha2() != null) {
            model.addAttribute("txt_desc_depe_tde", ficha.getEduca_ficha2().getTxt_desc_depe_tde());
            model.addAttribute("txt_comisionado", ficha.getEduca_ficha2().getTxt_comisionado());
            model.addAttribute("fch_supervision", ficha.getEduca_ficha2().getFch_supervision());
        }


        return "gestiondemuna/usuario/FormularioFichasEduca2";
    }




//
 

   


    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarByDNI")
    @ResponseBody
    public Map ajaxBuscarByDNI(Model model,
            @RequestParam("num_dni") String num_dni) {

        Map<String, Object> elemento = new HashMap();

        String nom_funcionario = "";

        String nombre = "";
        String ape_pat = "";
        String ape_mat = "";

        try {

            Optional<Matm_personaEntity> optionalEntity = matm_persona_repository.findById(num_dni.trim());

            if (optionalEntity.isPresent()) {

                Matm_personaEntity matm_personamodel = optionalEntity.get();

                nombre = matm_personamodel.getPrenom_inscrito() != null ? matm_personamodel.getPrenom_inscrito().trim().toUpperCase() : "";
                ape_pat = matm_personamodel.getAp_primer() != null ? matm_personamodel.getAp_primer().trim().toUpperCase() : "";
                ape_mat = matm_personamodel.getAp_segundo() != null ? matm_personamodel.getAp_segundo().trim().toUpperCase() : "";

                nom_funcionario = nombre + " " + ape_pat + " " + ape_mat;
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        elemento.put("nom_funcionario", nom_funcionario);

        return elemento;

    }

    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarByDNIdefensor")
    @ResponseBody
    public Map ajaxBuscarByDNIdefensor(Model model,
            @RequestParam("num_dni") String num_dni) {

        Map<String, Object> elemento = new HashMap();

        String nom_defensor = "";

        String nombre = "";
        String ape_pat = "";
        String ape_mat = "";

        try {

            Optional<Matm_personaEntity> optionalEntity = matm_persona_repository.findById(num_dni.trim());

            if (optionalEntity.isPresent()) {

                Matm_personaEntity matm_personamodel = optionalEntity.get();

                nombre = matm_personamodel.getPrenom_inscrito() != null ? matm_personamodel.getPrenom_inscrito().trim().toUpperCase() : "";
                ape_pat = matm_personamodel.getAp_primer() != null ? matm_personamodel.getAp_primer().trim().toUpperCase() : "";
                ape_mat = matm_personamodel.getAp_segundo() != null ? matm_personamodel.getAp_segundo().trim().toUpperCase() : "";

                nom_defensor = nombre + " " + ape_pat + " " + ape_mat;
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        elemento.put("nom_defensor", nom_defensor);

        return elemento;

    }
    
    
    
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec4_3")
    public String ajaxBuscarSec4_3(Model model,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        Educa_Ficha_S4_3Entity educa_ficha_s4_3 = null;

        try {

            if (id == null) {//nuevo
                educa_ficha_s4_3 = new Educa_Ficha_S4_3Entity();
                educa_ficha_s4_3.setEduca_ficha_s4_3pk(new Educa_Ficha_S4_3PkEntity(id, id_ficha));
            } else {//buscar
                educa_ficha_s4_3 = demuna_FichaService.getFicha_S4_3ById(new Educa_Ficha_S4_3PkEntity(id, id_ficha));
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
        model.addAttribute("educa_ficha_s4_3", educa_ficha_s4_3);

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec4_3";
    }
    
    
    @RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec4_3")
    public String ajaxGuardarMdlSec4_3(Model model, @RequestBody Educa_Ficha_S4_3Entity educa_ficha_s4_3) {

        try {

            String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

            if (educa_ficha_s4_3.getEduca_ficha_s4_3pk() != null && educa_ficha_s4_3.getEduca_ficha_s4_3pk().getId() != null) {//actualiza

                educa_ficha_s4_3.setUsu_actualiza(usuario_usu);
                educa_ficha_s4_3.setFch_actualiza(fecha_hora);
            } else {//inserta
                educa_ficha_s4_3.getEduca_ficha_s4_3pk().setId(demuna_FichaService.generarIdS4_3(educa_ficha_s4_3.getEduca_ficha_s4_3pk().getId_ficha()));
                educa_ficha_s4_3.setUsu_registro(usuario_usu);
                educa_ficha_s4_3.setFch_registro(fecha_hora);
                
                 System.out.println("inserta");
            }

            demuna_FichaService.guardarFichaS4_3(educa_ficha_s4_3);
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s4_3_preguntas", demuna_FichaService.listarS4_3ByIdFicha(educa_ficha_s4_3.getEduca_ficha_s4_3pk().getId_ficha()));

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec4_3";
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec4_3")
    public String ajaxEliminarModalSec4_3(Model model,
            @RequestParam("id") Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        try {

            demuna_FichaService.eliminarFichaS4_3(new Educa_Ficha_S4_3PkEntity(id, id_ficha));

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s4_3_preguntas", demuna_FichaService.listarS4_3ByIdFicha(id_ficha));

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec4_3";
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_1")
    public String ajaxBuscarSec5_1(Model model,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        Educa_Ficha_S5_1Entity educa_ficha_s5_1 = null;

        try {

            if (id == null) {//nuevo
                educa_ficha_s5_1 = new Educa_Ficha_S5_1Entity();
                educa_ficha_s5_1.setEduca_ficha_s5_1pk(new Educa_Ficha_S5_1PkEntity(id, id_ficha));
            } else {//buscar
                educa_ficha_s5_1 = demuna_FichaService.getFicha_S5_1ById(new Educa_Ficha_S5_1PkEntity(id, id_ficha));
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
        model.addAttribute("educa_ficha_s5_1", educa_ficha_s5_1);

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_1";
    }
    
    
    @RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_1")
    public String ajaxGuardarMdlSec5_1(Model model, @RequestBody Educa_Ficha_S5_1Entity educa_ficha_s5_1) {

        try {

            String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

            if (educa_ficha_s5_1.getEduca_ficha_s5_1pk() != null && educa_ficha_s5_1.getEduca_ficha_s5_1pk().getId() != null) {//actualiza

                educa_ficha_s5_1.setUsu_actualiza(usuario_usu);
                educa_ficha_s5_1.setFch_actualiza(fecha_hora);
            } else {//inserta
                educa_ficha_s5_1.getEduca_ficha_s5_1pk().setId(demuna_FichaService.generarIdS5_1(educa_ficha_s5_1.getEduca_ficha_s5_1pk().getId_ficha()));
                educa_ficha_s5_1.setUsu_registro(usuario_usu);
                educa_ficha_s5_1.setFch_registro(fecha_hora);
                
                 System.out.println("inserta");
            }

            demuna_FichaService.guardarFichaS5_1(educa_ficha_s5_1);
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listarS5_1ByIdFicha(educa_ficha_s5_1.getEduca_ficha_s5_1pk().getId_ficha()));

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_1";
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_1")
    public String ajaxEliminarModalSec5_1(Model model,
            @RequestParam("id") Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        try {

            demuna_FichaService.eliminarFichaS5_1(new Educa_Ficha_S5_1PkEntity(id, id_ficha));

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listarS5_1ByIdFicha(id_ficha));

        return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_1";
    }
   
    
    
    ////////////////////////////////////////MANTENIMIENTO 5-2 EDIFICACIONES/////////////////////////////////////////////////////////////
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_2")
public String ajaxBuscarSec5_2(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_2Entity educa_ficha_s5_2 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_2 = new Educa_Ficha_S5_2Entity();
            educa_ficha_s5_2.setEduca_ficha_s5_2pk(new Educa_Ficha_S5_2PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_2 = demuna_FichaService.getFicha_S5_2ById(new Educa_Ficha_S5_2PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_2", educa_ficha_s5_2);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_2";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_2")
public String ajaxGuardarMdlSec5_2(Model model, @RequestBody Educa_Ficha_S5_2Entity educa_ficha_s5_2) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_2.getEduca_ficha_s5_2pk() != null && educa_ficha_s5_2.getEduca_ficha_s5_2pk().getId() != null) { // actualiza

            educa_ficha_s5_2.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_2.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_2.getEduca_ficha_s5_2pk().setId(demuna_FichaService.generarIdS5_2(educa_ficha_s5_2.getEduca_ficha_s5_2pk().getId_ficha()));
            educa_ficha_s5_2.setUsu_registro(usuario_usu);
            educa_ficha_s5_2.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_2(educa_ficha_s5_2);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listarS5_2ByIdFicha(educa_ficha_s5_2.getEduca_ficha_s5_2pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_2";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_2")
public String ajaxEliminarModalSec5_2(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_2(new Educa_Ficha_S5_2PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listarS5_2ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_2";
}
////////////////////FIN MANTENIMIENTO EDIFACIONES/////////////////////////////////////////////////////////////



 ////////////////////////////////////////MANTENIMIENTO 5-3 SISTEMA ESTRUCTURAL/////////////////////////////////////////////////////////////
    
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_3")
public String ajaxBuscarSec5_3(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_3Entity educa_ficha_s5_3 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_3 = new Educa_Ficha_S5_3Entity();
            educa_ficha_s5_3.setEduca_ficha_s5_3pk(new Educa_Ficha_S5_3PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_3 = demuna_FichaService.getFicha_S5_3ById(new Educa_Ficha_S5_3PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_3", educa_ficha_s5_3);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_3";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_3")
public String ajaxGuardarMdlSec5_3(Model model, @RequestBody Educa_Ficha_S5_3Entity educa_ficha_s5_3) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_3.getEduca_ficha_s5_3pk() != null && educa_ficha_s5_3.getEduca_ficha_s5_3pk().getId() != null) { // actualiza

            educa_ficha_s5_3.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_3.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_3.getEduca_ficha_s5_3pk().setId(demuna_FichaService.generarIdS5_3(educa_ficha_s5_3.getEduca_ficha_s5_3pk().getId_ficha()));
            educa_ficha_s5_3.setUsu_registro(usuario_usu);
            educa_ficha_s5_3.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_3(educa_ficha_s5_3);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listarS5_3ByIdFicha(educa_ficha_s5_3.getEduca_ficha_s5_3pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_3";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_3")
public String ajaxEliminarModalSec5_3(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_3(new Educa_Ficha_S5_3PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listarS5_3ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_3";
}

////////////////////FIN MANTENIMIENTO SE/////////////////////////////////////////////////////////////



 ////////////////////////////////////////MANTENIMIENTO 5-4 PAREDES/////////////////////////////////////////////////////////////
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_4")
public String ajaxBuscarSec5_4(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_4Entity educa_ficha_s5_4 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_4 = new Educa_Ficha_S5_4Entity();
            educa_ficha_s5_4.setEduca_ficha_s5_4pk(new Educa_Ficha_S5_4PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_4 = demuna_FichaService.getFicha_S5_4ById(new Educa_Ficha_S5_4PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_4", educa_ficha_s5_4);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_4";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_4")
public String ajaxGuardarMdlSec5_4(Model model, @RequestBody Educa_Ficha_S5_4Entity educa_ficha_s5_4) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_4.getEduca_ficha_s5_4pk() != null && educa_ficha_s5_4.getEduca_ficha_s5_4pk().getId() != null) { // actualiza

            educa_ficha_s5_4.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_4.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_4.getEduca_ficha_s5_4pk().setId(demuna_FichaService.generarIdS5_4(educa_ficha_s5_4.getEduca_ficha_s5_4pk().getId_ficha()));
            educa_ficha_s5_4.setUsu_registro(usuario_usu);
            educa_ficha_s5_4.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_4(educa_ficha_s5_4);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listarS5_4ByIdFicha(educa_ficha_s5_4.getEduca_ficha_s5_4pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_4";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_4")
public String ajaxEliminarModalSec5_4(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_4(new Educa_Ficha_S5_4PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listarS5_4ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_4";
}


////////////////////FIN MANTENIMIENTO 5_4/////////////////////////////////////////////////////////////




 ////////////////////////////////////////MANTENIMIENTO 5-5 TECHOS/////////////////////////////////////////////////////////////
    @RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_5")
public String ajaxBuscarSec5_5(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_5Entity educa_ficha_s5_5 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_5 = new Educa_Ficha_S5_5Entity();
            educa_ficha_s5_5.setEduca_ficha_s5_5pk(new Educa_Ficha_S5_5PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_5 = demuna_FichaService.getFicha_S5_5ById(new Educa_Ficha_S5_5PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_5", educa_ficha_s5_5);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_5";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_5")
public String ajaxGuardarMdlSec5_5(Model model, @RequestBody Educa_Ficha_S5_5Entity educa_ficha_s5_5) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_5.getEduca_ficha_s5_5pk() != null && educa_ficha_s5_5.getEduca_ficha_s5_5pk().getId() != null) { // actualiza

            educa_ficha_s5_5.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_5.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_5.getEduca_ficha_s5_5pk().setId(demuna_FichaService.generarIdS5_5(educa_ficha_s5_5.getEduca_ficha_s5_5pk().getId_ficha()));
            educa_ficha_s5_5.setUsu_registro(usuario_usu);
            educa_ficha_s5_5.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_5(educa_ficha_s5_5);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listarS5_5ByIdFicha(educa_ficha_s5_5.getEduca_ficha_s5_5pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_5";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_5")
public String ajaxEliminarModalSec5_5(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_5(new Educa_Ficha_S5_5PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listarS5_5ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_5";
}


////////////////////FIN MANTENIMIENTO 5_5/////////////////////////////////////////////////////////////


////////////////////////////////////////MANTENIMIENTO 5-6 TECHOS/////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_6")
public String ajaxBuscarSec5_6(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_6Entity educa_ficha_s5_6 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_6 = new Educa_Ficha_S5_6Entity();
            educa_ficha_s5_6.setEduca_ficha_s5_6pk(new Educa_Ficha_S5_6PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_6 = demuna_FichaService.getFicha_S5_6ById(new Educa_Ficha_S5_6PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_6", educa_ficha_s5_6);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_6";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_6")
public String ajaxGuardarMdlSec5_6(Model model, @RequestBody Educa_Ficha_S5_6Entity educa_ficha_s5_6) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_6.getEduca_ficha_s5_6pk() != null && educa_ficha_s5_6.getEduca_ficha_s5_6pk().getId() != null) { // actualiza

            educa_ficha_s5_6.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_6.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_6.getEduca_ficha_s5_6pk().setId(demuna_FichaService.generarIdS5_6(educa_ficha_s5_6.getEduca_ficha_s5_6pk().getId_ficha()));
            educa_ficha_s5_6.setUsu_registro(usuario_usu);
            educa_ficha_s5_6.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_6(educa_ficha_s5_6);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listarS5_6ByIdFicha(educa_ficha_s5_6.getEduca_ficha_s5_6pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_6";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_6")
public String ajaxEliminarModalSec5_6(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_6(new Educa_Ficha_S5_6PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listarS5_6ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_6";
}

////////////////////FIN MANTENIMIENTO 5_6/////////////////////////////////////////////////////////////



//////////////////////////////////////MANTENIMIENTO 5-7 ESTADO CONSERVA/////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_7")
public String ajaxBuscarSec5_7(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_7Entity educa_ficha_s5_7 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_7 = new Educa_Ficha_S5_7Entity();
            educa_ficha_s5_7.setEduca_ficha_s5_7pk(new Educa_Ficha_S5_7PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_7 = demuna_FichaService.getFicha_S5_7ById(new Educa_Ficha_S5_7PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_7", educa_ficha_s5_7);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_7";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_7")
public String ajaxGuardarMdlSec5_7(Model model, @RequestBody Educa_Ficha_S5_7Entity educa_ficha_s5_7) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_7.getEduca_ficha_s5_7pk() != null && educa_ficha_s5_7.getEduca_ficha_s5_7pk().getId() != null) { // actualiza

            educa_ficha_s5_7.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_7.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_7.getEduca_ficha_s5_7pk().setId(demuna_FichaService.generarIdS5_7(educa_ficha_s5_7.getEduca_ficha_s5_7pk().getId_ficha()));
            educa_ficha_s5_7.setUsu_registro(usuario_usu);
            educa_ficha_s5_7.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_7(educa_ficha_s5_7);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listarS5_7ByIdFicha(educa_ficha_s5_7.getEduca_ficha_s5_7pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_7";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_7")
public String ajaxEliminarModalSec5_7(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_7(new Educa_Ficha_S5_7PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listarS5_7ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_7";
}

////////////////////FIN MANTENIMIENTO 5_7/////////////////////////////////////////////////////////////

//////////////////////////////////////MANTENIMIENTO 5-8 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_8")
public String ajaxBuscarSec5_8(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_8Entity educa_ficha_s5_8 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_8 = new Educa_Ficha_S5_8Entity();
            educa_ficha_s5_8.setEduca_ficha_s5_8pk(new Educa_Ficha_S5_8PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_8 = demuna_FichaService.getFicha_S5_8ById(new Educa_Ficha_S5_8PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_8", educa_ficha_s5_8);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_8";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_8")
public String ajaxGuardarMdlSec5_8(Model model, @RequestBody Educa_Ficha_S5_8Entity educa_ficha_s5_8) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_8.getEduca_ficha_s5_8pk() != null && educa_ficha_s5_8.getEduca_ficha_s5_8pk().getId() != null) { // actualiza

            educa_ficha_s5_8.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_8.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_8.getEduca_ficha_s5_8pk().setId(demuna_FichaService.generarIdS5_8(educa_ficha_s5_8.getEduca_ficha_s5_8pk().getId_ficha()));
            educa_ficha_s5_8.setUsu_registro(usuario_usu);
            educa_ficha_s5_8.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_8(educa_ficha_s5_8);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listarS5_8ByIdFicha(educa_ficha_s5_8.getEduca_ficha_s5_8pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_8";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_8")
public String ajaxEliminarModalSec5_8(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_8(new Educa_Ficha_S5_8PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listarS5_8ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_8";
}




//////////////////////////////////////MANTENIMIENTO 5-9 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_9")
public String ajaxBuscarSec5_9(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_9Entity educa_ficha_s5_9 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_9 = new Educa_Ficha_S5_9Entity();
            educa_ficha_s5_9.setEduca_ficha_s5_9pk(new Educa_Ficha_S5_9PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_9 = demuna_FichaService.getFicha_S5_9ById(new Educa_Ficha_S5_9PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_9", educa_ficha_s5_9);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_9";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_9")
public String ajaxGuardarMdlSec5_9(Model model, @RequestBody Educa_Ficha_S5_9Entity educa_ficha_s5_9) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_9.getEduca_ficha_s5_9pk() != null && educa_ficha_s5_9.getEduca_ficha_s5_9pk().getId() != null) { // actualiza

            educa_ficha_s5_9.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_9.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_9.getEduca_ficha_s5_9pk().setId(demuna_FichaService.generarIdS5_9(educa_ficha_s5_9.getEduca_ficha_s5_9pk().getId_ficha()));
            educa_ficha_s5_9.setUsu_registro(usuario_usu);
            educa_ficha_s5_9.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_9(educa_ficha_s5_9);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listarS5_9ByIdFicha(educa_ficha_s5_9.getEduca_ficha_s5_9pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_9";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_9")
public String ajaxEliminarModalSec5_9(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_9(new Educa_Ficha_S5_9PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listarS5_9ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_9";
}



//////////////////////////////////////MANTENIMIENTO 5-10 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_10")
public String ajaxBuscarSec5_10(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_10Entity educa_ficha_s5_10 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_10 = new Educa_Ficha_S5_10Entity();
            educa_ficha_s5_10.setEduca_ficha_s5_10pk(new Educa_Ficha_S5_10PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_10 = demuna_FichaService.getFicha_S5_10ById(new Educa_Ficha_S5_10PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_10", educa_ficha_s5_10);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_10";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_10")
public String ajaxGuardarMdlSec5_10(Model model, @RequestBody Educa_Ficha_S5_10Entity educa_ficha_s5_10) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_10.getEduca_ficha_s5_10pk() != null && educa_ficha_s5_10.getEduca_ficha_s5_10pk().getId() != null) { // actualiza

            educa_ficha_s5_10.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_10.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_10.getEduca_ficha_s5_10pk().setId(demuna_FichaService.generarIdS5_10(educa_ficha_s5_10.getEduca_ficha_s5_10pk().getId_ficha()));
            educa_ficha_s5_10.setUsu_registro(usuario_usu);
            educa_ficha_s5_10.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_10(educa_ficha_s5_10);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listarS5_10ByIdFicha(educa_ficha_s5_10.getEduca_ficha_s5_10pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_10";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_10")
public String ajaxEliminarModalSec5_10(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_10(new Educa_Ficha_S5_10PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listarS5_10ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_10";
}


//////////////////////////////////////MANTENIMIENTO 5-31 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscarSec5_31")
public String ajaxBuscarSec5_31(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha_S5_31Entity educa_ficha_s5_31 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha_s5_31 = new Educa_Ficha_S5_31Entity();
            educa_ficha_s5_31.setEduca_ficha_s5_31pk(new Educa_Ficha_S5_31PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha_s5_31 = demuna_FichaService.getFicha_S5_31ById(new Educa_Ficha_S5_31PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha_s5_31", educa_ficha_s5_31);

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_form_mdl_sec5_31";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardarMdlSec5_31")
public String ajaxGuardarMdlSec5_31(Model model, @RequestBody Educa_Ficha_S5_31Entity educa_ficha_s5_31) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha_s5_31.getEduca_ficha_s5_31pk() != null && educa_ficha_s5_31.getEduca_ficha_s5_31pk().getId() != null) { // actualiza

            educa_ficha_s5_31.setUsu_actualiza(usuario_usu);
            educa_ficha_s5_31.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha_s5_31.getEduca_ficha_s5_31pk().setId(demuna_FichaService.generarIdS5_31(educa_ficha_s5_31.getEduca_ficha_s5_31pk().getId_ficha()));
            educa_ficha_s5_31.setUsu_registro(usuario_usu);
            educa_ficha_s5_31.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFichaS5_31(educa_ficha_s5_31);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listarS5_31ByIdFicha(educa_ficha_s5_31.getEduca_ficha_s5_31pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_31";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminarModalSec5_31")
public String ajaxEliminarModalSec5_31(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFichaS5_31(new Educa_Ficha_S5_31PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listarS5_31ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasDemuna :: data_sec5_31";
}



//////////////////////////////////////FICHA2 -SEC5//////////////////////////////////////////////////////////////

@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_1")
    public String ajaxBuscar2Sec5_1(Model model,
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        Educa_Ficha2_S5_1Entity educa_ficha2_s5_1 = null;

        try {

            if (id == null) {//nuevo
                educa_ficha2_s5_1 = new Educa_Ficha2_S5_1Entity();
                educa_ficha2_s5_1.setEduca_ficha2_s5_1pk(new Educa_Ficha2_S5_1PkEntity(id, id_ficha));
            } else {//buscar
                educa_ficha2_s5_1 = demuna_FichaService.getFicha2_S5_1ById(new Educa_Ficha2_S5_1PkEntity(id, id_ficha));
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
        model.addAttribute("educa_ficha2_s5_1", educa_ficha2_s5_1);

        return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_1";
        
    } 
        
 @RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_1")
    public String ajaxGuardar2MdlSec5_1(Model model, @RequestBody Educa_Ficha2_S5_1Entity educa_ficha2_s5_1) {

        try {

            String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
            Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

            if (educa_ficha2_s5_1.getEduca_ficha2_s5_1pk() != null && educa_ficha2_s5_1.getEduca_ficha2_s5_1pk().getId() != null) {//actualiza

                educa_ficha2_s5_1.setUsu_actualiza(usuario_usu);
                educa_ficha2_s5_1.setFch_actualiza(fecha_hora);
            } else {//inserta
                educa_ficha2_s5_1.getEduca_ficha2_s5_1pk().setId(demuna_FichaService.generar2IdS5_1(educa_ficha2_s5_1.getEduca_ficha2_s5_1pk().getId_ficha()));
                educa_ficha2_s5_1.setUsu_registro(usuario_usu);
                educa_ficha2_s5_1.setFch_registro(fecha_hora);
                
                 System.out.println("inserta");
            }

            demuna_FichaService.guardarFicha2S5_1(educa_ficha2_s5_1);
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listar2S5_1ByIdFicha(educa_ficha2_s5_1.getEduca_ficha2_s5_1pk().getId_ficha()));

        return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_1";
    }

    @RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_1")
    public String ajaxEliminar2ModalSec5_1(Model model,
            @RequestParam("id") Integer id,
            @RequestParam("id_ficha") Integer id_ficha) {

        try {

            demuna_FichaService.eliminarFicha2S5_1(new Educa_Ficha2_S5_1PkEntity(id, id_ficha));

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("lista_s5_1_preguntas", demuna_FichaService.listar2S5_1ByIdFicha(id_ficha));

        return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_1";
    }
    
    
    
  @RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_2")
public String ajaxBuscar2Sec5_2(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_2Entity educa_ficha2_s5_2 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha2_s5_2 = new Educa_Ficha2_S5_2Entity();
            educa_ficha2_s5_2.setEduca_ficha2_s5_2pk(new Educa_Ficha2_S5_2PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_2 = demuna_FichaService.getFicha2_S5_2ById(new Educa_Ficha2_S5_2PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_2", educa_ficha2_s5_2);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_2";
}  
    
@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_2")
public String ajaxGuardar2MdlSec5_2(Model model, @RequestBody Educa_Ficha2_S5_2Entity educa_ficha2_s5_2) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_2.getEduca_ficha2_s5_2pk() != null && educa_ficha2_s5_2.getEduca_ficha2_s5_2pk().getId() != null) { // actualiza

            educa_ficha2_s5_2.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_2.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_2.getEduca_ficha2_s5_2pk().setId(demuna_FichaService.generar2IdS5_2(educa_ficha2_s5_2.getEduca_ficha2_s5_2pk().getId_ficha()));
            educa_ficha2_s5_2.setUsu_registro(usuario_usu);
            educa_ficha2_s5_2.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_2(educa_ficha2_s5_2);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listar2S5_2ByIdFicha(educa_ficha2_s5_2.getEduca_ficha2_s5_2pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_2";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_2")
public String ajaxEliminar2ModalSec5_2(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFicha2S5_2(new Educa_Ficha2_S5_2PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_2_preguntas", demuna_FichaService.listar2S5_2ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_2";
}



/*****************************************************************************/
////////////////////////////////////////MANTENIMIENTO 5-3 SISTEMA ESTRUCTURAL/////////////////////////////////////////////////////////////
    
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_3")
public String ajaxBuscar2Sec5_3(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_3Entity educa_ficha2_s5_3 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha2_s5_3 = new Educa_Ficha2_S5_3Entity();
            educa_ficha2_s5_3.setEduca_ficha2_s5_3pk(new Educa_Ficha2_S5_3PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_3 = demuna_FichaService.getFicha2_S5_3ById(new Educa_Ficha2_S5_3PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_3", educa_ficha2_s5_3);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_3";
}


@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_3")
public String ajaxGuardar2MdlSec5_3(Model model, @RequestBody Educa_Ficha2_S5_3Entity educa_ficha2_s5_3) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_3.getEduca_ficha2_s5_3pk() != null && educa_ficha2_s5_3.getEduca_ficha2_s5_3pk().getId() != null) { // actualiza

            educa_ficha2_s5_3.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_3.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_3.getEduca_ficha2_s5_3pk().setId(demuna_FichaService.generar2IdS5_3(educa_ficha2_s5_3.getEduca_ficha2_s5_3pk().getId_ficha()));
            educa_ficha2_s5_3.setUsu_registro(usuario_usu);
            educa_ficha2_s5_3.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_3(educa_ficha2_s5_3);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listar2S5_3ByIdFicha(educa_ficha2_s5_3.getEduca_ficha2_s5_3pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_3";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_3")
public String ajaxEliminar2ModalSec5_3(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFicha2S5_3(new Educa_Ficha2_S5_3PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_3_preguntas", demuna_FichaService.listar2S5_3ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_3";
}

// MANTENIMIENTO 5-4 PAREDES
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_4")
public String ajaxBuscar2Sec5_4(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_4Entity educa_ficha2_s5_4 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha2_s5_4 = new Educa_Ficha2_S5_4Entity();
            educa_ficha2_s5_4.setEduca_ficha2_s5_4pk(new Educa_Ficha2_S5_4PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_4 = demuna_FichaService.getFicha2_S5_4ById(new Educa_Ficha2_S5_4PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_4", educa_ficha2_s5_4);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_4";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_4")
public String ajaxGuardar2MdlSec5_4(Model model, @RequestBody Educa_Ficha2_S5_4Entity educa_ficha2_s5_4) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_4.getEduca_ficha2_s5_4pk() != null && educa_ficha2_s5_4.getEduca_ficha2_s5_4pk().getId() != null) { // actualiza

            educa_ficha2_s5_4.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_4.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_4.getEduca_ficha2_s5_4pk().setId(demuna_FichaService.generar2IdS5_4(educa_ficha2_s5_4.getEduca_ficha2_s5_4pk().getId_ficha()));
            educa_ficha2_s5_4.setUsu_registro(usuario_usu);
            educa_ficha2_s5_4.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_4(educa_ficha2_s5_4);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listar2S5_4ByIdFicha(educa_ficha2_s5_4.getEduca_ficha2_s5_4pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_4";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_4")
public String ajaxEliminar2ModalSec5_4(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFicha2S5_4(new Educa_Ficha2_S5_4PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_4_preguntas", demuna_FichaService.listar2S5_4ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_4";
}

// MANTENIMIENTO 5-5 TECHOS
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_5")
public String ajaxBuscar2Sec5_5(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_5Entity educa_ficha2_s5_5 = null;

    try {

        if (id == null) { // nuevo
            educa_ficha2_s5_5 = new Educa_Ficha2_S5_5Entity();
            educa_ficha2_s5_5.setEduca_ficha2_s5_5pk(new Educa_Ficha2_S5_5PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_5 = demuna_FichaService.getFicha2_S5_5ById(new Educa_Ficha2_S5_5PkEntity(id, id_ficha));
        }

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_5", educa_ficha2_s5_5);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_5";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_5")
public String ajaxGuardar2MdlSec5_5(Model model, @RequestBody Educa_Ficha2_S5_5Entity educa_ficha2_s5_5) {

    try {

        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_5.getEduca_ficha2_s5_5pk() != null && educa_ficha2_s5_5.getEduca_ficha2_s5_5pk().getId() != null) { // actualiza

            educa_ficha2_s5_5.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_5.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_5.getEduca_ficha2_s5_5pk().setId(demuna_FichaService.generar2IdS5_5(educa_ficha2_s5_5.getEduca_ficha2_s5_5pk().getId_ficha()));
            educa_ficha2_s5_5.setUsu_registro(usuario_usu);
            educa_ficha2_s5_5.setFch_registro(fecha_hora);
            
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_5(educa_ficha2_s5_5);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listar2S5_5ByIdFicha(educa_ficha2_s5_5.getEduca_ficha2_s5_5pk().getId_ficha()));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_5";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_5")
public String ajaxEliminar2ModalSec5_5(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {

        demuna_FichaService.eliminarFicha2S5_5(new Educa_Ficha2_S5_5PkEntity(id, id_ficha));

    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_5_preguntas", demuna_FichaService.listar2S5_5ByIdFicha(id_ficha));

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_5";
}



////////////////////////////////////////MANTENIMIENTO 5-6 TECHOS/////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_6")
public String ajaxBuscar2Sec5_6(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_6Entity educa_ficha2_s5_6 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_6 = new Educa_Ficha2_S5_6Entity();
            educa_ficha2_s5_6.setEduca_ficha2_s5_6pk(new Educa_Ficha2_S5_6PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_6 = demuna_FichaService.getFicha2_S5_6ById(new Educa_Ficha2_S5_6PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_6", educa_ficha2_s5_6);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_6";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_6")
public String ajaxGuardar2MdlSec5_6(Model model, @RequestBody Educa_Ficha2_S5_6Entity educa_ficha2_s5_6) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_6.getEduca_ficha2_s5_6pk() != null && educa_ficha2_s5_6.getEduca_ficha2_s5_6pk().getId() != null) { // actualiza
            educa_ficha2_s5_6.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_6.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_6.getEduca_ficha2_s5_6pk().setId(demuna_FichaService.generar2IdS5_6(educa_ficha2_s5_6.getEduca_ficha2_s5_6pk().getId_ficha()));
            educa_ficha2_s5_6.setUsu_registro(usuario_usu);
            educa_ficha2_s5_6.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_6(educa_ficha2_s5_6);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listar2S5_6ByIdFicha(educa_ficha2_s5_6.getEduca_ficha2_s5_6pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_6";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_6")
public String ajaxEliminar2ModalSec5_6(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_6(new Educa_Ficha2_S5_6PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_6_preguntas", demuna_FichaService.listar2S5_6ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_6";
}

////////////////////FIN MANTENIMIENTO 5_6/////////////////////////////////////////////////////////////

//////////////////////////////////////MANTENIMIENTO 5-7 ESTADO CONSERVA/////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_7")
public String ajaxBuscar2Sec5_7(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_7Entity educa_ficha2_s5_7 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_7 = new Educa_Ficha2_S5_7Entity();
            educa_ficha2_s5_7.setEduca_ficha2_s5_7pk(new Educa_Ficha2_S5_7PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_7 = demuna_FichaService.getFicha2_S5_7ById(new Educa_Ficha2_S5_7PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_7", educa_ficha2_s5_7);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_7";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_7")
public String ajaxGuardar2MdlSec5_7(Model model, @RequestBody Educa_Ficha2_S5_7Entity educa_ficha2_s5_7) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_7.getEduca_ficha2_s5_7pk() != null && educa_ficha2_s5_7.getEduca_ficha2_s5_7pk().getId() != null) { // actualiza
            educa_ficha2_s5_7.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_7.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_7.getEduca_ficha2_s5_7pk().setId(demuna_FichaService.generar2IdS5_7(educa_ficha2_s5_7.getEduca_ficha2_s5_7pk().getId_ficha()));
            educa_ficha2_s5_7.setUsu_registro(usuario_usu);
            educa_ficha2_s5_7.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_7(educa_ficha2_s5_7);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listar2S5_7ByIdFicha(educa_ficha2_s5_7.getEduca_ficha2_s5_7pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_7";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_7")
public String ajaxEliminar2ModalSec5_7(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_7(new Educa_Ficha2_S5_7PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_7_preguntas", demuna_FichaService.listar2S5_7ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_7";
}

////////////////////FIN MANTENIMIENTO 5_7/////////////////////////////////////////////////////////////

//////////////////////////////////////MANTENIMIENTO 5-8 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_8")
public String ajaxBuscar2Sec5_8(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_8Entity educa_ficha2_s5_8 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_8 = new Educa_Ficha2_S5_8Entity();
            educa_ficha2_s5_8.setEduca_ficha2_s5_8pk(new Educa_Ficha2_S5_8PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_8 = demuna_FichaService.getFicha2_S5_8ById(new Educa_Ficha2_S5_8PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_8", educa_ficha2_s5_8);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_8";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_8")
public String ajaxGuardar2MdlSec5_8(Model model, @RequestBody Educa_Ficha2_S5_8Entity educa_ficha2_s5_8) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_8.getEduca_ficha2_s5_8pk() != null && educa_ficha2_s5_8.getEduca_ficha2_s5_8pk().getId() != null) { // actualiza
            educa_ficha2_s5_8.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_8.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_8.getEduca_ficha2_s5_8pk().setId(demuna_FichaService.generar2IdS5_8(educa_ficha2_s5_8.getEduca_ficha2_s5_8pk().getId_ficha()));
            educa_ficha2_s5_8.setUsu_registro(usuario_usu);
            educa_ficha2_s5_8.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_8(educa_ficha2_s5_8);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listar2S5_8ByIdFicha(educa_ficha2_s5_8.getEduca_ficha2_s5_8pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_8";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_8")
public String ajaxEliminar2ModalSec5_8(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_8(new Educa_Ficha2_S5_8PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_8_preguntas", demuna_FichaService.listar2S5_8ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_8";
}

////////////////////FIN MANTENIMIENTO 5_8/////////////////////////////////////////////////////////////

//////////////////////////////////////MANTENIMIENTO 5-9 ESTADO/////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_9")
public String ajaxBuscar2Sec5_9(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_9Entity educa_ficha2_s5_9 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_9 = new Educa_Ficha2_S5_9Entity();
            educa_ficha2_s5_9.setEduca_ficha2_s5_9pk(new Educa_Ficha2_S5_9PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_9 = demuna_FichaService.getFicha2_S5_9ById(new Educa_Ficha2_S5_9PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_9", educa_ficha2_s5_9);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_9";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_9")
public String ajaxGuardar2MdlSec5_9(Model model, @RequestBody Educa_Ficha2_S5_9Entity educa_ficha2_s5_9) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_9.getEduca_ficha2_s5_9pk() != null && educa_ficha2_s5_9.getEduca_ficha2_s5_9pk().getId() != null) { // actualiza
            educa_ficha2_s5_9.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_9.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_9.getEduca_ficha2_s5_9pk().setId(demuna_FichaService.generar2IdS5_9(educa_ficha2_s5_9.getEduca_ficha2_s5_9pk().getId_ficha()));
            educa_ficha2_s5_9.setUsu_registro(usuario_usu);
            educa_ficha2_s5_9.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_9(educa_ficha2_s5_9);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listar2S5_9ByIdFicha(educa_ficha2_s5_9.getEduca_ficha2_s5_9pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_9";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_9")
public String ajaxEliminar2ModalSec5_9(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_9(new Educa_Ficha2_S5_9PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_9_preguntas", demuna_FichaService.listar2S5_9ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_9";
}

////////////////////FIN MANTENIMIENTO 5_9/////////////////////////////////////////////////////////////

//////////////////////////////////////MANTENIMIENTO 5-10 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_10")
public String ajaxBuscar2Sec5_10(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_10Entity educa_ficha2_s5_10 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_10 = new Educa_Ficha2_S5_10Entity();
            educa_ficha2_s5_10.setEduca_ficha2_s5_10pk(new Educa_Ficha2_S5_10PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_10 = demuna_FichaService.getFicha2_S5_10ById(new Educa_Ficha2_S5_10PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_10", educa_ficha2_s5_10);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_10";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_10")
public String ajaxGuardar2MdlSec5_10(Model model, @RequestBody Educa_Ficha2_S5_10Entity educa_ficha2_s5_10) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_10.getEduca_ficha2_s5_10pk() != null && educa_ficha2_s5_10.getEduca_ficha2_s5_10pk().getId() != null) { // actualiza
            educa_ficha2_s5_10.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_10.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_10.getEduca_ficha2_s5_10pk().setId(demuna_FichaService.generar2IdS5_10(educa_ficha2_s5_10.getEduca_ficha2_s5_10pk().getId_ficha()));
            educa_ficha2_s5_10.setUsu_registro(usuario_usu);
            educa_ficha2_s5_10.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_10(educa_ficha2_s5_10);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listar2S5_10ByIdFicha(educa_ficha2_s5_10.getEduca_ficha2_s5_10pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_10";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_10")
public String ajaxEliminar2ModalSec5_10(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_10(new Educa_Ficha2_S5_10PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_10_preguntas", demuna_FichaService.listar2S5_10ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_10";
}


//////////////////////////////////////MANTENIMIENTO 5-31 ESTADO /////////////////////////////////////////////////////////////
@RequestMapping("/demuna/ficha/formulario/ajaxBuscar2Sec5_31")
public String ajaxBuscar2Sec5_31(Model model,
        @RequestParam(value = "id", required = false) Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    Educa_Ficha2_S5_31Entity educa_ficha2_s5_31 = null;

    try {
        if (id == null) { // nuevo
            educa_ficha2_s5_31 = new Educa_Ficha2_S5_31Entity();
            educa_ficha2_s5_31.setEduca_ficha2_s5_31pk(new Educa_Ficha2_S5_31PkEntity(id, id_ficha));
        } else { // buscar
            educa_ficha2_s5_31 = demuna_FichaService.getFicha2_S5_31ById(new Educa_Ficha2_S5_31PkEntity(id, id_ficha));
        }
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_preguntas", demuna_FichaService.listarPregunta());
    model.addAttribute("educa_ficha2_s5_31", educa_ficha2_s5_31);

    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_form_mdl_sec5_31";
}

@RequestMapping("/demuna/ficha/formulario/ajaxGuardar2MdlSec5_31")
public String ajaxGuardar2MdlSec5_31(Model model, @RequestBody Educa_Ficha2_S5_31Entity educa_ficha2_s5_31) {
    try {
        String usuario_usu = variableSistemaService.userID().trim().toUpperCase();
        Date fecha_hora = variableSistemaLocalService.getFecha_hora_sistema();

        if (educa_ficha2_s5_31.getEduca_ficha2_s5_31pk() != null && educa_ficha2_s5_31.getEduca_ficha2_s5_31pk().getId() != null) { // actualiza
            educa_ficha2_s5_31.setUsu_actualiza(usuario_usu);
            educa_ficha2_s5_31.setFch_actualiza(fecha_hora);
        } else { // inserta
            educa_ficha2_s5_31.getEduca_ficha2_s5_31pk().setId(demuna_FichaService.generar2IdS5_31(educa_ficha2_s5_31.getEduca_ficha2_s5_31pk().getId_ficha()));
            educa_ficha2_s5_31.setUsu_registro(usuario_usu);
            educa_ficha2_s5_31.setFch_registro(fecha_hora);
            System.out.println("inserta");
        }

        demuna_FichaService.guardarFicha2S5_31(educa_ficha2_s5_31);
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listar2S5_31ByIdFicha(educa_ficha2_s5_31.getEduca_ficha2_s5_31pk().getId_ficha()));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_31";
}

@RequestMapping("/demuna/ficha/formulario/ajaxEliminar2ModalSec5_31")
public String ajaxEliminar2ModalSec5_31(Model model,
        @RequestParam("id") Integer id,
        @RequestParam("id_ficha") Integer id_ficha) {

    try {
        demuna_FichaService.eliminarFicha2S5_31(new Educa_Ficha2_S5_31PkEntity(id, id_ficha));
    } catch (Exception e) {
        logger.error("Error: " + e.getMessage());
        e.printStackTrace();
    }

    model.addAttribute("lista_s5_31_preguntas", demuna_FichaService.listar2S5_31ByIdFicha(id_ficha));
    return "gestiondemuna/usuario/FormularioFichasEduca2 :: data_sec5_31";
}





  //////////////////////////MONITOREO FICHA1////////////////////////////

    @RequestMapping("/demuna/especialista/ficha/listarSupervisionFichas")
    public String listarSeguimientoFichas(Model model, HttpSession httpSession) {

        List<Demuna_FichaEntity> listaFichas = null;

        List<String> listaRegiones = null;
        List<GepCuadroComparativoDTO> listaCuadro = null;
        System.out.println("Entro");
        try {

            listaRegiones = demuna_FichaService.listarRegiones();

            listaFichas = demuna_FichaService.listarSeguimientoFichas("00", "00");

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaCuadro", listaCuadro);
        model.addAttribute("listaRegiones", listaRegiones);
        model.addAttribute("listaFichas", listaFichas);

        return "gestiondemuna/especialista/ListaFichasSupervision";
    }


    @RequestMapping("/demuna/especialista/ficha/ajaxBuscarFichasSupervision")
    public String ajaxBuscarFichasSupervision(Model model,
            @RequestParam("codi_depa_dpt") String codi_depa_dpt,
            @RequestParam("estado") String estado) {
        System.out.println("listficha:");

        System.out.println("departamento recibido: " + codi_depa_dpt);
        System.out.println("Estado recibido: " + estado);

        List<Demuna_FichaEntity> listaFichas = null;

        try {

            listaFichas = demuna_FichaService.listarSeguimientoFichas(codi_depa_dpt, estado);

            System.out.println("listaficha:" + listaFichas);
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaFichas", listaFichas);

        return "gestiondemuna/especialista/ListaFichasSupervision :: data_lista_fichas";
    }
    
       @RequestMapping("/demuna/especialista/ficha/listarMonitoreoFichas")
//    @PreAuthorize("hasRole('ROLE_ESPECIALISTA') ")
    public String listarMonitoreoFichas(Model model, HttpSession httpSession) {

        List<GepCuadroComparativoDTO> listaCuadro = null;
        GepCuadroComparativoDTO totalCuadro = null;

        double total_porcent = 0.0;
        int total_registro = 0;
        int total_colegio = 0;
        String txt_total_porcent = "";

        try {

            listaCuadro = demuna_FichaService.listarCuadroRegistro();

            totalCuadro = demuna_FichaService.listarTotalCuadroRegistro();

            for (GepCuadroComparativoDTO cuadro : listaCuadro) {
//                
                total_registro = total_registro + cuadro.getDir_comp();
                total_colegio = total_colegio + cuadro.getTot_cole();
            }

            if (listaCuadro.size() > 0) {
                total_porcent = (double) total_registro / total_colegio;
                total_porcent = total_porcent * 100;

//                DecimalFormat df = new DecimalFormat("#.##");
//                df.setRoundingMode(RoundingMode.DOWN);
//                txt_total_porcent = df.format(total_porcent) + " % ";
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaCuadro", listaCuadro);
        model.addAttribute("totalCuadro", totalCuadro);
        model.addAttribute("total_porcent", total_porcent);
        model.addAttribute("txt_total_porcent", txt_total_porcent);

        return "gestiondemuna/especialista/ListaFichasMonitoreo";
    }

  //////////////////////////FIN MONITOREO FICHA1////////////////////////////


  //////////////////////////MONITOREO FICHA2////////////////////////////
  @RequestMapping("/demuna/especialista/ficha/listarSupervisionFichas2")
    public String listarSeguimientoFichas2(Model model, HttpSession httpSession) {

        List<Demuna_FichaEntity2> listaFichas2 = null;

        List<String> listaRegiones = null;
        List<GepCuadroComparativoDTO> listaCuadro2 = null;
        System.out.println("Entro");
        try {

            listaRegiones = demuna_FichaService.listarRegiones();

            listaFichas2 = demuna_FichaService.listarSeguimientoFichas2("00", "00");

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaCuadro2", listaCuadro2);
        model.addAttribute("listaRegiones", listaRegiones);
        model.addAttribute("listaFichas2", listaFichas2);

        return "gestiondemuna/especialista/ListaFichasSupervision2";
    }


    @RequestMapping("/demuna/especialista/ficha/ajaxBuscarFichasSupervision2")
    public String ajaxBuscarFichasSupervision2(Model model,
            @RequestParam("codi_depa_dpt") String codi_depa_dpt,
            @RequestParam("estado") String estado) {
        System.out.println("listficha:");

        System.out.println("departamento recibido: " + codi_depa_dpt);
        System.out.println("Estado recibido: " + estado);

        List<Demuna_FichaEntity2> listaFichas2 = null;

        try {

            listaFichas2 = demuna_FichaService.listarSeguimientoFichas2(codi_depa_dpt, estado);

            System.out.println("listaficha2:" + listaFichas2);
        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaFichas2", listaFichas2);

        return "gestiondemuna/especialista/ListaFichasSupervision2 :: data_lista_fichas";
    }
    
 @RequestMapping("/demuna/especialista/ficha/listarMonitoreoFichas2")
//    @PreAuthorize("hasRole('ROLE_ESPECIALISTA') ")
    public String listarMonitoreoFichas2(Model model, HttpSession httpSession) {

        List<GepCuadroComparativoDTO> listaCuadro = null;
        GepCuadroComparativoDTO totalCuadro2 = null;

        double total_porcent = 0.0;
        int total_registro = 0;
        int total_colegio = 0;
        String txt_total_porcent = "";

        try {

            listaCuadro = demuna_FichaService.listarCuadroRegistrox();

            totalCuadro2 = demuna_FichaService.listarTotalCuadroRegistro2();

            for (GepCuadroComparativoDTO cuadro : listaCuadro) {
//                
                total_registro = total_registro + cuadro.getDir_comp();
                total_colegio = total_colegio + cuadro.getTot_cole();
            }

            if (listaCuadro.size() > 0) {
                total_porcent = (double) total_registro / total_colegio;
                total_porcent = total_porcent * 100;

//                DecimalFormat df = new DecimalFormat("#.##");
//                df.setRoundingMode(RoundingMode.DOWN);
//                txt_total_porcent = df.format(total_porcent) + " % ";
            }

        } catch (Exception e) {
            logger.error("Error: " + e.getMessage());
            e.printStackTrace();
        }

        model.addAttribute("listaCuadro", listaCuadro);
        model.addAttribute("totalCuadro2", totalCuadro2);
        model.addAttribute("total_porcent", total_porcent);
        model.addAttribute("txt_total_porcent", txt_total_porcent);

        return "gestiondemuna/especialista/ListaFichasMonitoreo2";
    }




  //////////////////////////FIN MONITOREO FICHA2////////////////////////////
    
        
}

