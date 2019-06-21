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
public class planteRouge extends Soin{
    
    public planteRouge() {

        this.type="Plante";
        joueur.sante = joueur.sante+30;this.prix=20;
    }
    
}
