package com.portailRH.TypeConge.Entity;

import javax.persistence.*;

@Entity
@Table(name = "TypeConge")
public class TypeConge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
private String libelle;
    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "demande_id")
    private DemandeConge DemandeConge;*/
    public TypeConge() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "TypeConge{" +

                ", libelle='" + libelle + '\'' +
                '}';
    }
}
