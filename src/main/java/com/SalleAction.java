/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sdz.coffre.CoffreObjet;
import com.Objet;
import com.sdz.objet.tissue;
import com.sdz.perso.Personnage;
import com.sdz.perso.Zombie;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class SalleAction {
    
    public SalleAction(Piece piece, Personnage joueur) {
        
        
        
        Scanner sc = new Scanner(System.in);
        String rep = sc.nextLine();
        int check = 0;
        int tpt = 0;

        
        Random r = new Random();

        while (piece.nbMonstre > 0) {
            System.out.println(piece.Description());
            Zombie zombie = new Zombie("Zombie");
            zombie.randomClasse();

            System.out.println("*...zombie " + zombie.classe + " apparait...*");
            while ((joueur.sante >= 0 && zombie.sante >= 0)) {

                while (tpt != 1) {
                    System.out.println("*...Que voulez-vous faire ?...*\n-Tirer-\t-Frapper-\t-Partir-");
                    System.out.println("\n-----------------------------------------------------------------------------------------------\n");
                    rep = sc.nextLine();
                    if ("tirer".equals(rep)) {
                        if (joueur.nbCartouches != 0) {
                            System.out.println("\n*..."+joueur.nom+" tire...*\n");

                            zombie.sante = zombie.sante - ((joueur.force) - zombie.defense);

                            joueur.nbCartouches = joueur.nbCartouches - 1;

                            tpt = tpt + 1;
                        } else {
                            System.out.println("Vous n'avez plus de balle");
                        }
                    } else if ("frapper".equals(rep)) {
                        System.out.println("*...Vous utilisez votre arme de melee...*");
                        zombie.sante = zombie.sante - ((joueur.force) - zombie.defense);

                        System.out.println("\n*...Il reste " + zombie.sante + " point de vie au " + zombie.classe + "...*\n");
                        tpt = tpt + 1;
                    } else if ("partir".equals(rep)) {
                        System.out.println("*...Vous ne pouvez pas partir...*");
                    }

                }
                if (zombie.sante > 0) {
                    System.out.println("*...Zombie " + zombie.classe + " attaque...*");

                    joueur.sante = joueur.sante - (joueur.defense - zombie.force );

                    System.out.println("*...Il vous reste " + joueur.sante + " point de vie...*");
                    tpt = tpt - 1;
                }
            }
            if (joueur.sante <= 0) {
                System.out.println("*..Vous ne pouvez pas attaquer, vous etes mort...*");
                //todo t mort sale con faire turc 
            } else if (zombie.sante <= 0) {
                System.out.println("\n*...Le Zombie " + zombie.classe + " est mort...*\n");
                piece.nbMonstre = piece.nbMonstre - 1;
                if (null != zombie.classe) switch (zombie.classe) {
                    case "civil":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetCivil(2);
                            break;
                        }
                    case "sdf":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetSdf(2);
                            break;
                        }
                    case "soldat":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetSoldat(2);
                            break;
                        }
                    case "enfant":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetEnfant(2);
                            break;
                        }
                    case "gilet jaune":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetGiletJaune(2);
                            break;
                        }
                    case "estropier":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetEstropier(2);
                            break;
                        }
                    case "flic":{
                        System.out.println("\n*...Vous fouillez le corps d'un zombie...*\n");
                        CoffreObjet monCoffre = new CoffreObjet();
                        monCoffre.randomObjetFlic(2);
                            break;
                        }
                    default:
                        break;
                }
            }
        }
        System.out.println(piece.Description());
        while (check == 0) {

            System.out.println("*...Que voulez-vous faire ?...*\n-Ouvrir conteneur-\t-Fouiller-\t-Interagir-\t-Inventaire-\t-Partir-");
            System.out.println("\n------------------------------------------------------------------\n");
            rep = sc.nextLine();

            switch (rep) {

                case "ouvrir":
                    if (piece.nbCoffre != 0) {
                        GenerateurCoffre monCoffre = new GenerateurCoffre();

                        monCoffre.randomCoffre(piece);

                        piece.nbCoffre = piece.nbCoffre - 1;

                    } else {
                        System.out.println("Il n'y a plus de coffre");
                        //nbPiece = nbPiece--;
                    }
                    break;
                case "partir":
                    System.out.println("*...Vous quittez la piece...*");
                    check = check + 1;
                    break;
                case "interragir":
                    System.out.println("*...Vous vous sociabiliés...*");
                    if (piece.nbPnj > 0) {
                        System.out.println("*...Une personne se trouve dans la piece...*");
                    } else {
                        System.out.println("*...Mais il n'y a personne...*");
                    }
                    break;
                case "fouiller":
                    if (piece.corpsZombie > 0) {

                    } else {
                        System.out.println("*..Il n'y a plus rien à fouiller...*");
                    }
                    break;
                case "inventaire":

                    joueur.inventaire.VoirInventaire(Inventaire.listeObjet);
            }

        }
        check = 0;

    }
}
