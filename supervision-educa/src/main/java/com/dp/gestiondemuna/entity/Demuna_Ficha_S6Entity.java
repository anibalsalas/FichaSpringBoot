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
@Table(name = "educa_ficha_s6", schema = "SIGA")

public class Demuna_Ficha_S6Entity implements Serializable {
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

    private String p6_1_aul_local;
    private Integer p6_1_aul_total1;
    private Integer p6_1_aul_buen_estado1;
    private Integer p6_1_aul_regular1;
    private Integer p6_1_aul_mal1;

    private Integer p6_1_aul_total2;
    private Integer p6_1_aul_buen_estado2;
    private Integer p6_1_aul_regular2;
    private Integer p6_1_aul_mal2;

    private String p6_1_001_local;
    private Integer p6_1_001_total1;
    private Integer p6_1_001_buen_estado1;
    private Integer p6_1_001_regular1;
    private Integer p6_1_001_mal1;

    private Integer p6_1_001_total2;
    private Integer p6_1_001_buen_estado2;
    private Integer p6_1_001_regular2;
    private Integer p6_1_001_mal2;

    private String p6_1_002_local;
    private Integer p6_1_002_total1;
    private Integer p6_1_002_buen_estado1;
    private Integer p6_1_002_regular1;
    private Integer p6_1_002_mal1;

    private Integer p6_1_002_total2;
    private Integer p6_1_002_buen_estado2;
    private Integer p6_1_002_regular2;
    private Integer p6_1_002_mal2;

    private String p6_1_003_local;
    private Integer p6_1_003_total1;
    private Integer p6_1_003_buen_estado1;
    private Integer p6_1_003_regular1;
    private Integer p6_1_003_mal1;

    private Integer p6_1_003_total2;
    private Integer p6_1_003_buen_estado2;
    private Integer p6_1_003_regular2;
    private Integer p6_1_003_mal2;

    private String p6_1_004_local;
    private Integer p6_1_004_total1;
    private Integer p6_1_004_buen_estado1;
    private Integer p6_1_004_regular1;
    private Integer p6_1_004_mal1;

    private Integer p6_1_004_total2;
    private Integer p6_1_004_buen_estado2;
    private Integer p6_1_004_regular2;
    private Integer p6_1_004_mal2;

    private String p6_1_005_local;
    private Integer p6_1_005_total1;
    private Integer p6_1_005_buen_estado1;
    private Integer p6_1_005_regular1;
    private Integer p6_1_005_mal1;

    private Integer p6_1_005_total2;
    private Integer p6_1_005_buen_estado2;
    private Integer p6_1_005_regular2;
    private Integer p6_1_005_mal2;

    private String p6_1_006_local;
    private Integer p6_1_006_total1;
    private Integer p6_1_006_buen_estado1;
    private Integer p6_1_006_regular1;
    private Integer p6_1_006_mal1;

    private Integer p6_1_006_total2;
    private Integer p6_1_006_buen_estado2;
    private Integer p6_1_006_regular2;
    private Integer p6_1_006_mal2;

    private String p6_1_007_local;
    private Integer p6_1_007_total1;
    private Integer p6_1_007_buen_estado1;
    private Integer p6_1_007_regular1;
    private Integer p6_1_007_mal1;

    private Integer p6_1_007_total2;
    private Integer p6_1_007_buen_estado2;
    private Integer p6_1_007_regular2;
    private Integer p6_1_007_mal2;

    private String p6_1_008_local;
    private Integer p6_1_008_total1;
    private Integer p6_1_008_buen_estado1;
    private Integer p6_1_008_regular1;
    private Integer p6_1_008_mal1;

    private Integer p6_1_008_total2;
    private Integer p6_1_008_buen_estado2;
    private Integer p6_1_008_regular2;
    private Integer p6_1_008_mal2;

    private String p6_1_009_local;
    private Integer p6_1_009_total1;
    private Integer p6_1_009_buen_estado1;
    private Integer p6_1_009_regular1;
    private Integer p6_1_009_mal1;

    private Integer p6_1_009_total2;
    private Integer p6_1_009_buen_estado2;
    private Integer p6_1_009_regular2;
    private Integer p6_1_009_mal2;

    private String p6_1_010_local;
    private Integer p6_1_010_total1;
    private Integer p6_1_010_buen_estado1;
    private Integer p6_1_010_regular1;
    private Integer p6_1_010_mal1;

    private Integer p6_1_010_total2;
    private Integer p6_1_010_buen_estado2;
    private Integer p6_1_010_regular2;
    private Integer p6_1_010_mal2;

    private String p6_1_011_local;
    private Integer p6_1_011_total1;
    private Integer p6_1_011_buen_estado1;
    private Integer p6_1_011_regular1;
    private Integer p6_1_011_mal1;

    private Integer p6_1_011_total2;
    private Integer p6_1_011_buen_estado2;
    private Integer p6_1_011_regular2;
    private Integer p6_1_011_mal2;

    private String p6_1_012_local;
    private Integer p6_1_012_total1;
    private Integer p6_1_012_buen_estado1;
    private Integer p6_1_012_regular1;
    private Integer p6_1_012_mal1;

    private Integer p6_1_012_total2;
    private Integer p6_1_012_buen_estado2;
    private Integer p6_1_012_regular2;
    private Integer p6_1_012_mal2;

    private String p6_1_013_local;
    private Integer p6_1_013_total1;
    private Integer p6_1_013_buen_estado1;
    private Integer p6_1_013_regular1;
    private Integer p6_1_013_mal1;

    private Integer p6_1_013_total2;
    private Integer p6_1_013_buen_estado2;
    private Integer p6_1_013_regular2;
    private Integer p6_1_013_mal2;

    private String p6_1_014_local;
    private Integer p6_1_014_total1;
    private Integer p6_1_014_buen_estado1;
    private Integer p6_1_014_regular1;
    private Integer p6_1_014_mal1;

    private Integer p6_1_014_total2;
    private Integer p6_1_014_buen_estado2;
    private Integer p6_1_014_regular2;
    private Integer p6_1_014_mal2;

    private String p6_1_015_local;
    private Integer p6_1_015_total1;
    private Integer p6_1_015_buen_estado1;
    private Integer p6_1_015_regular1;
    private Integer p6_1_015_mal1;

    private Integer p6_1_015_total2;
    private Integer p6_1_015_buen_estado2;
    private Integer p6_1_015_regular2;
    private Integer p6_1_015_mal2;

    private String p6_1_016_local;
    private Integer p6_1_016_total1;
    private Integer p6_1_016_buen_estado1;
    private Integer p6_1_016_regular1;
    private Integer p6_1_016_mal1;

    private Integer p6_1_016_total2;
    private Integer p6_1_016_buen_estado2;
    private Integer p6_1_016_regular2;
    private Integer p6_1_016_mal2;

    private String p6_1_017_local;
    private Integer p6_1_017_total1;
    private Integer p6_1_017_buen_estado1;
    private Integer p6_1_017_regular1;
    private Integer p6_1_017_mal1;

    private Integer p6_1_017_total2;
    private Integer p6_1_017_buen_estado2;
    private Integer p6_1_017_regular2;
    private Integer p6_1_017_mal2;

    private String p6_1_018_local;
    private Integer p6_1_018_total1;
    private Integer p6_1_018_buen_estado1;
    private Integer p6_1_018_regular1;
    private Integer p6_1_018_mal1;

    private Integer p6_1_018_total2;
    private Integer p6_1_018_buen_estado2;
    private Integer p6_1_018_regular2;
    private Integer p6_1_018_mal2;

    private String p6_1_019_local;
    private Integer p6_1_019_total1;
    private Integer p6_1_019_buen_estado1;
    private Integer p6_1_019_regular1;
    private Integer p6_1_019_mal1;

    private Integer p6_1_019_total2;
    private Integer p6_1_019_buen_estado2;
    private Integer p6_1_019_regular2;
    private Integer p6_1_019_mal2;

    private String p6_1_020_local;
    private Integer p6_1_020_total1;
    private Integer p6_1_020_buen_estado1;
    private Integer p6_1_020_regular1;
    private Integer p6_1_020_mal1;

    private Integer p6_1_020_total2;
    private Integer p6_1_020_buen_estado2;
    private Integer p6_1_020_regular2;
    private Integer p6_1_020_mal2;

    private String p6_1_021_local;
    private Integer p6_1_021_total1;
    private Integer p6_1_021_buen_estado1;
    private Integer p6_1_021_regular1;
    private Integer p6_1_021_mal1;

    private Integer p6_1_021_total2;
    private Integer p6_1_021_buen_estado2;
    private Integer p6_1_021_regular2;
    private Integer p6_1_021_mal2;

    private String p6_1_022_local;
    private Integer p6_1_022_total1;
    private Integer p6_1_022_buen_estado1;
    private Integer p6_1_022_regular1;
    private Integer p6_1_022_mal1;

    private Integer p6_1_022_total2;
    private Integer p6_1_022_buen_estado2;
    private Integer p6_1_022_regular2;
    private Integer p6_1_022_mal2;

    private String p6_1_023_local;
    private Integer p6_1_023_total1;
    private Integer p6_1_023_buen_estado1;
    private Integer p6_1_023_regular1;
    private Integer p6_1_023_mal1;
    
    private Integer p6_1_023_total2;
    private Integer p6_1_023_buen_estado2;
    private Integer p6_1_023_regular2;
    private Integer p6_1_023_mal2;


    private String p6_2_001_local;
    private Integer p6_2_001_total1;
    private Integer p6_2_001_buen_estado1;
    private Integer p6_2_001_regular1;
    private Integer p6_2_001_mal1;

    private Integer p6_2_001_total2;
    private Integer p6_2_001_buen_estado2;
    private Integer p6_2_001_regular2;
    private Integer p6_2_001_mal2;

    private String p6_2_002_local;
    private Integer p6_2_002_total1;
    private Integer p6_2_002_buen_estado1;
    private Integer p6_2_002_regular1;
    private Integer p6_2_002_mal1;

    private Integer p6_2_002_total2;
    private Integer p6_2_002_buen_estado2;
    private Integer p6_2_002_regular2;
    private Integer p6_2_002_mal2;

    private String p6_2_003_local;
    private Integer p6_2_003_total1;
    private Integer p6_2_003_buen_estado1;
    private Integer p6_2_003_regular1;
    private Integer p6_2_003_mal1;

    private Integer p6_2_003_total2;
    private Integer p6_2_003_buen_estado2;
    private Integer p6_2_003_regular2;
    private Integer p6_2_003_mal2;

    private String p6_2_004_local;
    private Integer p6_2_004_total1;
    private Integer p6_2_004_buen_estado1;
    private Integer p6_2_004_regular1;
    private Integer p6_2_004_mal1;

    private Integer p6_2_004_total2;
    private Integer p6_2_004_buen_estado2;
    private Integer p6_2_004_regular2;
    private Integer p6_2_004_mal2;

    private String p6_2_005_local;
    private Integer p6_2_005_total1;
    private Integer p6_2_005_buen_estado1;
    private Integer p6_2_005_regular1;
    private Integer p6_2_005_mal1;
    private Integer p6_2_005_total2;
    private Integer p6_2_005_buen_estado2;
    private Integer p6_2_005_regular2;
    private Integer p6_2_005_mal2;

    private String p6_2_006_local;
    private Integer p6_2_006_total1;
    private Integer p6_2_006_buen_estado1;
    private Integer p6_2_006_regular1;
    private Integer p6_2_006_mal1;
    private Integer p6_2_006_total2;
    private Integer p6_2_006_buen_estado2;
    private Integer p6_2_006_regular2;
    private Integer p6_2_006_mal2;

    private String p6_2_007_local;
    private Integer p6_2_007_total1;
    private Integer p6_2_007_buen_estado1;
    private Integer p6_2_007_regular1;
    private Integer p6_2_007_mal1;
    private Integer p6_2_007_total2;
    private Integer p6_2_007_buen_estado2;
    private Integer p6_2_007_regular2;
    private Integer p6_2_007_mal2;

    private String p6_2_008_local;
    private Integer p6_2_008_total1;
    private Integer p6_2_008_buen_estado1;
    private Integer p6_2_008_regular1;
    private Integer p6_2_008_mal1;
    private Integer p6_2_008_total2;
    private Integer p6_2_008_buen_estado2;
    private Integer p6_2_008_regular2;
    private Integer p6_2_008_mal2;

    private String p6_2_009_local;
    private Integer p6_2_009_total1;
    private Integer p6_2_009_buen_estado1;
    private Integer p6_2_009_regular1;
    private Integer p6_2_009_mal1;
    private Integer p6_2_009_total2;
    private Integer p6_2_009_buen_estado2;
    private Integer p6_2_009_regular2;
    private Integer p6_2_009_mal2;

    private String p6_2_010_local;
    private Integer p6_2_010_total1;
    private Integer p6_2_010_buen_estado1;
    private Integer p6_2_010_regular1;
    private Integer p6_2_010_mal1;
    private Integer p6_2_010_total2;
    private Integer p6_2_010_buen_estado2;
    private Integer p6_2_010_regular2;
    private Integer p6_2_010_mal2;

    private String p6_2_011_local;
    private Integer p6_2_011_total1;
    private Integer p6_2_011_buen_estado1;
    private Integer p6_2_011_regular1;
    private Integer p6_2_011_mal1;
    private Integer p6_2_011_total2;
    private Integer p6_2_011_buen_estado2;
    private Integer p6_2_011_regular2;
    private Integer p6_2_011_mal2;

    private String p6_2_012_local;
    private Integer p6_2_012_total1;
    private Integer p6_2_012_buen_estado1;
    private Integer p6_2_012_regular1;
    private Integer p6_2_012_mal1;
    private Integer p6_2_012_total2;
    private Integer p6_2_012_buen_estado2;
    private Integer p6_2_012_regular2;
    private Integer p6_2_012_mal2;

    private String p6_2_013_local;
    private Integer p6_2_013_total1;
    private Integer p6_2_013_buen_estado1;
    private Integer p6_2_013_regular1;
    private Integer p6_2_013_mal1;
    private Integer p6_2_013_total2;
    private Integer p6_2_013_buen_estado2;
    private Integer p6_2_013_regular2;
    private Integer p6_2_013_mal2;

    private String p6_2_014_local;
    private Integer p6_2_014_total1;
    private Integer p6_2_014_buen_estado1;
    private Integer p6_2_014_regular1;
    private Integer p6_2_014_mal1;
    private Integer p6_2_014_total2;
    private Integer p6_2_014_buen_estado2;
    private Integer p6_2_014_regular2;
    private Integer p6_2_014_mal2;

    private String p6_2_015_local;
    private Integer p6_2_015_total1;
    private Integer p6_2_015_buen_estado1;
    private Integer p6_2_015_regular1;
    private Integer p6_2_015_mal1;
    private Integer p6_2_015_total2;
    private Integer p6_2_015_buen_estado2;
    private Integer p6_2_015_regular2;
    private Integer p6_2_015_mal2;

    private String p6_2_016_local;
    private Integer p6_2_016_total1;
    private Integer p6_2_016_buen_estado1;
    private Integer p6_2_016_regular1;
    private Integer p6_2_016_mal1;
    private Integer p6_2_016_total2;
    private Integer p6_2_016_buen_estado2;
    private Integer p6_2_016_regular2;
    private Integer p6_2_016_mal2;

    private String p6_2_017_local;
    private Integer p6_2_017_total1;
    private Integer p6_2_017_buen_estado1;
    private Integer p6_2_017_regular1;
    private Integer p6_2_017_mal1;
    private Integer p6_2_017_total2;
    private Integer p6_2_017_buen_estado2;
    private Integer p6_2_017_regular2;
    private Integer p6_2_017_mal2;

    private String p6_2_018_local;
    private Integer p6_2_018_total1;
    private Integer p6_2_018_buen_estado1;
    private Integer p6_2_018_regular1;
    private Integer p6_2_018_mal1;
    private Integer p6_2_018_total2;
    private Integer p6_2_018_buen_estado2;
    private Integer p6_2_018_regular2;
    private Integer p6_2_018_mal2;

    private String p6_2_019_local;
    private Integer p6_2_019_total1;
    private Integer p6_2_019_buen_estado1;
    private Integer p6_2_019_regular1;
    private Integer p6_2_019_mal1;
    private Integer p6_2_019_total2;
    private Integer p6_2_019_buen_estado2;
    private Integer p6_2_019_regular2;
    private Integer p6_2_019_mal2;

    private String p6_2_020_local;
    private Integer p6_2_020_total1;
    private Integer p6_2_020_buen_estado1;
    private Integer p6_2_020_regular1;
    private Integer p6_2_020_mal1;
    private Integer p6_2_020_total2;
    private Integer p6_2_020_buen_estado2;
    private Integer p6_2_020_regular2;
    private Integer p6_2_020_mal2;

    private String p6_2_021_local;
    private Integer p6_2_021_total1;
    private Integer p6_2_021_buen_estado1;
    private Integer p6_2_021_regular1;
    private Integer p6_2_021_mal1;
    private Integer p6_2_021_total2;
    private Integer p6_2_021_buen_estado2;
    private Integer p6_2_021_regular2;
    private Integer p6_2_021_mal2;

    private String p6_2_022_local;
    private Integer p6_2_022_total1;
    private Integer p6_2_022_buen_estado1;
    private Integer p6_2_022_regular1;
    private Integer p6_2_022_mal1;
    private Integer p6_2_022_total2;
    private Integer p6_2_022_buen_estado2;
    private Integer p6_2_022_regular2;
    private Integer p6_2_022_mal2;

    private String p6_2_023_local;
    private Integer p6_2_023_total1;
    private Integer p6_2_023_buen_estado1;
    private Integer p6_2_023_regular1;
    private Integer p6_2_023_mal1;
    private Integer p6_2_023_total2;
    private Integer p6_2_023_buen_estado2;
    private Integer p6_2_023_regular2;
    private Integer p6_2_023_mal2;

    private String p6_2_024_local;
    private Integer p6_2_024_total1;
    private Integer p6_2_024_buen_estado1;
    private Integer p6_2_024_regular1;
    private Integer p6_2_024_mal1;
    private Integer p6_2_024_total2;
    private Integer p6_2_024_buen_estado2;
    private Integer p6_2_024_regular2;
    private Integer p6_2_024_mal2;

    private String p6_2_025_local;
    private Integer p6_2_025_total1;
    private Integer p6_2_025_buen_estado1;
    private Integer p6_2_025_regular1;
    private Integer p6_2_025_mal1;
    private Integer p6_2_025_total2;
    private Integer p6_2_025_buen_estado2;
    private Integer p6_2_025_regular2;
    private Integer p6_2_025_mal2;

    private String p6_2_026_local;
    private Integer p6_2_026_total1;
    private Integer p6_2_026_buen_estado1;
    private Integer p6_2_026_regular1;
    private Integer p6_2_026_mal1;
    private Integer p6_2_026_total2;
    private Integer p6_2_026_buen_estado2;
    private Integer p6_2_026_regular2;
    private Integer p6_2_026_mal2;

    private String p6_2_027_local;
    private Integer p6_2_027_total1;
    private Integer p6_2_027_buen_estado1;
    private Integer p6_2_027_regular1;
    private Integer p6_2_027_mal1;
    private Integer p6_2_027_total2;
    private Integer p6_2_027_buen_estado2;
    private Integer p6_2_027_regular2;
    private Integer p6_2_027_mal2;

    private String p6_2_028_local;
    private Integer p6_2_028_total1;
    private Integer p6_2_028_buen_estado1;
    private Integer p6_2_028_regular1;
    private Integer p6_2_028_mal1;
    private Integer p6_2_028_total2;
    private Integer p6_2_028_buen_estado2;
    private Integer p6_2_028_regular2;
    private Integer p6_2_028_mal2;

    private String p6_2_029_local;
    private Integer p6_2_029_total1;
    private Integer p6_2_029_buen_estado1;
    private Integer p6_2_029_regular1;
    private Integer p6_2_029_mal1;
    private Integer p6_2_029_total2;
    private Integer p6_2_029_buen_estado2;
    private Integer p6_2_029_regular2;
    private Integer p6_2_029_mal2;

    private String p6_2_030_local;
    private Integer p6_2_030_total1;
    private Integer p6_2_030_buen_estado1;
    private Integer p6_2_030_regular1;
    private Integer p6_2_030_mal1;
    private Integer p6_2_030_total2;
    private Integer p6_2_030_buen_estado2;
    private Integer p6_2_030_regular2;
    private Integer p6_2_030_mal2;

    private String p6_2_031_local;
    private Integer p6_2_031_total1;
    private Integer p6_2_031_buen_estado1;
    private Integer p6_2_031_regular1;
    private Integer p6_2_031_mal1;
    private Integer p6_2_031_total2;
    private Integer p6_2_031_buen_estado2;
    private Integer p6_2_031_regular2;
    private Integer p6_2_031_mal2;

    private String p6_2_032_local;
    private Integer p6_2_032_total1;
    private Integer p6_2_032_buen_estado1;
    private Integer p6_2_032_regular1;
    private Integer p6_2_032_mal1;
    private Integer p6_2_032_total2;
    private Integer p6_2_032_buen_estado2;
    private Integer p6_2_032_regular2;
    private Integer p6_2_032_mal2;

    private String p6_2_033_local;
    private Integer p6_2_033_total1;
    private Integer p6_2_033_buen_estado1;
    private Integer p6_2_033_regular1;
    private Integer p6_2_033_mal1;
    private Integer p6_2_033_total2;
    private Integer p6_2_033_buen_estado2;
    private Integer p6_2_033_regular2;
    private Integer p6_2_033_mal2;

    private String p6_2_034_local;
    private Integer p6_2_034_total1;
    private Integer p6_2_034_buen_estado1;
    private Integer p6_2_034_regular1;
    private Integer p6_2_034_mal1;
    private Integer p6_2_034_total2;
    private Integer p6_2_034_buen_estado2;
    private Integer p6_2_034_regular2;
    private Integer p6_2_034_mal2;

    private String p6_2_035_local;
    private Integer p6_2_035_total1;
    private Integer p6_2_035_buen_estado1;
    private Integer p6_2_035_regular1;
    private Integer p6_2_035_mal1;
    private Integer p6_2_035_total2;
    private Integer p6_2_035_buen_estado2;
    private Integer p6_2_035_regular2;
    private Integer p6_2_035_mal2;

    private String p6_2_036_local;
    private Integer p6_2_036_total1;
    private Integer p6_2_036_buen_estado1;
    private Integer p6_2_036_regular1;
    private Integer p6_2_036_mal1;
    private Integer p6_2_036_total2;
    private Integer p6_2_036_buen_estado2;
    private Integer p6_2_036_regular2;
    private Integer p6_2_036_mal2;

    private String p6_2_037_local;
    private Integer p6_2_037_total1;
    private Integer p6_2_037_buen_estado1;
    private Integer p6_2_037_regular1;
    private Integer p6_2_037_mal1;
    private Integer p6_2_037_total2;
    private Integer p6_2_037_buen_estado2;
    private Integer p6_2_037_regular2;
    private Integer p6_2_037_mal2;

    private String p6_2_1_1;
    private String p6_2_2_1; 
    private String p6_2_2_2;
    private String p6_2_2_3;
    private String p6_2_2_4; 
    private String p6_2_2_5; 
    private String p6_2_2_6; 
    private String p6_2_2_7; 
    private String p6_2_2_8; 
    private String p6_2_2_detalle;

  
}
