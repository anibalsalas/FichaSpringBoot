package com.dp.gestiondemuna.dao.impl;

import com.dp.gestiondemuna.dao.Demuna_FichaDAO;
import com.dp.gestiondemuna.dto.GepCuadroComparativoDTO;
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
import com.dp.gestiondemuna.entity.Educa_ficha_preguntas4Entity;
import com.dp.gestiondemuna.entity.XubigeoEntity;
import com.dp.gestiondemuna.repository.Demuna_ArchivoRepository;
import com.dp.gestiondemuna.repository.Demuna_EstablecimientosRepository;
import com.dp.gestiondemuna.repository.Demuna_EstablecimientosRepository2;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S10Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S2Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S3Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S4Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S5Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S6Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S7Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S8Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha2_S9Repository;
import com.dp.gestiondemuna.repository.Demuna_FichaRepository;
import com.dp.gestiondemuna.repository.Demuna_FichaRepository2;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S10Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S11Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S12Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S2Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S3Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S4Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S5Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S6Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S7Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S8Repository;
import com.dp.gestiondemuna.repository.Demuna_Ficha_S9Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_10Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_1Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_2Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_31Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_3Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_4Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_5Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_6Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_7Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_8Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha2_S5_9Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_PreguntasRepository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S4_3Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_10Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_1Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_2Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_31Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_3Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_4Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_5Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_6Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_7Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_8Repository;
import com.dp.gestiondemuna.repository.Educa_Ficha_S5_9Repository;
import com.dp.gestiondemuna.repository.Xubigeo_Repository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Demuna_FichaDAOImpl implements Demuna_FichaDAO {
    
    @Autowired
    Demuna_FichaRepository demuna_FichaRepository;
    
    @Autowired
    Demuna_Ficha_S2Repository demuna_Ficha_S2Repository;
    
    @Autowired
    Demuna_Ficha_S3Repository demuna_Ficha_S3Repository;
    
    @Autowired
    Demuna_Ficha_S4Repository demuna_Ficha_S4Repository;
    
    @Autowired
    Demuna_Ficha_S5Repository demuna_Ficha_S5Repository;
    
    @Autowired
    Demuna_Ficha_S6Repository demuna_Ficha_S6Repository;
    
    @Autowired
    Demuna_Ficha_S7Repository demuna_Ficha_S7Repository;
    
    @Autowired
    Demuna_Ficha_S8Repository demuna_Ficha_S8Repository;
    
    @Autowired
    Demuna_Ficha_S9Repository demuna_Ficha_S9Repository;
    
    @Autowired
    Demuna_Ficha_S10Repository demuna_Ficha_S10Repository;
    /////////////////FICHA 2//////////////////
    @Autowired
    Demuna_FichaRepository2 demuna_FichaRepository2;
    
     @Autowired
    Demuna_Ficha2_S2Repository demuna_Ficha2_S2Repository;
    
    @Autowired
    Demuna_Ficha2_S3Repository demuna_Ficha2_S3Repository;
    
    @Autowired
    Demuna_Ficha2_S4Repository demuna_Ficha2_S4Repository;
    
    @Autowired
    Demuna_Ficha2_S5Repository demuna_Ficha2_S5Repository;
    
    @Autowired
    Demuna_Ficha2_S6Repository demuna_Ficha2_S6Repository;
    
    @Autowired
    Demuna_Ficha2_S7Repository demuna_Ficha2_S7Repository;
    
    @Autowired
    Demuna_Ficha2_S8Repository demuna_Ficha2_S8Repository;
    
    @Autowired
    Demuna_Ficha2_S9Repository demuna_Ficha2_S9Repository;
    
    @Autowired
    Demuna_Ficha2_S10Repository demuna_Ficha2_S10Repository;
    //////////////////////////////////////////
    @Autowired
    Demuna_Ficha_S11Repository demuna_Ficha_S11Repository;
    
     @Autowired
    Demuna_Ficha_S12Repository demuna_Ficha_S12Repository;
     
   
    @Autowired
    Demuna_EstablecimientosRepository demuna_stablecimientosRepository;
    
     @Autowired
    Demuna_EstablecimientosRepository2 demuna_stablecimientosRepository2;
    
     @Autowired
    Educa_Ficha_S4_3Repository educa_ficha_s4_3Repository;
     
      @Autowired
    Educa_Ficha_S5_1Repository educa_ficha_s5_1Repository;
      
    @Autowired
    Educa_Ficha_S5_2Repository educa_ficha_s5_2Repository;

    @Autowired
    Educa_Ficha_S5_3Repository educa_ficha_s5_3Repository;
        
   @Autowired
    private Educa_Ficha_S5_4Repository educa_ficha_s5_4Repository;
   
    @Autowired
    private Educa_Ficha_S5_5Repository educa_ficha_s5_5Repository;

    @Autowired
    private Educa_Ficha_S5_6Repository educa_ficha_s5_6Repository;

    @Autowired
    private Educa_Ficha_S5_7Repository educa_ficha_s5_7Repository;

    @Autowired
    private Educa_Ficha_S5_8Repository educa_ficha_s5_8Repository;

    @Autowired
    private Educa_Ficha_S5_9Repository educa_ficha_s5_9Repository;
    
     @Autowired
    private Educa_Ficha_S5_10Repository educa_ficha_s5_10Repository;
    
      @Autowired
    private Educa_Ficha_S5_31Repository educa_ficha_s5_31Repository;
    
    ////////////////////////////////////////////////////////////////////////
      @Autowired
    private Educa_Ficha2_S5_1Repository educa_ficha2_s5_1Repository;
      
    @Autowired
    private Educa_Ficha2_S5_2Repository educa_ficha2_s5_2Repository;

    @Autowired
    private Educa_Ficha2_S5_3Repository educa_ficha2_s5_3Repository;
        
   @Autowired
    private Educa_Ficha2_S5_4Repository educa_ficha2_s5_4Repository;
   
    @Autowired
    private Educa_Ficha2_S5_5Repository educa_ficha2_s5_5Repository;

    @Autowired
    private Educa_Ficha2_S5_6Repository educa_ficha2_s5_6Repository;

    @Autowired
    private Educa_Ficha2_S5_7Repository educa_ficha2_s5_7Repository;

    @Autowired
    private Educa_Ficha2_S5_8Repository educa_ficha2_s5_8Repository;

    @Autowired
    private Educa_Ficha2_S5_9Repository educa_ficha2_s5_9Repository;
    
     @Autowired
    private Educa_Ficha2_S5_10Repository educa_ficha2_s5_10Repository;
    
      @Autowired
    private Educa_Ficha2_S5_31Repository educa_ficha2_s5_31Repository;
      
      
////////////////////////////////////////////////////////////////////////////////////////////
     @Autowired
     Educa_Ficha_PreguntasRepository educa_ficha_PreguntasRepository;
     
    @Autowired
    Xubigeo_Repository xubigeo_Repository;
    
    public Demuna_FichaDAOImpl() {
    }
    
    @Override
    public List<Demuna_FichaEntity> listarFichas(String usuario_usu, String codi_depe_tde) {
        return demuna_FichaRepository.listarFichas(usuario_usu, codi_depe_tde);
    }
    
    @Override
    public Integer generarIdFicha() {
        return demuna_FichaRepository.generarIdFicha();
    }
    
    @Override
    public void guardarFicha(Demuna_FichaEntity ficha) {
        demuna_FichaRepository.save(ficha);
    }
    
    @Override
    public List<Demuna_FichaEntity> buscarFichaByCodigoUnico(String cod_unico) {
        return demuna_FichaRepository.buscarFichaByCodigoUnico(cod_unico);
    }
    
    @Override
    public Integer generarIdFichaS2() {
        return demuna_Ficha_S2Repository.generarIdFichaS2();
    }
    
    @Override
    public void guardarFichaS2(Demuna_Ficha_S2Entity fichaS2) {
        demuna_Ficha_S2Repository.save(fichaS2);
    }
    
    @Override
    public Integer generarIdFichaS3() {
        return demuna_Ficha_S3Repository.generarIdFichaS3();
    }
    
    @Override
    public void guardarFichaS3(Demuna_Ficha_S3Entity fichaS3) {
        demuna_Ficha_S3Repository.save(fichaS3);
    }
    
    @Override
    public Integer generarIdFichaS4() {
        return demuna_Ficha_S4Repository.generarIdFichaS4();
    }
    
    @Override
    public void guardarFichaS4(Demuna_Ficha_S4Entity fichaS4) {
        demuna_Ficha_S4Repository.save(fichaS4);
    }
    
    @Override
    public Integer generarIdFichaS5() {
        return demuna_Ficha_S5Repository.generarIdFichaS5();
    }
    
    @Override
    public void guardarFichaS5(Demuna_Ficha_S5Entity fichaS5) {
        demuna_Ficha_S5Repository.save(fichaS5);
    }
    
    @Override
    public Integer generarIdFichaS6() {
        return demuna_Ficha_S6Repository.generarIdFichaS6();
    }
    
    @Override
    public void guardarFichaS6(Demuna_Ficha_S6Entity fichaS6) {
        demuna_Ficha_S6Repository.save(fichaS6);
    }
    
    @Override
    public Integer generarIdFichaS7() {
        return demuna_Ficha_S7Repository.generarIdFichaS7();
    }
    
    @Override
    public void guardarFichaS7(Demuna_Ficha_S7Entity fichaS7) {
        demuna_Ficha_S7Repository.save(fichaS7);
    }
    
    @Override
    public Integer generarIdFichaS8() {
        return demuna_Ficha_S8Repository.generarIdFichaS8();
    }
    
    @Override
    public void guardarFichaS8(Demuna_Ficha_S8Entity fichaS8) {
        demuna_Ficha_S8Repository.save(fichaS8);
    }
    
    @Override
    public Integer generarIdFichaS9() {
        return demuna_Ficha_S9Repository.generarIdFichaS9();
    }
    
    @Override
    public void guardarFichaS9(Demuna_Ficha_S9Entity fichaS9) {
        demuna_Ficha_S9Repository.save(fichaS9);
    }
    
    @Override
    public Integer generarIdFichaS10() {
        return demuna_Ficha_S10Repository.generarIdFichaS10();
    }
    
    @Override
    public void guardarFichaS10(Demuna_Ficha_S10Entity fichaS10) {
        demuna_Ficha_S10Repository.save(fichaS10);
    }
    
    @Override
    public Integer generarIdFichaS11() {
        return demuna_Ficha_S11Repository.generarIdFichaS11();
    }
    
    @Override
    public void guardarFichaS11(Demuna_Ficha_S11Entity fichaS11) {
        demuna_Ficha_S11Repository.save(fichaS11);
    }
    
    
    
       @Override
    public Integer generarIdFichaS12() {
        return demuna_Ficha_S12Repository.generarIdFichaS12();
    }
    
    @Override
    public void guardarFichaS12(Demuna_Ficha_S12Entity fichaS12) {
        demuna_Ficha_S12Repository.save(fichaS12);
    }
    
    @Override
    public List<Demuna_FichaEntity> listarSeguimientoFichas(String codi_depa_dpt, String estado) {
        return demuna_FichaRepository.listarSeguimientoFichas(codi_depa_dpt, estado);
    }
    
     @Override
    public List<Demuna_FichaEntity2> listarSeguimientoFichas2(String codi_depa_dpt, String estado) {
        return demuna_FichaRepository.listarSeguimientoFichas2(codi_depa_dpt, estado);
    }
    
    @Override
    public Demuna_FichaEntity getFichaByIdFicha(Integer id_ficha) {
        return demuna_FichaRepository.getFichaByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S2Entity getFichaS2ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S2Repository.getFichaS2ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S3Entity getFichaS3ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S3Repository.getFichaS3ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S4Entity getFichaS4ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S4Repository.getFichaS4ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S5Entity getFichaS5ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S5Repository.getFichaS5ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S6Entity getFichaS6ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S6Repository.getFichaS6ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S7Entity getFichaS7ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S7Repository.getFichaS7ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S8Entity getFichaS8ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S8Repository.getFichaS8ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S9Entity getFichaS9ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S9Repository.getFichaS9ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S10Entity getFichaS10ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S10Repository.getFichaS10ByIdFicha(id_ficha);
    }
    ///////////////////////////////
    @Override
    public Demuna_Ficha_S11Entity getFichaS11ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S11Repository.getFichaS11ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha_S12Entity getFichaS12ByIdFicha(Integer id_ficha) {
        return demuna_Ficha_S12Repository.getFichaS12ByIdFicha(id_ficha);
    }
    
 /////////////////////////////FICHA 2/////////////////////////////////////////////////////
    @Override
    public List<Demuna_FichaEntity2> listarFichas2(String usuario_usu, String codi_depe_tde) {
        return demuna_FichaRepository2.listarFichas2(usuario_usu, codi_depe_tde);
    }
    
    @Override
    public Integer generarIdFicha2() {
        return demuna_FichaRepository2.generarIdFicha2();
    }
    
    @Override
    public void guardarFicha2(Demuna_FichaEntity2 ficha) {
        demuna_FichaRepository2.save(ficha);
    }
    
    @Override
    public List<Demuna_FichaEntity2> buscarFichaByCodigoUnico2(String cod_unico) {
        return demuna_FichaRepository2.buscarFichaByCodigoUnico2(cod_unico);
    }
    
    @Override
    public Integer generarIdFicha2S2() {
        return demuna_Ficha2_S2Repository.generarIdFicha2S2();
    }
    
    @Override
    public void guardarFicha2S2(Demuna_Ficha2_S2Entity fichaS2) {
        demuna_Ficha2_S2Repository.save(fichaS2);
    }
    
    @Override
    public Integer generarIdFicha2S3() {
        return demuna_Ficha2_S3Repository.generarIdFicha2S3();
    }
    
    @Override
    public void guardarFicha2S3(Demuna_Ficha2_S3Entity fichaS3) {
        demuna_Ficha2_S3Repository.save(fichaS3);
    }
    
    @Override
    public Integer generarIdFicha2S4() {
        return demuna_Ficha2_S4Repository.generarIdFicha2S4();
    }
    
    @Override
    public void guardarFicha2S4(Demuna_Ficha2_S4Entity fichaS4) {
        demuna_Ficha2_S4Repository.save(fichaS4);
    }
    
    @Override
    public Integer generarIdFicha2S5() {
        return demuna_Ficha2_S5Repository.generarIdFicha2S5();
    }
    
    @Override
    public void guardarFicha2S5(Demuna_Ficha2_S5Entity fichaS5) {
        demuna_Ficha2_S5Repository.save(fichaS5);
    }
    
    @Override
    public Integer generarIdFicha2S6() {
        return demuna_Ficha2_S6Repository.generarIdFicha2S6();
    }
    
    @Override
    public void guardarFicha2S6(Demuna_Ficha2_S6Entity fichaS6) {
        demuna_Ficha2_S6Repository.save(fichaS6);
    }
    
    @Override
    public Integer generarIdFicha2S7() {
        return demuna_Ficha2_S7Repository.generarIdFicha2S7();
    }
    
    @Override
    public void guardarFicha2S7(Demuna_Ficha2_S7Entity fichaS7) {
        demuna_Ficha2_S7Repository.save(fichaS7);
    }
    
    @Override
    public Integer generarIdFicha2S8() {
        return demuna_Ficha2_S8Repository.generarIdFicha2S8();
    }
    
    @Override
    public void guardarFicha2S8(Demuna_Ficha2_S8Entity fichaS8) {
        demuna_Ficha2_S8Repository.save(fichaS8);
    }
    
    @Override
    public Integer generarIdFicha2S9() {
        return demuna_Ficha2_S9Repository.generarIdFicha2S9();
    }
    
    @Override
    public void guardarFicha2S9(Demuna_Ficha2_S9Entity fichaS9) {
        demuna_Ficha2_S9Repository.save(fichaS9);
    }
    
    @Override
    public Integer generarIdFicha2S10() {
        return demuna_Ficha2_S10Repository.generarIdFicha2S10();
    }
    
    @Override
    public void guardarFicha2S10(Demuna_Ficha2_S10Entity fichaS10) {
        demuna_Ficha2_S10Repository.save(fichaS10);
    }
    /**************************************************************/
    @Override
    public Demuna_FichaEntity2 getFicha2ByIdFicha(Integer id_ficha) {
        return demuna_FichaRepository2.getFicha2ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S2Entity getFicha2S2ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S2Repository.getFicha2S2ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S3Entity getFicha2S3ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S3Repository.getFicha2S3ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S4Entity getFicha2S4ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S4Repository.getFicha2S4ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S5Entity getFicha2S5ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S5Repository.getFicha2S5ByIdFicha(id_ficha);
    }
    
 

    @Override
    public Demuna_Ficha2_S6Entity getFicha2S6ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S6Repository.getFicha2S6ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S7Entity getFicha2S7ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S7Repository.getFicha2S7ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S8Entity getFicha2S8ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S8Repository.getFicha2S8ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S9Entity getFicha2S9ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S9Repository.getFicha2S9ByIdFicha(id_ficha);
    }
    
    @Override
    public Demuna_Ficha2_S10Entity getFicha2S10ByIdFicha(Integer id_ficha) {
        return demuna_Ficha2_S10Repository.getFicha2S10ByIdFicha(id_ficha);
    }
    
    
///////////////////////////////FIN FICHA 2////////////////////////////////////////
    
    @Override
    public List<XubigeoEntity> findAllDepartamento() {
        return xubigeo_Repository.findAllDepartamento();
    }
    
    @Override
    public List<XubigeoEntity> findAllProvincia(String coddpto) {
        return xubigeo_Repository.findAllProvincia(coddpto);
    }
    
    @Override
    public List<Demuna_EstablecimientosEntity> findMunicipalidadesByDepartamento(String coddptox, String codprovx) {
        return xubigeo_Repository.findMunicipalidadesByDepartamento(coddptox, codprovx);
    }
    
    @Override
    public List<Demuna_EstablecimientosEntity> findMunicipalidadesByDepartamentoAndProvinciaAndDistrito(String coddptox, String codprovx, String coddistx) {
        return xubigeo_Repository.findMunicipalidadesByDepartamentoAndProvinciaAndDistrito(coddptox, codprovx, coddistx);
    }

//    @Override
//    public List<Demuna_EstablecimientosEntity> findUniqueDistrito(String coddptox, String codprovx, String coddistx) {
//        return xubigeo_Repository.findUniqueDistrito(coddptox, codprovx, coddistx);
//    }
    @Override
    public List<XubigeoEntity> findAllDistrito(String coddpto, String codprov) {
        return xubigeo_Repository.findAllDistrito(coddpto, codprov);
    }
    
    @Override
    public XubigeoEntity findDptoByNomb(String departamento) {
        return xubigeo_Repository.findDptoByNomb(departamento);
    }
    
    @Override
    public XubigeoEntity findProvByNomb(String coddpto, String provincia) {
        return xubigeo_Repository.findProvByNomb(coddpto, provincia);
    }
    
    @Override
    public XubigeoEntity findDistByNomb(String coddpto, String codprov, String distrito) {
        return xubigeo_Repository.findDistByNomb(coddpto, codprov, distrito);
    }
    
    @Override
    public List<String> listarRegiones() {
        return demuna_FichaRepository.listarRegiones();
    }

//    @Override
//    public List<ParametroDTO> listarDependenciaEESS() {
//        return listaDependenciaEESS;
//    }
//
//    @Override
//    public List<ParametroDTO> listarCategoriaEESS() {
//        return listaCategoriaEESS;
//    }
    @Override
    public List<Demuna_EstablecimientosEntity> listarEM() {
        return demuna_stablecimientosRepository.listarEM();
    }
    
    
    @Override
    public List<Demuna_EstablecimientosEntity2> listarEM2() {
        return demuna_stablecimientosRepository2.listarEM2();
    }
    
    
    @Override
    public List<GepCuadroComparativoDTO> listarCuadroRegistro() {
        
        List<GepCuadroComparativoDTO> listaCuadro = new ArrayList<>();
        GepCuadroComparativoDTO cuadro = null;
        List<Object[]> resultado = demuna_FichaRepository.listarCuadroRegistro2();
        Double porcent = 0.0;
        System.out.println("id_ficha" + resultado);
        for (Object[] obj : resultado) {
            cuadro = new GepCuadroComparativoDTO();
            
            cuadro.setRegion(obj[0].toString());
            cuadro.setComi_comp(Integer.valueOf(obj[1].toString()));
            cuadro.setComi_incom(Integer.valueOf(obj[2].toString()));
            cuadro.setDir_comp(Integer.valueOf(obj[3].toString()));
            cuadro.setDir_incom(Integer.valueOf(obj[4].toString()));
            cuadro.setTot_comi_dir(Integer.valueOf(obj[5].toString()));
            cuadro.setTot_cole(Integer.valueOf(obj[6].toString()));

//            porcent = (double) cuadro.getTot_comi_dir() / cuadro.getTot_cole();//porcentaje sobre el total de registro (completas e incompletas)
            porcent = (double) cuadro.getDir_comp() / cuadro.getTot_cole();//porcentaje sobre el total de registros completas

            cuadro.setProcent_total(porcent);
            
            listaCuadro.add(cuadro);
        }
        
        return listaCuadro;
        
    }
//

    @Override
    public GepCuadroComparativoDTO listarTotalCuadroRegistro() {
        
        GepCuadroComparativoDTO totalCuadro = new GepCuadroComparativoDTO();
        Object[] obj = demuna_FichaRepository.obtenerTotalCuadroRegistro();
        Double porcent = 0.0;
        System.out.println("op");
        if (obj != null) {
            try {
                
                totalCuadro.setComi_comp(Integer.valueOf(String.valueOf(obj[0].toString())));
                
                totalCuadro.setComi_incom(Integer.valueOf(obj[1].toString()));
                
                totalCuadro.setDir_comp(Integer.valueOf(obj[2].toString()));
                
                totalCuadro.setDir_incom(Integer.valueOf(obj[3].toString()));
                
                totalCuadro.setTot_comi_dir(Integer.valueOf(obj[4].toString()));
                
                totalCuadro.setTot_cole(Integer.valueOf(obj[5].toString()));
                
                porcent = (double) totalCuadro.getTot_comi_dir() / totalCuadro.getTot_cole();
                
                totalCuadro.setProcent_total(porcent);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        return totalCuadro;
    }
   
     @Override
    public List<GepCuadroComparativoDTO> listarCuadroRegistrox() {
        
        List<GepCuadroComparativoDTO> listaCuadro = new ArrayList<>();
        GepCuadroComparativoDTO cuadro = null;
        List<Object[]> resultado = demuna_FichaRepository.listarCuadroRegistro2x();
        Double porcent = 0.0;
        System.out.println("id_ficha" + resultado);
        for (Object[] obj : resultado) {
            cuadro = new GepCuadroComparativoDTO();
            
            cuadro.setRegion(obj[0].toString());
            cuadro.setComi_comp(Integer.valueOf(obj[1].toString()));
            cuadro.setComi_incom(Integer.valueOf(obj[2].toString()));
            cuadro.setDir_comp(Integer.valueOf(obj[3].toString()));
            cuadro.setDir_incom(Integer.valueOf(obj[4].toString()));
            cuadro.setTot_comi_dir(Integer.valueOf(obj[5].toString()));
            cuadro.setTot_cole(Integer.valueOf(obj[6].toString()));

//            porcent = (double) cuadro.getTot_comi_dir() / cuadro.getTot_cole();//porcentaje sobre el total de registro (completas e incompletas)
            porcent = (double) cuadro.getDir_comp() / cuadro.getTot_cole();//porcentaje sobre el total de registros completas

            cuadro.setProcent_total(porcent);
            
            listaCuadro.add(cuadro);
        }
        
        return listaCuadro;
        
    }
    @Override
    public GepCuadroComparativoDTO listarTotalCuadroRegistro2() {
        
        GepCuadroComparativoDTO totalCuadro2 = new GepCuadroComparativoDTO();
        Object[] obj = demuna_FichaRepository.obtenerTotalCuadroRegistro2();
        Double porcent = 0.0;
        System.out.println("op");
        if (obj != null) {
            try {
                
                totalCuadro2.setComi_comp(Integer.valueOf(String.valueOf(obj[0].toString())));
                
                totalCuadro2.setComi_incom(Integer.valueOf(obj[1].toString()));
                
                totalCuadro2.setDir_comp(Integer.valueOf(obj[2].toString()));
                
                totalCuadro2.setDir_incom(Integer.valueOf(obj[3].toString()));
                
                totalCuadro2.setTot_comi_dir(Integer.valueOf(obj[4].toString()));
                
                totalCuadro2.setTot_cole(Integer.valueOf(obj[5].toString()));
                
                porcent = (double) totalCuadro2.getTot_comi_dir() / totalCuadro2.getTot_cole();
                
                totalCuadro2.setProcent_total(porcent);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
        
        return totalCuadro2;
    }

//    @Override
//    public List<GepCuadroComparativoDTO> listarCuadroRegistro2() {
//        
//        List<GepCuadroComparativoDTO> listaCuadro = new ArrayList<>();
//        GepCuadroComparativoDTO cuadro = null;
//        List<Object[]> resultado = demuna_FichaRepository.listarCuadroRegistro3();
//        Double porcent = 0.0;
//        
//        for (Object[] obj : resultado) {
//            cuadro = new GepCuadroComparativoDTO();
//            
//            cuadro.setRegion(obj[0].toString());
//            cuadro.setCant_comi(Integer.valueOf(obj[1].toString()));
//            cuadro.setComi_comp(Integer.valueOf(obj[2].toString()));
//            cuadro.setComi_incom(Integer.valueOf(obj[3].toString()));
//            cuadro.setTotal_comi(Integer.valueOf(obj[4].toString()));
//            cuadro.setDir_comp(Integer.valueOf(obj[5].toString()));
//            cuadro.setDir_incom(Integer.valueOf(obj[6].toString()));
//            cuadro.setTotal_dir(Integer.valueOf(obj[7].toString()));
//            cuadro.setTotal_general(Integer.valueOf(obj[8].toString()));
//            cuadro.setTot_cole(Integer.valueOf(obj[9].toString()));
//
////            porcent = (double) cuadro.getTot_comi_dir() / cuadro.getTot_cole();//porcentaje sobre el total de registro (completas e incompletas)
//            porcent = (double) cuadro.getTotal_general() / cuadro.getTot_cole();//porcentaje sobre el total de registros completas
//
//            cuadro.setProcent_total(porcent);
//            
//            listaCuadro.add(cuadro);
//        }
//        
//        return listaCuadro;
//    }

    @Override
    public List<Demuna_FichaEntity> listarFichasByCodUnico(String cod_unico) {
        return demuna_FichaRepository.listarFichasByCodUnico(cod_unico);
    }
    
    @Override
    public List<Demuna_FichaEntity2> listarFichasByCodUnico2(String cod_unico) {
        return demuna_FichaRepository2.listarFichasByCodUnico2(cod_unico);
    }
    
//    @Override
//    public Demuna_FichaEntity buscarFichaByComisionadoCodigoUnico(String cod_unico) {
//        return demuna_FichaRepository.buscarFichaByComisionadoCodigoUnico(cod_unico);
//    }

    
    @Override
    public List<Demuna_FichaEntity> listarFichasByComisionado(String usuario_usu) {
        return demuna_FichaRepository.listarFichasByComisionado(usuario_usu.trim());
    }
    
    @Override
    public List<Demuna_FichaEntity2> listarFichasByComisionado2(String usuario_usu) {
        return demuna_FichaRepository2.listarFichasByComisionado2(usuario_usu.trim());
    }
   
    @Override
    public Demuna_FichaEntity getFichaByCodigoUnico(String cod_unico) {
        return demuna_FichaRepository.getFichaByCodigoUnico(cod_unico.trim());
    }
    
     @Override
    public Demuna_FichaEntity2 getFichaByCodigoUnico2(String cod_unico) {
        return demuna_FichaRepository.getFichaByCodigoUnico2(cod_unico.trim());
    }
    /*******************************************************************************/
    
    @Override
    public Integer generarIdS4_3(Integer id_ficha) {
        return educa_ficha_s4_3Repository.generarIdS4_3(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S4_3Entity> listarS4_3ByIdFicha(Integer id_ficha) {
        return educa_ficha_s4_3Repository.listarS4_3ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS4_3(Educa_Ficha_S4_3Entity educa_ficha_s4_3) {
        educa_ficha_s4_3Repository.save(educa_ficha_s4_3);
    }

    @Override
    public void eliminarFichaS4_3(Educa_Ficha_S4_3PkEntity educa_ficha_s4_3pk) {
        educa_ficha_s4_3Repository.deleteById(educa_ficha_s4_3pk);
    }

    @Override
    public Educa_Ficha_S4_3Entity getFicha_S4_3ById(Educa_Ficha_S4_3PkEntity educa_ficha_s4_3pk) {
        return educa_ficha_s4_3Repository.getReferenceById(educa_ficha_s4_3pk);
    }
    
    
    @Override
    public List<Educa_ficha_preguntas4Entity> listarPregunta() {
        return educa_ficha_PreguntasRepository.listarPregunta();
    }
    
    @Override
    public Integer generarIdPregunta() {
        return educa_ficha_PreguntasRepository.generarIdPregunta();
    }
    /////////////////////////////////////////////////////////////////////////////////
    @Override
public Integer generarIdS5_1(Integer id_ficha) {
    return educa_ficha_s5_1Repository.generarIdS5_1(id_ficha);
}

@Override
public List<Educa_Ficha_S5_1Entity> listarS5_1ByIdFicha(Integer id_ficha) {
    return educa_ficha_s5_1Repository.listarS5_1ByIdFichaGrupo(id_ficha);
}

@Override
public void guardarFichaS5_1(Educa_Ficha_S5_1Entity educa_ficha_s5_1) {
    educa_ficha_s5_1Repository.save(educa_ficha_s5_1);
}

@Override
public void eliminarFichaS5_1(Educa_Ficha_S5_1PkEntity educa_ficha_s5_1pk) {
    educa_ficha_s5_1Repository.deleteById(educa_ficha_s5_1pk);
}

@Override
public Educa_Ficha_S5_1Entity getFicha_S5_1ById(Educa_Ficha_S5_1PkEntity educa_ficha_s5_1pk) {
    return educa_ficha_s5_1Repository.getReferenceById(educa_ficha_s5_1pk);
}

///////////////////////////////////////////////////////////////////////////////
    @Override
    public Integer generarIdS5_2(Integer id_ficha) {
        return educa_ficha_s5_2Repository.generarIdS5_2(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_2Entity> listarS5_2ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_2Repository.listarS5_2ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_2(Educa_Ficha_S5_2Entity educa_ficha_s5_2) {
        educa_ficha_s5_2Repository.save(educa_ficha_s5_2);
    }

    @Override
    public void eliminarFichaS5_2(Educa_Ficha_S5_2PkEntity educa_ficha_s5_2pk) {
        educa_ficha_s5_2Repository.deleteById(educa_ficha_s5_2pk);
    }

    @Override
    public Educa_Ficha_S5_2Entity getFicha_S5_2ById(Educa_Ficha_S5_2PkEntity educa_ficha_s5_2pk) {
        return educa_ficha_s5_2Repository.getReferenceById(educa_ficha_s5_2pk);
    }

    
    ///////////////////////////////////////////////////////////////////////////////
@Override
public Integer generarIdS5_3(Integer id_ficha) {
    return educa_ficha_s5_3Repository.generarIdS5_3(id_ficha);
}

@Override
public List<Educa_Ficha_S5_3Entity> listarS5_3ByIdFicha(Integer id_ficha) {
    return educa_ficha_s5_3Repository.listarS5_3ByIdFichaGrupo(id_ficha);
}

@Override
public void guardarFichaS5_3(Educa_Ficha_S5_3Entity educa_ficha_s5_3) {
    educa_ficha_s5_3Repository.save(educa_ficha_s5_3);
}

@Override
public void eliminarFichaS5_3(Educa_Ficha_S5_3PkEntity educa_ficha_s5_3pk) {
    educa_ficha_s5_3Repository.deleteById(educa_ficha_s5_3pk);
}

@Override
public Educa_Ficha_S5_3Entity getFicha_S5_3ById(Educa_Ficha_S5_3PkEntity educa_ficha_s5_3pk) {
    return educa_ficha_s5_3Repository.getReferenceById(educa_ficha_s5_3pk);
}
////////////////////////////////////////////////////////////////////////////////////

 @Override
    public Integer generarIdS5_4(Integer id_ficha) {
        return educa_ficha_s5_4Repository.generarIdS5_4(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_4Entity> listarS5_4ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_4Repository.listarS5_4ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_4(Educa_Ficha_S5_4Entity educa_ficha_s5_4) {
        educa_ficha_s5_4Repository.save(educa_ficha_s5_4);
    }

    @Override
    public void eliminarFichaS5_4(Educa_Ficha_S5_4PkEntity educa_ficha_s5_4pk) {
        educa_ficha_s5_4Repository.deleteById(educa_ficha_s5_4pk);
    }

    @Override
    public Educa_Ficha_S5_4Entity getFicha_S5_4ById(Educa_Ficha_S5_4PkEntity educa_ficha_s5_4pk) {
        return educa_ficha_s5_4Repository.getReferenceById(educa_ficha_s5_4pk);
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////////////

 @Override
    public Integer generarIdS5_5(Integer id_ficha) {
        return educa_ficha_s5_5Repository.generarIdS5_5(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_5Entity> listarS5_5ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_5Repository.listarS5_5ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_5(Educa_Ficha_S5_5Entity educa_ficha_s5_5) {
        educa_ficha_s5_5Repository.save(educa_ficha_s5_5);
    }

    @Override
    public void eliminarFichaS5_5(Educa_Ficha_S5_5PkEntity educa_ficha_s5_5pk) {
        educa_ficha_s5_5Repository.deleteById(educa_ficha_s5_5pk);
    }

    @Override
    public Educa_Ficha_S5_5Entity getFicha_S5_5ById(Educa_Ficha_S5_5PkEntity educa_ficha_s5_5pk) {
        return educa_ficha_s5_5Repository.getReferenceById(educa_ficha_s5_5pk);
    }
    
    ///////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Integer generarIdS5_6(Integer id_ficha) {
        return educa_ficha_s5_6Repository.generarIdS5_6(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_6Entity> listarS5_6ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_6Repository.listarS5_6ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_6(Educa_Ficha_S5_6Entity educa_ficha_s5_6) {
        educa_ficha_s5_6Repository.save(educa_ficha_s5_6);
    }

    @Override
    public void eliminarFichaS5_6(Educa_Ficha_S5_6PkEntity educa_ficha_s5_6pk) {
        educa_ficha_s5_6Repository.deleteById(educa_ficha_s5_6pk);
    }

    @Override
    public Educa_Ficha_S5_6Entity getFicha_S5_6ById(Educa_Ficha_S5_6PkEntity educa_ficha_s5_6pk) {
        return educa_ficha_s5_6Repository.getReferenceById(educa_ficha_s5_6pk);
    }
    
    
    ////////////////////////////////////////////////////////////////////////////////////

    @Override
    public Integer generarIdS5_7(Integer id_ficha) {
        return educa_ficha_s5_7Repository.generarIdS5_7(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_7Entity> listarS5_7ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_7Repository.listarS5_7ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_7(Educa_Ficha_S5_7Entity educa_ficha_s5_7) {
        educa_ficha_s5_7Repository.save(educa_ficha_s5_7);
    }

    @Override
    public void eliminarFichaS5_7(Educa_Ficha_S5_7PkEntity educa_ficha_s5_7pk) {
        educa_ficha_s5_7Repository.deleteById(educa_ficha_s5_7pk);
    }

    @Override
    public Educa_Ficha_S5_7Entity getFicha_S5_7ById(Educa_Ficha_S5_7PkEntity educa_ficha_s5_7pk) {
        return educa_ficha_s5_7Repository.getReferenceById(educa_ficha_s5_7pk);
    }


 ////////////////////////////////////////////////////////////////////////////////////   
    @Override
    public Integer generarIdS5_8(Integer id_ficha) {
        return educa_ficha_s5_8Repository.generarIdS5_8(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_8Entity> listarS5_8ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_8Repository.listarS5_8ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_8(Educa_Ficha_S5_8Entity educa_ficha_s5_8) {
        educa_ficha_s5_8Repository.save(educa_ficha_s5_8);
    }

    @Override
    public void eliminarFichaS5_8(Educa_Ficha_S5_8PkEntity educa_ficha_s5_8pk) {
        educa_ficha_s5_8Repository.deleteById(educa_ficha_s5_8pk);
    }

    @Override
    public Educa_Ficha_S5_8Entity getFicha_S5_8ById(Educa_Ficha_S5_8PkEntity educa_ficha_s5_8pk) {
        return educa_ficha_s5_8Repository.getReferenceById(educa_ficha_s5_8pk);
    }

    
    @Override
    public Integer generarIdS5_9(Integer id_ficha) {
        return educa_ficha_s5_9Repository.generarIdS5_9(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_9Entity> listarS5_9ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_9Repository.listarS5_9ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_9(Educa_Ficha_S5_9Entity educa_ficha_s5_9) {
        educa_ficha_s5_9Repository.save(educa_ficha_s5_9);
    }

    @Override
    public void eliminarFichaS5_9(Educa_Ficha_S5_9PkEntity educa_ficha_s5_9pk) {
        educa_ficha_s5_9Repository.deleteById(educa_ficha_s5_9pk);
    }

    @Override
    public Educa_Ficha_S5_9Entity getFicha_S5_9ById(Educa_Ficha_S5_9PkEntity educa_ficha_s5_9pk) {
        return educa_ficha_s5_9Repository.getReferenceById(educa_ficha_s5_9pk);
    }
    
    @Override
    public Integer generarIdS5_10(Integer id_ficha) {
        return educa_ficha_s5_10Repository.generarIdS5_10(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_10Entity> listarS5_10ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_10Repository.listarS5_10ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_10(Educa_Ficha_S5_10Entity educa_ficha_s5_10) {
        educa_ficha_s5_10Repository.save(educa_ficha_s5_10);
    }

    @Override
    public void eliminarFichaS5_10(Educa_Ficha_S5_10PkEntity educa_ficha_s5_10pk) {
        educa_ficha_s5_10Repository.deleteById(educa_ficha_s5_10pk);
    }

    @Override
    public Educa_Ficha_S5_10Entity getFicha_S5_10ById(Educa_Ficha_S5_10PkEntity educa_ficha_s5_10pk) {
        return educa_ficha_s5_10Repository.getReferenceById(educa_ficha_s5_10pk);
    }
///////////////////////////////////////////////////////////
    
    @Override
    public Integer generarIdS5_31(Integer id_ficha) {
        return educa_ficha_s5_31Repository.generarIdS5_31(id_ficha);
    }

    @Override
    public List<Educa_Ficha_S5_31Entity> listarS5_31ByIdFicha(Integer id_ficha) {
        return educa_ficha_s5_31Repository.listarS5_31ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFichaS5_31(Educa_Ficha_S5_31Entity educa_ficha_s5_31) {
        educa_ficha_s5_31Repository.save(educa_ficha_s5_31);
    }

    @Override
    public void eliminarFichaS5_31(Educa_Ficha_S5_31PkEntity educa_ficha_s5_31pk) {
        educa_ficha_s5_31Repository.deleteById(educa_ficha_s5_31pk);
    }

    @Override
    public Educa_Ficha_S5_31Entity getFicha_S5_31ById(Educa_Ficha_S5_31PkEntity educa_ficha_s5_31pk) {
        return educa_ficha_s5_31Repository.getReferenceById(educa_ficha_s5_31pk);
    }

  
    @Override
    public Demuna_EstablecimientosEntity buscarByCodEESSficha1(String cod_unico) {
        return demuna_stablecimientosRepository.buscarByCodEESSficha1(cod_unico.trim());
    }

    @Override
    public Demuna_EstablecimientosEntity2 buscarByCodEESSficha2(String cod_unico) {
        return demuna_stablecimientosRepository2.buscarByCodEESSficha2(cod_unico.trim());
    }

 
    
    @Override
    public Demuna_FichaEntity buscarFichaByComisionadoCodigoUnicoFicha1(String cod_unico) {
        return demuna_stablecimientosRepository.buscarFichaByComisionadoCodigoUnicoFicha1(cod_unico);
    }

    @Override
    public Demuna_FichaEntity2 buscarFichaByComisionadoCodigoUnicoFicha2(String cod_unico) {
        return demuna_stablecimientosRepository2.buscarFichaByComisionadoCodigoUnicoFicha2(cod_unico);
    }
    
    //////////////////////////////////////FICHA2 SEC5///////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////
    @Override
public Integer generar2IdS5_1(Integer id_ficha) {
    return educa_ficha2_s5_1Repository.generar2IdS5_1(id_ficha);
}

@Override
public List<Educa_Ficha2_S5_1Entity> listar2S5_1ByIdFicha(Integer id_ficha) {
    return educa_ficha2_s5_1Repository.listar2S5_1ByIdFichaGrupo(id_ficha);
}

@Override
public void guardarFicha2S5_1(Educa_Ficha2_S5_1Entity educa_ficha2_s5_1) {
    educa_ficha2_s5_1Repository.save(educa_ficha2_s5_1);
}

@Override
public void eliminarFicha2S5_1(Educa_Ficha2_S5_1PkEntity educa_ficha2_s5_1pk) {
    educa_ficha2_s5_1Repository.deleteById(educa_ficha2_s5_1pk);
}

@Override
public Educa_Ficha2_S5_1Entity getFicha2_S5_1ById(Educa_Ficha2_S5_1PkEntity educa_ficha2_s5_1pk) {
    return educa_ficha2_s5_1Repository.getReferenceById(educa_ficha2_s5_1pk);
}

///////////////////////////////////////////////////////////////////////////////
    @Override
    public Integer generar2IdS5_2(Integer id_ficha) {
        return educa_ficha2_s5_2Repository.generar2IdS5_2(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_2Entity> listar2S5_2ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_2Repository.listar2S5_2ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_2(Educa_Ficha2_S5_2Entity educa_ficha2_s5_2) {
        educa_ficha2_s5_2Repository.save(educa_ficha2_s5_2);
    }

    @Override
    public void eliminarFicha2S5_2(Educa_Ficha2_S5_2PkEntity educa_ficha2_s5_2pk) {
        educa_ficha2_s5_2Repository.deleteById(educa_ficha2_s5_2pk);
    }

    @Override
    public Educa_Ficha2_S5_2Entity getFicha2_S5_2ById(Educa_Ficha2_S5_2PkEntity educa_ficha2_s5_2pk) {
        return educa_ficha2_s5_2Repository.getReferenceById(educa_ficha2_s5_2pk);
    }

///////////////////////////////////////////////////////////////////////////////
@Override
public Integer generar2IdS5_3(Integer id_ficha) {
    return educa_ficha2_s5_3Repository.generar2IdS5_3(id_ficha);
}

@Override
public List<Educa_Ficha2_S5_3Entity> listar2S5_3ByIdFicha(Integer id_ficha) {
    return educa_ficha2_s5_3Repository.listar2S5_3ByIdFichaGrupo(id_ficha);
}

@Override
public void guardarFicha2S5_3(Educa_Ficha2_S5_3Entity educa_ficha2_s5_3) {
    educa_ficha2_s5_3Repository.save(educa_ficha2_s5_3);
}

@Override
public void eliminarFicha2S5_3(Educa_Ficha2_S5_3PkEntity educa_ficha2_s5_3pk) {
    educa_ficha2_s5_3Repository.deleteById(educa_ficha2_s5_3pk);
}

@Override
public Educa_Ficha2_S5_3Entity getFicha2_S5_3ById(Educa_Ficha2_S5_3PkEntity educa_ficha2_s5_3pk) {
    return educa_ficha2_s5_3Repository.getReferenceById(educa_ficha2_s5_3pk);
}

////////////////////////////////////////////////////////////////////////////////////
 @Override
    public Integer generar2IdS5_4(Integer id_ficha) {
        return educa_ficha2_s5_4Repository.generar2IdS5_4(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_4Entity> listar2S5_4ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_4Repository.listar2S5_4ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_4(Educa_Ficha2_S5_4Entity educa_ficha2_s5_4) {
        educa_ficha2_s5_4Repository.save(educa_ficha2_s5_4);
    }

    @Override
    public void eliminarFicha2S5_4(Educa_Ficha2_S5_4PkEntity educa_ficha2_s5_4pk) {
        educa_ficha2_s5_4Repository.deleteById(educa_ficha2_s5_4pk);
    }

    @Override
    public Educa_Ficha2_S5_4Entity getFicha2_S5_4ById(Educa_Ficha2_S5_4PkEntity educa_ficha2_s5_4pk) {
        return educa_ficha2_s5_4Repository.getReferenceById(educa_ficha2_s5_4pk);
    }
    
////////////////////////////////////////////////////////////////////////////////////
 @Override
    public Integer generar2IdS5_5(Integer id_ficha) {
        return educa_ficha2_s5_5Repository.generar2IdS5_5(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_5Entity> listar2S5_5ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_5Repository.listar2S5_5ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_5(Educa_Ficha2_S5_5Entity educa_ficha2_s5_5) {
        educa_ficha2_s5_5Repository.save(educa_ficha2_s5_5);
    }

    @Override
    public void eliminarFicha2S5_5(Educa_Ficha2_S5_5PkEntity educa_ficha2_s5_5pk) {
        educa_ficha2_s5_5Repository.deleteById(educa_ficha2_s5_5pk);
    }

    @Override
    public Educa_Ficha2_S5_5Entity getFicha2_S5_5ById(Educa_Ficha2_S5_5PkEntity educa_ficha2_s5_5pk) {
        return educa_ficha2_s5_5Repository.getReferenceById(educa_ficha2_s5_5pk);
    }

////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Integer generar2IdS5_6(Integer id_ficha) {
        return educa_ficha2_s5_6Repository.generar2IdS5_6(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_6Entity> listar2S5_6ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_6Repository.listar2S5_6ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_6(Educa_Ficha2_S5_6Entity educa_ficha2_s5_6) {
        educa_ficha2_s5_6Repository.save(educa_ficha2_s5_6);
    }

    @Override
    public void eliminarFicha2S5_6(Educa_Ficha2_S5_6PkEntity educa_ficha2_s5_6pk) {
        educa_ficha2_s5_6Repository.deleteById(educa_ficha2_s5_6pk);
    }

    @Override
    public Educa_Ficha2_S5_6Entity getFicha2_S5_6ById(Educa_Ficha2_S5_6PkEntity educa_ficha2_s5_6pk) {
        return educa_ficha2_s5_6Repository.getReferenceById(educa_ficha2_s5_6pk);
    }
    
////////////////////////////////////////////////////////////////////////////////////
    @Override
    public Integer generar2IdS5_7(Integer id_ficha) {
        return educa_ficha2_s5_7Repository.generar2IdS5_7(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_7Entity> listar2S5_7ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_7Repository.listar2S5_7ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_7(Educa_Ficha2_S5_7Entity educa_ficha2_s5_7) {
        educa_ficha2_s5_7Repository.save(educa_ficha2_s5_7);
    }

    @Override
    public void eliminarFicha2S5_7(Educa_Ficha2_S5_7PkEntity educa_ficha2_s5_7pk) {
        educa_ficha2_s5_7Repository.deleteById(educa_ficha2_s5_7pk);
    }

    @Override
    public Educa_Ficha2_S5_7Entity getFicha2_S5_7ById(Educa_Ficha2_S5_7PkEntity educa_ficha2_s5_7pk) {
        return educa_ficha2_s5_7Repository.getReferenceById(educa_ficha2_s5_7pk);
    }
////////////////////////////////////////////////////////////////////////////////////
@Override
    public Integer generar2IdS5_8(Integer id_ficha) {
        return educa_ficha2_s5_8Repository.generar2IdS5_8(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_8Entity> listar2S5_8ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_8Repository.listar2S5_8ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_8(Educa_Ficha2_S5_8Entity educa_ficha2_s5_8) {
        educa_ficha2_s5_8Repository.save(educa_ficha2_s5_8);
    }

    @Override
    public void eliminarFicha2S5_8(Educa_Ficha2_S5_8PkEntity educa_ficha2_s5_8pk) {
        educa_ficha2_s5_8Repository.deleteById(educa_ficha2_s5_8pk);
    }

    @Override
    public Educa_Ficha2_S5_8Entity getFicha2_S5_8ById(Educa_Ficha2_S5_8PkEntity educa_ficha2_s5_8pk) {
        return educa_ficha2_s5_8Repository.getReferenceById(educa_ficha2_s5_8pk);
    }
////////////////////////////////////////////////////////////////////////////////////
@Override
    public Integer generar2IdS5_9(Integer id_ficha) {
        return educa_ficha2_s5_9Repository.generar2IdS5_9(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_9Entity> listar2S5_9ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_9Repository.listar2S5_9ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_9(Educa_Ficha2_S5_9Entity educa_ficha2_s5_9) {
        educa_ficha2_s5_9Repository.save(educa_ficha2_s5_9);
    }

    @Override
    public void eliminarFicha2S5_9(Educa_Ficha2_S5_9PkEntity educa_ficha2_s5_9pk) {
        educa_ficha2_s5_9Repository.deleteById(educa_ficha2_s5_9pk);
    }

    @Override
    public Educa_Ficha2_S5_9Entity getFicha2_S5_9ById(Educa_Ficha2_S5_9PkEntity educa_ficha2_s5_9pk) {
        return educa_ficha2_s5_9Repository.getReferenceById(educa_ficha2_s5_9pk);
    }
////////////////////////////////////////////////////////////////////////////////////
@Override
    public Integer generar2IdS5_10(Integer id_ficha) {
        return educa_ficha2_s5_10Repository.generar2IdS5_10(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_10Entity> listar2S5_10ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_10Repository.listar2S5_10ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_10(Educa_Ficha2_S5_10Entity educa_ficha2_s5_10) {
        educa_ficha2_s5_10Repository.save(educa_ficha2_s5_10);
    }

    @Override
    public void eliminarFicha2S5_10(Educa_Ficha2_S5_10PkEntity educa_ficha2_s5_10pk) {
        educa_ficha2_s5_10Repository.deleteById(educa_ficha2_s5_10pk);
    }

    @Override
    public Educa_Ficha2_S5_10Entity getFicha2_S5_10ById(Educa_Ficha2_S5_10PkEntity educa_ficha2_s5_10pk) {
        return educa_ficha2_s5_10Repository.getReferenceById(educa_ficha2_s5_10pk);
    }

 ///////////////////////////////////////////////////////////

    @Override
    public Integer generar2IdS5_31(Integer id_ficha) {
        return educa_ficha2_s5_31Repository.generar2IdS5_31(id_ficha);
    }

    @Override
    public List<Educa_Ficha2_S5_31Entity> listar2S5_31ByIdFicha(Integer id_ficha) {
        return educa_ficha2_s5_31Repository.listar2S5_31ByIdFichaGrupo(id_ficha);
    }

    @Override
    public void guardarFicha2S5_31(Educa_Ficha2_S5_31Entity educa_ficha2_s5_31) {
        educa_ficha2_s5_31Repository.save(educa_ficha2_s5_31);
    }

    @Override
    public void eliminarFicha2S5_31(Educa_Ficha2_S5_31PkEntity educa_ficha2_s5_31pk) {
        educa_ficha2_s5_31Repository.deleteById(educa_ficha2_s5_31pk);
    }

    @Override
    public Educa_Ficha2_S5_31Entity getFicha2_S5_31ById(Educa_Ficha2_S5_31PkEntity educa_ficha2_s5_31pk) {
        return educa_ficha2_s5_31Repository.getReferenceById(educa_ficha2_s5_31pk);
    }
    ///////////////////////////////////////////////////////////


}
