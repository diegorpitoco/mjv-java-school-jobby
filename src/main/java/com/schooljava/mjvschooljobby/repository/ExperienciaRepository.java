package com.schooljava.mjvschooljobby.repository;

import com.schooljava.mjvschooljobby.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
    @Query("SELECT e FROM Experiencia e WHERE e.candidato.idCandidato = ?1")
    List<Experiencia> findByCandidatoId(Integer candidatoId);
}
