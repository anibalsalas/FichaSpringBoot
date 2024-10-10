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

@Table(name = "educa_ficha_s5", schema = "SIGA")
public class Demuna_Ficha_S5Entity implements Serializable {
    
    @Id
    public Integer id_ficha_s5;
    public Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

        @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
        @Temporal(TemporalType.TIMESTAMP)
        private Date fch_actualiza;
        private String estado_s5;
       private Integer p1_1;
       private Integer p2_1;
       private String p2_2_a;
        private String p2_2_b;
        private String p2_2_c;
        
        private String p2_3_t1;
        private String p2_3_t2;
        private String p2_3_t3;
        private String p2_3_t4;
        private String p2_3_t5;
        private String p2_3_t6;
        private String p2_3_t8;
        private String p2_3_t9;
        private String p2_3_t10;
        private String p2_3_e1;
        private String p2_3_e2;
        private String p2_3_e3;
        private String p2_3_e4;
        private String p2_3_e5;
        private String p2_3_e6;
        private String p2_3_e7;
        private String p2_3_e8;
        private String p2_3_e9;

        private String p2_3_e10;
        private String p2_3_1_1;
        private String p2_3_1_2;
        private String p2_3_1_3;
        private String p2_3_1_4;
        private String p2_3_1_5;
        private String p2_3_1_6;
        private String p2_3_1_7;
        private String p2_3_1_8;
        private String p2_3_1_9;
        private String p2_3_1_10;
        private String p2_3_2_1;
        private String p2_3_2_2;
        private String p2_3_2_3;
        private String p2_3_2_4;
        private String p2_3_2_5;
        private String p2_3_2_6;
        private String p2_3_2_7;
        private String p2_3_2_8;
        private String p2_3_2_9;
        private String p2_3_2_10;
        private String p2_3_3_1;
        private String p2_3_3_2;
        private String p2_3_3_3;
        private String p2_3_3_4;
        private String p2_3_3_5;
        private String p2_3_3_6;

        private String p2_3_3_7;
        private String p2_3_3_8;
        private String p2_3_3_9;
        private String p2_3_3_10;
        private String p2_3_4_1;
        private String p2_3_4_2;
        private String p2_3_4_3;
        private String p2_3_4_4;
        private String p2_3_4_5;
        private String p2_3_4_6;
        private String p2_3_4_7;
        private String p2_3_4_8;
        private String p2_3_4_9;
        private String p2_3_4_10;
        private String p2_3_5_1;
        private String p2_3_5_2;
        private String p2_3_5_3;
        private String p2_3_5_4;
        private String p2_3_5_5;
        private String p2_3_5_6;
        private String p2_3_5_7;
        private String p2_3_5_8;
        private String p2_3_5_9;
        private String p2_3_5_10;
        private String p2_3_6_1;
        private String p2_3_6_2;
        private String p2_3_6_3;

        private String p2_3_6_4;
        private String p2_3_6_5;
        private String p2_3_6_6;
        private String p2_3_6_7;
        private String p2_3_6_8;
        private String p2_3_6_9;
        private String p2_3_6_10;
        private String p2_3_7_1;
        private String p2_3_7_2;
        private String p2_3_7_3;
        private String p2_3_7_4;
        private String p2_3_7_5;
        private String p2_3_7_6;
        private String p2_3_7_7;
        private String p2_3_7_8;
        private String p2_3_7_9;
        private String p2_3_7_10;
        private String p2_3_8_1;
        private String p2_3_8_2;
        private String p2_3_8_3;
        private String p2_3_8_4;
        private String p2_3_8_5;
        private String p2_3_8_6;
        private String p2_3_8_7;
        private String p2_3_8_8;
        private String p2_3_8_9;
        private String p2_3_8_10;
        private String p2_3_9_1;
        private String p2_3_9_2;
        private String p2_3_9_3;

        private String p2_3_9_4;
        private String p2_3_9_5;
        private String p2_3_9_6;
        private String p2_3_9_7;
        private String p2_3_9_8;
        private String p2_3_9_9;
        private String p2_3_9_10;
        private String p2_3_10_1;
        private String p2_3_10_2;
        private String p2_3_10_3;
        private String p2_3_10_4;
        private String p2_3_10_5;
        private String p2_3_10_6;
        private String p2_3_10_7;
        private String p2_3_10_8;
        private String p2_3_10_9;
        private String p2_3_10_10;
        private String p2_4_t1;
        private String p2_4_t2;
        private String p2_4_t3;
        private String p2_4_t4;
        private String p2_4_t5;
        private String p2_4_t6;
        private String p2_4_t8;
        private String p2_4_t9;
        private String p2_4_t10;
        private String p2_4_e1;
        private String p2_4_e2;
        private String p2_4_e3;
        private String p2_4_e4;

        private String p2_4_e5;
        private String p2_4_e6;
        private String p2_4_e7;
        private String p2_4_e8;
        private String p2_4_e9;
        private String p2_4_e10;
        private String p2_4_1_1;
        private String p2_4_1_2;
        private String p2_4_1_3;
        private String p2_4_1_4;
        private String p2_4_1_5;
        private String p2_4_1_6;
        private String p2_4_1_7;
        private String p2_4_1_8;
        private String p2_4_1_9;
        private String p2_4_1_10;
        private String p2_4_2_1;
        private String p2_4_2_2;
        private String p2_4_2_3;
        private String p2_4_2_4;
        private String p2_4_2_5;
        private String p2_4_2_6;
        private String p2_4_2_7;
        private String p2_4_2_8;
        private String p2_4_2_9;
        private String p2_4_2_10;
        private String p2_4_3_1;
        private String p2_4_3_2;
        private String p2_4_3_3;
        private String p2_4_3_4;

        private String p2_4_3_5;
        private String p2_4_3_6;
        private String p2_4_3_7;
        private String p2_4_3_8;
        private String p2_4_3_9;
        private String p2_4_3_10;
        private String p2_4_4_1;
        private String p2_4_4_2;
        private String p2_4_4_3;
        private String p2_4_4_4;
        private String p2_4_4_5;
        private String p2_4_4_6;
        private String p2_4_4_7;
        private String p2_4_4_8;
        private String p2_4_4_9;
        private String p2_4_4_10;
        private String p2_4_5_1;
        private String p2_4_5_2;
        private String p2_4_5_3;
        private String p2_4_5_4;
        private String p2_4_5_5;
        private String p2_4_5_6;
        private String p2_4_5_7;
        private String p2_4_5_8;
        private String p2_4_5_9;
        private String p2_4_5_10;
        private String p2_4_6_1;
        private String p2_4_6_2;
        private String p2_4_6_3;
        private String p2_4_6_4;

        private String p2_4_6_5;
        private String p2_4_6_6;
        private String p2_4_6_7;
        private String p2_4_6_8;
        private String p2_4_6_9;
        private String p2_4_6_10;
        private String p2_4_7_1;
        private String p2_4_7_2;
        private String p2_4_7_3;
        private String p2_4_7_4;
        private String p2_4_7_5;
        private String p2_4_7_6;
        private String p2_4_7_7;
        private String p2_4_7_8;
        private String p2_4_7_9;
        private String p2_4_7_10;
        private String p2_4_8_1;
        private String p2_4_8_2;
        private String p2_4_8_3;
        private String p2_4_8_4;
        private String p2_4_8_5;
        private String p2_4_8_6;
        private String p2_4_8_7;
        private String p2_4_8_8;
        private String p2_4_8_9;
        private String p2_4_8_10;
        private String p2_4_9_1;
        private String p2_4_9_2;
        private String p2_4_9_3;
        private String p2_4_9_4;
        private String p2_4_9_5;
        private String p2_4_9_6;
        private String p2_4_9_7;
        private String p2_4_9_8;
        private String p2_4_9_9;
        private String p2_4_9_10;
        private String p2_4_10_1;
        private String p2_4_10_2;
        private String p2_4_10_3;
        private String p2_4_10_4;
        private String p2_4_10_5;
        private String p2_4_10_6;
        private String p2_4_10_7;
        private String p2_4_10_8;
        private String p2_4_10_9;
        private String p2_4_10_10;


        private String p2_5_t1;
        private String p2_5_t2;
        private String p2_5_t3;
        private String p2_5_t4;
        private String p2_5_t5;
        private String p2_5_t6;
        private String p2_5_t8;
        private String p2_5_t9;
        private String p2_5_t10;
        private String p2_5_e1;
        private String p2_5_e2;
        private String p2_5_e3;
        private String p2_5_e4;
        private String p2_5_e5;
        private String p2_5_e6;
        private String p2_5_e7;
        private String p2_5_e8;
        private String p2_5_e9;
        private String p2_5_e10;
        private String p2_5_1_1;
        private String p2_5_1_2;
        private String p2_5_1_3;
        private String p2_5_1_4;
        private String p2_5_1_5;
        private String p2_5_1_6;
        private String p2_5_1_7;
        private String p2_5_1_8;
        private String p2_5_1_9;
        private String p2_5_1_10;
        private String p2_5_2_1;
        private String p2_5_2_2;
        private String p2_5_2_3;
        private String p2_5_2_4;
        private String p2_5_2_5;
        private String p2_5_2_6;
        private String p2_5_2_7;
        private String p2_5_2_8;
        private String p2_5_2_9;
        private String p2_5_2_10;
        private String p2_5_3_1;
        private String p2_5_3_2;
        private String p2_5_3_3;
        private String p2_5_3_4;
        private String p2_5_3_5;
        private String p2_5_3_6;
        private String p2_5_3_7;
        private String p2_5_3_8;
        private String p2_5_3_9;
        private String p2_5_3_10;
        private String p2_5_4_1;
        private String p2_5_4_2;
        private String p2_5_4_3;
        private String p2_5_4_4;
        private String p2_5_4_5;
        private String p2_5_4_6;
        private String p2_5_4_7;
        private String p2_5_4_8;
        private String p2_5_4_9;
        private String p2_5_4_10;
        private String p2_5_5_1;
        private String p2_5_5_2;
        private String p2_5_5_3;
        private String p2_5_5_4;
        private String p2_5_5_5;
        private String p2_5_5_6;
        private String p2_5_5_7;
        private String p2_5_5_8;
        private String p2_5_5_9;
        private String p2_5_5_10;
        private String p2_5_6_1;
        private String p2_5_6_2;
        private String p2_5_6_3;
        private String p2_5_6_4;
        private String p2_5_6_5;
        private String p2_5_6_6;
        private String p2_5_6_7;
        private String p2_5_6_8;
        private String p2_5_6_9;
        private String p2_5_6_10;
        private String p2_5_7_1;
        private String p2_5_7_2;
        private String p2_5_7_3;
        private String p2_5_7_4;
        private String p2_5_7_5;
        private String p2_5_7_6;
        private String p2_5_7_7;
        private String p2_5_7_8;
        private String p2_5_7_9;
        private String p2_5_7_10;
        private String p2_5_8_1;
        private String p2_5_8_2;
        private String p2_5_8_3;
        private String p2_5_8_4;
        private String p2_5_8_5;
        private String p2_5_8_6;
        private String p2_5_8_7;
        private String p2_5_8_8;
        private String p2_5_8_9;
        private String p2_5_8_10;
        private String p2_5_9_1;
        private String p2_5_9_2;
        private String p2_5_9_3;
        private String p2_5_9_4;
        private String p2_5_9_5;
        private String p2_5_9_6;
        private String p2_5_9_7;
        private String p2_5_9_8;
        private String p2_5_9_9;
        private String p2_5_9_10;
        private String p2_5_10_1;
        private String p2_5_10_2;
        private String p2_5_10_3;
        private String p2_5_10_4;
        private String p2_5_10_5;
        private String p2_5_10_6;
        private String p2_5_10_7;
        private String p2_5_10_8;
        private String p2_5_10_9;
        private String p2_5_10_10;
        private String p2_6_t1;
        private String p2_6_t2;
        private String p2_6_t3;
        private String p2_6_t4;
        private String p2_6_t5;
        private String p2_6_t6;
        private String p2_6_t8;
        private String p2_6_t9;
        private String p2_6_e1;
        private String p2_6_e2;
        private String p2_6_e3;
        private String p2_6_e4;
        private String p2_6_e5;
        private String p2_6_e6;
        private String p2_6_e7;
        private String p2_6_e8;
        private String p2_6_e9;
        private String p2_6_1_1;
        private String p2_6_1_2;
        private String p2_6_1_3;
        private String p2_6_1_4;
        private String p2_6_1_5;
        private String p2_6_1_6;
        private String p2_6_1_7;
        private String p2_6_1_8;
        private String p2_6_1_9;
        private String p2_6_2_1;
        private String p2_6_2_2;
        private String p2_6_2_3;
        private String p2_6_2_4;
        private String p2_6_2_5;
        private String p2_6_2_6;
        private String p2_6_2_7;
        private String p2_6_2_8;
        private String p2_6_2_9;
        private String p2_6_3_1;
        private String p2_6_3_2;
        private String p2_6_3_3;
        private String p2_6_3_4;
        private String p2_6_3_5;
        private String p2_6_3_6;
        private String p2_6_3_7;
        private String p2_6_3_8;
        private String p2_6_3_9;
        private String p2_6_4_1;
        private String p2_6_4_2;
        private String p2_6_4_3;
        private String p2_6_4_4;
        private String p2_6_4_5;
        private String p2_6_4_6;
        private String p2_6_4_7;
        private String p2_6_4_8;
        private String p2_6_4_9;
        private String p2_6_5_1;
        private String p2_6_5_2;
        private String p2_6_5_3;
        private String p2_6_5_4;
        private String p2_6_5_5;
        private String p2_6_5_6;
        private String p2_6_5_7;
        private String p2_6_5_8;
        private String p2_6_5_9;
        private String p2_6_6_1;
        private String p2_6_6_2;
        private String p2_6_6_3;
        private String p2_6_6_4;
        private String p2_6_6_5;
        private String p2_6_6_6;
        private String p2_6_6_7;
        private String p2_6_6_8;
        private String p2_6_6_9;
        private String p2_6_7_1;
        private String p2_6_7_2;
        private String p2_6_7_3;
        private String p2_6_7_4;
        private String p2_6_7_5;
        private String p2_6_7_6;
        private String p2_6_7_7;
        private String p2_6_7_8;
        private String p2_6_7_9;
        private String p2_6_8_1;
        private String p2_6_8_2;
        private String p2_6_8_3;
        private String p2_6_8_4;
        private String p2_6_8_5;
        private String p2_6_8_6;
        private String p2_6_8_7;
        private String p2_6_8_8;
        private String p2_6_8_9;
        private String p2_6_9_1;
        private String p2_6_9_2;
        private String p2_6_9_3;
        private String p2_6_9_4;
        private String p2_6_9_5;
        private String p2_6_9_6;
        private String p2_6_9_7;
        private String p2_6_9_8;
        private String p2_6_10_1;
        private String p2_6_10_2;
        private String p2_6_10_3;
        private String p2_6_10_4;
        private String p2_6_10_5;
        private String p2_6_10_6;
        private String p2_6_10_7;
        private String p2_6_10_8;
        private String p2_6_10_9;

        private Integer p3_1;
        private String p4_1;
        private Integer p4_2;
        private Integer p4_3;
        private String p4_4_1;
        private String p4_4_2;
        private String p4_4_3;
        private String p4_4_4;
        private String p4_4_5;
        private String p4_4_6;
        private String p4_4_7;
        private String p4_5;
        private String p4_6;
        private String p4_7_detalle;
        private String p4_7_7_detalle;

    public Integer getId_ficha_s5() {
        return id_ficha_s5;
    }

    public void setId_ficha_s5(Integer id_ficha_s5) {
        this.id_ficha_s5 = id_ficha_s5;
    }

    public Integer getId_ficha() {
        return id_ficha;
    }

    public void setId_ficha(Integer id_ficha) {
        this.id_ficha = id_ficha;
    }

    public String getUsu_registro() {
        return usu_registro;
    }

    public void setUsu_registro(String usu_registro) {
        this.usu_registro = usu_registro;
    }

    public Date getFch_registro() {
        return fch_registro;
    }

    public void setFch_registro(Date fch_registro) {
        this.fch_registro = fch_registro;
    }

    public String getUsu_actualiza() {
        return usu_actualiza;
    }

    public void setUsu_actualiza(String usu_actualiza) {
        this.usu_actualiza = usu_actualiza;
    }

    public Date getFch_actualiza() {
        return fch_actualiza;
    }

    public void setFch_actualiza(Date fch_actualiza) {
        this.fch_actualiza = fch_actualiza;
    }

    public String getEstado_s5() {
        return estado_s5;
    }

    public void setEstado_s5(String estado_s5) {
        this.estado_s5 = estado_s5;
    }

    public Integer getP1_1() {
        return p1_1;
    }

    public void setP1_1(Integer p1_1) {
        this.p1_1 = p1_1;
    }

    public Integer getP2_1() {
        return p2_1;
    }

    public void setP2_1(Integer p2_1) {
        this.p2_1 = p2_1;
    }

    public String getP2_2_a() {
        return p2_2_a;
    }

    public void setP2_2_a(String p2_2_a) {
        this.p2_2_a = p2_2_a;
    }

    public String getP2_2_b() {
        return p2_2_b;
    }

    public void setP2_2_b(String p2_2_b) {
        this.p2_2_b = p2_2_b;
    }

    public String getP2_2_c() {
        return p2_2_c;
    }

    public void setP2_2_c(String p2_2_c) {
        this.p2_2_c = p2_2_c;
    }

    public String getP2_3_t1() {
        return p2_3_t1;
    }

    public void setP2_3_t1(String p2_3_t1) {
        this.p2_3_t1 = p2_3_t1;
    }

    public String getP2_3_t2() {
        return p2_3_t2;
    }

    public void setP2_3_t2(String p2_3_t2) {
        this.p2_3_t2 = p2_3_t2;
    }

    public String getP2_3_t3() {
        return p2_3_t3;
    }

    public void setP2_3_t3(String p2_3_t3) {
        this.p2_3_t3 = p2_3_t3;
    }

    public String getP2_3_t4() {
        return p2_3_t4;
    }

    public void setP2_3_t4(String p2_3_t4) {
        this.p2_3_t4 = p2_3_t4;
    }

    public String getP2_3_t5() {
        return p2_3_t5;
    }

    public void setP2_3_t5(String p2_3_t5) {
        this.p2_3_t5 = p2_3_t5;
    }

    public String getP2_3_t6() {
        return p2_3_t6;
    }

    public void setP2_3_t6(String p2_3_t6) {
        this.p2_3_t6 = p2_3_t6;
    }

    public String getP2_3_t8() {
        return p2_3_t8;
    }

    public void setP2_3_t8(String p2_3_t8) {
        this.p2_3_t8 = p2_3_t8;
    }

    public String getP2_3_t9() {
        return p2_3_t9;
    }

    public void setP2_3_t9(String p2_3_t9) {
        this.p2_3_t9 = p2_3_t9;
    }

    public String getP2_3_t10() {
        return p2_3_t10;
    }

    public void setP2_3_t10(String p2_3_t10) {
        this.p2_3_t10 = p2_3_t10;
    }

    public String getP2_3_e1() {
        return p2_3_e1;
    }

    public void setP2_3_e1(String p2_3_e1) {
        this.p2_3_e1 = p2_3_e1;
    }

    public String getP2_3_e2() {
        return p2_3_e2;
    }

    public void setP2_3_e2(String p2_3_e2) {
        this.p2_3_e2 = p2_3_e2;
    }

    public String getP2_3_e3() {
        return p2_3_e3;
    }

    public void setP2_3_e3(String p2_3_e3) {
        this.p2_3_e3 = p2_3_e3;
    }

    public String getP2_3_e4() {
        return p2_3_e4;
    }

    public void setP2_3_e4(String p2_3_e4) {
        this.p2_3_e4 = p2_3_e4;
    }

    public String getP2_3_e5() {
        return p2_3_e5;
    }

    public void setP2_3_e5(String p2_3_e5) {
        this.p2_3_e5 = p2_3_e5;
    }

    public String getP2_3_e6() {
        return p2_3_e6;
    }

    public void setP2_3_e6(String p2_3_e6) {
        this.p2_3_e6 = p2_3_e6;
    }

    public String getP2_3_e7() {
        return p2_3_e7;
    }

    public void setP2_3_e7(String p2_3_e7) {
        this.p2_3_e7 = p2_3_e7;
    }

    public String getP2_3_e8() {
        return p2_3_e8;
    }

    public void setP2_3_e8(String p2_3_e8) {
        this.p2_3_e8 = p2_3_e8;
    }

    public String getP2_3_e9() {
        return p2_3_e9;
    }

    public void setP2_3_e9(String p2_3_e9) {
        this.p2_3_e9 = p2_3_e9;
    }

    public String getP2_3_e10() {
        return p2_3_e10;
    }

    public void setP2_3_e10(String p2_3_e10) {
        this.p2_3_e10 = p2_3_e10;
    }

    public String getP2_3_1_1() {
        return p2_3_1_1;
    }

    public void setP2_3_1_1(String p2_3_1_1) {
        this.p2_3_1_1 = p2_3_1_1;
    }

    public String getP2_3_1_2() {
        return p2_3_1_2;
    }

    public void setP2_3_1_2(String p2_3_1_2) {
        this.p2_3_1_2 = p2_3_1_2;
    }

    public String getP2_3_1_3() {
        return p2_3_1_3;
    }

    public void setP2_3_1_3(String p2_3_1_3) {
        this.p2_3_1_3 = p2_3_1_3;
    }

    public String getP2_3_1_4() {
        return p2_3_1_4;
    }

    public void setP2_3_1_4(String p2_3_1_4) {
        this.p2_3_1_4 = p2_3_1_4;
    }

    public String getP2_3_1_5() {
        return p2_3_1_5;
    }

    public void setP2_3_1_5(String p2_3_1_5) {
        this.p2_3_1_5 = p2_3_1_5;
    }

    public String getP2_3_1_6() {
        return p2_3_1_6;
    }

    public void setP2_3_1_6(String p2_3_1_6) {
        this.p2_3_1_6 = p2_3_1_6;
    }

    public String getP2_3_1_7() {
        return p2_3_1_7;
    }

    public void setP2_3_1_7(String p2_3_1_7) {
        this.p2_3_1_7 = p2_3_1_7;
    }

    public String getP2_3_1_8() {
        return p2_3_1_8;
    }

    public void setP2_3_1_8(String p2_3_1_8) {
        this.p2_3_1_8 = p2_3_1_8;
    }

    public String getP2_3_1_9() {
        return p2_3_1_9;
    }

    public void setP2_3_1_9(String p2_3_1_9) {
        this.p2_3_1_9 = p2_3_1_9;
    }

    public String getP2_3_1_10() {
        return p2_3_1_10;
    }

    public void setP2_3_1_10(String p2_3_1_10) {
        this.p2_3_1_10 = p2_3_1_10;
    }

    public String getP2_3_2_1() {
        return p2_3_2_1;
    }

    public void setP2_3_2_1(String p2_3_2_1) {
        this.p2_3_2_1 = p2_3_2_1;
    }

    public String getP2_3_2_2() {
        return p2_3_2_2;
    }

    public void setP2_3_2_2(String p2_3_2_2) {
        this.p2_3_2_2 = p2_3_2_2;
    }

    public String getP2_3_2_3() {
        return p2_3_2_3;
    }

    public void setP2_3_2_3(String p2_3_2_3) {
        this.p2_3_2_3 = p2_3_2_3;
    }

    public String getP2_3_2_4() {
        return p2_3_2_4;
    }

    public void setP2_3_2_4(String p2_3_2_4) {
        this.p2_3_2_4 = p2_3_2_4;
    }

    public String getP2_3_2_5() {
        return p2_3_2_5;
    }

    public void setP2_3_2_5(String p2_3_2_5) {
        this.p2_3_2_5 = p2_3_2_5;
    }

    public String getP2_3_2_6() {
        return p2_3_2_6;
    }

    public void setP2_3_2_6(String p2_3_2_6) {
        this.p2_3_2_6 = p2_3_2_6;
    }

    public String getP2_3_2_7() {
        return p2_3_2_7;
    }

    public void setP2_3_2_7(String p2_3_2_7) {
        this.p2_3_2_7 = p2_3_2_7;
    }

    public String getP2_3_2_8() {
        return p2_3_2_8;
    }

    public void setP2_3_2_8(String p2_3_2_8) {
        this.p2_3_2_8 = p2_3_2_8;
    }

    public String getP2_3_2_9() {
        return p2_3_2_9;
    }

    public void setP2_3_2_9(String p2_3_2_9) {
        this.p2_3_2_9 = p2_3_2_9;
    }

    public String getP2_3_2_10() {
        return p2_3_2_10;
    }

    public void setP2_3_2_10(String p2_3_2_10) {
        this.p2_3_2_10 = p2_3_2_10;
    }

    public String getP2_3_3_1() {
        return p2_3_3_1;
    }

    public void setP2_3_3_1(String p2_3_3_1) {
        this.p2_3_3_1 = p2_3_3_1;
    }

    public String getP2_3_3_2() {
        return p2_3_3_2;
    }

    public void setP2_3_3_2(String p2_3_3_2) {
        this.p2_3_3_2 = p2_3_3_2;
    }

    public String getP2_3_3_3() {
        return p2_3_3_3;
    }

    public void setP2_3_3_3(String p2_3_3_3) {
        this.p2_3_3_3 = p2_3_3_3;
    }

    public String getP2_3_3_4() {
        return p2_3_3_4;
    }

    public void setP2_3_3_4(String p2_3_3_4) {
        this.p2_3_3_4 = p2_3_3_4;
    }

    public String getP2_3_3_5() {
        return p2_3_3_5;
    }

    public void setP2_3_3_5(String p2_3_3_5) {
        this.p2_3_3_5 = p2_3_3_5;
    }

    public String getP2_3_3_6() {
        return p2_3_3_6;
    }

    public void setP2_3_3_6(String p2_3_3_6) {
        this.p2_3_3_6 = p2_3_3_6;
    }

    public String getP2_3_3_7() {
        return p2_3_3_7;
    }

    public void setP2_3_3_7(String p2_3_3_7) {
        this.p2_3_3_7 = p2_3_3_7;
    }

    public String getP2_3_3_8() {
        return p2_3_3_8;
    }

    public void setP2_3_3_8(String p2_3_3_8) {
        this.p2_3_3_8 = p2_3_3_8;
    }

    public String getP2_3_3_9() {
        return p2_3_3_9;
    }

    public void setP2_3_3_9(String p2_3_3_9) {
        this.p2_3_3_9 = p2_3_3_9;
    }

    public String getP2_3_3_10() {
        return p2_3_3_10;
    }

    public void setP2_3_3_10(String p2_3_3_10) {
        this.p2_3_3_10 = p2_3_3_10;
    }

    public String getP2_3_4_1() {
        return p2_3_4_1;
    }

    public void setP2_3_4_1(String p2_3_4_1) {
        this.p2_3_4_1 = p2_3_4_1;
    }

    public String getP2_3_4_2() {
        return p2_3_4_2;
    }

    public void setP2_3_4_2(String p2_3_4_2) {
        this.p2_3_4_2 = p2_3_4_2;
    }

    public String getP2_3_4_3() {
        return p2_3_4_3;
    }

    public void setP2_3_4_3(String p2_3_4_3) {
        this.p2_3_4_3 = p2_3_4_3;
    }

    public String getP2_3_4_4() {
        return p2_3_4_4;
    }

    public void setP2_3_4_4(String p2_3_4_4) {
        this.p2_3_4_4 = p2_3_4_4;
    }

    public String getP2_3_4_5() {
        return p2_3_4_5;
    }

    public void setP2_3_4_5(String p2_3_4_5) {
        this.p2_3_4_5 = p2_3_4_5;
    }

    public String getP2_3_4_6() {
        return p2_3_4_6;
    }

    public void setP2_3_4_6(String p2_3_4_6) {
        this.p2_3_4_6 = p2_3_4_6;
    }

    public String getP2_3_4_7() {
        return p2_3_4_7;
    }

    public void setP2_3_4_7(String p2_3_4_7) {
        this.p2_3_4_7 = p2_3_4_7;
    }

    public String getP2_3_4_8() {
        return p2_3_4_8;
    }

    public void setP2_3_4_8(String p2_3_4_8) {
        this.p2_3_4_8 = p2_3_4_8;
    }

    public String getP2_3_4_9() {
        return p2_3_4_9;
    }

    public void setP2_3_4_9(String p2_3_4_9) {
        this.p2_3_4_9 = p2_3_4_9;
    }

    public String getP2_3_4_10() {
        return p2_3_4_10;
    }

    public void setP2_3_4_10(String p2_3_4_10) {
        this.p2_3_4_10 = p2_3_4_10;
    }

    public String getP2_3_5_1() {
        return p2_3_5_1;
    }

    public void setP2_3_5_1(String p2_3_5_1) {
        this.p2_3_5_1 = p2_3_5_1;
    }

    public String getP2_3_5_2() {
        return p2_3_5_2;
    }

    public void setP2_3_5_2(String p2_3_5_2) {
        this.p2_3_5_2 = p2_3_5_2;
    }

    public String getP2_3_5_3() {
        return p2_3_5_3;
    }

    public void setP2_3_5_3(String p2_3_5_3) {
        this.p2_3_5_3 = p2_3_5_3;
    }

    public String getP2_3_5_4() {
        return p2_3_5_4;
    }

    public void setP2_3_5_4(String p2_3_5_4) {
        this.p2_3_5_4 = p2_3_5_4;
    }

    public String getP2_3_5_5() {
        return p2_3_5_5;
    }

    public void setP2_3_5_5(String p2_3_5_5) {
        this.p2_3_5_5 = p2_3_5_5;
    }

    public String getP2_3_5_6() {
        return p2_3_5_6;
    }

    public void setP2_3_5_6(String p2_3_5_6) {
        this.p2_3_5_6 = p2_3_5_6;
    }

    public String getP2_3_5_7() {
        return p2_3_5_7;
    }

    public void setP2_3_5_7(String p2_3_5_7) {
        this.p2_3_5_7 = p2_3_5_7;
    }

    public String getP2_3_5_8() {
        return p2_3_5_8;
    }

    public void setP2_3_5_8(String p2_3_5_8) {
        this.p2_3_5_8 = p2_3_5_8;
    }

    public String getP2_3_5_9() {
        return p2_3_5_9;
    }

    public void setP2_3_5_9(String p2_3_5_9) {
        this.p2_3_5_9 = p2_3_5_9;
    }

    public String getP2_3_5_10() {
        return p2_3_5_10;
    }

    public void setP2_3_5_10(String p2_3_5_10) {
        this.p2_3_5_10 = p2_3_5_10;
    }

    public String getP2_3_6_1() {
        return p2_3_6_1;
    }

    public void setP2_3_6_1(String p2_3_6_1) {
        this.p2_3_6_1 = p2_3_6_1;
    }

    public String getP2_3_6_2() {
        return p2_3_6_2;
    }

    public void setP2_3_6_2(String p2_3_6_2) {
        this.p2_3_6_2 = p2_3_6_2;
    }

    public String getP2_3_6_3() {
        return p2_3_6_3;
    }

    public void setP2_3_6_3(String p2_3_6_3) {
        this.p2_3_6_3 = p2_3_6_3;
    }

    public String getP2_3_6_4() {
        return p2_3_6_4;
    }

    public void setP2_3_6_4(String p2_3_6_4) {
        this.p2_3_6_4 = p2_3_6_4;
    }

    public String getP2_3_6_5() {
        return p2_3_6_5;
    }

    public void setP2_3_6_5(String p2_3_6_5) {
        this.p2_3_6_5 = p2_3_6_5;
    }

    public String getP2_3_6_6() {
        return p2_3_6_6;
    }

    public void setP2_3_6_6(String p2_3_6_6) {
        this.p2_3_6_6 = p2_3_6_6;
    }

    public String getP2_3_6_7() {
        return p2_3_6_7;
    }

    public void setP2_3_6_7(String p2_3_6_7) {
        this.p2_3_6_7 = p2_3_6_7;
    }

    public String getP2_3_6_8() {
        return p2_3_6_8;
    }

    public void setP2_3_6_8(String p2_3_6_8) {
        this.p2_3_6_8 = p2_3_6_8;
    }

    public String getP2_3_6_9() {
        return p2_3_6_9;
    }

    public void setP2_3_6_9(String p2_3_6_9) {
        this.p2_3_6_9 = p2_3_6_9;
    }

    public String getP2_3_6_10() {
        return p2_3_6_10;
    }

    public void setP2_3_6_10(String p2_3_6_10) {
        this.p2_3_6_10 = p2_3_6_10;
    }

    public String getP2_3_7_1() {
        return p2_3_7_1;
    }

    public void setP2_3_7_1(String p2_3_7_1) {
        this.p2_3_7_1 = p2_3_7_1;
    }

    public String getP2_3_7_2() {
        return p2_3_7_2;
    }

    public void setP2_3_7_2(String p2_3_7_2) {
        this.p2_3_7_2 = p2_3_7_2;
    }

    public String getP2_3_7_3() {
        return p2_3_7_3;
    }

    public void setP2_3_7_3(String p2_3_7_3) {
        this.p2_3_7_3 = p2_3_7_3;
    }

    public String getP2_3_7_4() {
        return p2_3_7_4;
    }

    public void setP2_3_7_4(String p2_3_7_4) {
        this.p2_3_7_4 = p2_3_7_4;
    }

    public String getP2_3_7_5() {
        return p2_3_7_5;
    }

    public void setP2_3_7_5(String p2_3_7_5) {
        this.p2_3_7_5 = p2_3_7_5;
    }

    public String getP2_3_7_6() {
        return p2_3_7_6;
    }

    public void setP2_3_7_6(String p2_3_7_6) {
        this.p2_3_7_6 = p2_3_7_6;
    }

    public String getP2_3_7_7() {
        return p2_3_7_7;
    }

    public void setP2_3_7_7(String p2_3_7_7) {
        this.p2_3_7_7 = p2_3_7_7;
    }

    public String getP2_3_7_8() {
        return p2_3_7_8;
    }

    public void setP2_3_7_8(String p2_3_7_8) {
        this.p2_3_7_8 = p2_3_7_8;
    }

    public String getP2_3_7_9() {
        return p2_3_7_9;
    }

    public void setP2_3_7_9(String p2_3_7_9) {
        this.p2_3_7_9 = p2_3_7_9;
    }

    public String getP2_3_7_10() {
        return p2_3_7_10;
    }

    public void setP2_3_7_10(String p2_3_7_10) {
        this.p2_3_7_10 = p2_3_7_10;
    }

    public String getP2_3_8_1() {
        return p2_3_8_1;
    }

    public void setP2_3_8_1(String p2_3_8_1) {
        this.p2_3_8_1 = p2_3_8_1;
    }

    public String getP2_3_8_2() {
        return p2_3_8_2;
    }

    public void setP2_3_8_2(String p2_3_8_2) {
        this.p2_3_8_2 = p2_3_8_2;
    }

    public String getP2_3_8_3() {
        return p2_3_8_3;
    }

    public void setP2_3_8_3(String p2_3_8_3) {
        this.p2_3_8_3 = p2_3_8_3;
    }

    public String getP2_3_8_4() {
        return p2_3_8_4;
    }

    public void setP2_3_8_4(String p2_3_8_4) {
        this.p2_3_8_4 = p2_3_8_4;
    }

    public String getP2_3_8_5() {
        return p2_3_8_5;
    }

    public void setP2_3_8_5(String p2_3_8_5) {
        this.p2_3_8_5 = p2_3_8_5;
    }

    public String getP2_3_8_6() {
        return p2_3_8_6;
    }

    public void setP2_3_8_6(String p2_3_8_6) {
        this.p2_3_8_6 = p2_3_8_6;
    }

    public String getP2_3_8_7() {
        return p2_3_8_7;
    }

    public void setP2_3_8_7(String p2_3_8_7) {
        this.p2_3_8_7 = p2_3_8_7;
    }

    public String getP2_3_8_8() {
        return p2_3_8_8;
    }

    public void setP2_3_8_8(String p2_3_8_8) {
        this.p2_3_8_8 = p2_3_8_8;
    }

    public String getP2_3_8_9() {
        return p2_3_8_9;
    }

    public void setP2_3_8_9(String p2_3_8_9) {
        this.p2_3_8_9 = p2_3_8_9;
    }

    public String getP2_3_8_10() {
        return p2_3_8_10;
    }

    public void setP2_3_8_10(String p2_3_8_10) {
        this.p2_3_8_10 = p2_3_8_10;
    }

    public String getP2_3_9_1() {
        return p2_3_9_1;
    }

    public void setP2_3_9_1(String p2_3_9_1) {
        this.p2_3_9_1 = p2_3_9_1;
    }

    public String getP2_3_9_2() {
        return p2_3_9_2;
    }

    public void setP2_3_9_2(String p2_3_9_2) {
        this.p2_3_9_2 = p2_3_9_2;
    }

    public String getP2_3_9_3() {
        return p2_3_9_3;
    }

    public void setP2_3_9_3(String p2_3_9_3) {
        this.p2_3_9_3 = p2_3_9_3;
    }

    public String getP2_3_9_4() {
        return p2_3_9_4;
    }

    public void setP2_3_9_4(String p2_3_9_4) {
        this.p2_3_9_4 = p2_3_9_4;
    }

    public String getP2_3_9_5() {
        return p2_3_9_5;
    }

    public void setP2_3_9_5(String p2_3_9_5) {
        this.p2_3_9_5 = p2_3_9_5;
    }

    public String getP2_3_9_6() {
        return p2_3_9_6;
    }

    public void setP2_3_9_6(String p2_3_9_6) {
        this.p2_3_9_6 = p2_3_9_6;
    }

    public String getP2_3_9_7() {
        return p2_3_9_7;
    }

    public void setP2_3_9_7(String p2_3_9_7) {
        this.p2_3_9_7 = p2_3_9_7;
    }

    public String getP2_3_9_8() {
        return p2_3_9_8;
    }

    public void setP2_3_9_8(String p2_3_9_8) {
        this.p2_3_9_8 = p2_3_9_8;
    }

    public String getP2_3_9_9() {
        return p2_3_9_9;
    }

    public void setP2_3_9_9(String p2_3_9_9) {
        this.p2_3_9_9 = p2_3_9_9;
    }

    public String getP2_3_9_10() {
        return p2_3_9_10;
    }

    public void setP2_3_9_10(String p2_3_9_10) {
        this.p2_3_9_10 = p2_3_9_10;
    }

    public String getP2_3_10_1() {
        return p2_3_10_1;
    }

    public void setP2_3_10_1(String p2_3_10_1) {
        this.p2_3_10_1 = p2_3_10_1;
    }

    public String getP2_3_10_2() {
        return p2_3_10_2;
    }

    public void setP2_3_10_2(String p2_3_10_2) {
        this.p2_3_10_2 = p2_3_10_2;
    }

    public String getP2_3_10_3() {
        return p2_3_10_3;
    }

    public void setP2_3_10_3(String p2_3_10_3) {
        this.p2_3_10_3 = p2_3_10_3;
    }

    public String getP2_3_10_4() {
        return p2_3_10_4;
    }

    public void setP2_3_10_4(String p2_3_10_4) {
        this.p2_3_10_4 = p2_3_10_4;
    }

    public String getP2_3_10_5() {
        return p2_3_10_5;
    }

    public void setP2_3_10_5(String p2_3_10_5) {
        this.p2_3_10_5 = p2_3_10_5;
    }

    public String getP2_3_10_6() {
        return p2_3_10_6;
    }

    public void setP2_3_10_6(String p2_3_10_6) {
        this.p2_3_10_6 = p2_3_10_6;
    }

    public String getP2_3_10_7() {
        return p2_3_10_7;
    }

    public void setP2_3_10_7(String p2_3_10_7) {
        this.p2_3_10_7 = p2_3_10_7;
    }

    public String getP2_3_10_8() {
        return p2_3_10_8;
    }

    public void setP2_3_10_8(String p2_3_10_8) {
        this.p2_3_10_8 = p2_3_10_8;
    }

    public String getP2_3_10_9() {
        return p2_3_10_9;
    }

    public void setP2_3_10_9(String p2_3_10_9) {
        this.p2_3_10_9 = p2_3_10_9;
    }

    public String getP2_3_10_10() {
        return p2_3_10_10;
    }

    public void setP2_3_10_10(String p2_3_10_10) {
        this.p2_3_10_10 = p2_3_10_10;
    }

    public String getP2_4_t1() {
        return p2_4_t1;
    }

    public void setP2_4_t1(String p2_4_t1) {
        this.p2_4_t1 = p2_4_t1;
    }

    public String getP2_4_t2() {
        return p2_4_t2;
    }

    public void setP2_4_t2(String p2_4_t2) {
        this.p2_4_t2 = p2_4_t2;
    }

    public String getP2_4_t3() {
        return p2_4_t3;
    }

    public void setP2_4_t3(String p2_4_t3) {
        this.p2_4_t3 = p2_4_t3;
    }

    public String getP2_4_t4() {
        return p2_4_t4;
    }

    public void setP2_4_t4(String p2_4_t4) {
        this.p2_4_t4 = p2_4_t4;
    }

    public String getP2_4_t5() {
        return p2_4_t5;
    }

    public void setP2_4_t5(String p2_4_t5) {
        this.p2_4_t5 = p2_4_t5;
    }

    public String getP2_4_t6() {
        return p2_4_t6;
    }

    public void setP2_4_t6(String p2_4_t6) {
        this.p2_4_t6 = p2_4_t6;
    }

    public String getP2_4_t8() {
        return p2_4_t8;
    }

    public void setP2_4_t8(String p2_4_t8) {
        this.p2_4_t8 = p2_4_t8;
    }

    public String getP2_4_t9() {
        return p2_4_t9;
    }

    public void setP2_4_t9(String p2_4_t9) {
        this.p2_4_t9 = p2_4_t9;
    }

    public String getP2_4_t10() {
        return p2_4_t10;
    }

    public void setP2_4_t10(String p2_4_t10) {
        this.p2_4_t10 = p2_4_t10;
    }

    public String getP2_4_e1() {
        return p2_4_e1;
    }

    public void setP2_4_e1(String p2_4_e1) {
        this.p2_4_e1 = p2_4_e1;
    }

    public String getP2_4_e2() {
        return p2_4_e2;
    }

    public void setP2_4_e2(String p2_4_e2) {
        this.p2_4_e2 = p2_4_e2;
    }

    public String getP2_4_e3() {
        return p2_4_e3;
    }

    public void setP2_4_e3(String p2_4_e3) {
        this.p2_4_e3 = p2_4_e3;
    }

    public String getP2_4_e4() {
        return p2_4_e4;
    }

    public void setP2_4_e4(String p2_4_e4) {
        this.p2_4_e4 = p2_4_e4;
    }

    public String getP2_4_e5() {
        return p2_4_e5;
    }

    public void setP2_4_e5(String p2_4_e5) {
        this.p2_4_e5 = p2_4_e5;
    }

    public String getP2_4_e6() {
        return p2_4_e6;
    }

    public void setP2_4_e6(String p2_4_e6) {
        this.p2_4_e6 = p2_4_e6;
    }

    public String getP2_4_e7() {
        return p2_4_e7;
    }

    public void setP2_4_e7(String p2_4_e7) {
        this.p2_4_e7 = p2_4_e7;
    }

    public String getP2_4_e8() {
        return p2_4_e8;
    }

    public void setP2_4_e8(String p2_4_e8) {
        this.p2_4_e8 = p2_4_e8;
    }

    public String getP2_4_e9() {
        return p2_4_e9;
    }

    public void setP2_4_e9(String p2_4_e9) {
        this.p2_4_e9 = p2_4_e9;
    }

    public String getP2_4_e10() {
        return p2_4_e10;
    }

    public void setP2_4_e10(String p2_4_e10) {
        this.p2_4_e10 = p2_4_e10;
    }

    public String getP2_4_1_1() {
        return p2_4_1_1;
    }

    public void setP2_4_1_1(String p2_4_1_1) {
        this.p2_4_1_1 = p2_4_1_1;
    }

    public String getP2_4_1_2() {
        return p2_4_1_2;
    }

    public void setP2_4_1_2(String p2_4_1_2) {
        this.p2_4_1_2 = p2_4_1_2;
    }

    public String getP2_4_1_3() {
        return p2_4_1_3;
    }

    public void setP2_4_1_3(String p2_4_1_3) {
        this.p2_4_1_3 = p2_4_1_3;
    }

    public String getP2_4_1_4() {
        return p2_4_1_4;
    }

    public void setP2_4_1_4(String p2_4_1_4) {
        this.p2_4_1_4 = p2_4_1_4;
    }

    public String getP2_4_1_5() {
        return p2_4_1_5;
    }

    public void setP2_4_1_5(String p2_4_1_5) {
        this.p2_4_1_5 = p2_4_1_5;
    }

    public String getP2_4_1_6() {
        return p2_4_1_6;
    }

    public void setP2_4_1_6(String p2_4_1_6) {
        this.p2_4_1_6 = p2_4_1_6;
    }

    public String getP2_4_1_7() {
        return p2_4_1_7;
    }

    public void setP2_4_1_7(String p2_4_1_7) {
        this.p2_4_1_7 = p2_4_1_7;
    }

    public String getP2_4_1_8() {
        return p2_4_1_8;
    }

    public void setP2_4_1_8(String p2_4_1_8) {
        this.p2_4_1_8 = p2_4_1_8;
    }

    public String getP2_4_1_9() {
        return p2_4_1_9;
    }

    public void setP2_4_1_9(String p2_4_1_9) {
        this.p2_4_1_9 = p2_4_1_9;
    }

    public String getP2_4_1_10() {
        return p2_4_1_10;
    }

    public void setP2_4_1_10(String p2_4_1_10) {
        this.p2_4_1_10 = p2_4_1_10;
    }

    public String getP2_4_2_1() {
        return p2_4_2_1;
    }

    public void setP2_4_2_1(String p2_4_2_1) {
        this.p2_4_2_1 = p2_4_2_1;
    }

    public String getP2_4_2_2() {
        return p2_4_2_2;
    }

    public void setP2_4_2_2(String p2_4_2_2) {
        this.p2_4_2_2 = p2_4_2_2;
    }

    public String getP2_4_2_3() {
        return p2_4_2_3;
    }

    public void setP2_4_2_3(String p2_4_2_3) {
        this.p2_4_2_3 = p2_4_2_3;
    }

    public String getP2_4_2_4() {
        return p2_4_2_4;
    }

    public void setP2_4_2_4(String p2_4_2_4) {
        this.p2_4_2_4 = p2_4_2_4;
    }

    public String getP2_4_2_5() {
        return p2_4_2_5;
    }

    public void setP2_4_2_5(String p2_4_2_5) {
        this.p2_4_2_5 = p2_4_2_5;
    }

    public String getP2_4_2_6() {
        return p2_4_2_6;
    }

    public void setP2_4_2_6(String p2_4_2_6) {
        this.p2_4_2_6 = p2_4_2_6;
    }

    public String getP2_4_2_7() {
        return p2_4_2_7;
    }

    public void setP2_4_2_7(String p2_4_2_7) {
        this.p2_4_2_7 = p2_4_2_7;
    }

    public String getP2_4_2_8() {
        return p2_4_2_8;
    }

    public void setP2_4_2_8(String p2_4_2_8) {
        this.p2_4_2_8 = p2_4_2_8;
    }

    public String getP2_4_2_9() {
        return p2_4_2_9;
    }

    public void setP2_4_2_9(String p2_4_2_9) {
        this.p2_4_2_9 = p2_4_2_9;
    }

    public String getP2_4_2_10() {
        return p2_4_2_10;
    }

    public void setP2_4_2_10(String p2_4_2_10) {
        this.p2_4_2_10 = p2_4_2_10;
    }

    public String getP2_4_3_1() {
        return p2_4_3_1;
    }

    public void setP2_4_3_1(String p2_4_3_1) {
        this.p2_4_3_1 = p2_4_3_1;
    }

    public String getP2_4_3_2() {
        return p2_4_3_2;
    }

    public void setP2_4_3_2(String p2_4_3_2) {
        this.p2_4_3_2 = p2_4_3_2;
    }

    public String getP2_4_3_3() {
        return p2_4_3_3;
    }

    public void setP2_4_3_3(String p2_4_3_3) {
        this.p2_4_3_3 = p2_4_3_3;
    }

    public String getP2_4_3_4() {
        return p2_4_3_4;
    }

    public void setP2_4_3_4(String p2_4_3_4) {
        this.p2_4_3_4 = p2_4_3_4;
    }

    public String getP2_4_3_5() {
        return p2_4_3_5;
    }

    public void setP2_4_3_5(String p2_4_3_5) {
        this.p2_4_3_5 = p2_4_3_5;
    }

    public String getP2_4_3_6() {
        return p2_4_3_6;
    }

    public void setP2_4_3_6(String p2_4_3_6) {
        this.p2_4_3_6 = p2_4_3_6;
    }

    public String getP2_4_3_7() {
        return p2_4_3_7;
    }

    public void setP2_4_3_7(String p2_4_3_7) {
        this.p2_4_3_7 = p2_4_3_7;
    }

    public String getP2_4_3_8() {
        return p2_4_3_8;
    }

    public void setP2_4_3_8(String p2_4_3_8) {
        this.p2_4_3_8 = p2_4_3_8;
    }

    public String getP2_4_3_9() {
        return p2_4_3_9;
    }

    public void setP2_4_3_9(String p2_4_3_9) {
        this.p2_4_3_9 = p2_4_3_9;
    }

    public String getP2_4_3_10() {
        return p2_4_3_10;
    }

    public void setP2_4_3_10(String p2_4_3_10) {
        this.p2_4_3_10 = p2_4_3_10;
    }

    public String getP2_4_4_1() {
        return p2_4_4_1;
    }

    public void setP2_4_4_1(String p2_4_4_1) {
        this.p2_4_4_1 = p2_4_4_1;
    }

    public String getP2_4_4_2() {
        return p2_4_4_2;
    }

    public void setP2_4_4_2(String p2_4_4_2) {
        this.p2_4_4_2 = p2_4_4_2;
    }

    public String getP2_4_4_3() {
        return p2_4_4_3;
    }

    public void setP2_4_4_3(String p2_4_4_3) {
        this.p2_4_4_3 = p2_4_4_3;
    }

    public String getP2_4_4_4() {
        return p2_4_4_4;
    }

    public void setP2_4_4_4(String p2_4_4_4) {
        this.p2_4_4_4 = p2_4_4_4;
    }

    public String getP2_4_4_5() {
        return p2_4_4_5;
    }

    public void setP2_4_4_5(String p2_4_4_5) {
        this.p2_4_4_5 = p2_4_4_5;
    }

    public String getP2_4_4_6() {
        return p2_4_4_6;
    }

    public void setP2_4_4_6(String p2_4_4_6) {
        this.p2_4_4_6 = p2_4_4_6;
    }

    public String getP2_4_4_7() {
        return p2_4_4_7;
    }

    public void setP2_4_4_7(String p2_4_4_7) {
        this.p2_4_4_7 = p2_4_4_7;
    }

    public String getP2_4_4_8() {
        return p2_4_4_8;
    }

    public void setP2_4_4_8(String p2_4_4_8) {
        this.p2_4_4_8 = p2_4_4_8;
    }

    public String getP2_4_4_9() {
        return p2_4_4_9;
    }

    public void setP2_4_4_9(String p2_4_4_9) {
        this.p2_4_4_9 = p2_4_4_9;
    }

    public String getP2_4_4_10() {
        return p2_4_4_10;
    }

    public void setP2_4_4_10(String p2_4_4_10) {
        this.p2_4_4_10 = p2_4_4_10;
    }

    public String getP2_4_5_1() {
        return p2_4_5_1;
    }

    public void setP2_4_5_1(String p2_4_5_1) {
        this.p2_4_5_1 = p2_4_5_1;
    }

    public String getP2_4_5_2() {
        return p2_4_5_2;
    }

    public void setP2_4_5_2(String p2_4_5_2) {
        this.p2_4_5_2 = p2_4_5_2;
    }

    public String getP2_4_5_3() {
        return p2_4_5_3;
    }

    public void setP2_4_5_3(String p2_4_5_3) {
        this.p2_4_5_3 = p2_4_5_3;
    }

    public String getP2_4_5_4() {
        return p2_4_5_4;
    }

    public void setP2_4_5_4(String p2_4_5_4) {
        this.p2_4_5_4 = p2_4_5_4;
    }

    public String getP2_4_5_5() {
        return p2_4_5_5;
    }

    public void setP2_4_5_5(String p2_4_5_5) {
        this.p2_4_5_5 = p2_4_5_5;
    }

    public String getP2_4_5_6() {
        return p2_4_5_6;
    }

    public void setP2_4_5_6(String p2_4_5_6) {
        this.p2_4_5_6 = p2_4_5_6;
    }

    public String getP2_4_5_7() {
        return p2_4_5_7;
    }

    public void setP2_4_5_7(String p2_4_5_7) {
        this.p2_4_5_7 = p2_4_5_7;
    }

    public String getP2_4_5_8() {
        return p2_4_5_8;
    }

    public void setP2_4_5_8(String p2_4_5_8) {
        this.p2_4_5_8 = p2_4_5_8;
    }

    public String getP2_4_5_9() {
        return p2_4_5_9;
    }

    public void setP2_4_5_9(String p2_4_5_9) {
        this.p2_4_5_9 = p2_4_5_9;
    }

    public String getP2_4_5_10() {
        return p2_4_5_10;
    }

    public void setP2_4_5_10(String p2_4_5_10) {
        this.p2_4_5_10 = p2_4_5_10;
    }

    public String getP2_4_6_1() {
        return p2_4_6_1;
    }

    public void setP2_4_6_1(String p2_4_6_1) {
        this.p2_4_6_1 = p2_4_6_1;
    }

    public String getP2_4_6_2() {
        return p2_4_6_2;
    }

    public void setP2_4_6_2(String p2_4_6_2) {
        this.p2_4_6_2 = p2_4_6_2;
    }

    public String getP2_4_6_3() {
        return p2_4_6_3;
    }

    public void setP2_4_6_3(String p2_4_6_3) {
        this.p2_4_6_3 = p2_4_6_3;
    }

    public String getP2_4_6_4() {
        return p2_4_6_4;
    }

    public void setP2_4_6_4(String p2_4_6_4) {
        this.p2_4_6_4 = p2_4_6_4;
    }

    public String getP2_4_6_5() {
        return p2_4_6_5;
    }

    public void setP2_4_6_5(String p2_4_6_5) {
        this.p2_4_6_5 = p2_4_6_5;
    }

    public String getP2_4_6_6() {
        return p2_4_6_6;
    }

    public void setP2_4_6_6(String p2_4_6_6) {
        this.p2_4_6_6 = p2_4_6_6;
    }

    public String getP2_4_6_7() {
        return p2_4_6_7;
    }

    public void setP2_4_6_7(String p2_4_6_7) {
        this.p2_4_6_7 = p2_4_6_7;
    }

    public String getP2_4_6_8() {
        return p2_4_6_8;
    }

    public void setP2_4_6_8(String p2_4_6_8) {
        this.p2_4_6_8 = p2_4_6_8;
    }

    public String getP2_4_6_9() {
        return p2_4_6_9;
    }

    public void setP2_4_6_9(String p2_4_6_9) {
        this.p2_4_6_9 = p2_4_6_9;
    }

    public String getP2_4_6_10() {
        return p2_4_6_10;
    }

    public void setP2_4_6_10(String p2_4_6_10) {
        this.p2_4_6_10 = p2_4_6_10;
    }

    public String getP2_4_7_1() {
        return p2_4_7_1;
    }

    public void setP2_4_7_1(String p2_4_7_1) {
        this.p2_4_7_1 = p2_4_7_1;
    }

    public String getP2_4_7_2() {
        return p2_4_7_2;
    }

    public void setP2_4_7_2(String p2_4_7_2) {
        this.p2_4_7_2 = p2_4_7_2;
    }

    public String getP2_4_7_3() {
        return p2_4_7_3;
    }

    public void setP2_4_7_3(String p2_4_7_3) {
        this.p2_4_7_3 = p2_4_7_3;
    }

    public String getP2_4_7_4() {
        return p2_4_7_4;
    }

    public void setP2_4_7_4(String p2_4_7_4) {
        this.p2_4_7_4 = p2_4_7_4;
    }

    public String getP2_4_7_5() {
        return p2_4_7_5;
    }

    public void setP2_4_7_5(String p2_4_7_5) {
        this.p2_4_7_5 = p2_4_7_5;
    }

    public String getP2_4_7_6() {
        return p2_4_7_6;
    }

    public void setP2_4_7_6(String p2_4_7_6) {
        this.p2_4_7_6 = p2_4_7_6;
    }

    public String getP2_4_7_7() {
        return p2_4_7_7;
    }

    public void setP2_4_7_7(String p2_4_7_7) {
        this.p2_4_7_7 = p2_4_7_7;
    }

    public String getP2_4_7_8() {
        return p2_4_7_8;
    }

    public void setP2_4_7_8(String p2_4_7_8) {
        this.p2_4_7_8 = p2_4_7_8;
    }

    public String getP2_4_7_9() {
        return p2_4_7_9;
    }

    public void setP2_4_7_9(String p2_4_7_9) {
        this.p2_4_7_9 = p2_4_7_9;
    }

    public String getP2_4_7_10() {
        return p2_4_7_10;
    }

    public void setP2_4_7_10(String p2_4_7_10) {
        this.p2_4_7_10 = p2_4_7_10;
    }

    public String getP2_4_8_1() {
        return p2_4_8_1;
    }

    public void setP2_4_8_1(String p2_4_8_1) {
        this.p2_4_8_1 = p2_4_8_1;
    }

    public String getP2_4_8_2() {
        return p2_4_8_2;
    }

    public void setP2_4_8_2(String p2_4_8_2) {
        this.p2_4_8_2 = p2_4_8_2;
    }

    public String getP2_4_8_3() {
        return p2_4_8_3;
    }

    public void setP2_4_8_3(String p2_4_8_3) {
        this.p2_4_8_3 = p2_4_8_3;
    }

    public String getP2_4_8_4() {
        return p2_4_8_4;
    }

    public void setP2_4_8_4(String p2_4_8_4) {
        this.p2_4_8_4 = p2_4_8_4;
    }

    public String getP2_4_8_5() {
        return p2_4_8_5;
    }

    public void setP2_4_8_5(String p2_4_8_5) {
        this.p2_4_8_5 = p2_4_8_5;
    }

    public String getP2_4_8_6() {
        return p2_4_8_6;
    }

    public void setP2_4_8_6(String p2_4_8_6) {
        this.p2_4_8_6 = p2_4_8_6;
    }

    public String getP2_4_8_7() {
        return p2_4_8_7;
    }

    public void setP2_4_8_7(String p2_4_8_7) {
        this.p2_4_8_7 = p2_4_8_7;
    }

    public String getP2_4_8_8() {
        return p2_4_8_8;
    }

    public void setP2_4_8_8(String p2_4_8_8) {
        this.p2_4_8_8 = p2_4_8_8;
    }

    public String getP2_4_8_9() {
        return p2_4_8_9;
    }

    public void setP2_4_8_9(String p2_4_8_9) {
        this.p2_4_8_9 = p2_4_8_9;
    }

    public String getP2_4_8_10() {
        return p2_4_8_10;
    }

    public void setP2_4_8_10(String p2_4_8_10) {
        this.p2_4_8_10 = p2_4_8_10;
    }

    public String getP2_4_9_1() {
        return p2_4_9_1;
    }

    public void setP2_4_9_1(String p2_4_9_1) {
        this.p2_4_9_1 = p2_4_9_1;
    }

    public String getP2_4_9_2() {
        return p2_4_9_2;
    }

    public void setP2_4_9_2(String p2_4_9_2) {
        this.p2_4_9_2 = p2_4_9_2;
    }

    public String getP2_4_9_3() {
        return p2_4_9_3;
    }

    public void setP2_4_9_3(String p2_4_9_3) {
        this.p2_4_9_3 = p2_4_9_3;
    }

    public String getP2_4_9_4() {
        return p2_4_9_4;
    }

    public void setP2_4_9_4(String p2_4_9_4) {
        this.p2_4_9_4 = p2_4_9_4;
    }

    public String getP2_4_9_5() {
        return p2_4_9_5;
    }

    public void setP2_4_9_5(String p2_4_9_5) {
        this.p2_4_9_5 = p2_4_9_5;
    }

    public String getP2_4_9_6() {
        return p2_4_9_6;
    }

    public void setP2_4_9_6(String p2_4_9_6) {
        this.p2_4_9_6 = p2_4_9_6;
    }

    public String getP2_4_9_7() {
        return p2_4_9_7;
    }

    public void setP2_4_9_7(String p2_4_9_7) {
        this.p2_4_9_7 = p2_4_9_7;
    }

    public String getP2_4_9_8() {
        return p2_4_9_8;
    }

    public void setP2_4_9_8(String p2_4_9_8) {
        this.p2_4_9_8 = p2_4_9_8;
    }

    public String getP2_4_9_9() {
        return p2_4_9_9;
    }

    public void setP2_4_9_9(String p2_4_9_9) {
        this.p2_4_9_9 = p2_4_9_9;
    }

    public String getP2_4_9_10() {
        return p2_4_9_10;
    }

    public void setP2_4_9_10(String p2_4_9_10) {
        this.p2_4_9_10 = p2_4_9_10;
    }

    public String getP2_4_10_1() {
        return p2_4_10_1;
    }

    public void setP2_4_10_1(String p2_4_10_1) {
        this.p2_4_10_1 = p2_4_10_1;
    }

    public String getP2_4_10_2() {
        return p2_4_10_2;
    }

    public void setP2_4_10_2(String p2_4_10_2) {
        this.p2_4_10_2 = p2_4_10_2;
    }

    public String getP2_4_10_3() {
        return p2_4_10_3;
    }

    public void setP2_4_10_3(String p2_4_10_3) {
        this.p2_4_10_3 = p2_4_10_3;
    }

    public String getP2_4_10_4() {
        return p2_4_10_4;
    }

    public void setP2_4_10_4(String p2_4_10_4) {
        this.p2_4_10_4 = p2_4_10_4;
    }

    public String getP2_4_10_5() {
        return p2_4_10_5;
    }

    public void setP2_4_10_5(String p2_4_10_5) {
        this.p2_4_10_5 = p2_4_10_5;
    }

    public String getP2_4_10_6() {
        return p2_4_10_6;
    }

    public void setP2_4_10_6(String p2_4_10_6) {
        this.p2_4_10_6 = p2_4_10_6;
    }

    public String getP2_4_10_7() {
        return p2_4_10_7;
    }

    public void setP2_4_10_7(String p2_4_10_7) {
        this.p2_4_10_7 = p2_4_10_7;
    }

    public String getP2_4_10_8() {
        return p2_4_10_8;
    }

    public void setP2_4_10_8(String p2_4_10_8) {
        this.p2_4_10_8 = p2_4_10_8;
    }

    public String getP2_4_10_9() {
        return p2_4_10_9;
    }

    public void setP2_4_10_9(String p2_4_10_9) {
        this.p2_4_10_9 = p2_4_10_9;
    }

    public String getP2_4_10_10() {
        return p2_4_10_10;
    }

    public void setP2_4_10_10(String p2_4_10_10) {
        this.p2_4_10_10 = p2_4_10_10;
    }

    public String getP2_5_t1() {
        return p2_5_t1;
    }

    public void setP2_5_t1(String p2_5_t1) {
        this.p2_5_t1 = p2_5_t1;
    }

    public String getP2_5_t2() {
        return p2_5_t2;
    }

    public void setP2_5_t2(String p2_5_t2) {
        this.p2_5_t2 = p2_5_t2;
    }

    public String getP2_5_t3() {
        return p2_5_t3;
    }

    public void setP2_5_t3(String p2_5_t3) {
        this.p2_5_t3 = p2_5_t3;
    }

    public String getP2_5_t4() {
        return p2_5_t4;
    }

    public void setP2_5_t4(String p2_5_t4) {
        this.p2_5_t4 = p2_5_t4;
    }

    public String getP2_5_t5() {
        return p2_5_t5;
    }

    public void setP2_5_t5(String p2_5_t5) {
        this.p2_5_t5 = p2_5_t5;
    }

    public String getP2_5_t6() {
        return p2_5_t6;
    }

    public void setP2_5_t6(String p2_5_t6) {
        this.p2_5_t6 = p2_5_t6;
    }

    public String getP2_5_t8() {
        return p2_5_t8;
    }

    public void setP2_5_t8(String p2_5_t8) {
        this.p2_5_t8 = p2_5_t8;
    }

    public String getP2_5_t9() {
        return p2_5_t9;
    }

    public void setP2_5_t9(String p2_5_t9) {
        this.p2_5_t9 = p2_5_t9;
    }

    public String getP2_5_t10() {
        return p2_5_t10;
    }

    public void setP2_5_t10(String p2_5_t10) {
        this.p2_5_t10 = p2_5_t10;
    }

    public String getP2_5_e1() {
        return p2_5_e1;
    }

    public void setP2_5_e1(String p2_5_e1) {
        this.p2_5_e1 = p2_5_e1;
    }

    public String getP2_5_e2() {
        return p2_5_e2;
    }

    public void setP2_5_e2(String p2_5_e2) {
        this.p2_5_e2 = p2_5_e2;
    }

    public String getP2_5_e3() {
        return p2_5_e3;
    }

    public void setP2_5_e3(String p2_5_e3) {
        this.p2_5_e3 = p2_5_e3;
    }

    public String getP2_5_e4() {
        return p2_5_e4;
    }

    public void setP2_5_e4(String p2_5_e4) {
        this.p2_5_e4 = p2_5_e4;
    }

    public String getP2_5_e5() {
        return p2_5_e5;
    }

    public void setP2_5_e5(String p2_5_e5) {
        this.p2_5_e5 = p2_5_e5;
    }

    public String getP2_5_e6() {
        return p2_5_e6;
    }

    public void setP2_5_e6(String p2_5_e6) {
        this.p2_5_e6 = p2_5_e6;
    }

    public String getP2_5_e7() {
        return p2_5_e7;
    }

    public void setP2_5_e7(String p2_5_e7) {
        this.p2_5_e7 = p2_5_e7;
    }

    public String getP2_5_e8() {
        return p2_5_e8;
    }

    public void setP2_5_e8(String p2_5_e8) {
        this.p2_5_e8 = p2_5_e8;
    }

    public String getP2_5_e9() {
        return p2_5_e9;
    }

    public void setP2_5_e9(String p2_5_e9) {
        this.p2_5_e9 = p2_5_e9;
    }

    public String getP2_5_e10() {
        return p2_5_e10;
    }

    public void setP2_5_e10(String p2_5_e10) {
        this.p2_5_e10 = p2_5_e10;
    }

    public String getP2_5_1_1() {
        return p2_5_1_1;
    }

    public void setP2_5_1_1(String p2_5_1_1) {
        this.p2_5_1_1 = p2_5_1_1;
    }

    public String getP2_5_1_2() {
        return p2_5_1_2;
    }

    public void setP2_5_1_2(String p2_5_1_2) {
        this.p2_5_1_2 = p2_5_1_2;
    }

    public String getP2_5_1_3() {
        return p2_5_1_3;
    }

    public void setP2_5_1_3(String p2_5_1_3) {
        this.p2_5_1_3 = p2_5_1_3;
    }

    public String getP2_5_1_4() {
        return p2_5_1_4;
    }

    public void setP2_5_1_4(String p2_5_1_4) {
        this.p2_5_1_4 = p2_5_1_4;
    }

    public String getP2_5_1_5() {
        return p2_5_1_5;
    }

    public void setP2_5_1_5(String p2_5_1_5) {
        this.p2_5_1_5 = p2_5_1_5;
    }

    public String getP2_5_1_6() {
        return p2_5_1_6;
    }

    public void setP2_5_1_6(String p2_5_1_6) {
        this.p2_5_1_6 = p2_5_1_6;
    }

    public String getP2_5_1_7() {
        return p2_5_1_7;
    }

    public void setP2_5_1_7(String p2_5_1_7) {
        this.p2_5_1_7 = p2_5_1_7;
    }

    public String getP2_5_1_8() {
        return p2_5_1_8;
    }

    public void setP2_5_1_8(String p2_5_1_8) {
        this.p2_5_1_8 = p2_5_1_8;
    }

    public String getP2_5_1_9() {
        return p2_5_1_9;
    }

    public void setP2_5_1_9(String p2_5_1_9) {
        this.p2_5_1_9 = p2_5_1_9;
    }

    public String getP2_5_1_10() {
        return p2_5_1_10;
    }

    public void setP2_5_1_10(String p2_5_1_10) {
        this.p2_5_1_10 = p2_5_1_10;
    }

    public String getP2_5_2_1() {
        return p2_5_2_1;
    }

    public void setP2_5_2_1(String p2_5_2_1) {
        this.p2_5_2_1 = p2_5_2_1;
    }

    public String getP2_5_2_2() {
        return p2_5_2_2;
    }

    public void setP2_5_2_2(String p2_5_2_2) {
        this.p2_5_2_2 = p2_5_2_2;
    }

    public String getP2_5_2_3() {
        return p2_5_2_3;
    }

    public void setP2_5_2_3(String p2_5_2_3) {
        this.p2_5_2_3 = p2_5_2_3;
    }

    public String getP2_5_2_4() {
        return p2_5_2_4;
    }

    public void setP2_5_2_4(String p2_5_2_4) {
        this.p2_5_2_4 = p2_5_2_4;
    }

    public String getP2_5_2_5() {
        return p2_5_2_5;
    }

    public void setP2_5_2_5(String p2_5_2_5) {
        this.p2_5_2_5 = p2_5_2_5;
    }

    public String getP2_5_2_6() {
        return p2_5_2_6;
    }

    public void setP2_5_2_6(String p2_5_2_6) {
        this.p2_5_2_6 = p2_5_2_6;
    }

    public String getP2_5_2_7() {
        return p2_5_2_7;
    }

    public void setP2_5_2_7(String p2_5_2_7) {
        this.p2_5_2_7 = p2_5_2_7;
    }

    public String getP2_5_2_8() {
        return p2_5_2_8;
    }

    public void setP2_5_2_8(String p2_5_2_8) {
        this.p2_5_2_8 = p2_5_2_8;
    }

    public String getP2_5_2_9() {
        return p2_5_2_9;
    }

    public void setP2_5_2_9(String p2_5_2_9) {
        this.p2_5_2_9 = p2_5_2_9;
    }

    public String getP2_5_2_10() {
        return p2_5_2_10;
    }

    public void setP2_5_2_10(String p2_5_2_10) {
        this.p2_5_2_10 = p2_5_2_10;
    }

    public String getP2_5_3_1() {
        return p2_5_3_1;
    }

    public void setP2_5_3_1(String p2_5_3_1) {
        this.p2_5_3_1 = p2_5_3_1;
    }

    public String getP2_5_3_2() {
        return p2_5_3_2;
    }

    public void setP2_5_3_2(String p2_5_3_2) {
        this.p2_5_3_2 = p2_5_3_2;
    }

    public String getP2_5_3_3() {
        return p2_5_3_3;
    }

    public void setP2_5_3_3(String p2_5_3_3) {
        this.p2_5_3_3 = p2_5_3_3;
    }

    public String getP2_5_3_4() {
        return p2_5_3_4;
    }

    public void setP2_5_3_4(String p2_5_3_4) {
        this.p2_5_3_4 = p2_5_3_4;
    }

    public String getP2_5_3_5() {
        return p2_5_3_5;
    }

    public void setP2_5_3_5(String p2_5_3_5) {
        this.p2_5_3_5 = p2_5_3_5;
    }

    public String getP2_5_3_6() {
        return p2_5_3_6;
    }

    public void setP2_5_3_6(String p2_5_3_6) {
        this.p2_5_3_6 = p2_5_3_6;
    }

    public String getP2_5_3_7() {
        return p2_5_3_7;
    }

    public void setP2_5_3_7(String p2_5_3_7) {
        this.p2_5_3_7 = p2_5_3_7;
    }

    public String getP2_5_3_8() {
        return p2_5_3_8;
    }

    public void setP2_5_3_8(String p2_5_3_8) {
        this.p2_5_3_8 = p2_5_3_8;
    }

    public String getP2_5_3_9() {
        return p2_5_3_9;
    }

    public void setP2_5_3_9(String p2_5_3_9) {
        this.p2_5_3_9 = p2_5_3_9;
    }

    public String getP2_5_3_10() {
        return p2_5_3_10;
    }

    public void setP2_5_3_10(String p2_5_3_10) {
        this.p2_5_3_10 = p2_5_3_10;
    }

    public String getP2_5_4_1() {
        return p2_5_4_1;
    }

    public void setP2_5_4_1(String p2_5_4_1) {
        this.p2_5_4_1 = p2_5_4_1;
    }

    public String getP2_5_4_2() {
        return p2_5_4_2;
    }

    public void setP2_5_4_2(String p2_5_4_2) {
        this.p2_5_4_2 = p2_5_4_2;
    }

    public String getP2_5_4_3() {
        return p2_5_4_3;
    }

    public void setP2_5_4_3(String p2_5_4_3) {
        this.p2_5_4_3 = p2_5_4_3;
    }

    public String getP2_5_4_4() {
        return p2_5_4_4;
    }

    public void setP2_5_4_4(String p2_5_4_4) {
        this.p2_5_4_4 = p2_5_4_4;
    }

    public String getP2_5_4_5() {
        return p2_5_4_5;
    }

    public void setP2_5_4_5(String p2_5_4_5) {
        this.p2_5_4_5 = p2_5_4_5;
    }

    public String getP2_5_4_6() {
        return p2_5_4_6;
    }

    public void setP2_5_4_6(String p2_5_4_6) {
        this.p2_5_4_6 = p2_5_4_6;
    }

    public String getP2_5_4_7() {
        return p2_5_4_7;
    }

    public void setP2_5_4_7(String p2_5_4_7) {
        this.p2_5_4_7 = p2_5_4_7;
    }

    public String getP2_5_4_8() {
        return p2_5_4_8;
    }

    public void setP2_5_4_8(String p2_5_4_8) {
        this.p2_5_4_8 = p2_5_4_8;
    }

    public String getP2_5_4_9() {
        return p2_5_4_9;
    }

    public void setP2_5_4_9(String p2_5_4_9) {
        this.p2_5_4_9 = p2_5_4_9;
    }

    public String getP2_5_4_10() {
        return p2_5_4_10;
    }

    public void setP2_5_4_10(String p2_5_4_10) {
        this.p2_5_4_10 = p2_5_4_10;
    }

    public String getP2_5_5_1() {
        return p2_5_5_1;
    }

    public void setP2_5_5_1(String p2_5_5_1) {
        this.p2_5_5_1 = p2_5_5_1;
    }

    public String getP2_5_5_2() {
        return p2_5_5_2;
    }

    public void setP2_5_5_2(String p2_5_5_2) {
        this.p2_5_5_2 = p2_5_5_2;
    }

    public String getP2_5_5_3() {
        return p2_5_5_3;
    }

    public void setP2_5_5_3(String p2_5_5_3) {
        this.p2_5_5_3 = p2_5_5_3;
    }

    public String getP2_5_5_4() {
        return p2_5_5_4;
    }

    public void setP2_5_5_4(String p2_5_5_4) {
        this.p2_5_5_4 = p2_5_5_4;
    }

    public String getP2_5_5_5() {
        return p2_5_5_5;
    }

    public void setP2_5_5_5(String p2_5_5_5) {
        this.p2_5_5_5 = p2_5_5_5;
    }

    public String getP2_5_5_6() {
        return p2_5_5_6;
    }

    public void setP2_5_5_6(String p2_5_5_6) {
        this.p2_5_5_6 = p2_5_5_6;
    }

    public String getP2_5_5_7() {
        return p2_5_5_7;
    }

    public void setP2_5_5_7(String p2_5_5_7) {
        this.p2_5_5_7 = p2_5_5_7;
    }

    public String getP2_5_5_8() {
        return p2_5_5_8;
    }

    public void setP2_5_5_8(String p2_5_5_8) {
        this.p2_5_5_8 = p2_5_5_8;
    }

    public String getP2_5_5_9() {
        return p2_5_5_9;
    }

    public void setP2_5_5_9(String p2_5_5_9) {
        this.p2_5_5_9 = p2_5_5_9;
    }

    public String getP2_5_5_10() {
        return p2_5_5_10;
    }

    public void setP2_5_5_10(String p2_5_5_10) {
        this.p2_5_5_10 = p2_5_5_10;
    }

    public String getP2_5_6_1() {
        return p2_5_6_1;
    }

    public void setP2_5_6_1(String p2_5_6_1) {
        this.p2_5_6_1 = p2_5_6_1;
    }

    public String getP2_5_6_2() {
        return p2_5_6_2;
    }

    public void setP2_5_6_2(String p2_5_6_2) {
        this.p2_5_6_2 = p2_5_6_2;
    }

    public String getP2_5_6_3() {
        return p2_5_6_3;
    }

    public void setP2_5_6_3(String p2_5_6_3) {
        this.p2_5_6_3 = p2_5_6_3;
    }

    public String getP2_5_6_4() {
        return p2_5_6_4;
    }

    public void setP2_5_6_4(String p2_5_6_4) {
        this.p2_5_6_4 = p2_5_6_4;
    }

    public String getP2_5_6_5() {
        return p2_5_6_5;
    }

    public void setP2_5_6_5(String p2_5_6_5) {
        this.p2_5_6_5 = p2_5_6_5;
    }

    public String getP2_5_6_6() {
        return p2_5_6_6;
    }

    public void setP2_5_6_6(String p2_5_6_6) {
        this.p2_5_6_6 = p2_5_6_6;
    }

    public String getP2_5_6_7() {
        return p2_5_6_7;
    }

    public void setP2_5_6_7(String p2_5_6_7) {
        this.p2_5_6_7 = p2_5_6_7;
    }

    public String getP2_5_6_8() {
        return p2_5_6_8;
    }

    public void setP2_5_6_8(String p2_5_6_8) {
        this.p2_5_6_8 = p2_5_6_8;
    }

    public String getP2_5_6_9() {
        return p2_5_6_9;
    }

    public void setP2_5_6_9(String p2_5_6_9) {
        this.p2_5_6_9 = p2_5_6_9;
    }

    public String getP2_5_6_10() {
        return p2_5_6_10;
    }

    public void setP2_5_6_10(String p2_5_6_10) {
        this.p2_5_6_10 = p2_5_6_10;
    }

    public String getP2_5_7_1() {
        return p2_5_7_1;
    }

    public void setP2_5_7_1(String p2_5_7_1) {
        this.p2_5_7_1 = p2_5_7_1;
    }

    public String getP2_5_7_2() {
        return p2_5_7_2;
    }

    public void setP2_5_7_2(String p2_5_7_2) {
        this.p2_5_7_2 = p2_5_7_2;
    }

    public String getP2_5_7_3() {
        return p2_5_7_3;
    }

    public void setP2_5_7_3(String p2_5_7_3) {
        this.p2_5_7_3 = p2_5_7_3;
    }

    public String getP2_5_7_4() {
        return p2_5_7_4;
    }

    public void setP2_5_7_4(String p2_5_7_4) {
        this.p2_5_7_4 = p2_5_7_4;
    }

    public String getP2_5_7_5() {
        return p2_5_7_5;
    }

    public void setP2_5_7_5(String p2_5_7_5) {
        this.p2_5_7_5 = p2_5_7_5;
    }

    public String getP2_5_7_6() {
        return p2_5_7_6;
    }

    public void setP2_5_7_6(String p2_5_7_6) {
        this.p2_5_7_6 = p2_5_7_6;
    }

    public String getP2_5_7_7() {
        return p2_5_7_7;
    }

    public void setP2_5_7_7(String p2_5_7_7) {
        this.p2_5_7_7 = p2_5_7_7;
    }

    public String getP2_5_7_8() {
        return p2_5_7_8;
    }

    public void setP2_5_7_8(String p2_5_7_8) {
        this.p2_5_7_8 = p2_5_7_8;
    }

    public String getP2_5_7_9() {
        return p2_5_7_9;
    }

    public void setP2_5_7_9(String p2_5_7_9) {
        this.p2_5_7_9 = p2_5_7_9;
    }

    public String getP2_5_7_10() {
        return p2_5_7_10;
    }

    public void setP2_5_7_10(String p2_5_7_10) {
        this.p2_5_7_10 = p2_5_7_10;
    }

    public String getP2_5_8_1() {
        return p2_5_8_1;
    }

    public void setP2_5_8_1(String p2_5_8_1) {
        this.p2_5_8_1 = p2_5_8_1;
    }

    public String getP2_5_8_2() {
        return p2_5_8_2;
    }

    public void setP2_5_8_2(String p2_5_8_2) {
        this.p2_5_8_2 = p2_5_8_2;
    }

    public String getP2_5_8_3() {
        return p2_5_8_3;
    }

    public void setP2_5_8_3(String p2_5_8_3) {
        this.p2_5_8_3 = p2_5_8_3;
    }

    public String getP2_5_8_4() {
        return p2_5_8_4;
    }

    public void setP2_5_8_4(String p2_5_8_4) {
        this.p2_5_8_4 = p2_5_8_4;
    }

    public String getP2_5_8_5() {
        return p2_5_8_5;
    }

    public void setP2_5_8_5(String p2_5_8_5) {
        this.p2_5_8_5 = p2_5_8_5;
    }

    public String getP2_5_8_6() {
        return p2_5_8_6;
    }

    public void setP2_5_8_6(String p2_5_8_6) {
        this.p2_5_8_6 = p2_5_8_6;
    }

    public String getP2_5_8_7() {
        return p2_5_8_7;
    }

    public void setP2_5_8_7(String p2_5_8_7) {
        this.p2_5_8_7 = p2_5_8_7;
    }

    public String getP2_5_8_8() {
        return p2_5_8_8;
    }

    public void setP2_5_8_8(String p2_5_8_8) {
        this.p2_5_8_8 = p2_5_8_8;
    }

    public String getP2_5_8_9() {
        return p2_5_8_9;
    }

    public void setP2_5_8_9(String p2_5_8_9) {
        this.p2_5_8_9 = p2_5_8_9;
    }

    public String getP2_5_8_10() {
        return p2_5_8_10;
    }

    public void setP2_5_8_10(String p2_5_8_10) {
        this.p2_5_8_10 = p2_5_8_10;
    }

    public String getP2_5_9_1() {
        return p2_5_9_1;
    }

    public void setP2_5_9_1(String p2_5_9_1) {
        this.p2_5_9_1 = p2_5_9_1;
    }

    public String getP2_5_9_2() {
        return p2_5_9_2;
    }

    public void setP2_5_9_2(String p2_5_9_2) {
        this.p2_5_9_2 = p2_5_9_2;
    }

    public String getP2_5_9_3() {
        return p2_5_9_3;
    }

    public void setP2_5_9_3(String p2_5_9_3) {
        this.p2_5_9_3 = p2_5_9_3;
    }

    public String getP2_5_9_4() {
        return p2_5_9_4;
    }

    public void setP2_5_9_4(String p2_5_9_4) {
        this.p2_5_9_4 = p2_5_9_4;
    }

    public String getP2_5_9_5() {
        return p2_5_9_5;
    }

    public void setP2_5_9_5(String p2_5_9_5) {
        this.p2_5_9_5 = p2_5_9_5;
    }

    public String getP2_5_9_6() {
        return p2_5_9_6;
    }

    public void setP2_5_9_6(String p2_5_9_6) {
        this.p2_5_9_6 = p2_5_9_6;
    }

    public String getP2_5_9_7() {
        return p2_5_9_7;
    }

    public void setP2_5_9_7(String p2_5_9_7) {
        this.p2_5_9_7 = p2_5_9_7;
    }

    public String getP2_5_9_8() {
        return p2_5_9_8;
    }

    public void setP2_5_9_8(String p2_5_9_8) {
        this.p2_5_9_8 = p2_5_9_8;
    }

    public String getP2_5_9_9() {
        return p2_5_9_9;
    }

    public void setP2_5_9_9(String p2_5_9_9) {
        this.p2_5_9_9 = p2_5_9_9;
    }

    public String getP2_5_9_10() {
        return p2_5_9_10;
    }

    public void setP2_5_9_10(String p2_5_9_10) {
        this.p2_5_9_10 = p2_5_9_10;
    }

    public String getP2_5_10_1() {
        return p2_5_10_1;
    }

    public void setP2_5_10_1(String p2_5_10_1) {
        this.p2_5_10_1 = p2_5_10_1;
    }

    public String getP2_5_10_2() {
        return p2_5_10_2;
    }

    public void setP2_5_10_2(String p2_5_10_2) {
        this.p2_5_10_2 = p2_5_10_2;
    }

    public String getP2_5_10_3() {
        return p2_5_10_3;
    }

    public void setP2_5_10_3(String p2_5_10_3) {
        this.p2_5_10_3 = p2_5_10_3;
    }

    public String getP2_5_10_4() {
        return p2_5_10_4;
    }

    public void setP2_5_10_4(String p2_5_10_4) {
        this.p2_5_10_4 = p2_5_10_4;
    }

    public String getP2_5_10_5() {
        return p2_5_10_5;
    }

    public void setP2_5_10_5(String p2_5_10_5) {
        this.p2_5_10_5 = p2_5_10_5;
    }

    public String getP2_5_10_6() {
        return p2_5_10_6;
    }

    public void setP2_5_10_6(String p2_5_10_6) {
        this.p2_5_10_6 = p2_5_10_6;
    }

    public String getP2_5_10_7() {
        return p2_5_10_7;
    }

    public void setP2_5_10_7(String p2_5_10_7) {
        this.p2_5_10_7 = p2_5_10_7;
    }

    public String getP2_5_10_8() {
        return p2_5_10_8;
    }

    public void setP2_5_10_8(String p2_5_10_8) {
        this.p2_5_10_8 = p2_5_10_8;
    }

    public String getP2_5_10_9() {
        return p2_5_10_9;
    }

    public void setP2_5_10_9(String p2_5_10_9) {
        this.p2_5_10_9 = p2_5_10_9;
    }

    public String getP2_5_10_10() {
        return p2_5_10_10;
    }

    public void setP2_5_10_10(String p2_5_10_10) {
        this.p2_5_10_10 = p2_5_10_10;
    }

    public String getP2_6_t1() {
        return p2_6_t1;
    }

    public void setP2_6_t1(String p2_6_t1) {
        this.p2_6_t1 = p2_6_t1;
    }

    public String getP2_6_t2() {
        return p2_6_t2;
    }

    public void setP2_6_t2(String p2_6_t2) {
        this.p2_6_t2 = p2_6_t2;
    }

    public String getP2_6_t3() {
        return p2_6_t3;
    }

    public void setP2_6_t3(String p2_6_t3) {
        this.p2_6_t3 = p2_6_t3;
    }

    public String getP2_6_t4() {
        return p2_6_t4;
    }

    public void setP2_6_t4(String p2_6_t4) {
        this.p2_6_t4 = p2_6_t4;
    }

    public String getP2_6_t5() {
        return p2_6_t5;
    }

    public void setP2_6_t5(String p2_6_t5) {
        this.p2_6_t5 = p2_6_t5;
    }

    public String getP2_6_t6() {
        return p2_6_t6;
    }

    public void setP2_6_t6(String p2_6_t6) {
        this.p2_6_t6 = p2_6_t6;
    }

    public String getP2_6_t8() {
        return p2_6_t8;
    }

    public void setP2_6_t8(String p2_6_t8) {
        this.p2_6_t8 = p2_6_t8;
    }

    public String getP2_6_t9() {
        return p2_6_t9;
    }

    public void setP2_6_t9(String p2_6_t9) {
        this.p2_6_t9 = p2_6_t9;
    }

    public String getP2_6_e1() {
        return p2_6_e1;
    }

    public void setP2_6_e1(String p2_6_e1) {
        this.p2_6_e1 = p2_6_e1;
    }

    public String getP2_6_e2() {
        return p2_6_e2;
    }

    public void setP2_6_e2(String p2_6_e2) {
        this.p2_6_e2 = p2_6_e2;
    }

    public String getP2_6_e3() {
        return p2_6_e3;
    }

    public void setP2_6_e3(String p2_6_e3) {
        this.p2_6_e3 = p2_6_e3;
    }

    public String getP2_6_e4() {
        return p2_6_e4;
    }

    public void setP2_6_e4(String p2_6_e4) {
        this.p2_6_e4 = p2_6_e4;
    }

    public String getP2_6_e5() {
        return p2_6_e5;
    }

    public void setP2_6_e5(String p2_6_e5) {
        this.p2_6_e5 = p2_6_e5;
    }

    public String getP2_6_e6() {
        return p2_6_e6;
    }

    public void setP2_6_e6(String p2_6_e6) {
        this.p2_6_e6 = p2_6_e6;
    }

    public String getP2_6_e7() {
        return p2_6_e7;
    }

    public void setP2_6_e7(String p2_6_e7) {
        this.p2_6_e7 = p2_6_e7;
    }

    public String getP2_6_e8() {
        return p2_6_e8;
    }

    public void setP2_6_e8(String p2_6_e8) {
        this.p2_6_e8 = p2_6_e8;
    }

    public String getP2_6_e9() {
        return p2_6_e9;
    }

    public void setP2_6_e9(String p2_6_e9) {
        this.p2_6_e9 = p2_6_e9;
    }

    public String getP2_6_1_1() {
        return p2_6_1_1;
    }

    public void setP2_6_1_1(String p2_6_1_1) {
        this.p2_6_1_1 = p2_6_1_1;
    }

    public String getP2_6_1_2() {
        return p2_6_1_2;
    }

    public void setP2_6_1_2(String p2_6_1_2) {
        this.p2_6_1_2 = p2_6_1_2;
    }

    public String getP2_6_1_3() {
        return p2_6_1_3;
    }

    public void setP2_6_1_3(String p2_6_1_3) {
        this.p2_6_1_3 = p2_6_1_3;
    }

    public String getP2_6_1_4() {
        return p2_6_1_4;
    }

    public void setP2_6_1_4(String p2_6_1_4) {
        this.p2_6_1_4 = p2_6_1_4;
    }

    public String getP2_6_1_5() {
        return p2_6_1_5;
    }

    public void setP2_6_1_5(String p2_6_1_5) {
        this.p2_6_1_5 = p2_6_1_5;
    }

    public String getP2_6_1_6() {
        return p2_6_1_6;
    }

    public void setP2_6_1_6(String p2_6_1_6) {
        this.p2_6_1_6 = p2_6_1_6;
    }

    public String getP2_6_1_7() {
        return p2_6_1_7;
    }

    public void setP2_6_1_7(String p2_6_1_7) {
        this.p2_6_1_7 = p2_6_1_7;
    }

    public String getP2_6_1_8() {
        return p2_6_1_8;
    }

    public void setP2_6_1_8(String p2_6_1_8) {
        this.p2_6_1_8 = p2_6_1_8;
    }

    public String getP2_6_1_9() {
        return p2_6_1_9;
    }

    public void setP2_6_1_9(String p2_6_1_9) {
        this.p2_6_1_9 = p2_6_1_9;
    }

    public String getP2_6_2_1() {
        return p2_6_2_1;
    }

    public void setP2_6_2_1(String p2_6_2_1) {
        this.p2_6_2_1 = p2_6_2_1;
    }

    public String getP2_6_2_2() {
        return p2_6_2_2;
    }

    public void setP2_6_2_2(String p2_6_2_2) {
        this.p2_6_2_2 = p2_6_2_2;
    }

    public String getP2_6_2_3() {
        return p2_6_2_3;
    }

    public void setP2_6_2_3(String p2_6_2_3) {
        this.p2_6_2_3 = p2_6_2_3;
    }

    public String getP2_6_2_4() {
        return p2_6_2_4;
    }

    public void setP2_6_2_4(String p2_6_2_4) {
        this.p2_6_2_4 = p2_6_2_4;
    }

    public String getP2_6_2_5() {
        return p2_6_2_5;
    }

    public void setP2_6_2_5(String p2_6_2_5) {
        this.p2_6_2_5 = p2_6_2_5;
    }

    public String getP2_6_2_6() {
        return p2_6_2_6;
    }

    public void setP2_6_2_6(String p2_6_2_6) {
        this.p2_6_2_6 = p2_6_2_6;
    }

    public String getP2_6_2_7() {
        return p2_6_2_7;
    }

    public void setP2_6_2_7(String p2_6_2_7) {
        this.p2_6_2_7 = p2_6_2_7;
    }

    public String getP2_6_2_8() {
        return p2_6_2_8;
    }

    public void setP2_6_2_8(String p2_6_2_8) {
        this.p2_6_2_8 = p2_6_2_8;
    }

    public String getP2_6_2_9() {
        return p2_6_2_9;
    }

    public void setP2_6_2_9(String p2_6_2_9) {
        this.p2_6_2_9 = p2_6_2_9;
    }

    public String getP2_6_3_1() {
        return p2_6_3_1;
    }

    public void setP2_6_3_1(String p2_6_3_1) {
        this.p2_6_3_1 = p2_6_3_1;
    }

    public String getP2_6_3_2() {
        return p2_6_3_2;
    }

    public void setP2_6_3_2(String p2_6_3_2) {
        this.p2_6_3_2 = p2_6_3_2;
    }

    public String getP2_6_3_3() {
        return p2_6_3_3;
    }

    public void setP2_6_3_3(String p2_6_3_3) {
        this.p2_6_3_3 = p2_6_3_3;
    }

    public String getP2_6_3_4() {
        return p2_6_3_4;
    }

    public void setP2_6_3_4(String p2_6_3_4) {
        this.p2_6_3_4 = p2_6_3_4;
    }

    public String getP2_6_3_5() {
        return p2_6_3_5;
    }

    public void setP2_6_3_5(String p2_6_3_5) {
        this.p2_6_3_5 = p2_6_3_5;
    }

    public String getP2_6_3_6() {
        return p2_6_3_6;
    }

    public void setP2_6_3_6(String p2_6_3_6) {
        this.p2_6_3_6 = p2_6_3_6;
    }

    public String getP2_6_3_7() {
        return p2_6_3_7;
    }

    public void setP2_6_3_7(String p2_6_3_7) {
        this.p2_6_3_7 = p2_6_3_7;
    }

    public String getP2_6_3_8() {
        return p2_6_3_8;
    }

    public void setP2_6_3_8(String p2_6_3_8) {
        this.p2_6_3_8 = p2_6_3_8;
    }

    public String getP2_6_3_9() {
        return p2_6_3_9;
    }

    public void setP2_6_3_9(String p2_6_3_9) {
        this.p2_6_3_9 = p2_6_3_9;
    }

    public String getP2_6_4_1() {
        return p2_6_4_1;
    }

    public void setP2_6_4_1(String p2_6_4_1) {
        this.p2_6_4_1 = p2_6_4_1;
    }

    public String getP2_6_4_2() {
        return p2_6_4_2;
    }

    public void setP2_6_4_2(String p2_6_4_2) {
        this.p2_6_4_2 = p2_6_4_2;
    }

    public String getP2_6_4_3() {
        return p2_6_4_3;
    }

    public void setP2_6_4_3(String p2_6_4_3) {
        this.p2_6_4_3 = p2_6_4_3;
    }

    public String getP2_6_4_4() {
        return p2_6_4_4;
    }

    public void setP2_6_4_4(String p2_6_4_4) {
        this.p2_6_4_4 = p2_6_4_4;
    }

    public String getP2_6_4_5() {
        return p2_6_4_5;
    }

    public void setP2_6_4_5(String p2_6_4_5) {
        this.p2_6_4_5 = p2_6_4_5;
    }

    public String getP2_6_4_6() {
        return p2_6_4_6;
    }

    public void setP2_6_4_6(String p2_6_4_6) {
        this.p2_6_4_6 = p2_6_4_6;
    }

    public String getP2_6_4_7() {
        return p2_6_4_7;
    }

    public void setP2_6_4_7(String p2_6_4_7) {
        this.p2_6_4_7 = p2_6_4_7;
    }

    public String getP2_6_4_8() {
        return p2_6_4_8;
    }

    public void setP2_6_4_8(String p2_6_4_8) {
        this.p2_6_4_8 = p2_6_4_8;
    }

    public String getP2_6_4_9() {
        return p2_6_4_9;
    }

    public void setP2_6_4_9(String p2_6_4_9) {
        this.p2_6_4_9 = p2_6_4_9;
    }

    public String getP2_6_5_1() {
        return p2_6_5_1;
    }

    public void setP2_6_5_1(String p2_6_5_1) {
        this.p2_6_5_1 = p2_6_5_1;
    }

    public String getP2_6_5_2() {
        return p2_6_5_2;
    }

    public void setP2_6_5_2(String p2_6_5_2) {
        this.p2_6_5_2 = p2_6_5_2;
    }

    public String getP2_6_5_3() {
        return p2_6_5_3;
    }

    public void setP2_6_5_3(String p2_6_5_3) {
        this.p2_6_5_3 = p2_6_5_3;
    }

    public String getP2_6_5_4() {
        return p2_6_5_4;
    }

    public void setP2_6_5_4(String p2_6_5_4) {
        this.p2_6_5_4 = p2_6_5_4;
    }

    public String getP2_6_5_5() {
        return p2_6_5_5;
    }

    public void setP2_6_5_5(String p2_6_5_5) {
        this.p2_6_5_5 = p2_6_5_5;
    }

    public String getP2_6_5_6() {
        return p2_6_5_6;
    }

    public void setP2_6_5_6(String p2_6_5_6) {
        this.p2_6_5_6 = p2_6_5_6;
    }

    public String getP2_6_5_7() {
        return p2_6_5_7;
    }

    public void setP2_6_5_7(String p2_6_5_7) {
        this.p2_6_5_7 = p2_6_5_7;
    }

    public String getP2_6_5_8() {
        return p2_6_5_8;
    }

    public void setP2_6_5_8(String p2_6_5_8) {
        this.p2_6_5_8 = p2_6_5_8;
    }

    public String getP2_6_5_9() {
        return p2_6_5_9;
    }

    public void setP2_6_5_9(String p2_6_5_9) {
        this.p2_6_5_9 = p2_6_5_9;
    }

    public String getP2_6_6_1() {
        return p2_6_6_1;
    }

    public void setP2_6_6_1(String p2_6_6_1) {
        this.p2_6_6_1 = p2_6_6_1;
    }

    public String getP2_6_6_2() {
        return p2_6_6_2;
    }

    public void setP2_6_6_2(String p2_6_6_2) {
        this.p2_6_6_2 = p2_6_6_2;
    }

    public String getP2_6_6_3() {
        return p2_6_6_3;
    }

    public void setP2_6_6_3(String p2_6_6_3) {
        this.p2_6_6_3 = p2_6_6_3;
    }

    public String getP2_6_6_4() {
        return p2_6_6_4;
    }

    public void setP2_6_6_4(String p2_6_6_4) {
        this.p2_6_6_4 = p2_6_6_4;
    }

    public String getP2_6_6_5() {
        return p2_6_6_5;
    }

    public void setP2_6_6_5(String p2_6_6_5) {
        this.p2_6_6_5 = p2_6_6_5;
    }

    public String getP2_6_6_6() {
        return p2_6_6_6;
    }

    public void setP2_6_6_6(String p2_6_6_6) {
        this.p2_6_6_6 = p2_6_6_6;
    }

    public String getP2_6_6_7() {
        return p2_6_6_7;
    }

    public void setP2_6_6_7(String p2_6_6_7) {
        this.p2_6_6_7 = p2_6_6_7;
    }

    public String getP2_6_6_8() {
        return p2_6_6_8;
    }

    public void setP2_6_6_8(String p2_6_6_8) {
        this.p2_6_6_8 = p2_6_6_8;
    }

    public String getP2_6_6_9() {
        return p2_6_6_9;
    }

    public void setP2_6_6_9(String p2_6_6_9) {
        this.p2_6_6_9 = p2_6_6_9;
    }

    public String getP2_6_7_1() {
        return p2_6_7_1;
    }

    public void setP2_6_7_1(String p2_6_7_1) {
        this.p2_6_7_1 = p2_6_7_1;
    }

    public String getP2_6_7_2() {
        return p2_6_7_2;
    }

    public void setP2_6_7_2(String p2_6_7_2) {
        this.p2_6_7_2 = p2_6_7_2;
    }

    public String getP2_6_7_3() {
        return p2_6_7_3;
    }

    public void setP2_6_7_3(String p2_6_7_3) {
        this.p2_6_7_3 = p2_6_7_3;
    }

    public String getP2_6_7_4() {
        return p2_6_7_4;
    }

    public void setP2_6_7_4(String p2_6_7_4) {
        this.p2_6_7_4 = p2_6_7_4;
    }

    public String getP2_6_7_5() {
        return p2_6_7_5;
    }

    public void setP2_6_7_5(String p2_6_7_5) {
        this.p2_6_7_5 = p2_6_7_5;
    }

    public String getP2_6_7_6() {
        return p2_6_7_6;
    }

    public void setP2_6_7_6(String p2_6_7_6) {
        this.p2_6_7_6 = p2_6_7_6;
    }

    public String getP2_6_7_7() {
        return p2_6_7_7;
    }

    public void setP2_6_7_7(String p2_6_7_7) {
        this.p2_6_7_7 = p2_6_7_7;
    }

    public String getP2_6_7_8() {
        return p2_6_7_8;
    }

    public void setP2_6_7_8(String p2_6_7_8) {
        this.p2_6_7_8 = p2_6_7_8;
    }

    public String getP2_6_7_9() {
        return p2_6_7_9;
    }

    public void setP2_6_7_9(String p2_6_7_9) {
        this.p2_6_7_9 = p2_6_7_9;
    }

    public String getP2_6_8_1() {
        return p2_6_8_1;
    }

    public void setP2_6_8_1(String p2_6_8_1) {
        this.p2_6_8_1 = p2_6_8_1;
    }

    public String getP2_6_8_2() {
        return p2_6_8_2;
    }

    public void setP2_6_8_2(String p2_6_8_2) {
        this.p2_6_8_2 = p2_6_8_2;
    }

    public String getP2_6_8_3() {
        return p2_6_8_3;
    }

    public void setP2_6_8_3(String p2_6_8_3) {
        this.p2_6_8_3 = p2_6_8_3;
    }

    public String getP2_6_8_4() {
        return p2_6_8_4;
    }

    public void setP2_6_8_4(String p2_6_8_4) {
        this.p2_6_8_4 = p2_6_8_4;
    }

    public String getP2_6_8_5() {
        return p2_6_8_5;
    }

    public void setP2_6_8_5(String p2_6_8_5) {
        this.p2_6_8_5 = p2_6_8_5;
    }

    public String getP2_6_8_6() {
        return p2_6_8_6;
    }

    public void setP2_6_8_6(String p2_6_8_6) {
        this.p2_6_8_6 = p2_6_8_6;
    }

    public String getP2_6_8_7() {
        return p2_6_8_7;
    }

    public void setP2_6_8_7(String p2_6_8_7) {
        this.p2_6_8_7 = p2_6_8_7;
    }

    public String getP2_6_8_8() {
        return p2_6_8_8;
    }

    public void setP2_6_8_8(String p2_6_8_8) {
        this.p2_6_8_8 = p2_6_8_8;
    }

    public String getP2_6_8_9() {
        return p2_6_8_9;
    }

    public void setP2_6_8_9(String p2_6_8_9) {
        this.p2_6_8_9 = p2_6_8_9;
    }

    public String getP2_6_9_1() {
        return p2_6_9_1;
    }

    public void setP2_6_9_1(String p2_6_9_1) {
        this.p2_6_9_1 = p2_6_9_1;
    }

    public String getP2_6_9_2() {
        return p2_6_9_2;
    }

    public void setP2_6_9_2(String p2_6_9_2) {
        this.p2_6_9_2 = p2_6_9_2;
    }

    public String getP2_6_9_3() {
        return p2_6_9_3;
    }

    public void setP2_6_9_3(String p2_6_9_3) {
        this.p2_6_9_3 = p2_6_9_3;
    }

    public String getP2_6_9_4() {
        return p2_6_9_4;
    }

    public void setP2_6_9_4(String p2_6_9_4) {
        this.p2_6_9_4 = p2_6_9_4;
    }

    public String getP2_6_9_5() {
        return p2_6_9_5;
    }

    public void setP2_6_9_5(String p2_6_9_5) {
        this.p2_6_9_5 = p2_6_9_5;
    }

    public String getP2_6_9_6() {
        return p2_6_9_6;
    }

    public void setP2_6_9_6(String p2_6_9_6) {
        this.p2_6_9_6 = p2_6_9_6;
    }

    public String getP2_6_9_7() {
        return p2_6_9_7;
    }

    public void setP2_6_9_7(String p2_6_9_7) {
        this.p2_6_9_7 = p2_6_9_7;
    }

    public String getP2_6_9_8() {
        return p2_6_9_8;
    }

    public void setP2_6_9_8(String p2_6_9_8) {
        this.p2_6_9_8 = p2_6_9_8;
    }

    public String getP2_6_10_1() {
        return p2_6_10_1;
    }

    public void setP2_6_10_1(String p2_6_10_1) {
        this.p2_6_10_1 = p2_6_10_1;
    }

    public String getP2_6_10_2() {
        return p2_6_10_2;
    }

    public void setP2_6_10_2(String p2_6_10_2) {
        this.p2_6_10_2 = p2_6_10_2;
    }

    public String getP2_6_10_3() {
        return p2_6_10_3;
    }

    public void setP2_6_10_3(String p2_6_10_3) {
        this.p2_6_10_3 = p2_6_10_3;
    }

    public String getP2_6_10_4() {
        return p2_6_10_4;
    }

    public void setP2_6_10_4(String p2_6_10_4) {
        this.p2_6_10_4 = p2_6_10_4;
    }

    public String getP2_6_10_5() {
        return p2_6_10_5;
    }

    public void setP2_6_10_5(String p2_6_10_5) {
        this.p2_6_10_5 = p2_6_10_5;
    }

    public String getP2_6_10_6() {
        return p2_6_10_6;
    }

    public void setP2_6_10_6(String p2_6_10_6) {
        this.p2_6_10_6 = p2_6_10_6;
    }

    public String getP2_6_10_7() {
        return p2_6_10_7;
    }

    public void setP2_6_10_7(String p2_6_10_7) {
        this.p2_6_10_7 = p2_6_10_7;
    }

    public String getP2_6_10_8() {
        return p2_6_10_8;
    }

    public void setP2_6_10_8(String p2_6_10_8) {
        this.p2_6_10_8 = p2_6_10_8;
    }

    public String getP2_6_10_9() {
        return p2_6_10_9;
    }

    public void setP2_6_10_9(String p2_6_10_9) {
        this.p2_6_10_9 = p2_6_10_9;
    }

    public Integer getP3_1() {
        return p3_1;
    }

    public void setP3_1(Integer p3_1) {
        this.p3_1 = p3_1;
    }

    public String getP4_1() {
        return p4_1;
    }

    public void setP4_1(String p4_1) {
        this.p4_1 = p4_1;
    }

    public Integer getP4_2() {
        return p4_2;
    }

    public void setP4_2(Integer p4_2) {
        this.p4_2 = p4_2;
    }

    public Integer getP4_3() {
        return p4_3;
    }

    public void setP4_3(Integer p4_3) {
        this.p4_3 = p4_3;
    }

    public String getP4_4_1() {
        return p4_4_1;
    }

    public void setP4_4_1(String p4_4_1) {
        this.p4_4_1 = p4_4_1;
    }

    public String getP4_4_2() {
        return p4_4_2;
    }

    public void setP4_4_2(String p4_4_2) {
        this.p4_4_2 = p4_4_2;
    }

    public String getP4_4_3() {
        return p4_4_3;
    }

    public void setP4_4_3(String p4_4_3) {
        this.p4_4_3 = p4_4_3;
    }

    public String getP4_4_4() {
        return p4_4_4;
    }

    public void setP4_4_4(String p4_4_4) {
        this.p4_4_4 = p4_4_4;
    }

    public String getP4_4_5() {
        return p4_4_5;
    }

    public void setP4_4_5(String p4_4_5) {
        this.p4_4_5 = p4_4_5;
    }

    public String getP4_4_6() {
        return p4_4_6;
    }

    public void setP4_4_6(String p4_4_6) {
        this.p4_4_6 = p4_4_6;
    }

    public String getP4_4_7() {
        return p4_4_7;
    }

    public void setP4_4_7(String p4_4_7) {
        this.p4_4_7 = p4_4_7;
    }

    public String getP4_5() {
        return p4_5;
    }

    public void setP4_5(String p4_5) {
        this.p4_5 = p4_5;
    }

    public String getP4_6() {
        return p4_6;
    }

    public void setP4_6(String p4_6) {
        this.p4_6 = p4_6;
    }

    public String getP4_7_detalle() {
        return p4_7_detalle;
    }

    public void setP4_7_detalle(String p4_7_detalle) {
        this.p4_7_detalle = p4_7_detalle;
    }

    public String getP4_7_7_detalle() {
        return p4_7_7_detalle;
    }

    public void setP4_7_7_detalle(String p4_7_7_detalle) {
        this.p4_7_7_detalle = p4_7_7_detalle;
    }

    

}