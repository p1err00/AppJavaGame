/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.coffre;

import com.sdz.objet.*;
import com.sdz.objet.arme.*;

import com.sdz.objet.armure.*;

import com.sdz.objet.medicament.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.GenerateurCoffre;
import com.Inventaire;
import com.Objet;

/**
 *
 * @author pierr
 */
public class CoffreObjet extends GenerateurCoffre {

    String nom;
    List<Objet> listeObjet; 

    public CoffreObjet() {

    }

    public List<Objet> randomObjetCivil(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("\nVous recevez " + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("\nVous recevez " + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;

    }

    public List<Objet> randomObjetSdf(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new bouteilleVide();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetSoldat(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.32) {
                objet = new douille();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.33 && r < 0.68) {
                objet = new poudre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.69 && r < 0.75) {
                objet = new botteSoldat();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.76 && r < 0.84) {
                objet = new casqueSoldat();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.85 && r < 0.90) {
                objet = new pantalonSoldat();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.91 && r < 0.96) {
                objet = new vestSoldat();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.97 && r <= 1) {
                objet = new neufMM();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetEnfant(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new paireLunette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new morceauBois();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new ressort();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetGiletJaune(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new giletJaune();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new batte();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.85) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.86 && r < 0.95) {
                objet = new molotov();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetEstropier(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new cannette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new poudre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetFlic(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new douille();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new poudre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new magnum();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);
                
            }

        }

        return listeObjet;
    }


    /*-----------------------A ajouter a la randomClasse------------------------*/


    public List<Objet> randomObjetPompier(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetProstituer(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetBureaucrate(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetGaragiste(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetMacon(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

    public List<Objet> randomObjetSurvivaliste(int nbObjet) {
        Objet objet;
        
        
       

        listeObjet = new ArrayList<Objet>();

        Inventaire inventaire = new Inventaire();
        for (int i = 0; i < nbObjet; i++) {
            double r = Math.random();
            if (r >= 0 && r < 0.15) {
                objet = new montre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r >= 0.16 && r < 0.30) {
                objet = new briquet();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.31 && r < 0.45) {
                objet = new livre();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.46 && r < 0.65) {
                objet = new tissue();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.66 && r < 0.80) {
                objet = new ficelle();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.81 && r < 0.95) {
                objet = new cigarette();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            } else if (r > 0.95 && r <= 1) {
                objet = new alcool();
                System.out.println("Vous recevez :\n" + objet.nom+"\n");
                inventaire.AjouterInventaire(objet);

            }

        }

        return listeObjet;
    }

}
