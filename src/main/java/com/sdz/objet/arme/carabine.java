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
public class carabine extends Arme{
    Scanner sc = new Scanner(System.in);
    public carabine() {
        joueur.force=joueur.force+70;
        this.type="arme";
        this.classeEquipe="Sniper";
        this.couleur="Marron";
        this.poid=2000;
        this.nbCartouches=2;
        this.prix=200;
        this.materiaux1 = "Bois";
        this.materiaux2 = "Feraille";
        this.materiaux3 = "";
        this.nbMateriaux1 = 10;
        this.nbMateriaux2 = 20;
    }
    
    public String Description(){
        return "Une carabine de chasse.\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }
    public void Craft(){
        bois bois = new bois();
        feraille feraille = new feraille();
        System.out.println("Requiere :\n"+this.nbMateriaux1+" "+this.materiaux1+"\n"+this.nbMateriaux2+" "+this.materiaux2);
        System.out.println("Fabriquer ?");
        String rep = sc.nextLine();
        switch(rep){
            case "oui":
                if(Inventaire.listeObjet.contains(bois)&& bois.cpt >=this.nbMateriaux1&& Inventaire.listeObjet.contains(feraille)&& feraille.cpt >= this.nbMateriaux2){
                    System.out.println("*...Fabrication...*");
                    bois.cpt = bois.cpt - this.nbMateriaux1;
                    feraille.cpt = feraille.cpt - this.nbMateriaux2;
                    carabine carabine = new carabine();
                    Inventaire.listeObjet.add(carabine.nom);
                    System.out.println("Carabine ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
    }
}
