package com.example.tpspring.entities;

import javax.persistence.*;


@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int idE;

    @Column(name="Nom")
    String nom;

    @Column(name="Prenom")
    String prenom;

    @ManyToOne
    private Groupe groupe;
}