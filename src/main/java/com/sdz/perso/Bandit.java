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
public class Bandit extends Monstre{
    
    public Bandit(String nom) {
        super(nom);
        this.classe= "Bandit";
        this.sante = super.sante + 20;
        this.force= super.force+20;
        this.defense = super.defense+10;
        this.agilite = super.agilite+10;
        this.chance = super.chance+5;
    }
    
}
