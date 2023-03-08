package com.portailRH.demandeConge.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "demande_conge")
public class DemandeConge implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "demande_id",nullable=false)
    private Long demandeId;
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
   /* @OneToMany(mappedBy = "DemandeConge", cascade = CascadeType.ALL)
    private List<TypeConge> TypeConge;*/

    public DemandeConge() {}


    public DemandeConge(Long demandeId, String login, Date dateDebut, Date dateFin, String etatDemande, int nbjours) {
        this.demandeId =demandeId;
        this.login = login;

        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.etatDemande = etatDemande;
        this.nbjours = nbjours;
    }

    public Long getDemandeId() {
        return demandeId;
    }

    public void setDemandeId(Long demandeId) {

        this.demandeId = demandeId;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getEtatDemande() {
        return etatDemande;
    }

    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }

    public int getNbjours() {
        return nbjours;
    }

    public void setNbjours(int nbjours) {
        this.nbjours = nbjours;
    }

    @Override
    public String toString() {
        return "DemandeConge{" +
                "demandeId=" + demandeId +
                ", login='" + login + '\'' +

                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", etatDemande='" + etatDemande + '\'' +
                ", nbjours=" + nbjours +
                '}';
    }
}


