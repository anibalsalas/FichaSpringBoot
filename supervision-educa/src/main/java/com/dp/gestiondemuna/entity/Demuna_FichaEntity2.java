/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author asalas
 */
@Entity

@Table(name = "educa_ficha2", schema = "SIGA")
public class Demuna_FichaEntity2 implements Serializable {

    @Id
    private Integer id_ficha;
    
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;

    private String estado;
    private String codi_depe_tde;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_supervision;

     private Integer id_sestablecmnt;
    private String cod_unico;
    private String cod_local;
    private Integer telefono_dp;
    private String correo;
    private Integer p2_1_s1;
    private String p2_2_s1;
    private Integer p2_3_s1;
    private String p2_4_s1;
    private String p2_5_s1;
    private String p2_6_s1;
    private Integer p2_7_años_s1;
    private String p2_7_meses_s1;
    private Integer p2_8_cel_s1;
    private String p2_9_s1;
    private String p2_10_1_s1;
    private String p2_10_2_s1;
    private String p2_10_3_s1;
    private String p2_10_4_s1;
    private String p2_10_5_s1;
    private String p2_10_6_s1;
    private String p2_10_7_s1;
    private String p2_10_8_s1;
    private String p2_10_detalle_s1;
    private String p2_11_s1;
    private String p2_11_detalle_s1;
    private String nom_entidad;
     private String p3_2;
      private String p3_3;

    private String codi_depa_dpt;
    private String codi_prov_tpr;
    private String codi_dist_tdi;
    private String p3_7_s1;
    private String p3_8_s1;
    private String p3_9_s1;
    private String p3_10_s1;
    private String p3_10_1_s1;
    private String p3_10_1_s1_detalle;
    private String p3_11_1_s1;
    private String p3_11_2_s1;
    private String p3_11_3_s1;
    private String p3_11_detalle_s1;
    private String p3_12_s1;
    private String p3_13_s1;
    private String p3_14_1_s1;
    private String p3_14_2_s1;
    private String p3_14_3_s1;
    private String p3_14_4_s1;
    private String p3_14_5_s1;
    private String p3_14_6_s1;
    private Integer p3_14_1_h_s1;
    private BigDecimal p3_14_1_dista_s1;
    private Integer p3_14_1_m_s1;
    private Integer p3_14_2_h_s1;
    private Integer p3_14_2_m_s1;
    private BigDecimal p3_14_2_dista_s1;
    private Integer p3_14_3_h_s1;
    private Integer p3_14_3_m_s1;
    private BigDecimal p3_14_3_dista_s1;
    private Integer p3_14_4_h_s1;
    private Integer p3_14_4_m_s1;
    private BigDecimal p3_14_4_dista_s1;
    private Integer p3_14_5_h_s1;
    private Integer p3_14_5_m_s1;
    private BigDecimal p3_14_5_dista_s1;
    private Integer p3_14_6_h_s1;
    private Integer p3_14_6_m_s1;
    private BigDecimal p3_14_dista_s1;
    private String p3_15_s1;
    private String p3_15_s1_detalle;
    private String p3_16_s1;
    private String p3_16_1_1_s1;
    private String p3_16_1_1_s1_detalle;
    private String p3_16_1_2_s1;
    private String p3_16_1_3_s1;
    private String p3_16_1_4_s1;
    private String p3_16_1_4_detalle;
    private String p3_16_2_s1;
    private String p3_16_3_s1;
    private String p3_16_3_detallar_s1;
    private String p3_17_s1;
    private String p3_18_1_s1;
    private String p3_18_2_s1;
    private String p3_18_3_s1;
    private String p3_18_4_s1;
    private String estado_s1;
    
    private Integer p3_19_1_1m;
    private Integer p3_19_1_1f;
    private Integer p3_19_1_2m;
    private Integer p3_19_1_2f;
    private Integer p3_19_1_3m;
    private Integer p3_19_1_3f;
    private Integer p3_19_1_4m;
    private Integer p3_19_1_4f;
    private Integer p3_19_1_5m;
    private Integer p3_19_1_5f;
    private Integer p3_19_1total;
    
    private Integer p3_19_2_1m;
    private Integer p3_19_2_1f;
    private Integer p3_19_2_2m;
    private Integer p3_19_2_2f;
    private Integer p3_19_2_3m;
    private Integer p3_19_2_3f;
    private Integer p3_19_2_4m;
    private Integer p3_19_2_4f;
    private Integer p3_19_2_5m;
    private Integer p3_19_2_5f;
    private Integer p3_19_2total;
    

    @Formula("(select t.desc_depe_tde from siga.tdependencias t where t.codi_depe_tde = codi_depe_tde)")
    private String txt_desc_depe_tde;

    @Formula("(select u.nomb_cort_usu from siga.usuario u where trim(u.usuario_usu) = trim(usu_registro))")
    private String txt_comisionado;

    @Formula("decode(estado,'I','INCOMPLETA','C','COMPLETA')")
    private String txt_estado_ficha;


    @Formula("(select x.nombre from siga.xubigeo x where x.coddpto = codi_depa_dpt and x.codprov = '00' and x.coddist = '00')")
    private String departamento_educa;
    @Formula("(select x.nombre from siga.xubigeo x where x.coddpto = codi_depa_dpt and x.codprov = codi_prov_tpr and x.coddist = '00')")
    private String provincia_educa;
    @Formula("(select x.nombre from siga.xubigeo x where x.coddpto = codi_depa_dpt and x.codprov = codi_prov_tpr and x.coddist = codi_dist_tdi)")
    private String distrito_educa;
    
    @Transient
    private Demuna_FichaEntity2 educa_ficha2;
    
    @Transient
    public Demuna_Ficha2_S2Entity educa_ficha2_s2;
    @Transient
    private Demuna_Ficha2_S3Entity educa_ficha2_s3;
    @Transient
    private Demuna_Ficha2_S4Entity educa_ficha2_s4;
    @Transient
    private Demuna_Ficha2_S5Entity educa_ficha2_s5;
    @Transient
    private Demuna_Ficha2_S6Entity educa_ficha2_s6;
    @Transient
    private Demuna_Ficha2_S7Entity educa_ficha2_s7;
    @Transient
    private Demuna_Ficha2_S8Entity educa_ficha2_s8;
    @Transient
    private Demuna_Ficha2_S9Entity educa_ficha2_s9;
    @Transient
    private Demuna_Ficha2_S10Entity educa_ficha2_s10;

    
    
    @Transient
    private String msg_modal;
    @Transient
    private String txt_btn_guardado_parcial;
    @Transient
    private boolean flag_readonly;
    @Transient
    private boolean flag_ie;
    @Transient
    private boolean flag_guardado_parcial;
    @Transient
    private String msg_modal_ie;
    @Transient
    private String flag_modal;
    @Transient
    private String cod_unico_ant;

    public Integer getId_ficha() {
        return id_ficha;
    }

    public void setId_ficha(Integer id_ficha) {
        this.id_ficha = id_ficha;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodi_depe_tde() {
        return codi_depe_tde;
    }

    public void setCodi_depe_tde(String codi_depe_tde) {
        this.codi_depe_tde = codi_depe_tde;
    }

    public Date getFch_supervision() {
        return fch_supervision;
    }

    public void setFch_supervision(Date fch_supervision) {
        this.fch_supervision = fch_supervision;
    }

    public Integer getId_sestablecmnt() {
        return id_sestablecmnt;
    }

    public void setId_sestablecmnt(Integer id_sestablecmnt) {
        this.id_sestablecmnt = id_sestablecmnt;
    }

    public String getCod_unico() {
        return cod_unico;
    }

    public void setCod_unico(String cod_unico) {
        this.cod_unico = cod_unico;
    }

    public String getCod_local() {
        return cod_local;
    }

    public void setCod_local(String cod_local) {
        this.cod_local = cod_local;
    }

    public Integer getTelefono_dp() {
        return telefono_dp;
    }

    public void setTelefono_dp(Integer telefono_dp) {
        this.telefono_dp = telefono_dp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getP2_1_s1() {
        return p2_1_s1;
    }

    public void setP2_1_s1(Integer p2_1_s1) {
        this.p2_1_s1 = p2_1_s1;
    }

    public String getP2_2_s1() {
        return p2_2_s1;
    }

    public void setP2_2_s1(String p2_2_s1) {
        this.p2_2_s1 = p2_2_s1;
    }

    public Integer getP2_3_s1() {
        return p2_3_s1;
    }

    public void setP2_3_s1(Integer p2_3_s1) {
        this.p2_3_s1 = p2_3_s1;
    }

    public String getP2_4_s1() {
        return p2_4_s1;
    }

    public void setP2_4_s1(String p2_4_s1) {
        this.p2_4_s1 = p2_4_s1;
    }

    public String getP2_5_s1() {
        return p2_5_s1;
    }

    public void setP2_5_s1(String p2_5_s1) {
        this.p2_5_s1 = p2_5_s1;
    }

    public String getP2_6_s1() {
        return p2_6_s1;
    }

    public void setP2_6_s1(String p2_6_s1) {
        this.p2_6_s1 = p2_6_s1;
    }

    public Integer getP2_7_años_s1() {
        return p2_7_años_s1;
    }

    public void setP2_7_años_s1(Integer p2_7_años_s1) {
        this.p2_7_años_s1 = p2_7_años_s1;
    }

    public String getP2_7_meses_s1() {
        return p2_7_meses_s1;
    }

    public void setP2_7_meses_s1(String p2_7_meses_s1) {
        this.p2_7_meses_s1 = p2_7_meses_s1;
    }

    public Integer getP2_8_cel_s1() {
        return p2_8_cel_s1;
    }

    public void setP2_8_cel_s1(Integer p2_8_cel_s1) {
        this.p2_8_cel_s1 = p2_8_cel_s1;
    }

    public String getP2_9_s1() {
        return p2_9_s1;
    }

    public void setP2_9_s1(String p2_9_s1) {
        this.p2_9_s1 = p2_9_s1;
    }

    public String getP2_10_1_s1() {
        return p2_10_1_s1;
    }

    public void setP2_10_1_s1(String p2_10_1_s1) {
        this.p2_10_1_s1 = p2_10_1_s1;
    }

    public String getP2_10_2_s1() {
        return p2_10_2_s1;
    }

    public void setP2_10_2_s1(String p2_10_2_s1) {
        this.p2_10_2_s1 = p2_10_2_s1;
    }

    public String getP2_10_3_s1() {
        return p2_10_3_s1;
    }

    public void setP2_10_3_s1(String p2_10_3_s1) {
        this.p2_10_3_s1 = p2_10_3_s1;
    }

    public String getP2_10_4_s1() {
        return p2_10_4_s1;
    }

    public void setP2_10_4_s1(String p2_10_4_s1) {
        this.p2_10_4_s1 = p2_10_4_s1;
    }

    public String getP2_10_5_s1() {
        return p2_10_5_s1;
    }

    public void setP2_10_5_s1(String p2_10_5_s1) {
        this.p2_10_5_s1 = p2_10_5_s1;
    }

    public String getP2_10_6_s1() {
        return p2_10_6_s1;
    }

    public void setP2_10_6_s1(String p2_10_6_s1) {
        this.p2_10_6_s1 = p2_10_6_s1;
    }

    public String getP2_10_7_s1() {
        return p2_10_7_s1;
    }

    public void setP2_10_7_s1(String p2_10_7_s1) {
        this.p2_10_7_s1 = p2_10_7_s1;
    }

    public String getP2_10_8_s1() {
        return p2_10_8_s1;
    }

    public void setP2_10_8_s1(String p2_10_8_s1) {
        this.p2_10_8_s1 = p2_10_8_s1;
    }

    public String getP2_10_detalle_s1() {
        return p2_10_detalle_s1;
    }

    public void setP2_10_detalle_s1(String p2_10_detalle_s1) {
        this.p2_10_detalle_s1 = p2_10_detalle_s1;
    }

    public String getP2_11_s1() {
        return p2_11_s1;
    }

    public void setP2_11_s1(String p2_11_s1) {
        this.p2_11_s1 = p2_11_s1;
    }

    public String getP2_11_detalle_s1() {
        return p2_11_detalle_s1;
    }

    public void setP2_11_detalle_s1(String p2_11_detalle_s1) {
        this.p2_11_detalle_s1 = p2_11_detalle_s1;
    }

    public String getNom_entidad() {
        return nom_entidad;
    }

    public void setNom_entidad(String nom_entidad) {
        this.nom_entidad = nom_entidad;
    }

    public String getP3_2() {
        return p3_2;
    }

    public void setP3_2(String p3_2) {
        this.p3_2 = p3_2;
    }

    public String getP3_3() {
        return p3_3;
    }

    public void setP3_3(String p3_3) {
        this.p3_3 = p3_3;
    }

    public String getCodi_depa_dpt() {
        return codi_depa_dpt;
    }

    public void setCodi_depa_dpt(String codi_depa_dpt) {
        this.codi_depa_dpt = codi_depa_dpt;
    }

    public String getCodi_prov_tpr() {
        return codi_prov_tpr;
    }

    public void setCodi_prov_tpr(String codi_prov_tpr) {
        this.codi_prov_tpr = codi_prov_tpr;
    }

    public String getCodi_dist_tdi() {
        return codi_dist_tdi;
    }

    public void setCodi_dist_tdi(String codi_dist_tdi) {
        this.codi_dist_tdi = codi_dist_tdi;
    }

    public String getP3_7_s1() {
        return p3_7_s1;
    }

    public void setP3_7_s1(String p3_7_s1) {
        this.p3_7_s1 = p3_7_s1;
    }

    public String getP3_8_s1() {
        return p3_8_s1;
    }

    public void setP3_8_s1(String p3_8_s1) {
        this.p3_8_s1 = p3_8_s1;
    }

    public String getP3_9_s1() {
        return p3_9_s1;
    }

    public void setP3_9_s1(String p3_9_s1) {
        this.p3_9_s1 = p3_9_s1;
    }

    public String getP3_10_s1() {
        return p3_10_s1;
    }

    public void setP3_10_s1(String p3_10_s1) {
        this.p3_10_s1 = p3_10_s1;
    }

    public String getP3_10_1_s1() {
        return p3_10_1_s1;
    }

    public void setP3_10_1_s1(String p3_10_1_s1) {
        this.p3_10_1_s1 = p3_10_1_s1;
    }

    public String getP3_10_1_s1_detalle() {
        return p3_10_1_s1_detalle;
    }

    public void setP3_10_1_s1_detalle(String p3_10_1_s1_detalle) {
        this.p3_10_1_s1_detalle = p3_10_1_s1_detalle;
    }

    public String getP3_11_1_s1() {
        return p3_11_1_s1;
    }

    public void setP3_11_1_s1(String p3_11_1_s1) {
        this.p3_11_1_s1 = p3_11_1_s1;
    }

    public String getP3_11_2_s1() {
        return p3_11_2_s1;
    }

    public void setP3_11_2_s1(String p3_11_2_s1) {
        this.p3_11_2_s1 = p3_11_2_s1;
    }

    public String getP3_11_3_s1() {
        return p3_11_3_s1;
    }

    public void setP3_11_3_s1(String p3_11_3_s1) {
        this.p3_11_3_s1 = p3_11_3_s1;
    }

    public String getP3_11_detalle_s1() {
        return p3_11_detalle_s1;
    }

    public void setP3_11_detalle_s1(String p3_11_detalle_s1) {
        this.p3_11_detalle_s1 = p3_11_detalle_s1;
    }

    public String getP3_12_s1() {
        return p3_12_s1;
    }

    public void setP3_12_s1(String p3_12_s1) {
        this.p3_12_s1 = p3_12_s1;
    }

    public String getP3_13_s1() {
        return p3_13_s1;
    }

    public void setP3_13_s1(String p3_13_s1) {
        this.p3_13_s1 = p3_13_s1;
    }

    public String getP3_14_1_s1() {
        return p3_14_1_s1;
    }

    public void setP3_14_1_s1(String p3_14_1_s1) {
        this.p3_14_1_s1 = p3_14_1_s1;
    }

    public String getP3_14_2_s1() {
        return p3_14_2_s1;
    }

    public void setP3_14_2_s1(String p3_14_2_s1) {
        this.p3_14_2_s1 = p3_14_2_s1;
    }

    public String getP3_14_3_s1() {
        return p3_14_3_s1;
    }

    public void setP3_14_3_s1(String p3_14_3_s1) {
        this.p3_14_3_s1 = p3_14_3_s1;
    }

    public String getP3_14_4_s1() {
        return p3_14_4_s1;
    }

    public void setP3_14_4_s1(String p3_14_4_s1) {
        this.p3_14_4_s1 = p3_14_4_s1;
    }

    public String getP3_14_5_s1() {
        return p3_14_5_s1;
    }

    public void setP3_14_5_s1(String p3_14_5_s1) {
        this.p3_14_5_s1 = p3_14_5_s1;
    }

    public String getP3_14_6_s1() {
        return p3_14_6_s1;
    }

    public void setP3_14_6_s1(String p3_14_6_s1) {
        this.p3_14_6_s1 = p3_14_6_s1;
    }

    public Integer getP3_14_1_h_s1() {
        return p3_14_1_h_s1;
    }

    public void setP3_14_1_h_s1(Integer p3_14_1_h_s1) {
        this.p3_14_1_h_s1 = p3_14_1_h_s1;
    }

    public BigDecimal getP3_14_1_dista_s1() {
        return p3_14_1_dista_s1;
    }

    public void setP3_14_1_dista_s1(BigDecimal p3_14_1_dista_s1) {
        this.p3_14_1_dista_s1 = p3_14_1_dista_s1;
    }

    public Integer getP3_14_1_m_s1() {
        return p3_14_1_m_s1;
    }

    public void setP3_14_1_m_s1(Integer p3_14_1_m_s1) {
        this.p3_14_1_m_s1 = p3_14_1_m_s1;
    }

    public Integer getP3_14_2_h_s1() {
        return p3_14_2_h_s1;
    }

    public void setP3_14_2_h_s1(Integer p3_14_2_h_s1) {
        this.p3_14_2_h_s1 = p3_14_2_h_s1;
    }

    public Integer getP3_14_2_m_s1() {
        return p3_14_2_m_s1;
    }

    public void setP3_14_2_m_s1(Integer p3_14_2_m_s1) {
        this.p3_14_2_m_s1 = p3_14_2_m_s1;
    }

    public BigDecimal getP3_14_2_dista_s1() {
        return p3_14_2_dista_s1;
    }

    public void setP3_14_2_dista_s1(BigDecimal p3_14_2_dista_s1) {
        this.p3_14_2_dista_s1 = p3_14_2_dista_s1;
    }

    public Integer getP3_14_3_h_s1() {
        return p3_14_3_h_s1;
    }

    public void setP3_14_3_h_s1(Integer p3_14_3_h_s1) {
        this.p3_14_3_h_s1 = p3_14_3_h_s1;
    }

    public Integer getP3_14_3_m_s1() {
        return p3_14_3_m_s1;
    }

    public void setP3_14_3_m_s1(Integer p3_14_3_m_s1) {
        this.p3_14_3_m_s1 = p3_14_3_m_s1;
    }

    public BigDecimal getP3_14_3_dista_s1() {
        return p3_14_3_dista_s1;
    }

    public void setP3_14_3_dista_s1(BigDecimal p3_14_3_dista_s1) {
        this.p3_14_3_dista_s1 = p3_14_3_dista_s1;
    }

    public Integer getP3_14_4_h_s1() {
        return p3_14_4_h_s1;
    }

    public void setP3_14_4_h_s1(Integer p3_14_4_h_s1) {
        this.p3_14_4_h_s1 = p3_14_4_h_s1;
    }

    public Integer getP3_14_4_m_s1() {
        return p3_14_4_m_s1;
    }

    public void setP3_14_4_m_s1(Integer p3_14_4_m_s1) {
        this.p3_14_4_m_s1 = p3_14_4_m_s1;
    }

    public BigDecimal getP3_14_4_dista_s1() {
        return p3_14_4_dista_s1;
    }

    public void setP3_14_4_dista_s1(BigDecimal p3_14_4_dista_s1) {
        this.p3_14_4_dista_s1 = p3_14_4_dista_s1;
    }

    public Integer getP3_14_5_h_s1() {
        return p3_14_5_h_s1;
    }

    public void setP3_14_5_h_s1(Integer p3_14_5_h_s1) {
        this.p3_14_5_h_s1 = p3_14_5_h_s1;
    }

    public Integer getP3_14_5_m_s1() {
        return p3_14_5_m_s1;
    }

    public void setP3_14_5_m_s1(Integer p3_14_5_m_s1) {
        this.p3_14_5_m_s1 = p3_14_5_m_s1;
    }

    public BigDecimal getP3_14_5_dista_s1() {
        return p3_14_5_dista_s1;
    }

    public void setP3_14_5_dista_s1(BigDecimal p3_14_5_dista_s1) {
        this.p3_14_5_dista_s1 = p3_14_5_dista_s1;
    }

    public Integer getP3_14_6_h_s1() {
        return p3_14_6_h_s1;
    }

    public void setP3_14_6_h_s1(Integer p3_14_6_h_s1) {
        this.p3_14_6_h_s1 = p3_14_6_h_s1;
    }

    public Integer getP3_14_6_m_s1() {
        return p3_14_6_m_s1;
    }

    public void setP3_14_6_m_s1(Integer p3_14_6_m_s1) {
        this.p3_14_6_m_s1 = p3_14_6_m_s1;
    }

    public BigDecimal getP3_14_dista_s1() {
        return p3_14_dista_s1;
    }

    public void setP3_14_dista_s1(BigDecimal p3_14_dista_s1) {
        this.p3_14_dista_s1 = p3_14_dista_s1;
    }

    public String getP3_15_s1() {
        return p3_15_s1;
    }

    public void setP3_15_s1(String p3_15_s1) {
        this.p3_15_s1 = p3_15_s1;
    }

    public String getP3_15_s1_detalle() {
        return p3_15_s1_detalle;
    }

    public void setP3_15_s1_detalle(String p3_15_s1_detalle) {
        this.p3_15_s1_detalle = p3_15_s1_detalle;
    }

    public String getP3_16_s1() {
        return p3_16_s1;
    }

    public void setP3_16_s1(String p3_16_s1) {
        this.p3_16_s1 = p3_16_s1;
    }

    public String getP3_16_1_1_s1() {
        return p3_16_1_1_s1;
    }

    public void setP3_16_1_1_s1(String p3_16_1_1_s1) {
        this.p3_16_1_1_s1 = p3_16_1_1_s1;
    }

    public String getP3_16_1_1_s1_detalle() {
        return p3_16_1_1_s1_detalle;
    }

    public void setP3_16_1_1_s1_detalle(String p3_16_1_1_s1_detalle) {
        this.p3_16_1_1_s1_detalle = p3_16_1_1_s1_detalle;
    }

    public String getP3_16_1_2_s1() {
        return p3_16_1_2_s1;
    }

    public void setP3_16_1_2_s1(String p3_16_1_2_s1) {
        this.p3_16_1_2_s1 = p3_16_1_2_s1;
    }

    public String getP3_16_1_3_s1() {
        return p3_16_1_3_s1;
    }

    public void setP3_16_1_3_s1(String p3_16_1_3_s1) {
        this.p3_16_1_3_s1 = p3_16_1_3_s1;
    }

    public String getP3_16_1_4_s1() {
        return p3_16_1_4_s1;
    }

    public void setP3_16_1_4_s1(String p3_16_1_4_s1) {
        this.p3_16_1_4_s1 = p3_16_1_4_s1;
    }

    public String getP3_16_1_4_detalle() {
        return p3_16_1_4_detalle;
    }

    public void setP3_16_1_4_detalle(String p3_16_1_4_detalle) {
        this.p3_16_1_4_detalle = p3_16_1_4_detalle;
    }

    public String getP3_16_2_s1() {
        return p3_16_2_s1;
    }

    public void setP3_16_2_s1(String p3_16_2_s1) {
        this.p3_16_2_s1 = p3_16_2_s1;
    }

    public String getP3_16_3_s1() {
        return p3_16_3_s1;
    }

    public void setP3_16_3_s1(String p3_16_3_s1) {
        this.p3_16_3_s1 = p3_16_3_s1;
    }

    public String getP3_16_3_detallar_s1() {
        return p3_16_3_detallar_s1;
    }

    public void setP3_16_3_detallar_s1(String p3_16_3_detallar_s1) {
        this.p3_16_3_detallar_s1 = p3_16_3_detallar_s1;
    }

    public String getP3_17_s1() {
        return p3_17_s1;
    }

    public void setP3_17_s1(String p3_17_s1) {
        this.p3_17_s1 = p3_17_s1;
    }

    public String getP3_18_1_s1() {
        return p3_18_1_s1;
    }

    public void setP3_18_1_s1(String p3_18_1_s1) {
        this.p3_18_1_s1 = p3_18_1_s1;
    }

    public String getP3_18_2_s1() {
        return p3_18_2_s1;
    }

    public void setP3_18_2_s1(String p3_18_2_s1) {
        this.p3_18_2_s1 = p3_18_2_s1;
    }

    public String getP3_18_3_s1() {
        return p3_18_3_s1;
    }

    public void setP3_18_3_s1(String p3_18_3_s1) {
        this.p3_18_3_s1 = p3_18_3_s1;
    }

    public String getP3_18_4_s1() {
        return p3_18_4_s1;
    }

    public void setP3_18_4_s1(String p3_18_4_s1) {
        this.p3_18_4_s1 = p3_18_4_s1;
    }

    public String getEstado_s1() {
        return estado_s1;
    }

    public void setEstado_s1(String estado_s1) {
        this.estado_s1 = estado_s1;
    }

    public Integer getP3_19_1_1m() {
        return p3_19_1_1m;
    }

    public void setP3_19_1_1m(Integer p3_19_1_1m) {
        this.p3_19_1_1m = p3_19_1_1m;
    }

    public Integer getP3_19_1_1f() {
        return p3_19_1_1f;
    }

    public void setP3_19_1_1f(Integer p3_19_1_1f) {
        this.p3_19_1_1f = p3_19_1_1f;
    }

    public Integer getP3_19_1_2m() {
        return p3_19_1_2m;
    }

    public void setP3_19_1_2m(Integer p3_19_1_2m) {
        this.p3_19_1_2m = p3_19_1_2m;
    }

    public Integer getP3_19_1_2f() {
        return p3_19_1_2f;
    }

    public void setP3_19_1_2f(Integer p3_19_1_2f) {
        this.p3_19_1_2f = p3_19_1_2f;
    }

    public Integer getP3_19_1_3m() {
        return p3_19_1_3m;
    }

    public void setP3_19_1_3m(Integer p3_19_1_3m) {
        this.p3_19_1_3m = p3_19_1_3m;
    }

    public Integer getP3_19_1_3f() {
        return p3_19_1_3f;
    }

    public void setP3_19_1_3f(Integer p3_19_1_3f) {
        this.p3_19_1_3f = p3_19_1_3f;
    }

    public Integer getP3_19_1_4m() {
        return p3_19_1_4m;
    }

    public void setP3_19_1_4m(Integer p3_19_1_4m) {
        this.p3_19_1_4m = p3_19_1_4m;
    }

    public Integer getP3_19_1_4f() {
        return p3_19_1_4f;
    }

    public void setP3_19_1_4f(Integer p3_19_1_4f) {
        this.p3_19_1_4f = p3_19_1_4f;
    }

    public Integer getP3_19_1_5m() {
        return p3_19_1_5m;
    }

    public void setP3_19_1_5m(Integer p3_19_1_5m) {
        this.p3_19_1_5m = p3_19_1_5m;
    }

    public Integer getP3_19_1_5f() {
        return p3_19_1_5f;
    }

    public void setP3_19_1_5f(Integer p3_19_1_5f) {
        this.p3_19_1_5f = p3_19_1_5f;
    }

    public Integer getP3_19_1total() {
        return p3_19_1total;
    }

    public void setP3_19_1total(Integer p3_19_1total) {
        this.p3_19_1total = p3_19_1total;
    }

    public Integer getP3_19_2_1m() {
        return p3_19_2_1m;
    }

    public void setP3_19_2_1m(Integer p3_19_2_1m) {
        this.p3_19_2_1m = p3_19_2_1m;
    }

    public Integer getP3_19_2_1f() {
        return p3_19_2_1f;
    }

    public void setP3_19_2_1f(Integer p3_19_2_1f) {
        this.p3_19_2_1f = p3_19_2_1f;
    }

    public Integer getP3_19_2_2m() {
        return p3_19_2_2m;
    }

    public void setP3_19_2_2m(Integer p3_19_2_2m) {
        this.p3_19_2_2m = p3_19_2_2m;
    }

    public Integer getP3_19_2_2f() {
        return p3_19_2_2f;
    }

    public void setP3_19_2_2f(Integer p3_19_2_2f) {
        this.p3_19_2_2f = p3_19_2_2f;
    }

    public Integer getP3_19_2_3m() {
        return p3_19_2_3m;
    }

    public void setP3_19_2_3m(Integer p3_19_2_3m) {
        this.p3_19_2_3m = p3_19_2_3m;
    }

    public Integer getP3_19_2_3f() {
        return p3_19_2_3f;
    }

    public void setP3_19_2_3f(Integer p3_19_2_3f) {
        this.p3_19_2_3f = p3_19_2_3f;
    }

    public Integer getP3_19_2_4m() {
        return p3_19_2_4m;
    }

    public void setP3_19_2_4m(Integer p3_19_2_4m) {
        this.p3_19_2_4m = p3_19_2_4m;
    }

    public Integer getP3_19_2_4f() {
        return p3_19_2_4f;
    }

    public void setP3_19_2_4f(Integer p3_19_2_4f) {
        this.p3_19_2_4f = p3_19_2_4f;
    }

    public Integer getP3_19_2_5m() {
        return p3_19_2_5m;
    }

    public void setP3_19_2_5m(Integer p3_19_2_5m) {
        this.p3_19_2_5m = p3_19_2_5m;
    }

    public Integer getP3_19_2_5f() {
        return p3_19_2_5f;
    }

    public void setP3_19_2_5f(Integer p3_19_2_5f) {
        this.p3_19_2_5f = p3_19_2_5f;
    }

    public Integer getP3_19_2total() {
        return p3_19_2total;
    }

    public void setP3_19_2total(Integer p3_19_2total) {
        this.p3_19_2total = p3_19_2total;
    }

    public String getTxt_desc_depe_tde() {
        return txt_desc_depe_tde;
    }

    public void setTxt_desc_depe_tde(String txt_desc_depe_tde) {
        this.txt_desc_depe_tde = txt_desc_depe_tde;
    }

    public String getTxt_comisionado() {
        return txt_comisionado;
    }

    public void setTxt_comisionado(String txt_comisionado) {
        this.txt_comisionado = txt_comisionado;
    }

    public String getTxt_estado_ficha() {
        return txt_estado_ficha;
    }

    public void setTxt_estado_ficha(String txt_estado_ficha) {
        this.txt_estado_ficha = txt_estado_ficha;
    }

    public String getDepartamento_educa() {
        return departamento_educa;
    }

    public void setDepartamento_educa(String departamento_educa) {
        this.departamento_educa = departamento_educa;
    }

    public String getProvincia_educa() {
        return provincia_educa;
    }

    public void setProvincia_educa(String provincia_educa) {
        this.provincia_educa = provincia_educa;
    }

    public String getDistrito_educa() {
        return distrito_educa;
    }

    public void setDistrito_educa(String distrito_educa) {
        this.distrito_educa = distrito_educa;
    }

    public Demuna_FichaEntity2 getEduca_ficha2() {
        return educa_ficha2;
    }

    public void setEduca_ficha2(Demuna_FichaEntity2 educa_ficha2) {
        this.educa_ficha2 = educa_ficha2;
    }

    public Demuna_Ficha2_S2Entity getEduca_ficha2_s2() {
        return educa_ficha2_s2;
    }

    public void setEduca_ficha2_s2(Demuna_Ficha2_S2Entity educa_ficha2_s2) {
        this.educa_ficha2_s2 = educa_ficha2_s2;
    }

    public Demuna_Ficha2_S3Entity getEduca_ficha2_s3() {
        return educa_ficha2_s3;
    }

    public void setEduca_ficha2_s3(Demuna_Ficha2_S3Entity educa_ficha2_s3) {
        this.educa_ficha2_s3 = educa_ficha2_s3;
    }

    public Demuna_Ficha2_S4Entity getEduca_ficha2_s4() {
        return educa_ficha2_s4;
    }

    public void setEduca_ficha2_s4(Demuna_Ficha2_S4Entity educa_ficha2_s4) {
        this.educa_ficha2_s4 = educa_ficha2_s4;
    }

    public Demuna_Ficha2_S5Entity getEduca_ficha2_s5() {
        return educa_ficha2_s5;
    }

    public void setEduca_ficha2_s5(Demuna_Ficha2_S5Entity educa_ficha2_s5) {
        this.educa_ficha2_s5 = educa_ficha2_s5;
    }

    public Demuna_Ficha2_S6Entity getEduca_ficha2_s6() {
        return educa_ficha2_s6;
    }

    public void setEduca_ficha2_s6(Demuna_Ficha2_S6Entity educa_ficha2_s6) {
        this.educa_ficha2_s6 = educa_ficha2_s6;
    }

    public Demuna_Ficha2_S7Entity getEduca_ficha2_s7() {
        return educa_ficha2_s7;
    }

    public void setEduca_ficha2_s7(Demuna_Ficha2_S7Entity educa_ficha2_s7) {
        this.educa_ficha2_s7 = educa_ficha2_s7;
    }

    public Demuna_Ficha2_S8Entity getEduca_ficha2_s8() {
        return educa_ficha2_s8;
    }

    public void setEduca_ficha2_s8(Demuna_Ficha2_S8Entity educa_ficha2_s8) {
        this.educa_ficha2_s8 = educa_ficha2_s8;
    }

    public Demuna_Ficha2_S9Entity getEduca_ficha2_s9() {
        return educa_ficha2_s9;
    }

    public void setEduca_ficha2_s9(Demuna_Ficha2_S9Entity educa_ficha2_s9) {
        this.educa_ficha2_s9 = educa_ficha2_s9;
    }

    public Demuna_Ficha2_S10Entity getEduca_ficha2_s10() {
        return educa_ficha2_s10;
    }

    public void setEduca_ficha2_s10(Demuna_Ficha2_S10Entity educa_ficha2_s10) {
        this.educa_ficha2_s10 = educa_ficha2_s10;
    }

    public String getMsg_modal() {
        return msg_modal;
    }

    public void setMsg_modal(String msg_modal) {
        this.msg_modal = msg_modal;
    }

    public String getTxt_btn_guardado_parcial() {
        return txt_btn_guardado_parcial;
    }

    public void setTxt_btn_guardado_parcial(String txt_btn_guardado_parcial) {
        this.txt_btn_guardado_parcial = txt_btn_guardado_parcial;
    }

    public boolean isFlag_readonly() {
        return flag_readonly;
    }

    public void setFlag_readonly(boolean flag_readonly) {
        this.flag_readonly = flag_readonly;
    }

    public boolean isFlag_ie() {
        return flag_ie;
    }

    public void setFlag_ie(boolean flag_ie) {
        this.flag_ie = flag_ie;
    }

    public boolean isFlag_guardado_parcial() {
        return flag_guardado_parcial;
    }

    public void setFlag_guardado_parcial(boolean flag_guardado_parcial) {
        this.flag_guardado_parcial = flag_guardado_parcial;
    }

    public String getMsg_modal_ie() {
        return msg_modal_ie;
    }

    public void setMsg_modal_ie(String msg_modal_ie) {
        this.msg_modal_ie = msg_modal_ie;
    }

    public String getFlag_modal() {
        return flag_modal;
    }

    public void setFlag_modal(String flag_modal) {
        this.flag_modal = flag_modal;
    }

    public String getCod_unico_ant() {
        return cod_unico_ant;
    }

    public void setCod_unico_ant(String cod_unico_ant) {
        this.cod_unico_ant = cod_unico_ant;
    }

    


}
