/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.coffre;


import com.sdz.objet.medicament.planteRouge;
import com.sdz.objet.medicament.planteJaune;
import com.sdz.objet.medicament.zombrex;
import com.sdz.objet.medicament.doliprane;
import com.sdz.objet.medicament.antiInflammatoire;
import com.sdz.objet.medicament.planteVerte;
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
public class CoffreSoin extends GenerateurCoffre{
    String nom;
    public CoffreSoin() {
        this.nom = "Coffre de Soin";
    }
    
    public List<Objet> randomObjet(int nbObjet){
        Objet objet = null;
        List<Objet> listeObjet = new ArrayList<Objet>();
        Random r = new Random();
        Inventaire inventaire = new Inventaire();
        
        System.out.println("Vous ouvrez un coffre de Soin");
        
        int intR = r.nextInt(2);
        switch(intR){
            case 0:
                objet = new doliprane();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 1:
                objet = new zombrex();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 2:
                objet = new planteRouge();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 3:
                objet = new planteVerte();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 4:
                objet = new planteJaune();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 5:
                objet = new antiInflammatoire();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                break;
        }
        listeObjet.add(objet);
        return listeObjet;
    }
    
}
