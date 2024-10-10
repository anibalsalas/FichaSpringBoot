/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestiondemuna.repository;



import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_31Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha2_S5_31PkEntity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_31Entity;
import com.dp.gestiondemuna.entity.Educa_Ficha_S5_31PkEntity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author asalas
 */

public interface Educa_Ficha2_S5_31Repository extends JpaRepository<Educa_Ficha2_S5_31Entity, Educa_Ficha2_S5_31PkEntity> {

    @Query(value = "select nvl(max(id),0) + 1 from siga.educa_ficha2_s5_espacios_aulas where id_ficha=:id_ficha", nativeQuery = true)
    public Integer generar2IdS5_31(@Param("id_ficha") Integer id_ficha);

    @Query(value = "select f from Educa_Ficha2_S5_31Entity f where f.educa_ficha2_s5_31pk.id_ficha=:id_ficha order by 1 asc")
    public List<Educa_Ficha2_S5_31Entity> listar2S5_31ByIdFichaGrupo(@Param("id_ficha") Integer id_ficha);

}