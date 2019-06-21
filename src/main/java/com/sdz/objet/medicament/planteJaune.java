/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.objet.medicament;

/**
 *
 * @author pierr
 */
public class planteJaune extends Soin{
    
    public planteJaune() {
        
        this.type="Plante";
        joueur.sante = joueur.sante+20;
        this.prix=20;
    }
    
}
