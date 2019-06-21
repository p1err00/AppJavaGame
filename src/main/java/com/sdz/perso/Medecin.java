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
public class Medecin extends Personnage{
    
    public Medecin(String nom) {
        super(nom);
        this.classe = "Soldat Medecin";
        this.sante = super.sante+50;
        this.santeMax = super.sante+50;
        this.force = super.force+10;
        this.defense = super.defense+30;
        this.agilite = super.agilite+30;
        this.chance = super.chance + 10;
        this.armePrincipale = "scalpel";
    }
    
}
