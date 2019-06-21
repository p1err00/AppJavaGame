/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.competence;

/**
 *
 * @author pierr
 */
public class Larcin extends Competence{
    public Larcin(){
        super("Larcin");
        this.pouvoir = 2;
    }
    public String Description() {
        return "La competence " + this.nomCompetence + " utilise " + this.pouvoir + " point de pouvoir";
    }
}
