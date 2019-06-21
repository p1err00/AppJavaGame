/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.ville;

import com.sdz.batiment.*;
import com.sdz.perso.Personnage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import com.Abri;
import com.Batiment;
import com.Inventaire;
import com.Objet;

/**
 *
 * @author pierr
 */
public class Paris extends Ville {

    public List<Batiment> listeBatiment = new ArrayList<Batiment>();
    Scanner sc = new Scanner(System.in);
    Batiment batiment;
    Abri abri;
    String rep;
    Objet objet;
   // List<Objet> listeObjet = Inventaire.listeObjet;
    
    public Paris(Personnage joueur) {
        this.nomVille = "Paris";
        this.nbBatiment = 15;
        this.nbArmurerie = 0;
        this.nbBaseMilitaire = 0;
        this.nbBatimentRuine = 2;
        this.nbEcole = 1;
        this.nbEntrepot = 2;
        this.nbFerme = 0;
        this.nbGendarmerie = 1;
        this.nbMagasinVetement = 2;
        this.nbMaison = 3;
        this.nbPharmacie = 1;
        this.nbStationService = 1;
        this.nbSuperMarche = 1;
        this.nbTerrainVague = 2;

    }

    public void Description() {

    }

    public void Visiter(Personnage joueur) {
        System.out.println("*N*Vous entrez dans " + this.nomVille + "*N*\n");
        while (nbBatiment != 0 || ("partir").equals(rep)) {
            System.out.println("Il y a " + this.nbBatiment + " batiments .\n"
                    + this.nbBatimentRuine + ": Batiments en ruine\n"
                    + this.nbEcole + ": Ecole\n"
                    + this.nbEntrepot + ": Entrepot\n"
                    + this.nbGendarmerie + ": Gendarmerie\n"
                    + this.nbMagasinVetement + ": Magasin de vetement\n"
                    + this.nbMaison + ": Maison\n"
                    + this.nbPharmacie + ": Pharmacie\n"
                    + this.nbStationService + ": Station service\n"
                    + this.nbSuperMarche + ": Super marche\n"
                    + this.nbTerrainVague + ": Terrain vague\n"
                    + "Retourner à l'abri");
            System.out.println("Ou voulez-vous aller ?\n");
            rep = sc.nextLine();
            switch (rep) {
                case "batimentRuine":
                    if (this.nbBatimentRuine != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);

                        batiment = new BatimentRuine(nbpiece);
                        batiment.PieceRandomBatimentRuine(nbpiece, joueur);
                        System.out.println("ca marche");
                        this.nbBatimentRuine = this.nbBatimentRuine - 1;
                    } else {
                        System.out.println("Il ne reste plus de batiment en ruine a visiter");
                    }

                    break;
                case "ecole":
                    if (this.nbEcole != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new Ecole(nbpiece);
                        batiment.PieceRandomEcole(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbEcole = this.nbEcole - 1;

                    } else {
                        System.out.println("Il ne reste plus d'ecoleà visiter");
                    }
                    break;
                case "entrepot":
                    if (this.nbEntrepot != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new Entrepot(nbpiece);
                        batiment.PieceRandomEntrepot(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbEntrepot = this.nbEntrepot - 1;

                    } else {
                        System.out.println("Il ne reste plus d'entrepot à visiter");
                    }
                    break;
                case "gendarmerie":
                    if (this.nbGendarmerie != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new Gendarmerie(nbpiece);
                        batiment.PieceRandomGendarmerie(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbGendarmerie = this.nbGendarmerie - 1;

                    } else {
                        System.out.println("Il ne reste plus de gendarmerie à visiter");
                    }
                    break;
                case "magasinVetement":
                    if (this.nbMagasinVetement != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new MagasinVetement(nbpiece);
                        batiment.PieceRandomMagasinVetement(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbMagasinVetement = this.nbMagasinVetement - 1;

                    }
                    break;
                case "maison":
                    if (this.nbMaison != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new Maison(nbpiece);
                        batiment.PieceRandomMaison(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbMaison = this.nbMaison - 1;

                    } else {
                        System.out.println("Il ne reste plus de maison à visiter");
                    }
                    break;
                case "pharmacie":
                    if (this.nbPharmacie != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new Pharmacie(nbpiece);
                        batiment.PieceRandomPharmacie(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbPharmacie = this.nbPharmacie - 1;

                    } else {
                        System.out.println("Il ne reste plus de pharmacie à visiter");
                    }
                    break;
                case "stationService":
                    if (this.nbStationService != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new StationEssence(nbpiece);
                        batiment.PieceRandomStationService(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbStationService = this.nbStationService - 1;

                    } else {
                        System.out.println("Il ne reste plus de station service à visiter");
                    }
                    break;
                case "superMarche":
                    if (this.nbSuperMarche != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new SuperMarche(nbpiece);
                        batiment.PieceRandomSuperMarche(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbSuperMarche = this.nbSuperMarche - 1;

                    } else {
                        System.out.println("Il ne reste plus de super marche à visiter");
                    }
                    break;
                case "terrainVague":
                    if (this.nbTerrainVague != 0) {
                        int nbpiece = ThreadLocalRandom.current().nextInt(1, 3 + 1);
                        batiment = new TerrainVague(nbpiece);
                        batiment.PieceRandomTerrainVague(nbpiece, joueur);
                        System.out.println("Vous entrez dans un " + batiment.nomBatiment);
                        System.out.println("Il y a " + nbpiece + " pieces");
                        this.nbTerrainVague = this.nbTerrainVague - 1;

                    } else {
                        System.out.println("Il ne reste plus de terrain vague à visiter");
                    }
                    break;
                case "partir":
                    System.out.println("Vous rentrez à l'abri");
                    abri =new Abri(joueur);
                    break;
            }
        }
        nbBatiment -= nbBatiment;
    }
}
