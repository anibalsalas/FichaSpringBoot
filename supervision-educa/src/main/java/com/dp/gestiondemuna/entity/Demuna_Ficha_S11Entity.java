package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educa_ficha_s11", schema = "SIGA")
public class Demuna_Ficha_S11Entity implements Serializable {

    @Id
    public Integer id_ficha_s11;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;

    //@Formula("decode(estado,'I','INCOMPLETA','C','COMPLETA','1','VALIDADO')")
    private String estado_s11;

    private Integer p11_1_1;
    private Integer p11_1_2_mujeres;
    private Integer p11_1_2_hombres;
    private String p11_1_2_no;
    private Integer p11_1_3_precise;
    private String p11_1_3_no;
    private String p11_1_4;
    private String p11_1_5;
    private String p11_1_6;
    private Integer p11_1_7_cetpro;
    private Integer p11_1_7_iest;
    private Integer p11_1_7_eest;
    private String p11_1_7_no;
    private String p11_1_8;
    private String p11_1_9;
    private String p11_1_10;
    private String p11_1_11_a;
    private String p11_1_11_b;
    private String p11_1_11_c;
    private String p11_2_1_a;
    private String p11_2_1_b;
    private String p11_2_1_c;
    private String p11_2_2;
    private String p11_2_2_acciones;
    private String p11_2_3;
    private String p11_2_3_acciones;
    private String p11_2_4_a;
    private String p11_2_4_b;
    private String p11_2_4_c;
    private String p11_2_4_d;
    private String p11_2_5_a;
    private String p11_2_5_b;
    private String p11_2_5_c;
    private String p11_2_6;
    private String p11_2_7_doc;
    private String p11_2_7_lengua;
    private String p11_2_8;
    private String p11_2_9;
    private String p11_2_10_a;
    private String p11_2_10_b;
    private String p11_2_10_c;
    private String p11_2_10_d;
    private String p11_2_10_e;
    private String p11_2_10_f;
    private String p11_2_10_g_otro;
    private String p11_2_10_otro_detalle;
    private String p11_2_11;
    private String p11_2_12_a;
    private String p11_2_12_b;
    private String p11_2_12_c;
    private String p11_2_12_d;
    private String p11_2_12_e;
    private String p11_2_13;
    private String p11_2_14;
    private String p11_2_15;
    private String p11_2_16;
    private String p11_2_17;
    private String p11_2_18;
    private String p11_2_19_a;
    private String p11_2_19_b;
    private String p11_2_19_c_otra;
    private String p11_2_19_otra_detalle;
    private String p11_2_20_a;
    private String p11_2_20_b;
    private String p11_2_20_c;
    private String p11_2_20_d;
    private String p11_2_20_e;
    private String p11_2_20_f;
    private String p11_2_20_g_otro;
    private String p11_2_20_otro_detall;
    private String p11_2_21;
    private String p11_2_22_a;
    private String p11_2_22_b;
    private String p11_2_22_c;
    private String p11_2_22_d;
    private String p11_2_22_e_otro;
    private String p11_2_22_otro_detalla;
    private String p11_2_23;
    private String p11_2_24;

 
}
