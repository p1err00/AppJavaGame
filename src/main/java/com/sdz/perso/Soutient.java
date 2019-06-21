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
public class Soutient extends Personnage{
    
    public Soutient(String nom) {
        super(nom);
        this.classe = "Soldat de soutien";
        this.sante = super.sante + 50;
        this.santeMax = super.sante + 50;
        this.force = super.force+50;
        this.defense = super.defense+30;
        this.agilite = super.agilite+10;
        this.chance = super.chance+5;
        this.armePrincipale = "MG49";
        this.armeMelee = "Couteau de combat";
        this.nbCartouches = 90;
    }
    
}
