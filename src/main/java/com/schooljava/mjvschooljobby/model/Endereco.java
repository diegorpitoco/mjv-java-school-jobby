<<<<<<< HEAD
//package com.schooljava.mjvschooljobby.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//
//@Entity
//public class Endereco {
//
//    @Id
//    private Integer idEndereco;
//    private Long cep;
//    private String logradouro;
//    private String numero;
//    private String complemento;
//    private String bairro;
//    private String cidade;
//    private String estado;
//    private String sigla;
//
//
//}
=======
package com.schooljava.mjvschooljobby.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_endereco")
    private Integer idEndereco;

    @Column(name = "cep")
    private Long cep;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "sigla")
    private String sigla;


}
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
