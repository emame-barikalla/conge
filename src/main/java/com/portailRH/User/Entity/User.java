package com.portailRH.User.Entity;

import javax.persistence.*;

@Entity
@Table(name="USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String login;
    private int roleId;

    private String password;
    private String matricule;
    private String statut;
    private String nom;
    private String prenom;

    public User() {
    }

    public User(String login, int roleId, String password, String matricule, String statut, String nom, String prenom) {
        this.login = login;
        this.roleId = roleId;
        this.password = password;
        this.matricule = matricule;
        this.statut = statut;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", roleId=" + roleId +
                ", password='" + password + '\'' +
                ", matricule='" + matricule + '\'' +
                ", statut='" + statut + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
