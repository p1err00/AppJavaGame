/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.objet.arme;

/**
 *
 * @author pierr
 */
public class barett extends Arme{
    
    public barett() {

        this.nom="Barett";
        joueur.force=joueur.force+200;
        this.type="arme";
        this.classeEquipe="Sniper";
        this.couleur="Noir";
        this.poid=2000;
        this.nbCartouches=5;
        this.prix=100;
    }
    
    public String Description(){
        return "Un fusil de sniper tres puissant et tres rare.\n"
                +joueur.force+ " point de force\n"
                +this.poid+ "g\n"
                +this.nbCartouches+ " cartouches\n"
                +this.prix+ " $";
    }

}
