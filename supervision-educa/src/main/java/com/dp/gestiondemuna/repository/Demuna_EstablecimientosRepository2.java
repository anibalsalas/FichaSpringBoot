
package com.dp.gestiondemuna.repository;

import com.dp.gestiondemuna.entity.Demuna_EstablecimientosEntity2;
import com.dp.gestiondemuna.entity.Demuna_FichaEntity;
import com.dp.gestiondemuna.entity.Demuna_FichaEntity2;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Demuna_EstablecimientosRepository2 extends JpaRepository<Demuna_EstablecimientosEntity2, Integer> {

    @Query(value = "select f from Demuna_EstablecimientosEntity2 f where trim(f.cod_unico)=:cod_unico")
    public Demuna_EstablecimientosEntity2 buscarByCodEESSficha2(@Param("cod_unico") String cod_unico);

    /**
     * INICIO NUEVO 
     */
    @Query("SELECT f FROM Demuna_EstablecimientosEntity2 f ORDER BY f.nom_entidad ASC")
    public List<Demuna_EstablecimientosEntity2> listarEM2();

    
        @Query(value = "select u from Demuna_EstablecimientosEntity2 u where trim(upper(u.cod_unico))=:username")
    Demuna_EstablecimientosEntity2 buscarAutoridad(@Param("username") String username);
    
    
     @Query("select f from Demuna_FichaEntity2 f where trim(f.cod_unico)=trim(:cod_unico) ")
    public Demuna_FichaEntity2 buscarFichaByComisionadoCodigoUnicoFicha2(@Param("cod_unico") String cod_unico);
    
    /**
     * FIN NUEVO 
     */

//    @Query(value = "select tipo_ficha from Demuna_EstablecimientosEntity f where trim(f.cod_unico)=:cod_unico")
//    public String buscarTipoFichaEstablecimiento(@Param("cod_unico") String cod_unico);
}
