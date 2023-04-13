package com.example.tpspring.repositories;

import com.example.tpspring.entities.Groupe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends CrudRepository<Groupe, Long> {
}