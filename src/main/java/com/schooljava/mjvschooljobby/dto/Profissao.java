package com.schooljava.mjvschooljobby.dto;


import lombok.Data;

@Data
public class Profissao {
    private Integer idProfissao;
    private String nome;

    public Profissao(Profissao profissao) {
        this.idProfissao = profissao.getIdProfissao();
        this.nome = profissao.nome;
    }
}
