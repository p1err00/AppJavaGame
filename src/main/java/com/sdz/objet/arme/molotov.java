/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.objet.arme;

import com.sdz.objet.bois;
import java.util.Scanner;
import com.Inventaire;
import com.Objet;

/**
 *
 * @author pierr
 */
public class molotov extends Arme {
    Scanner sc = new Scanner(System.in);
    public molotov() {
        //joueur.force=joueur.force+80;
        this.type = "Grenade";
        this.classeEquipe = "";
        this.couleur = "Vert";
        this.poid = 600;
        this.prix = 60;
        //essence+tissu+bouteille en verre
    }
    public String Description(){
        return "Une bombe incendiaire de fortune.\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }
public void Craft(){
        bois bois = new bois();
        System.out.println("Requiere :\n"+this.nbMateriaux1+" "+this.materiaux1+"\n"+this.nbMateriaux1+" "+this.materiaux1);
        System.out.println("Fabriquer ?");
        String rep = sc.nextLine();
        switch(rep){
            case "oui":
                if(Inventaire.listeObjet.contains(bois)&& bois.cpt >=3){
                    System.out.println("*...Fabrication...*");
                    bois.cpt = bois.cpt - this.nbMateriaux1;
                    this.nom="";batte batte = new batte();
                    Inventaire.listeObjet.add(batte.nom);
                    System.out.println("Batte ajoute à votre inventaire");
                }
                break;
            case "non":
                
                break;
        }
    }
}

