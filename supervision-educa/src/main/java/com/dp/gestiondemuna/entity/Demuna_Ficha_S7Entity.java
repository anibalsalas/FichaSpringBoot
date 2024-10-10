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
@Table(name = "educa_ficha_s7", schema = "SIGA")

public class Demuna_Ficha_S7Entity implements Serializable {
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
    
    
    
    private Integer p7_1_cant_total;
    private Integer p7_1_mesa_unipers_estado;
    private Integer p7_1_mesa_unipers_manteni;
    private Integer p7_1_mesa_unipers_sustituir;
    private Integer p7_1_cant_no_msa_uniper;
    private Integer p7_1_mesa_multiple_estado;
    private Integer p7_1_mesa_multiple_manteni;
    private Integer p7_1_mesa_multiple_sustituir;
    private Integer p7_1_cant_no_msa_multiple;
    private Integer p7_1_cant_total_car_unipers;
    private Integer p7_1_cant_total_car_bipers;
    private Integer p7_1_silla_cant_total;
    private Integer p7_1_silla_buen_estado;
    private Integer p7_1_silla_mateni;
    private Integer p7_1_silla_sustituir;
    private Integer p7_1_pizarra_cant_total;
    private Integer p7_1_pizarra_buen_estado;
    private Integer p7_1_pizarra_manteni;
    private Integer p7_1_pizarra_sustituir;

    private Integer p7_2_docnt1_cant_total;
    private Integer p7_2_docnt1_buen_estado;
    private Integer p7_2_docnt1_regular_estado;
    private Integer p7_2_docnt1_mal_estado;
    private Integer p7_2_docnt2_cant_total;
    private Integer p7_2_docnt2_buen_estado;
    private Integer p7_2_docnt2_regular_estado;
    private Integer p7_2_docnt2_mal_estado;

    private Integer p7_2_armario_cant_total;
    private Integer p7_2_armario_buen_estado;
    private Integer p7_2_armario_regular_estado;
    private Integer p7_2_armario_mal_estado;

    private Integer p7_2_estant_cant_total;
    private Integer p7_2_estant_buen_estado;
    private Integer p7_2_estant_regular_estado;
    private Integer p7_2_estant_mal_estado;

    private Integer p7_2_lockrs_cant_total;
    private Integer p7_2_lockrs_buen_estado;
    private Integer p7_2_lockrs_regular_estado;
    private Integer p7_2_lockrs_mal_estado;
    private Integer p7_2_librero_cant_total;
    private Integer p7_2_librero_buen_estado;
    private Integer p7_2_librero_regular_estado;
    private Integer p7_2_librero_mal_estado;

    private Integer p7_2_cocina_cant_total;
    private Integer p7_2_cocina_buen_estado;
    private Integer p7_2_cocina_regular_estado;
    private Integer p7_2_cocina_mal_estado;
    private Integer p7_2_cambiadr_cant_total;
    private Integer p7_2_cambiadr_buen_estado;
    private Integer p7_2_cambiadr_regular_estado;
    private Integer p7_2_cambiadr_mal_estado;

    private Integer p7_2_pies_cant_total;
    private Integer p7_2_pies_buen_estado;
    private Integer p7_2_pies_regular_estado;
    private Integer p7_2_pies_mal_estado;

    private Integer p7_3_escritorio_cant_total;
    private Integer p7_3_escritorio_buen_estado;
    private Integer p7_3_escritorio_regular_estado;
    private Integer p7_3_escritorio_mal_estado;
    private Integer p7_3_silla_cant_total;
    private Integer p7_3_silla_buen_estado;
    private Integer p7_3_silla_regular_estado;
    private Integer p7_3_silla_mal_estado;
    private Integer p7_3_armario_cant_total;
    private Integer p7_3_armario_buen_estado;
    private Integer p7_3_armario_regular_estado;
    private Integer p7_3_armario_mal_estado;
    private Integer p7_3_estant_cant_total;
    private Integer p7_3_estant_buen_estado;
    private Integer p7_3_estant_regular_estado;
    private Integer p7_3_estant_mal_estado;

    private Integer p7_3_lockrs_cant_total;
    private Integer p7_3_lockrs_buen_estado;
    private Integer p7_3_lockrs_regular_estado;
    private Integer p7_3_lockrs_mal_estado;
    private Integer p7_3_exhibidor_cant_total;
    private Integer p7_3_exhibidor_buen_estado;
    private Integer p7_3_exhibidor_regular_estado;
    private Integer p7_3_exhibidor_mal_estado;

    private Integer p7_3_cocina_cant_total;
    private Integer p7_3_cocina_buen_estado;
    private Integer p7_3_cocina_regular_estado;
    private Integer p7_3_cocina_mal_estado;
    private Integer p7_3_vitrina_cant_total;
    private Integer p7_3_vitrina_buen_estado;
    private Integer p7_3_vitrina_regular_estado;
    private Integer p7_3_vitrina_mal_estado;
    private Integer p7_3_otros_cant_total;
    private Integer p7_3_otros_buen_estado;
    private Integer p7_3_otros_regular_estado;
    private Integer p7_3_otros_mal_estado;


}
