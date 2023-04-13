package com.example.tpspring.entities;
import com.example.tpspring.enumerations.Specialite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Groupe")
public class Groupe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idG;

    @Column(name="Nom")
    String nomG;

    @Column(name="Specialite")
    Specialite specialite;

    @OneToMany(mappedBy = "Groupe")
    private List<Etudiant> etudiants;

    @ManyToMany
    private List<Enseignant> enseignants;
}