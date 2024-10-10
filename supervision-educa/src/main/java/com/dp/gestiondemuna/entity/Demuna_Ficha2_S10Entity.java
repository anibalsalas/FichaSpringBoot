package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "educa_ficha2_s10", schema = "SIGA")
public class Demuna_Ficha2_S10Entity implements Serializable {
    @Id
    public Integer id_ficha_s10;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;
    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s10;


    private String p10_1;
    private String p10_2_a;
    private String p10_2_b;
    private String p10_2_c;
    private String p10_2_d;
    private String p10_2_e;
    private String p10_3_1;
    private String p10_3_2;
    private String p10_3_3;
    private String p10_3_4;
    private String p10_3_5;
    private String p10_3_6;
    private String p10_3_7;
    private String p10_3_7_detalle;
    private String p10_4_infor_com;
     private String aceptar;
    
}
