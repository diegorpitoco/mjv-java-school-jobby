package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}
