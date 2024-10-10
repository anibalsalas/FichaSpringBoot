
package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_Ficha2_S3Entity;
import com.dp.gestiondemuna.entity.Demuna_Ficha_S3Entity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Demuna_Ficha2_S3Repository extends JpaRepository<Demuna_Ficha2_S3Entity, Integer> {

    @Query(value = "select nvl(max(id_ficha_s3),0) + 1 from siga.educa_ficha2_S3", nativeQuery = true)
    public Integer generarIdFicha2S3();

    @Query(value = "select f from Demuna_Ficha2_S3Entity f where f.id_ficha=:id_ficha")
    public Demuna_Ficha2_S3Entity getFicha2S3ByIdFicha(@Param("id_ficha") Integer id_ficha);

    
}
