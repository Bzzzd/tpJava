package com.example.tpspring.entities;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="Enseignant")
public class Enseignant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idE;


    @Column(name="Nom")
    private String nomEn;

    @Column(name="Date_of_Birth")
    private Date dateofBirth;

    @ManyToMany(mappedBy = "enseignants")
    private List<Groupe> groupes;
}