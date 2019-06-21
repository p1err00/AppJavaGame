package com;

import com.sdz.coffre.Coffre;
import com.sdz.perso.Monstre;
import com.sdz.perso.Pnj;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierr
 */
public class Piece {

    public String nomPiece;
    public int nbCoffre;
    public int nbMonstre;
    public int nbPiege;
    public int nbPnj;
    public int corpsZombie;
    List<Monstre> monstres = new ArrayList<>();
    List<Coffre> coffres = new ArrayList<>();
    List<Pnj> pnj = new ArrayList();


    public String getNomPiece() {
        return nomPiece;
    }

    public int getNbCoffre() {
        return nbCoffre;
    }

    public int getNbMonstre() {
        return nbMonstre;
    }

    public int getNbPiege() {
        return nbPiege;
    }

    public int getNbPnj() {
        return nbPnj;
    }
    public int getCorpsZombie(){return corpsZombie;}

    public void setNomPiece(String nomPiece) {
        this.nomPiece = nomPiece;
    }

    public void setNbCoffre(int nbCoffre) {
        this.nbCoffre = nbCoffre;
    }

    public void setNbMonstre(int nbMonstre) {
        this.nbMonstre = nbMonstre;
    }


    public void setNbPnj(int nbPnj) {
        this.nbPnj = nbPnj;
    }
    public void setCorpsZombie(int corpsZombie){this.corpsZombie=corpsZombie;}

    public Piece(String nomPiece, int nbMonstre,int nbCoffre, int nbPnj) {
        this.nomPiece = nomPiece;
        this.nbCoffre = nbCoffre;
        this.nbMonstre = nbMonstre;
        this.nbPnj = nbPnj;



        for (int i = 0; i < nbPnj; i++) {
            Pnj p = new Pnj();
            this.pnj.add(p);
        }


    }

    public String Description() {
        if (this.nbMonstre != 0) {
            System.out.println("*...Vous entrez dans " + this.nomPiece + "\nElle comporte "
                    + this.nbMonstre + " monstres, ainsi que " + this.nbCoffre + " coffre,"
                    + this.nbPiege + " pieges et " + this.nbPnj + " Pnj...*");
        } else if (this.nbMonstre == 0) {
            System.out.println("*...Il n'y a plus de monstres.\nIl reste " + this.nbCoffre
                    + " coffre ainsi que " + this.nbPiege + " piege...*\n");
        } else if (this.nbPiege == 0) {
            System.out.println("*...Il n'y a plus de monstre ni de piege...*\n");
        }
        return "";
    }


}
