package com.schooljava.mjvschooljobby.service;

import com.schooljava.mjvschooljobby.dto.CandidatoDto;
import com.schooljava.mjvschooljobby.repository.CandidatoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.util.BeanDefinitionUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CandidatoService {

    //final CandidatoRepository cadastroRepository;
    @Autowired
    private  CandidadoRepository repository;
//    public void gravar(CandidatoDto dto) {
//        CandidatoEntity entity = new CandidatoEntity();
//        BeanUtils.copyProperties(dto, entity);
//        repository.save(entity);

    }

}
