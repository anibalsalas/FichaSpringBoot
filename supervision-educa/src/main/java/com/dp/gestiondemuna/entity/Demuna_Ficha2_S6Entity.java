package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@Table(name = "educa_ficha2_s6", schema = "SIGA")

public class Demuna_Ficha2_S6Entity implements Serializable {
    @Id
    public Integer id_ficha_s6;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s6;

    private Integer p6_1_a_total;
    private Integer p6_1_a_buen_estado;
    private Integer p6_1_a_regular;
    private Integer p6_1_a_mal;
    private Integer p6_1_b_total;
    private Integer p6_1_b_buen_estado;
    private Integer p6_1_b_regular;
    private Integer p6_1_b_mal;
    private Integer p6_1_c_total;
    private Integer p6_1_c_buen_estado;
    private Integer p6_1_c_regular;
    private Integer p6_1_c_mal;
    private Integer p6_1_d_total;
    private Integer p6_1_d_buen_estado;
    private Integer p6_1_d_regular;
    private Integer p6_1_d_mal;
    private Integer p6_1_e_total;
    private Integer p6_1_e_buen_estado;
    private Integer p6_1_e_regular;
    private Integer p6_1_e_mal;
    private Integer p6_1_f_total;
    private Integer p6_1_f_buen_estado;
    private Integer p6_1_f_regular;
    private Integer p6_1_f_mal;
    private Integer p6_1_g_total;
    private Integer p6_1_g_buen_estado;
    private Integer p6_1_g_regular;
    private Integer p6_1_g_mal;
    private Integer p6_1_h_total;
    private Integer p6_1_h_buen_estado;
    private Integer p6_1_h_regular;
    private Integer p6_1_h_mal;
    private Integer p6_1_i_total;
    private Integer p6_1_i_buen_estado;
    private Integer p6_1_i_regular;
    private Integer p6_1_i_mal;
    private Integer p6_1_j_total;
    private Integer p6_1_j_buen_estado;
    private Integer p6_1_j_regular;
    private Integer p6_1_j_mal;
    private Integer p6_1_k_total;
    private Integer p6_1_k_buen_estado;
    private Integer p6_1_k_regular;
    private Integer p6_1_k_mal;
    private Integer p6_1_l_total;
    private Integer p6_1_l_buen_estado;
    private Integer p6_1_l_regular;
    private Integer p6_1_l_mal;
    private Integer p6_2_a_total;
    private Integer p6_2_a_buen_estado;
    private Integer p6_2_a_regular;
    private Integer p6_2_a_mal;
    private Integer p6_2_b_total;
    private Integer p6_2_b_buen_estado;
    private Integer p6_2_b_regular;
    private Integer p6_2_b_mal;
    private Integer p6_2_c_total;
    private Integer p6_2_c_buen_estado;
    private Integer p6_2_c_regular;
    private Integer p6_2_c_mal;
    private String p6_3_1;
    private String p6_3_1_a;
    private String p6_3_1_b;
    private String p6_3_1_c;
    private String p6_3_1_d;
    private String p6_3_1_e;
    private String p6_3_1_f;
    private String p6_3_2;

    private String p6_4_2_1;
    private String p6_4_2_2_1;
    private String p6_4_2_2_2;
    private String p6_4_2_2_3;
    private String p6_4_2_2_4;
    private String p6_4_2_2_5;
    private String p6_4_2_2_6;
    private String p6_4_2_2_7;
    private String p6_4_2_2_8;
    private String p6_4_2_2_8_detalle;
}
