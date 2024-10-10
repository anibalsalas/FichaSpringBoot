/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestiondemuna.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "educa_ficha2_s5_se", schema = "SIGA")
public class Educa_Ficha2_S5_3Entity implements Serializable {
    
     @EmbeddedId
    private Educa_Ficha2_S5_3PkEntity educa_ficha2_s5_3pk;

    private String usu_registro;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_registro;
    private String usu_actualiza;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "America/Lima", locale = "es-PE", shape = JsonFormat.Shape.STRING)
    private Date fch_actualiza;
   
   private String p2_3_terreno;
    private String p2_3_edificacion;
    
    
    @Column(name = "p2_3_se_predomina")
    private String p2_3_se_predomina;
   

    



    public Educa_Ficha2_S5_3Entity() {
    }

    public Educa_Ficha2_S5_3PkEntity getEduca_ficha2_s5_3pk() {
        return educa_ficha2_s5_3pk;
    }

    public void setEduca_ficha2_s5_3pk(Educa_Ficha2_S5_3PkEntity educa_ficha2_s5_3pk) {
        this.educa_ficha2_s5_3pk = educa_ficha2_s5_3pk;
    }

    public String getUsu_registro() {
        return usu_registro;
    }

    public void setUsu_registro(String usu_registro) {
        this.usu_registro = usu_registro;
    }

    public Date getFch_registro() {
        return fch_registro;
    }

    public void setFch_registro(Date fch_registro) {
        this.fch_registro = fch_registro;
    }

    public String getUsu_actualiza() {
        return usu_actualiza;
    }

    public void setUsu_actualiza(String usu_actualiza) {
        this.usu_actualiza = usu_actualiza;
    }

    public Date getFch_actualiza() {
        return fch_actualiza;
    }

    public void setFch_actualiza(Date fch_actualiza) {
        this.fch_actualiza = fch_actualiza;
    }

    public String getP2_3_terreno() {
        return p2_3_terreno;
    }

    public void setP2_3_terreno(String p2_3_terreno) {
        this.p2_3_terreno = p2_3_terreno;
    }

    public String getP2_3_edificacion() {
        return p2_3_edificacion;
    }

    public void setP2_3_edificacion(String p2_3_edificacion) {
        this.p2_3_edificacion = p2_3_edificacion;
    }

    public String getP2_3_se_predomina() {
        return p2_3_se_predomina;
    }

    public void setP2_3_se_predomina(String p2_3_se_predomina) {
        this.p2_3_se_predomina = p2_3_se_predomina;
    }

    
    
    
}