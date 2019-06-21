/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.coffre;

import com.sdz.objet.arme.kalashnikov;
import com.sdz.objet.arme.barett;
import com.sdz.objet.arme.couteauCombat;
import com.sdz.objet.*;
import com.Objet;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.GenerateurCoffre;
import com.Inventaire;
import com.sdz.*;

/**
 *
 * @author pierr
 */
public class CoffreArme extends GenerateurCoffre {
    String nom;

    public CoffreArme() {
        this.nom = "Coffre d'Arme";
        
    }
    
    public List<Objet> randomObjet(int nbObjet){
        Objet objet = null;
        List<Objet> listeObjet = new ArrayList<Objet>();
        Random r = new Random();
        Inventaire inventaire = new Inventaire();
        int intR = r.nextInt(3);
        switch(intR){
            case 0:
                objet = new barett();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 1:
                objet = new couteauCombat();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 2:
                objet = new kalashnikov();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
        }
        listeObjet.add(objet);
        return listeObjet;
    }
    
}
