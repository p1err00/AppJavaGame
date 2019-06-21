/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.perso;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pierr
 */
public class Zombie extends Monstre {

    public Zombie(String nom) {
        super("Zombie");
        this.sante = super.sante + 0;
        this.force = super.force + 0;
        this.defense = super.defense + 0;
        this.agilite = super.agilite + 0;
        this.chance = super.chance + 0;

    }

    public String randomClasse() {

        Random r = new Random();
        int intR = r.nextInt(6);
        switch (intR) {
            case 0:
                this.classe = "civil";
                break;
            case 1:
                this.classe = "sdf";
                break;
            case 2:
                this.classe = "soldat";
                break;
            case 3:
                this.classe = "enfant";
                break;
            case 4:
                this.classe = "gilet jaune";
                break;
            case 5:
                this.classe = "estropier";
                break;
            case 6:
                this.classe = "flic";
                break;
            case 7:
                this.classe = "pompier";
                break;
            case 8:
                this.classe="prostituer";
                break;
            case 9:
                this.classe="bureaucrate";
                break;
            case 10:
                this.classe="garagiste";
                break;
            case 11:
                this.classe="maçon";
                break;
            case 12:
                this.classe="survivaliste";
                break;

        }
        return this.classe;
    }

}
