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
@Table(name = "educa_ficha2_s9", schema = "SIGA")
public class Demuna_Ficha2_S9Entity implements Serializable {
    @Id
    public Integer id_ficha_s9;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s9;
    
    
    private String p9_1_a;
    private BigDecimal p9_1_a_2020;
    private BigDecimal p9_1_a_2021;
    private BigDecimal p9_1_a_2022;
    private BigDecimal p9_1_a_2023;
    private BigDecimal p9_1_a_2024;
    private String p9_1_b;
    private BigDecimal p9_1_b_2020;
    private BigDecimal p9_1_b_2021;
    private BigDecimal p9_1_b_2022;
    private BigDecimal p9_1_b_2023;
    private BigDecimal p9_1_b_2024;
    private String p9_1_c;
    private BigDecimal p9_1_c_2020;
    private BigDecimal p9_1_c_2021;
    private BigDecimal p9_1_c_2022;
    private BigDecimal p9_1_c_2023;
    private BigDecimal p9_1_c_2024;
    private String p9_1_d;
    private BigDecimal p9_1_d_2020;
    private BigDecimal p9_1_d_2021;
    private BigDecimal p9_1_d_2022;
    private BigDecimal p9_1_d_2023;
    private BigDecimal p9_1_d_2024;
    private String p9_1_e;
    private BigDecimal p9_1_e_2020;
    private BigDecimal p9_1_e_2021;
    private BigDecimal p9_1_e_2022;
    private BigDecimal p9_1_e_2023;
    private BigDecimal p9_1_e_2024;
    private String p9_1_f_no;

}