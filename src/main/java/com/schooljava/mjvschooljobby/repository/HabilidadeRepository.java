package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Integer> {
    Optional<Habilidade> findByNome(String nome);
}
