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
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Formula;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educa_ficha_s2", schema = "SIGA")
public class Demuna_Ficha_S2Entity implements Serializable {
     
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
  
    private String p1_1;
    private String p1_1_1;
    
    private String p1_1_2_1;
    private String p1_1_2_2;
    private String p1_1_2_3;
    private String p1_1_2_4;
    private String p1_1_2_5;
    
    private String p1_2_1;
    private String p1_2_2;
    private String p1_2_3;
    private String p1_2_4;
    private String p1_2_5;
    private String p1_2_6;
    private String p1_2_7;
    private String p1_2_8;
    private String p1_2_8_detalle;
    private String p1_3;
    private String p1_3_detalle;
    private String p1_4_1;
    private String p1_4_2;
    private String p1_4_3;
    private String p1_4_4;
    private String p1_4_5;
    private String p1_4_5_detalle;
    private String p1_5;
    private String p1_6;
    private String p2_1;
    private String p2_1_1;
    private String p2_1_2_1;
    private String p2_1_2_2;
    private String p2_1_2_3;
    private String p2_1_2_4;
    private String p2_1_2_5;
    private String p2_2_1;
    private String p2_2_2;
    private String p2_2_3;
    private String p2_2_4;
    private String p2_2_5;
    private String p2_2_6;
    private String p2_2_7;
    private String p2_2_7_detalle;
    private String p3_1;
    private String p3_1_1;
    private String p3_1_2_1;
    private String p3_1_2_2;
    private String p3_1_2_3;
    private String p3_1_2_4;
    private String p3_1_2_5;
    private String p3_2_1;
    private String p3_2_2;
    private String p3_2_3;
    private String p3_2_4;
    private String p3_3_1;
    private String p3_3;
    private String p3_4;
    private String p3_5;
    private String p4_1;
    private String p4_2;
    private String p5_1;
    private String p5_2; 
    private String p5_3;
    private String p5_3_detalle; 
    private String p6_1;
    private String p6_2; 
    private String p6_3;
    private String p7_1;
    private String p7_2_tipo_1;
    private String p7_2_velocidad1; 
    private String p7_2_tipo_2;
    private String p7_2_velocidad2; 
    private String p7_2_tipo_3;
    private String p7_2_velocidad3; 
    private String p7_2_tipo_4;
    private String p7_2_velocidad4; 
    private String p7_3_1;
    private String p7_3_2;
    private String p7_3_3;
    private String p7_3_4;
    private String p7_3_5;
    private String p7_4;

   

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


