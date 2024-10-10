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
@Table(name = "educa_ficha2_s7", schema = "SIGA")

public class Demuna_Ficha2_S7Entity implements Serializable {
    @Id
    public Integer id_ficha_s7;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s7;
    
       private Integer p7_1_a_total;
    private Integer p7_1_a_buen_estado;
    private Integer p7_1_a_regular;
    private Integer p7_1_a_mal;
    private Integer p7_1_b_total;
    private Integer p7_1_b_buen_estado;
    private Integer p7_1_b_regular;
    private Integer p7_1_b_mal;
    private Integer p7_1_c_total;
    private Integer p7_1_c_buen_estado;
    private Integer p7_1_c_regular;
    private Integer p7_1_c_mal;
    private Integer p7_1_d_total;
    private Integer p7_1_d_buen_estado;
    private Integer p7_1_d_regular;
    private Integer p7_1_d_mal;
    private Integer p7_1_e_total;
    private Integer p7_1_e_buen_estado;
    private Integer p7_1_e_regular;
    private Integer p7_1_e_mal;
    private Integer p7_1_f_total;
    private Integer p7_1_f_buen_estado;
    private Integer p7_1_f_regular;
    private Integer p7_1_f_mal;




}
