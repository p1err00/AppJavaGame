/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.perso;

/**
 *
 * @author pierr
 */
public class Assault extends Personnage{
    
    public Assault(String nom) {
        super(nom);
        this.classe ="Soldat d'assault";
        this.sante = super.sante+50;
        this.santeMax = super.sante+50;
        this.force = super.force+20;
        this.defense = super.defense+20;
        this.agilite = super.agilite+20;
        this.chance = super.chance+20;
        this.armePrincipale = "Kalashnikov";
        this.armeMelee = "Couteau de combat";
        this.nbCartouches = 46;
    }
    
}
