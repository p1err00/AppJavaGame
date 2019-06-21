/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.objet.arme;

import com.sdz.objet.*;
import java.util.Scanner;
import com.Inventaire;

/**
 *
 * @author pierr
 */
public class batte extends Arme{
    Scanner sc = new Scanner(System.in);
    public batte() {
        //joueur.force=joueur.force+5;
        this.type="arme";
        this.classeEquipe="";
        this.couleur="Marron";
        this.poid=500;
        this.prix=100;
        this.materiaux1= "Bois";
        this.nbMateriaux1=3;

    }
    public String Description(){
        return "Une batte de baseball, tout ce qui a de plus classique\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }
    public void Craft(){
        bois bois = new bois();
        System.out.println("Requiere :\n"+this.nbMateriaux1+" "+this.materiaux1+"\n");
        System.out.println("Fabriquer ?");
        String rep = sc.nextLine();
        switch(rep){
            case "oui":
                if(Inventaire.listeObjet.contains(bois)&& bois.cpt >=this.nbMateriaux1){
                    System.out.println("*...Fabrication...*");
                    bois.cpt = bois.cpt - this.nbMateriaux1;
                    batte batte = new batte();
                    Inventaire.listeObjet.add(batte.nom);
                    System.out.println("Batte ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
        
        
    }
}
