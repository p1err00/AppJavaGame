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
public class Mutant extends Monstre{
    
    public Mutant(String nom) {
        super(nom);
        this.sante=super.sante+100;
        this.force=super.force+100;
        this.defense=super.defense+50;
        this.agilite=super.agilite+0;
        this.chance=super.chance+0;
    }
    
}
