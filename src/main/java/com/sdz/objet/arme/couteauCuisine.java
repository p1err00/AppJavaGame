/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.objet.arme;

import com.sdz.objet.bois;
import com.sdz.objet.feraille;
import java.util.Scanner;
import com.Inventaire;

/**
 *
 * @author pierr
 */
public class couteauCuisine extends Arme{
    Scanner sc = new Scanner(System.in);
    public couteauCuisine() {
        joueur.force=joueur.force+5;
        this.type="arme";
        this.classeEquipe="";
        this.couleur="Blanc";
        this.poid=30;
        this.nbCartouches=0;
        this.prix=6;
        this.materiaux1 = "Feraille";
        this.materiaux2 = "Bois";
        this.nbMateriaux1 = 5;
        this.nbMateriaux2 = 3;
    }
    
    public String Description(){
        return "Un couteau de cuisine basic\n"
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
                if(Inventaire.listeObjet.contains(bois)&& bois.cpt >=this.nbMateriaux2 && Inventaire.listeObjet.contains(feraille)&& feraille.cpt >=this.nbMateriaux1){
                    System.out.println("*...Fabrication...*");
                    bois.cpt = bois.cpt - this.nbMateriaux2;
                    feraille.cpt = feraille.cpt - this.nbMateriaux1;
                    couteauCuisine couteauCuisine = new couteauCuisine();
                    Inventaire.listeObjet.add(couteauCuisine.nom);
                    System.out.println("Couteau de cuisine ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
    }
}
