package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha2_S10Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S10Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_Ficha2_S10Repository extends JpaRepository<Demuna_Ficha2_S10Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s10),0) + 1 from siga.educa_ficha2_S10", nativeQuery = true)
    public Integer generarIdFicha2S10();

    @Query(value = "select f from Demuna_Ficha2_S10Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S10Entity getFicha2S10ByIdFicha(@Param("id_ficha") Integer id_ficha);

    
   
}
