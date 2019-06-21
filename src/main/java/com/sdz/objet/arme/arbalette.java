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
public class arbalette extends Arme{
    
    public arbalette() {
        joueur.force=joueur.force+20;
        this.nbCartouches=1;
        this.materiaux1= "Bois";
        this.materiaux2= "Ficelle";
        this.materiaux3= "";
        this.nbMateriaux1=0;
        this.nbMateriaux2=0;
        this.nbMateriaux3=0;
    }
    
    public String Description(){
        return "Une arbalette de fortune mais tres puissante !\n"
                +joueur.force+ " point de force";
    }
    
    public void Craft(){
        
    }
}
