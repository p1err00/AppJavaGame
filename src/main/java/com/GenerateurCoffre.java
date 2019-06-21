/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sdz.coffre.*;
import com.Objet;
import com.sdz.objet.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pierr
 */
public class GenerateurCoffre {

    public String nom;
    public Random r = new Random();
    public Objet objet;
    public Inventaire inventaire;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public GenerateurCoffre() {

    }

    public List<Coffre> randomCoffre(Piece piece) {

        System.out.println("*...Vous fouillez un coffre dans la piece " + piece.nomPiece + "...*");
        List<Coffre> listeCoffres = new ArrayList<Coffre>();
        Random r = new Random();

        for (int i = 0; i < piece.nbCoffre; i++) {
            switch (piece.nomPiece) {

            case "magasin":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomCaisse();
                        break;
                    case 1:
                        RandomTelephone();
                        break;
                    case 2:
                        RandomSacados();
                        break;
                    case 3:
                        RandomOrdinateur();
                        break;
                    }

                }

            case "reserve":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomCarton();
                        break;
                    case 1:
                        RandomBureau();
                        break;
                    }
                }

            case "hall":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomSacados();
                        break;
                    case 1:
                        RandomValise();
                        break;
                    }
                }

            case "dortoir":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomArmoire();
                        break;
                    case 1:
                        RandomTableChevet();
                        break;
                    case 2:
                        RandomPlacard();
                        break;
                    case 3:
                        RandomCoffre();
                        break;
                    }
                }

            case "hangar":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomReserveOutil();
                        break;
                    case 1:
                        RandomPompe();
                        break;
                    }
                }

            case "cantine":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomFrigo();
                        break;
                    case 1:
                        RandomCongelateur();
                        break;
                    case 2:
                        RandomPlacard();
                        break;
                    }
                }

            case "salle de reunion":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomSacados();
                        break;
                    case 1:
                        RandomBureau();
                        break;
                    case 2:
                        RandomArmoire();
                        break;
                    case 3:
                        RandomTelephone();
                        break;
                    }
                }

            case "salon detruit":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomArmoire();
                        break;
                    case 1:
                        RandomEtagere();
                        break;
                    case 2:
                        RandomGravat();
                        break;
                    }
                }

            case "chambre detruite":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomTableChevet();
                        break;
                    case 1:
                        RandomTele();
                        break;
                    case 2:
                        RandomTelephone();
                        break;
                    case 3:
                        RandomBureau();
                        break;
                    }
                }

            case "salle de bain detruite":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomPlacard();
                        break;
                    case 1:
                        RandomGravat();
                        break;
                    }
                }

            case "cuisine detruite":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomPlacard();
                        break;
                    case 1:
                        RandomEtagere();
                        break;
                    case 2:
                        RandomGravat();
                        break;
                    }
                }
                break;
            case "salle de classe":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomBureau();
                        break;
                    case 1:
                        RandomSacados();
                        break;
                    }
                }

            case "bibliotheque":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomEtagere();
                        break;
                    case 1:
                        RandomArmoire();
                        break;
                    case 2:
                        RandomOrdinateur();
                        break;
                    }
                }

            case "salle informatique":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomBureau();
                        break;
                    case 1:
                        RandomOrdinateur();
                        break;
                    case 2:
                        RandomCoffre();
                        break;
                    }
                }

            case "reserve vide":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomCoffre();
                        break;
                    case 1:
                        RandomCarton();
                        break;
                    }
                }

            case "grange":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomSac();
                        break;
                    case 1:
                        RandomReserveOutil();
                        break;
                    case 2:
                        RandomReserveArme();
                        break;
                    }
                }

                break;
            case "champ":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomTerrainVague();
                        break;
                    case 1:
                        RandomChamp();
                        break;
                    }
                }

            case "scierie":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomReserveOutil();
                        break;
                    case 1:
                        RandomReserveBois();
                        break;
                    }
                }

            case "garage":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomVoiture();
                        break;
                    case 1:
                        RandomReserveOutil();
                        break;
                    case 2:
                        RandomArmoire();
                        break;
                    case 3:
                        RandomReserveArme();
                        break;
                    }
                }

            case "cellule":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomCellule();
                        break;
                    case 1:
                        RandomBureau();
                        break;
                    }
                }

            case "bureau":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomBureau();
                        break;
                    case 1:
                        RandomOrdinateur();
                        break;
                    case 2:
                        RandomTelephone();
                        break;

                    }
                }

            case "salon":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomTele();
                        break;
                    case 1:
                        RandomArmoire();
                        break;
                    case 2:
                        RandomPlacard();
                        break;
                    case 3:
                        RandomTableBasse();
                        break;
                    }
                }

            case "chambre":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(4);
                    switch (repInt) {
                    case 0:
                        RandomTableChevet();
                        break;
                    case 1:
                        RandomOrdinateur();
                        break;
                    case 2:
                        RandomArmoire();
                        break;
                    case 3:
                        RandomBureau();
                        break;
                    }
                }

            case "salle de bain":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomPlacard();
                        break;
                    case 1:
                        RandomArmoire();
                        break;
                    }
                }

            case "cuisine":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomFrigo();
                        break;
                    case 1:
                        RandomPlacard();
                        break;
                    case 2:
                        RandomCongelateur();
                        break;

                    }
                }

            case "pompe":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(3);
                    switch (repInt) {
                    case 0:
                        RandomPompe();
                        break;
                    case 1:
                        RandomReserveOutil();
                        break;
                    case 2:
                        RandomVoiture();
                        break;
                    }
                }

            case "terrain vague":
                for (i = 0; i < piece.nbCoffre; i++) {
                    int repInt = r.nextInt(2);
                    switch (repInt) {
                    case 0:
                        RandomTerrainVague();
                        break;
                    case 1:
                        RandomChamp();
                        break;
                    }
                }
            }
        }
        return listeCoffres;
    }

    public void RandomArmoire() {

        System.out.println("Vous fouillez une armoire");  
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + " \n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);
                Inventaire.listeObjet.add(objet.nom);
            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }
    }

    public void RandomCarton() {
        System.out.println("Vous fouillez un carton");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }
    }

    public void RandomCaisse() {
        System.out.println("Vous fouillez une caisse");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomTableBasse() {
        System.out.println("Vous fouillez une table basse");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);
                
            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomCoffre() {
        System.out.println("Vous fouillez un coffre");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomReserveOutil() {
        System.out.println("Vous fouillez une caisse à outils");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomFrigo() {
        System.out.println("Vous fouillez un frigo");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomCongelateur() {
        System.out.println("Vous fouillez un congelateur");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomPlacard() {
        System.out.println("Vous fouillez un placard");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomTelephone() {
        System.out.println("Vous fouillez un telephone fixe");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomTele() {
        System.out.println("Vous fouillez une tele");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomBureau() {
        System.out.println("Vous fouillez un bureau");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomSacados() {
        System.out.println("Vous fouillez un sac à dos");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomValise() {
        System.out.println("Vous fouillez une valise");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomVoiture() {
        System.out.println("Vous fouillez une voiture");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomSac() {
        System.out.println("Vous fouillez un sac");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomOrdinateur() {
        System.out.println("Vous fouillez un ordinateur");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomTableChevet() {
        System.out.println("Vous fouillez une table de chevet");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomChamp() {
        System.out.println("Vous fouillez un champ");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomCellule() {
        System.out.println("Vous fouillez une cellule");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomReserveArme() {
        System.out.println("Vous fouillez une reserve d'arme");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomPompe() {
        System.out.println("Vous fouillez une pompe");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomTerrainVague() {
        System.out.println("Vous fouillez par terre");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomEtagere() {
        System.out.println("Vous fouillez une etagere");
        int nbObjet = r.nextInt(5);
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :" + objet.nom + "\n");
                Inventaire.listeObjet.add(objet.nom);

            }
            System.out.println("Vous recevez : " + objet.nom);
            Inventaire.listeObjet.add(objet.nom);
        }

    }

    public void RandomGravat() {

    }

    public void RandomReserveBois() {

    }

}
