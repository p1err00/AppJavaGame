/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdz.extension;

import com.sdz.objet.arme.*;
import java.util.Scanner;

/**
 *
 * @author pierr
 */
public class AtelierArme {

    public String materiau1 = "Bois";
    public String materiau2 = "Feraille";
    public String materiau3 = "";
    public int nbMateriaux1 = 20;
    public int nbMateriaux2 = 20;
    public int nbMateriaux3;

    public AtelierArme() {
    }

    public void AtelierArmeCraft() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenu dans l'atelier d'arme. Ici vous pourrez fabriquer differents "
                + "types d'armes et les ameliores.");
        System.out.println("Selectionnez un objet a creer puis selectionre les materiaux necessaires.");

        System.out.println("Arme de melee\nArme a feu\nOutils");
        
        String rep = sc.nextLine();
        while(rep !="partir"){
        switch (rep) {
            case "melee":
                System.out.println("\t\tArme de melee");
                System.out.println("Batte\nCouteau de combat\nEpee\nKatana\nScalpel");
                rep = sc.nextLine();
                
                switch (rep) {
                    case "batte":
                        batte batte = new batte();
                        System.out.println(batte.Description());
                        batte.Craft();
                        break;
                    case "couteau":
                        couteauCombat couteauCombat = new couteauCombat();
                        System.out.println(couteauCombat.Description());
                        couteauCombat.Craft();
                        break;
                    case "epee":
                        epee epee = new epee();
                        System.out.println(epee.Description());
                        epee.Craft();
                        break;
                    case "katana":
                        katana katana = new katana();
                        System.out.println(katana.Description());
                        katana.Craft();
                        break;
                    case "scalpel":
                        scalpel scalpel = new scalpel();
                        System.out.println(scalpel.Description());
                        scalpel.Craft();
                        break;
                }
                break;
            case "feu":
                System.out.println("\t\tArme à feu");
                System.out.println("Arbalette\nCarabine\nKalashnikov\nMagnum\nNeuf mm\n"
                        + "Svt40\nUzi");
                rep = sc.nextLine();
                switch(rep){
                    case "arbalette":
                        arbalette arbalette = new arbalette();
                        System.out.println(arbalette.Description());
                        arbalette.Craft();
                        break;
                    case "carabine":
                        carabine carabine = new carabine();
                        System.out.println(carabine.Description());
                        carabine.Craft();
                        break;
                    case "kalash":
                        kalashnikov kalashnikov = new kalashnikov();
                        System.out.println(kalashnikov.Description());
                        kalashnikov.Craft();
                        break;
                    case " magnum":
                        magnum magnum = new magnum();
                        System.out.println(magnum.Description());
                        magnum.Craft();
                        break;
                    case " neuf":
                        neufMM neufMM = new neufMM();
                        System.out.println(neufMM.Description());
                        neufMM.Craft();
                        break;
                    case "svt":
                        svt40 svt40 = new svt40();
                        System.out.println(svt40.Description());
                        svt40.Craft();
                        break;
                    case "uzi":
                        uzi uzi = new uzi();
                        System.out.println(uzi.Description());
                        uzi.Craft();
                        break;
                }
                break;
            case "outils":
                System.out.println("\t\tOutils");
                break;
            case "partir":
                System.out.println("*...Vous quittez l'atelier...*");
                break;
        }
        }

    }

}
