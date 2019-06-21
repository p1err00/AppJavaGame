package com.sdz.competence;

import com.sdz.perso.Personnage;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pierr
 */
public abstract class Competence extends Personnage {

    public String nomCompetence;
    public int pouvoir;
    Scanner sc = new Scanner(System.in);
    String rep;

    public Competence(String nom) {
        super(nom);
    }

    public String getNomCompetence() {
        return nomCompetence;
    }

    public int getPouvoir() {
        return pouvoir;
    }

    public void setNomCompetence(String nomCompetence) {
        this.nomCompetence = nomCompetence;
    }

    public void setPouvoir(int pouvoir) {
        this.pouvoir = pouvoir;
    }


}
