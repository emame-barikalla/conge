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



}
