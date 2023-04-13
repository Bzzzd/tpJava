package com.example.tpspring.entities;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter


@Entity
@Table(name="Etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long idE;

    @Column(name="Nom")
    String nom;

    @Column(name="Prenom")
    String prenom;

    @ManyToOne
    private Groupe groupe;
}