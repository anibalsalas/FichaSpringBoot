package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha2_S6Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S6Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_Ficha2_S6Repository extends JpaRepository<Demuna_Ficha2_S6Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s6),0) + 1 from siga.educa_ficha2_S6", nativeQuery = true)
    public Integer generarIdFicha2S6();

    @Query(value = "select f from Demuna_Ficha2_S6Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S6Entity getFicha2S6ByIdFicha(@Param("id_ficha") Integer id_ficha);
    


}

