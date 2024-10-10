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
@NoArgsConstructor
@Table(name = "educa_ficha2_s8", schema = "SIGA")
public class Demuna_Ficha2_S8Entity implements Serializable {
    @Id
    public Integer id_ficha_s8;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s8;

    
    private Integer p8_1_a;
    private Integer p8_1_b;
    private Integer p8_1_c;
    private Integer p8_1_d;
    private String p8_1_d_otros;
    private String p8_2_a;
    private String p8_2_b;
    private String p8_2_c;
    private String p8_2_d;
    private String p8_2_e;
    private String p8_2_f;
    private String p8_2_g;
    private String p8_3_1;
    private String p8_3_2;
    private String p8_3_3;
    private String p8_3_4;

}