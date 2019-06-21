/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author pierr
 */
public class Crafting {
    String nomObjetCraft;
    String nomObjetCraftFinal;
    int nbObjet;
    int sante;
    int force;
    int defense;
    int agilite;
    int chance;
    int prix;
    int testConstruction;
    int materiaux1;
    int materiaux2;
    int materiaux3;

    public Crafting() {
        
    }
    
    public String getNomObjetCraft() {return nomObjetCraft;}
    public String getNomObjetCraftFinal(){return nomObjetCraftFinal;}
    public int getNbObjet (){return nbObjet;}
    public int getSante (){return sante;}
    public int getForce (){return force;}
    public int getDefense (){return defense;}
    public int getAgilite (){return agilite;}
    public int getChance (){return chance;}
    public int getPrix (){return prix;}
    public int getTestConstruction (){return testConstruction;}
    public int getMateriaux1(){return materiaux1;}
    public int getMateriaux2(){return materiaux2;}
    public int getMateriaux3(){return materiaux3;}
    
    public void setNomOBjetCraft(String nomObjetCraft){this.nomObjetCraft= nomObjetCraft;}
    public void setNomObjetCraftFinal(String nomObjetCraftFinal){this.nomObjetCraftFinal=nomObjetCraftFinal;}
    public void setNbObjet(int nbObjet){this.nbObjet=nbObjet;}
    public void setForce(int force){this.force=force;}
    public void setDefense(int defense){this.defense=defense;}
    public void setAgilite(int agilite){this.agilite=agilite;}
    public void setChance(int chance){this.chance=chance;}
    public void setPrix(int prix){this.prix = prix;}
    public void setTestConstruction(int testConstruction){this.testConstruction=testConstruction;}
    public void setMateriaux1(int materiaux1){this.materiaux1=materiaux1;}
    public void setMateriaux2(int materiaux2){this.materiaux2=materiaux2;}
    public void setMateriaux3(int materiaux3){this.materiaux3=materiaux3;}
    
    
}
