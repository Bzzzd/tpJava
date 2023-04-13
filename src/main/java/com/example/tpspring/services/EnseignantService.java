package com.example.tpspring.services;

import com.example.tpspring.entities.Enseignant;
import com.example.tpspring.entities.Etudiant;
import com.example.tpspring.repositories.EnseignantRepository;
import com.example.tpspring.repositories.EtudiantRepository;
import com.example.tpspring.repositories.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
 class EnseignantService {
    @Autowired
    EnseignantRepository enseignantRepository;

    @Autowired
    GroupeRepository groupeRepository;

    @Autowired
    EtudiantRepository etudiantRepository;


    List<Enseignant> retrieveAllEnseignants(){
        return (List<Enseignant>) enseignantRepository.findAll();
    }

    Enseignant addEnseignant(Enseignant E){
        return enseignantRepository.save(E);
    }

    void deleteEnseignant(Long id){
        enseignantRepository.deleteById(id);
    }

    Enseignant updateEnseignant(Enseignant E){
        Optional<Enseignant> enseignantToUpdate= enseignantRepository.findById(E.getIdE());
        enseignantToUpdate.get().setNomEn(E.getNomEn());
        enseignantToUpdate.get().setDateofBirth(E.getDateofBirth());
        enseignantToUpdate.get().setGroupes(E.getGroupes());
        return enseignantRepository.save(enseignantToUpdate.get());
    }

    Optional<Enseignant> retrieveEnseignant(long id){
        return enseignantRepository.findById(id);
    }

    long countEnseignants(){
        return enseignantRepository.count();
    }

    public List<Enseignant> getEnseignantsByDateOfBirthInterval(Date Beginning, Date End){
        return enseignantRepository.findByDateOfBirthBetween(Beginning,End);
    }

    List<Enseignant> getEnseiganntsByGroupe (Long idGrp){
        return groupeRepository.findById(idGrp).get().getEnseignants();
    }

    public List<Enseignant> retrieveEnseignantsByEtudiantsId(Long idEtudiants){
        return etudiantRepository.findById(idEtudiants).get().getGroupe().getEnseignants();
    }

}
