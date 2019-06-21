package com.sdz.perso;

import java.util.ArrayList;
import java.util.List;
import com.Inventaire;
import com.Objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierr
 */
public abstract class Personnage {

    public String nom;
    public int sante;
    public int santeMax;
    public int force;
    public int defense;
    public int agilite;
    public int chance;
    public String armePrincipale;
    public String armeMelee;
    public String armureTete;
    public String armureTorse;
    public String armureBras;
    public String armureJambes;
    public String armurePied;
    public int nbCartouches;
    public int argent;
    private int statut;
    public String classe;
    public Inventaire inventaire;
    int poidMax = 20000;
    int poidConstant = 0;
    List<Objet> listeObjet = new ArrayList<Objet>();

    public String getNom() {
        return nom;
    }

    public int getSante() {
        return sante;
    }

    public int getForce() {
        return force;
    }

    public int getDefense() {
        return defense;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getChance() {
        return chance;
    }

    public String getArmePrincipale() {
        return armePrincipale;
    }

    public String getArmeMelee() {
        return armeMelee;
    }

    public String getArmureTete() {
        return armureTete;
    }

    public String getArmureTorse() {
        return armureTorse;
    }

    public String getArmureBras() {
        return armureBras;
    }

    public String getArmureJambes() {
        return armureJambes;
    }

    public String getArmurePied() {
        return armurePied;
    }

    public int nbCartouches() {
        return nbCartouches;
    }

    public int getArgent() {
        return argent;
    }

    public int getStatut() {
        return statut;
    }

    public String getRace() {
        return classe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public void setArmePrincipale(String armePrincipale) {
        this.armePrincipale = armePrincipale;
    }

    public void setArmeMelee(String armeMelee) {
        this.armeMelee = armeMelee;
    }

    public void setArmureTete(String armureTete) {
        this.armureTete = armureTete;
    }

    public void setArmureTorse(String armureTorse) {
        this.armureTorse = armureTorse;
    }

    public void setArmureBras(String armureBras) {
        this.armureBras = armureBras;
    }

    public void setArmureJambes(String armureJambes) {
        this.armureJambes = armureJambes;
    }

    public void setArmurePied(String armurePied) {
        this.armurePied = armurePied;
    }

    public void setNbCartouches(int nbCartouches) {
        this.nbCartouches = nbCartouches;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public void setRace(String classe) {
        this.classe = classe;
    }

    public Personnage(String nom) {
        this.nom = nom;
        this.sante = 50;
        this.force = 20;
        this.defense = 20;
        this.agilite = 10;
        this.chance = 10;
        inventaire = new Inventaire();
    }

    public String Description() {
        return "Tres bien " + this.nom + ", " + this.classe + ".Voici tes caracteristiques :\n"
                + "-" + this.sante + " point de sante\n"
                + "-" + this.force + " point de force\n"
                + "-" + this.defense + " point de defense\n"
                + "-" + this.agilite + " point d'agilite\n"
                + "-" + this.chance + " point de chance\n";
    }

}
