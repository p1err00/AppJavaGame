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
public class ChefBandit extends Monstre{
    
    public ChefBandit(String nom) {
        super(nom);
        this.classe = "Chef bandit";
        this.sante = super.sante + 0;
        this.force = super.force + 0;
        this.defense = super.defense + 0;
        this.agilite = super.agilite + 0;
        this.chance = super.chance + 0;
    }
    
}
