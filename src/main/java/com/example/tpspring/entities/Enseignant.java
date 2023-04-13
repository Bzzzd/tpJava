package com.example.tpspring.entities;
import java.util.Date;
import java.util.List;
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
@Table(name="Enseignant")
public class Enseignant {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long idE;


    @Column(name="Nom")
    private String nomEn;

    @Column(name="Date_of_Birth")
    private Date dateofBirth;

    @ManyToMany(mappedBy = "enseignants")
    private List<Groupe> groupes;
}