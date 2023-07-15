package com.schooljava.mjvschooljobby.model;

import com.schooljava.mjvschooljobby.enums.Sexo;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "dados_candidato")
public class Candidato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_cadastro")
    private Integer idCadastro;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;

//    @Embedded
//    private PretensaoSalarial pretensaoSalarial;

//    @Embedded
//    @Column(name = "contato_id")
//    private Contato contato;

//    @Embedded
//    @Column(name = "endereco_id")
//    private Endereco endereco;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "profissao_id")
//    private Profissao profissao;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "experiencia_id")
//    private List<Experiencia> experiencias;
//
//    @ElementCollection
//    @CollectionTable(name="tab_habilidade",
//            joinColumns=@JoinColumn(name = "cad_id", referencedColumnName = "id"))
//    @Column(name="nm_habil")
//    private List<String> habilidades;

}
