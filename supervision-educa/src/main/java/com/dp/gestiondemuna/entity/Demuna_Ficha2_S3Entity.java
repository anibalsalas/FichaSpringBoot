package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educa_ficha2_s3", schema = "SIGA")
public class Demuna_Ficha2_S3Entity implements Serializable {
    @Id
    public Integer id_ficha_s3;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;

    private String estado_s3;

    private String p3_1_1;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_1_fch;

    private String p3_1_2;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_2_fch;

    private String p3_1_3;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_3_fch;

    private String p3_1_4;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_4_fch;

    private String p3_1_5;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_5_fch;

    private String p3_1_6;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_6_fch;

    private String p3_1_7;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_7_fch;

    private String p3_1_8;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_8_fch;

    private String p3_1_9;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_9_fch;

    private String p3_1_10;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_10_fch;

    private String p3_1_11;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_11_fch;

    private String p3_1_12;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p3_1_12_fch;

    private String p3_1_13;

    private String p3_1_13_detalle;
    private String p3_2;

}


//  p3_3           char(1 byte),
//  p3_3_obser     varchar2(1100 byte),
//  p3_4           char(1 byte),
//  p3_4_obser     varchar2(1100 byte),
//  p3_5           char(1 byte),
//  p3_5_obser     varchar2(1100 byte),
//  p3_6           char(1 byte),
//  p3_6_obser     varchar2(1100 byte),
//  p3_6_1         char(1 byte),
//  p3_7_luz       char(1 byte),
//  p3_7_agua      char(1 byte),
//  p3_7_tel       char(1 byte),
//  p3_7_inter     char(1 byte),
//  p3_8           char(1 byte)