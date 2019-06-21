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
public class Rat extends Monstre{
    
    public Rat(String nom) {
        super(nom);
        this.sante=super.sante+0;
        this.force=super.force+2;
        this.defense=super.defense+2;
        this.agilite=super.agilite+7;
        this.chance=super.chance+0;
    }
    
}
