/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.ville;

import com.sdz.batiment.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pierr
 */
public abstract class Ville {

    public String nomVille;
    public int nbBatiment;
    public int nbBaseMilitaire;
    public int nbBatimentRuine;
    public int nbEcole;
    public int nbEntrepot;
    public int nbFerme;
    public int nbGendarmerie;
    public int nbMagasinVetement;
    public int nbMaison;
    public int nbPharmacie;
    public int nbStationService;
    public int nbSuperMarche;
    public int nbTerrainVague;
    public int nbArmurerie;

    //***Getter***
    public int getNbArmurerie() {
        return nbArmurerie;
    }

    public String getNomVille() {
        return nomVille;
    }

    public int getNbBatiment() {
        return nbBatiment;
    }

    public int getNbBaseMilitaire() {
        return nbBaseMilitaire;
    }

    public int getNbBatimentRuine() {
        return nbBatimentRuine;
    }

    public int getNbEcole() {
        return nbEcole;
    }

    public int getNbEntrepot() {
        return nbEntrepot;
    }

    public int getNbFerme() {
        return nbFerme;
    }

    public int getNbGendarmerie() {
        return nbGendarmerie;
    }

    public int getNbMagasinVetement() {
        return nbMagasinVetement;
    }

    public int getNbMaison() {
        return nbMaison;
    }

    public int getNbPharmacie() {
        return nbPharmacie;
    }

    public int getNbStationService() {
        return nbStationService;
    }

    public int getNbSuperMarche() {
        return nbSuperMarche;
    }

    public int getNbTerrainVague() {
        return nbTerrainVague;
    }

    //***Setter***
    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void setNbBatiment(int nbBatiment) {
        this.nbBatiment = nbBatiment;
    }

    public void setNbArmurerie(int nbArmurerie) {
        this.nbArmurerie = nbArmurerie;
    }

    public void setNbBaseMilitaire(int nbBaseMilitaire) {
        this.nbBaseMilitaire = nbBaseMilitaire;
    }

    public void setNbBatimentRuine(int nbBatimentRuine) {
        this.nbBatimentRuine = nbBatimentRuine;
    }

    public void setNbEcole(int nbEcole) {
        this.nbEcole = nbEcole;
    }

    public void setNbEntrepot(int nbEntrepot) {
        this.nbEntrepot = nbEntrepot;
    }

    public void setNbFerme(int nbFerme) {
        this.nbFerme = nbFerme;
    }

    public void setNbGendarmerie(int nbGendarmerie) {
        this.nbGendarmerie = nbGendarmerie;
    }

    public void setNbMagasinVetement(int nbMagasinVetement) {
        this.nbMagasinVetement = nbMagasinVetement;
    }

    public void setNbMaison(int Maison) {
        this.nbMaison = nbMaison;
    }

    public void setNbPharmacie(int nbPharmacie) {
        this.nbPharmacie = nbPharmacie;
    }

    public void setNbStationService(int nbStationService) {
        this.nbStationService = nbStationService;
    }

    public void setNbSuperMarche(int nbSuperMarche) {
        this.nbSuperMarche = nbSuperMarche;
    }

    public void setNbTerrainVague(int nbTerrainVague) {
        this.nbTerrainVague = nbTerrainVague;
    }

}
