package com.example.tpspring.repositories;

import com.example.tpspring.entities.Enseignant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EnseignantRepository extends CrudRepository<Enseignant, Long> {
    List<Enseignant> findByDateOfBirthBetween(Date beginning, Date end);
}