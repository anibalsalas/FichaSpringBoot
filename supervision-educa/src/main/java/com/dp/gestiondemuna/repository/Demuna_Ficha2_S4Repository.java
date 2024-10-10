

package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha2_S4Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S4Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_Ficha2_S4Repository extends JpaRepository<Demuna_Ficha2_S4Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s4),0) + 1 from siga.educa_ficha2_S4", nativeQuery = true)
    public Integer generarIdFicha2S4();

    @Query(value = "select f from Demuna_Ficha2_S4Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S4Entity getFicha2S4ByIdFicha(@Param("id_ficha") Integer id_ficha);


}




   