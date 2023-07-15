package com.schooljava.mjvschooljobby.controller;

import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import com.schooljava.mjvschooljobby.dto.CandidatoUpdateDto;
import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.service.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

    @Autowired
    private CandidatoService candidatoService;

    @PostMapping()
    public Candidato cadastrarCandidato (@RequestBody Candidato candidato){
        return candidatoService.cadastrarCandidato(candidato);
    }

    @GetMapping ("/{id}")
    public CandidatoDto buscarPorId(@PathVariable Integer id){
        return candidatoService.buscarPorId(id);
    }

//    @PatchMapping ("/{id}")
//    public Optional<Candidato> alterarDados(@PathVariable Integer id, @RequestBody CandidatoUpdateDto candidato){
//        return candidatoService.alterarDados(id, candidato);
//    }
//    @DeleteMapping ("/{id}")
//    public void deletarDados(@PathVariable Integer id){
//        candidatoService.deletarDados(id);
//    }
//
//    //Contar quantos candidatos possuem a habilidade JAVA
//    @GetMapping("/habilidade-java")
//    public Integer contarCandidatosComHabilidadeJava() {
//        List<CandidatoDto> todosCandidatos = candidatoService.listarTodos(); // Criar no service/método para listar candidatos
//
//        Integer quantidadeCandidatos = 0;
//        for (CandidatoDto candidato : todosCandidatos) {
//            if (candidato.getHabilidades().contains("Java")) {
//                quantidadeCandidatos++;
//            }
//        }
//        return quantidadeCandidatos;
//    }
//
//    //Identificar quais candidatos NÃO possuem habilidade relacionadas
//    @GetMapping("/sem-habilidades")
//    public List<Integer> listarCandidatosSemHabilidades() {
//        return candidatoService.listarCandidatosSemHabilidades(); //
//    }
//
//    //Selecionar os candidatos que são do sexo FEMININO e que moram nas cidades do estado sigla SP informando o nome, cpf, dados de endereço e nome da cidade
//    @GetMapping("/sexo-feminino-sp")
//    public List<CandidatoDto> listarCandidatoFemininoSP() {
//        return candidatoService.listarCandidatoFemininoSP();
//    }
//
//    //Agrupar por profissão e contar quantos profissionais que moram na cidade de nome SÃO PAULO
//    @GetMapping("/profissionais-sp")
//    public List<ProfissaoDto> contarProfissionaisPorProfissaoSP() {
//        return candidatoService.contarProfissionaisPorProfissaoSP();
//    }
//
//    //Selecionar candidatos que registram experiências com data de contratação entre 01/01/202 a 31/12/2023
//    @GetMapping("/experiencia/{dataInicio}/{dataFim}")
//    public List<CandidatoDto> listarCandidatosComExperienciaEntre(@PathVariable LocalDate dataInicio, @PathVariable LocalDate dataFim) {
//        return candidatoService.listarCandidatosComExperienciaEntre(dataInicio, dataFim);
//    }
//
//    //já trabalhou na microsoft
//    @GetMapping("/experiencia-empresa/{empresa}")
//    public List<CandidatoDto> listarCandidatosComExperienciaNaEmpresa(@PathVariable String empresa) {
//        return candidatoService.listarCandidatosComExperienciaNaEmpresa(empresa);
//    }
//
//    //Selecionar candidatos que AINDA trabalham na empresa MICROSOFT
//    @GetMapping("/experiencia-empresa/{empresa}/trabalhando")
//    public List<CandidatoDto> listarCandidatosTrabalhandoNaEmpresa(@PathVariable String empresa) {
//        return candidatoService.listarCandidatosTrabalhandoNaEmpresa(empresa);
//    }
//
//    //Selecionar candidatos que estão trabalhando atualmente
//    @GetMapping("/trabalhando")
//    public List<CandidatoDto> listarCandidatosTrabalhandoAtualmente() {
//        return candidatoService.listarCandidatosTrabalhandoAtualmente();
//    }
//
//    //Criar uma consulta que retorne todos os candidatos e nome da sua profissão correspondentemente
//    @GetMapping("/todos-com-profissao")
//    public List<CandidatoDto> listarCandidatosComProfissao() {
//        return candidatoService.listarCandidatosComProfissao();
//    }
//
//    //Criar uma consulta que retorne todos os candidatos e nome da sua profissão onde o id da profissão corresponda ao registro ANALISTA DE SISTEMAS
//    @GetMapping("/profissao/{idProfissao}")
//    public List<CandidatoDto> listarCandidatosPorProfissao(@PathVariable Integer idProfissao) {
//        return candidatoService.listarCandidatosPorProfissao(idProfissao);
//    }
//
//    //Criar uma consulta que conte a quantidade de profissionais por profissão
//    @GetMapping("/quantidade-por-profissao")
//    public List<ProfissaoDto> contarCandidatosPorProfissao() {
//        return candidatoService.contarCandidatosPorProfissao();
//    }
//
//    //Criar uma consulta que retorne os candidatos ordenados por profissão e salário máximo de forma decrescente
//    @GetMapping("/ordenados-por-profissao-salario")
//    public List<CandidatoDto> listarCandidatosProfissaoSalario() {
//        return candidatoService.listarCandidatosProfissaoSalario();
//    }

}
