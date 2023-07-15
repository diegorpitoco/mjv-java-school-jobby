package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.Sexo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "tab_candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidato;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, length = 14)
    private String cpf;

    @Column(nullable = false, columnDefinition = "DATE")
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false)
    private String email;

    private Long telefone;

    @Column(nullable = false)
    private Long celular;

    private boolean whatsapp;

    @Embedded
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profissao")
    private Profissao profissao;

    @Embedded
    private PretensaoSalarial pretensaoSalarial;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "experiencia")
    private List<Experiencia> experiencias;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "habilidades")
    private List<String> habilidades;

}
