<<<<<<< HEAD
//package com.schooljava.mjvschooljobby.model;
//
//import com.schooljava.mjvschooljobby.enums.RegimeContratacao;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//import java.time.LocalDate;
//
//@Entity
//public class Experiencia {
//
//    @Id
//    private Integer idExperiencia;
//    private double salario;
//    private boolean empregoAtual;
//    private LocalDate dataContratacao;
//    private LocalDate dataDesligamento;
//    private String empresa;
//    private RegimeContratacao regimeContratacao;
//}
=======
package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.RegimeContratacao;
import lombok.AccessLevel;
import lombok.Data;
import jakarta.persistence.*;
import lombok.Setter;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "experiencia")
public class Experiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_experiencia")
    private Integer idExperiencia;

    @Column(name = "salario")
    private double salario;

    @Column(name = "emprego_atual")
    private boolean empregoAtual;

    @Column(name = "data_contratacao")
    private LocalDate dataContratacao;

    @Column(name = "data_desligamento")
    private LocalDate dataDesligamento;

    @Column(name = "empresa")
    private String empresa;

    @Enumerated(EnumType.STRING)
    @Column(name = "regime_contratacao_id")
    private RegimeContratacao regimeContratacao;
}
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
