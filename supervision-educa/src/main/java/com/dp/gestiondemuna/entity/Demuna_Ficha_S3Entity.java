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
@Table(name = "educa_ficha_s3", schema = "SIGA")
public class Demuna_Ficha_S3Entity implements Serializable {
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
    
  
     private String p1_1;
    private String p1_2;
    private String p1_3;
    private String p1_4;
    private String p1_5;
    private String p1_6;
    private String p1_7;
    private String p1_8;
    private String p1_9;
    private String p1_10;
    private String p1_11;
    private String p1_12;
    
    
      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_1_fecha_ocurrencia;
    
      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_2_fecha_ocurrencia;
    
     @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_3_fecha_ocurrencia;
    
     @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_4_fecha_ocurrencia;
    
      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_5_fecha_ocurrencia;
    
      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_6_fecha_ocurrencia;
    
     @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_7_fecha_ocurrencia;

      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_8_fecha_ocurrencia;

     @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_9_fecha_ocurrencia;

      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_10_fecha_ocurrencia;

     @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_11_fecha_ocurrencia;

      @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.TIMESTAMP)
    private Date p1_12_fecha_ocurrencia;

    private String p1_13_otros;
    private String p1_13_otros_detalle;
    private String p2_acciones;
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