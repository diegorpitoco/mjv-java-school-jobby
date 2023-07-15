package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.CandidatoUpdateDto;
import com.schooljava.mjvschooljobby.model.Candidato;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CandidatoService {

    @Autowired
    CandidatoRepository candidatoRepository;

    public Candidato cadastrarCandidato(Candidato candidato){

        Optional<Candidato> candidatoEncontrado = candidatoRepository.findByCpf(candidato.getCpf());

        if(candidatoEncontrado.isEmpty()){
            candidatoRepository.save(candidato);
        }else{
            System.out.println("Candidato jé está cadastrado");
        }
        return candidato;
    }

    public CandidatoDto buscarPorId(Integer id){

        CandidatoDto candidatoRetornado = new CandidatoDto();
        Candidato candidatoRegistrado = candidatoRepository.findById(id).get();
        BeanUtils.copyProperties(candidatoRegistrado, candidatoRetornado);

        return candidatoRetornado;
    }

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



}
