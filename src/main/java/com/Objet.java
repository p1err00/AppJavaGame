/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sdz.perso.Personnage;

/**
 *
 * @author pierr
 */
public class Objet {

    public String nom;
    public int prix;
    public int poid;
    public int type;
    public int cpt;

    public String getNom() {
        return nom;
    }

    public int getPrix() {
        return prix;
    }

    public int getPoid() {
        return poid;
    }

    public int getType() {
        return type;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public void setPoid(int poid) {
        this.poid = poid;
    }

    public void setType(int type) {
        this.type = type;
    }


}
