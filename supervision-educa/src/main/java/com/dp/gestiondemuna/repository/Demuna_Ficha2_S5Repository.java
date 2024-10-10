


package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha2_S5Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S5Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_Ficha2_S5Repository extends JpaRepository<Demuna_Ficha2_S5Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s5),0) + 1 from siga.educa_ficha2_S5", nativeQuery = true)
    public Integer generarIdFicha2S5();

    @Query(value = "select f from Demuna_Ficha2_S5Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S5Entity getFicha2S5ByIdFicha(@Param("id_ficha") Integer id_ficha);

 
 
}
