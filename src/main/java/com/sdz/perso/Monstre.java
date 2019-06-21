package com.sdz.perso;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierr
 */
public class Monstre extends Personnage {

    public Monstre(String nom) {
        super(nom);
        Random r = new Random();
        this.sante = 10 + r.nextInt(10);
        this.classe="Monstre";
        
    }
    
        


}
