/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.coffre;

import com.sdz.objet.*;
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
public class CoffreRessources extends GenerateurCoffre{
    String nom;
    public CoffreRessources(){
        this.nom="Coffre de Ressources";
    }
    
    public List<Objet> randomObjet(int nbObjet){
        Objet objet = null;
        List<Objet> listeObjet = new ArrayList<Objet>();
        Random r = new Random();
        Inventaire inventaire = new Inventaire();
        int intR = r.nextInt(2);
        switch(intR){
            case 1:
                objet = new douille();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                break;
            case 2:
                objet = new poudre();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                break;
        }
        listeObjet.add(objet);
        return listeObjet;
    }
}
