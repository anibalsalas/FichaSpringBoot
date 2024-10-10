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
@Table(name = "educa_ficha_s9", schema = "SIGA")
public class Demuna_Ficha_S9Entity implements Serializable {
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
    


    private Integer p9_1_nombrado;
    private Integer p9_1_contratado;
    private Integer p9_1_2_a_1;
    private Integer p9_1_2_a_2;
    private Integer p9_1_2_a_3;
    private Integer p9_1_2_a_4;
    private Integer p9_1_2_a_5;
    private Integer p9_1_2_b_1;
    private Integer p9_1_2_b_2;
    private Integer p9_1_2_b_3;
    private Integer p9_1_2_b_4;
    private Integer p9_1_2_b_5;
    private Integer p9_1_2_c_1;
    private Integer p9_1_2_c_2;
    private Integer p9_1_2_c_3;
    private Integer p9_1_2_c_4;
    private Integer p9_1_2_c_5;
    private Integer p9_1_2_d_1;
    private Integer p9_1_2_d_2;
    private Integer p9_1_2_d_3;
    private Integer p9_1_2_d_4;
    private Integer p9_1_2_d_5;
    private Integer p9_1_2_e_1;
    private Integer p9_1_2_e_2;
    private Integer p9_1_2_e_3;
    private Integer p9_1_2_e_4;
    private Integer p9_1_2_e_5;
    private Integer p9_1_2_f_1;
    private Integer p9_1_2_f_2;
    private Integer p9_1_2_f_3;
    private Integer p9_1_2_f_4;
    private Integer p9_1_2_f_5;
    private Integer p9_1_2_g_1;
    private Integer p9_1_2_g_2;
    private Integer p9_1_2_g_3;
    private Integer p9_1_2_g_4;
    private Integer p9_1_2_g_5;
    private Integer p9_1_2_h_1;
    private Integer p9_1_2_h_2;
    private Integer p9_1_2_h_3;
    private Integer p9_1_2_h_4;
    private Integer p9_1_2_h_5;
    private Integer p9_1_2_i_1;
    private Integer p9_1_2_i_2;
    private Integer p9_1_2_i_3;
    private Integer p9_1_2_i_4;
    private Integer p9_1_2_i_5;
    private Integer p9_1_2_j_1;
    private Integer p9_1_2_j_2;
    private Integer p9_1_2_j_3;
    private Integer p9_1_2_j_4;
    private Integer p9_1_2_j_5;
    private Integer p9_1_2_k_1;
    private Integer p9_1_2_k_2;
    private Integer p9_1_2_k_3;
    private Integer p9_1_2_k_4;
    private Integer p9_1_2_k_5;
    private Integer p9_1_2_a_total;
    private Integer p9_1_2_b_total;
    private Integer p9_1_2_c_total; 
    private Integer p9_1_2_d_total;
    private Integer p9_1_2_e_total;
    private Integer p9_1_2_f_total;
    private Integer p9_1_2_g_total ;
    private Integer p9_1_2_h_total;
    private Integer p9_1_2_i_total;
    private Integer p9_1_2_j_total;
    private Integer p9_1_2_k_total ;
   
}