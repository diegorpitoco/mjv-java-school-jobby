package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.Sexo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCadastro;
    private String nome;
    @Column(nullable = false)
    private String cpf;
    private LocalDate dataNascimento;
    private Sexo sexo;
//    @ManyToOne
//    @JoinColumn(name = "contato_id_contato")
//    private Contato contato;
//    @ManyToOne
//    @JoinColumn(name = "endereco_id_endereco")
//    private Endereco endereco;
////    private Profissao profissao;
//    @ManyToOne
//    @JoinColumn(name = "experiencia_id_experiencia")
//    private Experiencia experiencia;
////    private PretensaoSalarial pretensaoSalarial;



}
