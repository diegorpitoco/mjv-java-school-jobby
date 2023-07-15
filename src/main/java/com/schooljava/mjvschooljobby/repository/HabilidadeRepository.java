package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Integer> {
}
