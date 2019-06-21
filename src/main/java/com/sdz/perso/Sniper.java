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
public class Sniper extends Personnage{
    
    public Sniper(String nom) {
        super(nom);
        this.classe = "Soldat de Sniper";
        this.sante = super.sante + 20;
        this.santeMax = super.sante + 20;
        this.force = super.force+10;
        this.defense = super.defense +10;
        this.agilite = super.agilite + 30;
        this.chance = super.chance +20;
        this.armePrincipale = "Barett";
        this.armeMelee = "Couteau de combat";
        this.nbCartouches = 5;
    }
    
}
