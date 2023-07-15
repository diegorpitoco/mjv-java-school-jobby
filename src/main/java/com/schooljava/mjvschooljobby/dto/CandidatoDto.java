package com.schooljava.mjvschooljobby.dto;

import com.schooljava.mjvschooljobby.enums.Sexo;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class CandidatoDto {

        private String nome;
        private String cpf;
        private LocalDate dataNascimento;
        private Sexo sexo;
        private String email;
        private Long telefone;
        private Long celular;
        private Boolean whatsapp;
        private EnderecoDto endereco;
        private ProfissaoDto profissao;
        private PretensaoSalarialDto pretensaoSalarial;
        private List<ExperienciaDto> experiencias = new ArrayList<>();
        private List<HabilidadeDto> habilidades = new ArrayList<>();
    }

