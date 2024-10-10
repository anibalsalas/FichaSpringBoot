package com.dp.gestiondemuna.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educa_ficha2_s2", schema = "SIGA")
public class Demuna_Ficha2_S2Entity implements Serializable {
     
      
    @Id
    private Integer id_ficha_s2;
    private Integer id_ficha;
    private String usu_registro;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_registro;

    private String usu_actualiza;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fch_actualiza;
    private String estado_s2;

    private String p2_1_1;
    private String p2_1_2;
    private String p2_1_3_1;
    private String p2_1_3_2;
    private String p2_1_3_3;
    private String p2_1_3_4;
    private String p2_1_3_5;
    private String p2_1_4_1;
    private String p2_1_4_2;
    private String p2_1_4_3;
    private String p2_1_4_4;
    private String p2_1_4_5;
    private String p2_1_4_6;
    private String p2_1_4_7;
    private String p2_1_4_7_detalle;
    private String p2_1_4_8_no;
    private String p2_1_5;
    private String p2_1_5_detalle;
    private String p2_1_6_1;
    private String p2_1_6_2;
    private String p2_1_6_3;
    private String p2_1_6_4;
    private String p2_1_6_5;
    private String p2_1_6_5_detalle;
    private Integer p2_1_7;
    private Integer p2_1_8;
    private String p2_1_9;
    private String p2_2_1;
    private String p2_2_2;
    private String p2_2_3;
    private String p2_2_4_1;
    private String p2_2_4_2;
    private String p2_2_4_3;
    private String p2_2_4_4;
    private String p2_2_4_5;
    private String p2_2_4_6;
    private String p2_2_4_7;
    private String p2_2_4_7_detalle;
    private String p2_2_4_8_no;
    private String p2_3_1;
    private String p2_3_2;
    private String p2_3_3;
    private String p2_3_4_1;
    private String p2_3_4_2;
    private String p2_3_4_3;
    private String p2_3_4_4;
    private String p2_3_4_4_detalle;
    private String p2_3_5;
    private String p2_3_5_detalle;
    private String p2_3_6;
    private String p2_3_7;
    private String p2_4_1;
    private String p2_4_2;
    private String p2_5_1;
    private String p2_5_2;
    private String p2_6_1;
    private String p2_6_2;
    private String p2_7_1;
    private String p2_7_2_1;
    private String p2_7_2_1_50m;
    private String p2_7_2_1_100m;
    private String p2_7_2_1_300m;
    private String p2_7_2_1_500m;
    private String p2_7_2_2;
    private String p2_7_2_2_50m;
    private String p2_7_2_2_100m;
    private String p2_7_2_2_300m;
    private String p2_7_2_2_500m;
    private String p2_7_2_3;
    private String p2_7_2_3_50m;
    private String p2_7_2_3_100m;
    private String p2_7_2_3_300m;
    private String p2_7_2_3_500m;
    private String p2_7_2_4;
    private String p2_7_2_4_detalle;
    private String p2_7_2_4_50m;
    private String p2_7_2_4_100m;
    private String p2_7_2_4_300m;
    private String p2_7_2_4_500m;
    private String p2_7_3_1;
    private String p2_7_3_2;
    private String p2_7_3_3;
    private String p2_7_3_4;
    private String p2_7_3_5;
    private String p2_7_3_5_detalle;
    private String p2_7_4;
//        @Formula("(select count(ea.id_archivo) \n"
//            + "from siga.demuna_archivo ea \n"
//            + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S2' and ea.nom_campo = 'S2_ARCH')")
//    private Integer s2_arch_id_archivo;
//   
//
//         @Formula("(select count(ea.id_archivo) \n"
//            + "from siga.demuna_archivo ea \n"
//            + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S2' and ea.nom_campo = 'S212_ARCH')")
//    private Integer s212_arch_id_archivo;
//         
//         
//           @Formula("(select count(ea.id_archivo) \n"
//            + "from siga.demuna_archivo ea \n"
//            + "where ea.id_ficha = id_ficha and ea.id_seccion = 'S2' and ea.nom_campo = 'S251_ARCH')")
//    private Integer s251_arch_id_archivo;
    
    
    
    
}


