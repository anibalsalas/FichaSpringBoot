package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
@Table(name = "educa_ficha2_s4", schema = "SIGA")

public class Demuna_Ficha2_S4Entity implements Serializable {
    @Id
    public Integer id_ficha_s4;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    
    private String estado_s4;
    
    private String p4_1_1;
   private String p4_1_2;
   private String p4_1_3;
   private String p4_1_4;
   private String p4_1_5;
   private String p4_1_6;
   private String p4_1_7;
   private String p4_1_8;
   private String p4_1_9;
   private String p4_1_10;
   private String p4_1_11;
   private String p4_1_11_detalle;
   private String p4_1_12_no;
    
}