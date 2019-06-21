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
public class couteauCombat extends Arme{
    Scanner sc = new Scanner(System.in);
    public couteauCombat() {
        joueur.force=joueur.force+25;
        this.type="arme";
        this.classeEquipe="Medecin";
        this.couleur="Vert";
        this.poid=200;
        this.nbCartouches=0;
        this.prix=30;
        this.materiaux1 = "Couteau de cuisine";
        this.materiaux2 = "Feraille";
        this.nbMateriaux1 = 1;
        this.nbMateriaux2 = 5;
    }
    
    public String Description(){
        return "Un couteau de combat de l'armée. Tres affuté\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }
    public void Craft(){
        feraille feraille = new feraille();
        couteauCuisine couteauCuisine = new couteauCuisine();
        System.out.println("Requiere :\n"+this.nbMateriaux1+" "+this.materiaux1+"\n"+this.nbMateriaux2+" "+this.materiaux2);
        System.out.println("Fabriquer ?");
        String rep = sc.nextLine();
        switch(rep){
            case "oui":
                if(Inventaire.listeObjet.contains(couteauCuisine)&& couteauCuisine.cpt >=this.nbMateriaux1 &&Inventaire.listeObjet.contains(feraille)&& feraille.cpt >=this.nbMateriaux2 ){
                    System.out.println("*...Fabrication...*");
                    feraille.cpt = feraille.cpt - this.nbMateriaux2;
                    couteauCuisine.cpt = couteauCuisine.cpt - this.nbMateriaux1;
                    couteauCombat couteauCombat =new couteauCombat();
                    Inventaire.listeObjet.add(couteauCombat.nom);
                    System.out.println("Couteau de combat ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
    }
}
