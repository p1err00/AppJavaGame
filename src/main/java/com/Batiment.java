package com;

import com.sdz.perso.Personnage;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierr
 */
public class Batiment {

    public String nomBatiment;
    public int nbPiece;
    public String nomPiece;
    Random r = new Random();
    Personnage joueur = new PersonnageImpl();
    Piece piece;
    SalleAction salleAction;
    int nbMonstre, nbCoffre, nbPnj;

    public String getNomBatiment() {
        return nomBatiment;
    }

    public int getNbPiece() {
        return nbPiece;
    }

    public String getNomPiece() {
        return nomPiece;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    public void setNbPiece(int nbPiece) {
        this.nbPiece = nbPiece;
    }

    public void setNomPiece(String nomPiece) {
        this.nomPiece = nomPiece;
    }

    public Batiment(int nbPiece) {
        
    }

    public void PieceRandomArmurerie(int nbPiece, Personnage joueur) {

        while(nbPiece !=0){
            int rep = r.nextInt(2);
            System.out.println(nbPiece);
            switch (rep) {
                case 0:
                    this.nomPiece = "magasin";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    break;
                case 1:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece("reserve",nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    break;
            }
            rep = r.nextInt(1);
            nbPiece = nbPiece-1;
            
        }
    }
    
    public void PieceRandomBaseMilitaire(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(6);
            switch (rep) {
                case 0:
                    this.nomPiece = "hall";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "dortoire";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "hangar";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "cantine";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 4:
                    this.nomPiece = "salle de reunion";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 5:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomBatimentRuine(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(4);
            switch (rep) {
                case 0:
                    this.nomPiece = "salon detruit";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "chambre detruite";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "salle de bain detruite";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "cuisine detruite";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomEcole(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(4);
            switch (rep) {
                case 0:
                    this.nomPiece = "salle de classe";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "cantine";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "bibliotheque";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "salle informatique";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomEntrepot(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(2);
            switch (rep) {
                case 0:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "reserve vide";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomFerme(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(5);
            switch (rep) {
                case 0:
                    this.nomPiece = "grange";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "etable";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "champ";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "scierie";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 4:
                    this.nomPiece = "garage";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomGendarmerie(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(4);
            switch (rep) {
                case 0:
                    this.nomPiece = "hall";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "cellule";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "bureau";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
        }
    }
    
    public void PieceRandomMagasinVetement(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(2);
            switch (rep) {
                case 0:
                    this.nomPiece = "magasin";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomMaison(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(4);
            switch (rep) {
                case 0:
                    this.nomPiece = "salon";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "chambre";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 2:
                    this.nomPiece = "salle de bain";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 3:
                    this.nomPiece = "cuisine";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomPharmacie(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(2);
            switch (rep) {
                case 0:
                    this.nomPiece = "magasin";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
                case 1:
                    this.nomPiece = "reserve";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
        }
    }
    
    public void PieceRandomStationService(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(2);
            switch (rep) {
                case 0:
                    this.nomPiece = "magasin";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    
                    break;
                case 1:
                    this.nomPiece = "pompe";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
            
        }
    }
    
    public void PieceRandomSuperMarche(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(1);
            switch (rep) {
                case 0:
                    this.nomPiece = "magasin";
                    nbMonstre = ThreadLocalRandom.current().nextInt(1, 4 + 1);
                    nbCoffre = r.nextInt(3);
                    nbPnj = 0;
                    piece = new Piece(this.nomPiece,nbMonstre,nbCoffre,nbPnj);
                    salleAction = new SalleAction(piece,joueur);
                    
                    break;
            }
            nbPiece = nbPiece-1;
        }
    }
    
    public void PieceRandomTerrainVague(int nbPiece, Personnage joueur) {
        while(nbPiece !=0){
            int rep = r.nextInt(1);
            switch (rep) {
                case 0:
                    this.nomPiece = "terrain vague";
                    break;

            }
            nbPiece = nbPiece-1;
        }
    }

    private static class PersonnageImpl extends Personnage {

        public PersonnageImpl() {
            super("");
        }
    }
    
    
    
    
    
    

}
