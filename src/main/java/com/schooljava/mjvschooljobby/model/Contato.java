<<<<<<< HEAD
//package com.schooljava.mjvschooljobby.model;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import lombok.Data;
//
//@Entity
//@Data
//public class Contato {
//
//    @Id
//    private Integer idContato;
//    private String email;
//    private Long telefone;
//    private Long celular;
//    private boolean whatsapp;
//}
=======
package com.schooljava.mjvschooljobby.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
@Entity
@Table(name = "contato")
public class Contato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    @Column(name = "id_contato")
    private Integer idContato;

    @Column(name = "email")
    private String email;

    @Column(name = "telefone")
    private Long telefone;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "whatsapp")
    private boolean whatsapp;
}
>>>>>>> 5a1a9bfaf14ab0c48ca6c19c90094f99e159f62f
