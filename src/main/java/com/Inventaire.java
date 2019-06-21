/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.Objet;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;

import java.util.Scanner;

import java.util.TreeMap;

/**
 *
 * @author pierr
 */
public class Inventaire {

    public static int poidMax = 20000;
    public static int poidConstant = 0;
    public static List<String> listeObjet = new ArrayList<String>();
    public static List<Objet> objetUse = new ArrayList<Objet>();

    public Inventaire() {

    }

    public void AjouterInventaire(Objet objet) {

        // ***Ajout d'un objet***
        // Verifie si la liste est vide

        if (poidConstant + objet.poid <= poidMax) {
            listeObjet.add(objet.nom);
            objetUse.add(objet);
            System.out.println("L'objet a ete ajouter");
        } else {
            System.out.println("Vous ne pouvez pas prendre ça, votre sac est pleins");
        }
    }

    public void VoirInventaire(List<String> listeObjet) {
        Scanner sc = new Scanner(System.in);
        String rep;
        String array[];

        System.out.println("*...Ouverture de l'inventaire...*");
        System.out.println("---------------");

        TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
        for (String objetNom : listeObjet) {
            Integer c = tmap.get(objetNom);
            tmap.put(objetNom, (c == null) ? 1 : c + 1);
        }
        for (Map.Entry m : tmap.entrySet())

            System.out.println(m.getKey() + " : " + m.getValue());

        //UI Inventaire

            System.out.println("Que faire ?");
            System.out.println("\tUtiliser\tVoir\tJeter\tSortir");
            rep = sc.nextLine();

            while(("partir").equals(rep)){
                switch(rep){
                    case "utiliser":
                    System.out.println("Que voulez -vous utiliser ?");
                    rep = sc.nextLine();
                    for (int i = 0;i<listeObjet.)
                    break;
                    case "voir":
                    System.out.println("Que voulez -vous voir ?");
                    rep = sc.nextLine();
                    if(listeObjet.contains(rep)){

                    }
                    break;
                    case "jeter":
                    System.out.println("Que voulez -vous jeter ?");
                    rep = sc.nextLine();
                    if(listeObjet.contains(rep)){
                        System.out.println("Vous jetez "+rep);
                        listeObjet.remove(rep);
                    }
                    break;
                    case "sortir":
                    System.out.println("Vous fermez votre inventaire");
                    break;
                }
            }

    }

}
