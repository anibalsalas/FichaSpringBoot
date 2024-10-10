package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha_S12Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface Demuna_Ficha_S12Repository extends JpaRepository<Demuna_Ficha_S12Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s12),0) + 1 from siga.educa_ficha_S12", nativeQuery = true)
    public Integer generarIdFichaS12();

    @Query(value = "select f from Demuna_Ficha_S12Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha_S12Entity getFichaS12ByIdFicha(@Param("id_ficha") Integer id_ficha);


    @Transactional
    @Modifying
    @Query(value = "update siga.educa_ficha_S12 f set f.estado_s12 = '1', f.usu_valida=:usu_valida, f.fch_valida=sysdate where f.id_ficha=:id_ficha and f.id_ficha_s12=:id_ficha_s12", nativeQuery = true)
    public void validarSec12(@Param("id_ficha") Integer id_ficha, @Param("id_ficha_s12") Integer id_ficha_s12, @Param("usu_valida") String usu_valida);
}
