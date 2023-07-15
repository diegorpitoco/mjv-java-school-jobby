package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.model.Contato;
import lombok.Data;

@Data
public class ContatoDto {
    private Integer idContato;
    private String email;
    private Long telefone;
    private Long celular;
    private boolean whatsapp;

    public ContatoDto(Contato contato) {
        this.email = contato.getEmail();
        this.telefone = contato.getTelefone();
        this.celular = contato.getCelular();
        this.whatsapp = contato.isWhatsapp();

    }
}

