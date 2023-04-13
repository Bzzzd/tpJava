package com.example.tpspring.repositories;

import com.example.tpspring.entities.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
}