package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.Sexo;
import javax.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCandidato;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "cpf", nullable = false, length = 14)
    private String cpf;

    @Column(name = "dataNascimento", nullable = false, columnDefinition = "DATE")
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telefone")
    private Long telefone;

    @Column(name = "celular", nullable = false)
    private Long celular;

    @Column(name = "whatsapp")
    private boolean whatsapp;

    @Embedded
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "profissao_id")
    private Profissao profissao;

    @Embedded
    private PretensaoSalarial pretensaoSalarial;


    @OneToMany(mappedBy = "candidato")
    private List<Experiencia> experiencias;

    @ManyToMany
    @JoinTable(
            name = "candidato_habilidade",
            joinColumns = @JoinColumn(name = "candidato_id"),
            inverseJoinColumns = @JoinColumn(name = "habilidade_id")
    )
    private List<Habilidade> habilidades;

}
