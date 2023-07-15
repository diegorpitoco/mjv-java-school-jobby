package com.schooljava.mjvschooljobby.service;


import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatoService {

    private CandidatoRepository candidatoRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public CandidatoService(CandidatoRepository candidatoRepository, ModelMapper modelMapper) {
        this.candidatoRepository = candidatoRepository;
        this.modelMapper = modelMapper;
    }

    public Candidato cadastrarCandidato(CandidatoDto candidatoDto) {
        Candidato candidato = modelMapper.map(candidatoDto, Candidato.class);
        Optional<Candidato> candidatoEncontrado = candidatoRepository.findByCpf(candidato.getCpf());

        if (candidatoEncontrado.isEmpty()) {
            candidatoRepository.save(candidato);
        } else {
            System.out.println("Candidato já está cadastrado");
        }
        return candidato;
    }

    public Candidato alterarCandidato(CandidatoDto candidatoDto) {
        Candidato candidato = modelMapper.map(candidatoDto, Candidato.class);
        Optional<Candidato> optionalCandidato = candidatoRepository.findById(candidato.getIdCandidato());

        if (optionalCandidato.isPresent()) {
            Candidato candidatoExistente = optionalCandidato.get();
            modelMapper.map(candidatoDto, candidatoExistente); // Realiza o mapeamento automático dos atributos
            return candidatoRepository.save(candidatoExistente);
        } else {
            throw new IllegalArgumentException("Candidato não encontrado");
        }
    }

    public List<Candidato> listarCandidato() {
        return candidatoRepository.findAll();
    }
    public Candidato buscarCandidatoId(Integer id) {
        return candidatoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Candidato não encontrado"));
    }
    public boolean deletarCandidato(Integer id) {
        Optional<Candidato> optionalCandidato = candidatoRepository.findById(id);
        if (optionalCandidato.isPresent()) {
            Candidato candidato = optionalCandidato.get();
            candidatoRepository.delete(candidato);
            return true;
        }
        return false;
    }
}



















//    public Candidato cadastrarCandidato(Candidato candidato){
//
//        Optional<Candidato> candidatoEncontrado = candidatoRepository.findByCpf(candidato.getCpf());
//
//        if(candidatoEncontrado.isEmpty()){
//            candidatoRepository.save(candidato);
//        }else{
//            System.out.println("Candidato jé está cadastrado");
//        }
//        return candidato;
//    }
//
//    public CandidatoDto buscarPorId(Integer id){
//
//        CandidatoDto candidatoRetornado = new CandidatoDto();
//        Candidato candidatoRegistrado = candidatoRepository.findById(id).get();
//        BeanUtils.copyProperties(candidatoRegistrado, candidatoRetornado);
//
//        return candidatoRetornado;
//    }

    //ainda não consegui fazer funcionar
//    public Optional<Candidato> alterarDados(Integer id, CandidatoUpdateDto candidato){
//
//        Optional<Candidato> candidatoRegistrado = Optional.of(candidatoRepository.findById(id).get());
//
//        if(candidatoRegistrado.isEmpty()){
//            System.out.println("Candidato não encontrado no sistema");
//        }else{
//
//        }
//        return candidatoRegistrado;
//    }




