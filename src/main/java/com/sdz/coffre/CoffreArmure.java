/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.coffre;

import com.sdz.objet.armure.botteSoldat;
import com.sdz.objet.armure.pantalonSoldat;
import com.sdz.objet.armure.vestSoldat;
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
public class CoffreArmure extends GenerateurCoffre{

    String nom;
    
    public CoffreArmure() {
        this.nom = "Coffre d'Armure";

    }
    
    public List<Objet> randomObjet(int nbObjet){
        Objet objet = null;
        List<Objet> listeObjet = new ArrayList<Objet>();
        Random r = new Random();
        Inventaire inventaire = new Inventaire();
        
        System.out.println("Vous ouvrez un coffre d'armure");
        
        int intR = r.nextInt(3);
        switch(intR){
            case 0:
                objet = new botteSoldat();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 1:
                objet = new vestSoldat();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
            case 2:
                objet = new pantalonSoldat();
                System.out.println("Vous recevez "+objet.nom);
                inventaire.AjouterInventaire(objet);
                
                break;
        }
        listeObjet.add(objet);
        return listeObjet;
    }
    
}
