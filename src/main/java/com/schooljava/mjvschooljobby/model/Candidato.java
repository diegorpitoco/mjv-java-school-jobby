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
<<<<<<< HEAD
=======
    @Column(name = "id_cadastro")
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
    private Integer idCadastro;

    @Column(name = "nome")
    private String nome;
<<<<<<< HEAD
    @Column(nullable = false)
=======

    @Column(name = "cpf")
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexo")
    private Sexo sexo;
<<<<<<< HEAD
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
=======

    @Embedded
    private PretensaoSalarial pretensaoSalarial;
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f

    @Embedded
    @Column(name = "contato_id")
    private Contato contato;

    @Embedded
    @Column(name = "endereco_id")
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profissao_id")
    private Profissao profissao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "experiencia_id")
    private List<Experiencia> experiencias;

    @ElementCollection
    @CollectionTable(name="tab_habilidade",
            joinColumns=@JoinColumn(name = "cad_id", referencedColumnName = "id"))
    @Column(name="nm_habil")
    private List<String> habilidades;

}
