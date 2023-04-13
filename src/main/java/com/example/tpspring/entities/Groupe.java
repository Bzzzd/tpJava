package com.example.tpspring.entities;
import com.example.tpspring.enumerations.Specialite;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Groupe")
public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int idG;

    @Column(name="Nom")
    String nomG;

    @Column(name="Specialite")
    Specialite specialite;

    @OneToMany(mappedBy = "Groupe")
    private List<Etudiant> etudiants;

    @ManyToMany
    private List<Enseignant> enseignants;
}