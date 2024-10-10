package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.dto.ReporteDTO;
import com.dp.gestiondemuna.entity.Demuna_Ficha2_S2Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S2Entity;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Demuna_Ficha2_S2Repository extends JpaRepository<Demuna_Ficha2_S2Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s2),0) + 1 from siga.educa_ficha2_S2", nativeQuery = true)
    public Integer generarIdFicha2S2();

    @Query(value = "select f from Demuna_Ficha2_S2Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S2Entity getFicha2S2ByIdFicha(@Param("id_ficha") Integer id_ficha);

  
   

}
