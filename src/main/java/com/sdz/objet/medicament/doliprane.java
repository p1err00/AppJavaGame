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
public class doliprane extends Soin{
    
    public doliprane() {
        
        this.type="Medicament";
        joueur.sante=joueur.sante+30;
        this.maladie="Mal de tete";
        this.prix=10;
    }
    
}
