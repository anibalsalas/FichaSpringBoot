package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educa_ficha_s12", schema = "SIGA")
public class Demuna_Ficha_S12Entity implements Serializable {

    @Id
    public Integer id_ficha_s12;
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
    private String estado_s12;

    private String p12_1;
    private String p12_2;
    private String p12_3;
    private String p12_4;
    private Integer p12_5_residentes;
    private Integer p12_5_no_residentes;
    private Integer p12_5_total;
    private String p12_6;
    private Integer p12_7_a_residentes;
    private Integer p12_7_a_no_residentes;
    private Integer p12_7_a_total;
    private Integer p12_7_b_residentes;
    private Integer p12_7_b_no_residentes;
    private Integer p12_7_b_total;
    private Integer p12_7_c_residentes;
    private Integer p12_7_c_no_residentes;
    private Integer p12_7_c_total;
    private Integer p12_7_d_residentes;
    private Integer p12_7_d_no_residentes;
    private Integer p12_7_d_total;
    private Integer p12_7_e_residentes;
    private Integer p12_7_e_no_residentes;
    private Integer p12_7_e_total;
    private Integer p12_8;
    private String p12_9;
    private Integer p12_10;
    private Integer p12_11;
    private Integer p12_12_a;
    private Integer p12_12_b;
    private Integer p12_13_a;
    private Integer p12_13_b;
    private Integer p12_13_c;
    private Integer p12_13_d;
    private Integer p12_13_e;
    private String p12_14;
    private String p12_15;
    private Integer p12_16_a;
    private Integer p12_16_b;
    private Integer p12_16_c;
    private Integer p12_16_d;
    private Integer p12_16_e;
    private String p12_17;
    private String aceptar;





}