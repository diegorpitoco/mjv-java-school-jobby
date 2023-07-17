package com.schooljava.mjvschooljobby.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Embeddable
public class Endereco {

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    @ManyToOne
    @JoinColumn(name = "Id_cidade")
    private Cidade cidade;


}
