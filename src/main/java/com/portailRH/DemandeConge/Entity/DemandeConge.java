package com.portailRH.DemandeConge.Entity;

import com.portailRH.TypeConge.Entity.TypeConge;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "demande_conge")

public class DemandeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "demande_id",nullable=false)
    private Long demandeId;
    @Column(name = "type_conge_id")
    private Long typecongeid;
    @Column(name = "login")
    private String login;
    @Column(name = "date_debut")
    private Date dateDebut;
    @Column(name = "date_fin")
    private Date dateFin;
    @Column(name = "etat_demande")
    private String etatDemande;
    @Column(name = "nbjours")
    private int nbjours;

    @OneToMany(mappedBy = "demandeconge", fetch = FetchType.LAZY)
    private List<TypeConge> typeconge = new ArrayList<>();



}


