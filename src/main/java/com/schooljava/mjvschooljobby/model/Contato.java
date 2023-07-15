package com.schooljava.mjvschooljobby.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Contato {


    private Integer idContato;
    private String email;
    private Long telefone;
    private Long celular;
    private boolean whatsapp;

}
