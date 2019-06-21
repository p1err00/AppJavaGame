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
public class ChienErrant extends Monstre{
    
    public ChienErrant(String nom) {
        super(nom);
        this.sante=super.sante+5;
        this.force=super.force+10;
        this.defense=super.defense+2;
        this.agilite=super.agilite+3;
        this.chance=super.chance+0;
    }
    
}
