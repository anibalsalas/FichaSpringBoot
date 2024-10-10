package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_FichaEntity;
import com.dp.gestiondemuna.entity.Demuna_FichaEntity2;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_FichaRepository2 extends JpaRepository<Demuna_FichaEntity2, Integer> {

    @Query("select f from Demuna_FichaEntity2 f where (trim(f.usu_registro)=trim(:usu_registro)) and  (f.codi_depe_tde=:codi_depe_tde) order by  f.departamento_educa asc,f.provincia_educa asc,f.distrito_educa asc,  f.estado desc")
    public List<Demuna_FichaEntity2> listarFichas2(@Param("usu_registro") String usu_registro, @Param("codi_depe_tde") String codi_depe_tde);

    @Query("select f from Demuna_FichaEntity2 f where ('00'=trim(:cod_unico) or trim(f.cod_unico)=trim(:cod_unico))")
    public List<Demuna_FichaEntity2> listarFichasByCodUnico2(@Param("cod_unico") String cod_unico);

    @Query("select f from Demuna_FichaEntity2 f where f.cod_unico IN ('00005197','00007277')")
    public List<Demuna_FichaEntity2> listarFichasByCodUnico2();

    @Query(value = "select nvl(max(id_ficha),0) + 1 from siga.educa_ficha2", nativeQuery = true)
    public Integer generarIdFicha2();

    @Query("select f from Demuna_FichaEntity2 f where f.cod_unico=:cod_unico")
    public List<Demuna_FichaEntity2> buscarFichaByCodigoUnico2(@Param("cod_unico") String cod_unico);

    @Query(value = "select f from Demuna_FichaEntity2 f where f.id_ficha=:id_ficha")
    public Demuna_FichaEntity2 getFicha2ByIdFicha(@Param("id_ficha") Integer id_ficha);

    @Query("select f from Demuna_FichaEntity2 f where trim(f.cod_unico)=trim(:cod_unico) ")
    public Demuna_FichaEntity2 buscarFichaByComisionadoCodigoUnico2(@Param("cod_unico") String cod_unico);

//    @Query("select count(f) from Demuna_FichaEntity2 f where  trim(f.cod_unico) = trim(:cod_unico)")
//    int existeCodUnico(@Param("cod_unico") String cod_unico);
//
//    @Query("select trim(w.des_departament) from Demuna_EstablecimientosEntity2 w group by w.des_departament order by w.des_departament asc")
//    public List<String> listarRegiones();

 
    
    
@Query("SELECT f " +
       "FROM Demuna_FichaEntity2 f " +
       "INNER JOIN Demuna_EstablecimientosEntity2 p " +
       "ON TRIM(f.cod_unico) = TRIM(p.cod_unico) " +
       "WHERE (:codi_depa_dpt = '00' OR TRIM(p.des_departament) = TRIM(:codi_depa_dpt)) " +
       "AND (:estado = '00' OR TRIM(f.estado) = TRIM(:estado))")
public List<Demuna_FichaEntity> listarSeguimientoFichas2(@Param("codi_depa_dpt") String codi_depa_dpt, @Param("estado") String estado);
    
    @Query(value = "select upper(trim(w.des_departament)) as region,\n"
            + "0 as comi_comp,\n"
            + "0 as comi_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox) AND  f.estado='C'),0) as dir_comp,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox) AND f.estado='I'),0) as dir_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox) AND  f.estado in ('C','I')),0) as tot_comi_dir,\n"
            + "nvl( (select count(*) from siga.educa_padron2 wb where trim(wb.coddptox)=trim(w.coddptox) ),0) as tot_cole\n"
            + "from siga.educa_padron2 w group by upper(trim(w.des_departament)), w.coddptox order by w.coddptox asc", nativeQuery = true)
    public List<Object[]> listarCuadroRegistro2_2();

    @Query(value = "select upper(trim(w.des_departament)) as region,\n"
            + "nvl((select count(distinct f.usu_registro) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox) and f.estado IN ('C','I')),0) as cant_comi,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado='C'),0) as comi_comp,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado='I'),0) as comi_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado in ('I','C')),0) as total_comi,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado='C'),0) as dir_comp,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado='I'),0) as dir_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado in ('I','C')),0) as total_dir,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where trim(f.codi_depa_dpt)=trim(w.coddptox)  and f.estado in ('I','C')),0) as total_general,\n"
            + "nvl( (select count(*) from siga.educa_padron2 wb where trim(wb.coddptox)=trim(w.coddptox) ),0) as tot_cole\n"
            + "from siga.educa_padron2 w group by upper(trim(w.des_departament)), w.coddptox order by w.coddptox asc", nativeQuery = true)
    public List<Object[]> listarCuadroRegistro3_2();

    @Query(value = "select \n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where f.codi_depa_dpt is not null and f.estado='C'),0) comi_comp,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where f.codi_depa_dpt is not null  and f.estado='I'),0) comi_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where f.codi_depa_dpt is not null and f.estado='C'),0) dir_comp,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where f.codi_depa_dpt is not null  and f.estado='I'),0) dir_incom,\n"
            + "nvl( (select count(*) from siga.educa_ficha2 f where f.codi_depa_dpt is not null and  f.estado in ('C','I')),0) tot_comi_dir,\n"
            + "nvl( (select count(*) from siga.educa_padron2 wb),0) tot_cole\n"
            + "from dual", nativeQuery = true)
    public Object[] obtenerTotalCuadroRegistro2();

    @Query("select f \n"
            + "from Demuna_FichaEntity2 f inner join Demuna_EstablecimientosEntity2 p\n"
            + "on trim(f.cod_unico) = trim(p.cod_unico)\n"
            + "where upper(trim(p.des_departament)) in (select upper(trim(s.desc_sede_sed))\n"
            + "from UsuarioEntity u inner join  Maestro_PersonalEntity mp \n"
            + "on substr(u.codi_empl_per,2,8) = mp.codi_empl_per\n"
            + "inner join TdependenciasEntity t\n"
            + "on mp.ubic_fisi_tde = t.codi_depe_tde\n"
            + "inner join Sedes_IneiEntity s\n"
            + "on s.codi_sede_sed = t.codi_sede_sed\n"
            + "where trim(u.usuario_usu) =:usuario_usu)")
    public List<Demuna_FichaEntity2> listarFichasByComisionado2(@Param("usuario_usu") String usuario_usu);


    @Query(value = "SELECT SUM(N.ESTADO) CANT_ESTADO\n"
            + "FROM (SELECT  TO_NUMBER(NVL(F.ESTADO_S1,'0'))   ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT  TO_NUMBER(NVL(F.ESTADO_S2,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S2 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S3,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S3 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S4,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S4 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S5,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S5 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S6,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S6 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S7,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S7 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S8,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S8 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S9,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S9 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S10,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S10 F  WHERE F.ID_FICHA=:id_ficha\n"
            + "UNION ALL\n"
            + "SELECT TO_NUMBER(NVL(F.ESTADO_S11,'0')) ESTADO\n"
            + "FROM SIGA.EDUCA_FICHA_S11 F  WHERE F.ID_FICHA=:id_ficha) N", nativeQuery = true)
    int findSumOfStatesByFichaId(@Param("id_ficha") Integer id_ficha);


    @Query("select f from Demuna_FichaEntity f where f.cod_unico=:cod_unico")
    public Demuna_FichaEntity getFichaByCodigoUnico(@Param("cod_unico") String cod_unico);
    
    @Query("select f from Demuna_FichaEntity2 f where f.cod_unico=:cod_unico")
    public Demuna_FichaEntity2 getFichaByCodigoUnico2(@Param("cod_unico") String cod_unico);
    
}
