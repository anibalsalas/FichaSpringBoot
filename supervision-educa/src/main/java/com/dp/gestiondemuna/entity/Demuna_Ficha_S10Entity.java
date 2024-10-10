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
@Table(name = "educa_ficha_s10", schema = "SIGA")
public class Demuna_Ficha_S10Entity implements Serializable {
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

    private String p10_1_1_a;
    private BigDecimal p10_1_1_a_2020;
    private BigDecimal p10_1_1_a_2021;
    private BigDecimal p10_1_1_a_2022;
    private BigDecimal p10_1_1_a_2023;
    private BigDecimal p10_1_1_a_2024;
    private String p10_1_1_b;
    private BigDecimal p10_1_1_b_2020;
    private BigDecimal p10_1_1_b_2021;
    private BigDecimal p10_1_1_b_2022;
    private BigDecimal p10_1_1_b_2023;
    private BigDecimal p10_1_1_b_2024;
    private String p10_1_1_c;
    private BigDecimal p10_1_1_c_2020;
    private BigDecimal p10_1_1_c_2021;
    private BigDecimal p10_1_1_c_2022;
    private BigDecimal p10_1_1_c_2023;
    private BigDecimal p10_1_1_c_2024;
    private String p10_1_1_d;
    private BigDecimal p10_1_1_d_2020;
    private BigDecimal p10_1_1_d_2021;
    private BigDecimal p10_1_1_d_2022;
    private BigDecimal p10_1_1_d_2023;
    private BigDecimal p10_1_1_d_2024;
    private String p10_1_1_e;
    private BigDecimal p10_1_1_e_2020;
    private BigDecimal p10_1_1_e_2021;
    private BigDecimal p10_1_1_e_2022;
    private BigDecimal p10_1_1_e_2023;
    private BigDecimal p10_1_1_e_2024;
    private String p10_1_1_f_no;
    private String p10_1_2;
    private String p10_1_3_resolucion;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date p10_1_3_fecha;
    private String p10_1_3_ingresos_propios;
    private String p10_1_3_ingresos_product;
    private String p10_1_4;
    private String p10_1_5;
    private String p10_1_5_detalle;
    private Integer p10_1_6_codigo_u;
    
    private String p10_1_1_f_si;


    
}
