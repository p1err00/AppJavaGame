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
public class zombrex extends Soin{
    
    public zombrex() {
        this.type="Medicament";
        joueur.sante = joueur.sante+10;
        this.maladie="Infecter";
        this.prix=100;
    }
    
}
