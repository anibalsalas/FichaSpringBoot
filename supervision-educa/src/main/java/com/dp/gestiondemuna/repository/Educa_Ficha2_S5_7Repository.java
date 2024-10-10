/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestiondemuna.repository;



import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_7Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_7PkEntity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Educa_Ficha2_S5_7Repository extends JpaRepository<Educa_Ficha2_S5_7Entity, Educa_Ficha2_S5_7PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.educa_ficha2_s5_conservacion where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generar2IdS5_7(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Educa_Ficha2_S5_7Entity f where f.educa_ficha2_s5_7pk.id_ficha=:id_ficha order by 1 asc")
    public List<Educa_Ficha2_S5_7Entity> listar2S5_7ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);

}