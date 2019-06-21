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
public class epee extends Arme{
    Scanner sc = new Scanner(System.in);
    public epee() {
        joueur.force=joueur.force+35;
        this.type="arme";
        this.classeEquipe="";
        this.poid=1000;
        this.prix=800;
        this.materiaux1 = "Feraille";
        this.nbMateriaux1 = 30;
    }
    
    public String Description(){
        return "Une epee medieval, lourde mais efficace\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }
    public void Craft(){
        feraille feraille = new feraille();
        System.out.println("Requiere :\n"+this.nbMateriaux1+" "+this.materiaux1+"\n");
        System.out.println("Fabriquer ?");
        String rep = sc.nextLine();
        switch(rep){
            case "oui":
                if(Inventaire.listeObjet.contains(feraille)&& feraille.cpt >=this.nbMateriaux1){
                    System.out.println("*...Fabrication...*");
                    feraille.cpt = feraille.cpt - this.nbMateriaux1;
                    epee epee = new epee();
                    Inventaire.listeObjet.add(epee.nom);
                    System.out.println("Epee ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
    }
}
