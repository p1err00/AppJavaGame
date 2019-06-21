package com;


import com.sdz.objet.bouteilleVide;
import com.sdz.objet.feraille;
import com.sdz.objet.bois;

import com.sdz.perso.Personnage;

import static com.Inventaire.listeObjet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
//import static .Inventaire.listeObjet;

/**
 *
 * @author pierr
 */
public class Abri {

    String listAtelier[];
    boolean check = false;
    Scanner sc = new Scanner(System.in);
    String rep;
    Inventaire inventaire = new Inventaire();
    List<String> listeObjet;
    List<String> listeObjetInventaire;

    public Abri(Personnage joueur) {

        System.out.println("*...Bienvenu chez vous !...*\n");
        System.out
                .println("\n--------------------------------------------------------------------------------------\n");
        System.out.println("*..Ici vous etes en securité, vous pouvez vous reposer ou bien ameliorer certains"
                + "coin de votre base...*\n");
        System.out.println("N'oubliez pas de vous equiper avant de partir et de remplir votre sac d'uniquement"
                + " ce qui vous serait utile");

        //ViderInventaire(joueur);

        System.out.println("Vos objets on ete inventorier");
        while (check == false) {
            System.out.println("*...Que voulez-vous faire ?...*");

            String Use[] = {"dormir","inventaire","partir"};
            for (int i =0;i<Use.length; i++){
                System.out.println("\t-"+Use[i]+"-");
            }

            rep = sc.nextLine();
            switch (rep) {
            case "dormir":
                System.out.println("*...Vous dormez...*");
                joueur.sante = joueur.santeMax;
                System.out.println("*..Vos point des vie sont au maximum..*");
                break;
            case "inventaire":
                System.out.println("Vous regardez votre inventaire");
                Inventaire();
                break;
            case "arme":
                System.out.println("Atelier d'arme");
                AtelierArme atelierArme = new AtelierArme();
                System.out.println(listAtelier);
                bois bois = new bois();
                feraille feraille = new feraille();
                if (listAtelier[0]== "Atelier arme") {

                    atelierArme.AtelierArmeCraft();

                } else {

                    System.out.println("Vous pouzer fabriquer un atelier d'arme avec :\n" + atelierArme.nbMateriaux1
                            + " " + atelierArme.materiau1 + "\n" + atelierArme.nbMateriaux2 + " "
                            + atelierArme.materiau2);

                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains("bois") && bois.cpt >= atelierArme.nbMateriaux1
                                && Inventaire.listeObjet.contains("feraille")
                                && feraille.cpt >= atelierArme.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - atelierArme.nbMateriaux1;
                            bois.cpt = feraille.cpt - atelierArme.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[0] = "Atelier arme";
                            atelierArme.AtelierArmeCraft();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }

                }
                break;
            case "armure":
                System.out.println("Atelier d'armure");
                AtelierArmure atelierArmure = new AtelierArmure();
                bois = new bois();
                feraille = new feraille();

                if (listAtelier[1]=="Atelier armure") {

                    // atelierArmure.AtelierArmureCraft();
                } else {
                    System.out.println("Vous pouzer fabriquer un atelier d'armure avec :\n" + atelierArmure.nbMateriaux1
                            + " " + atelierArmure.materiau1 + "\n" + atelierArmure.nbMateriaux2 + " "
                            + atelierArmure.materiau2);
                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains(bois) && bois.cpt >= atelierArmure.nbMateriaux1
                                && Inventaire.listeObjet.contains(feraille)
                                && feraille.cpt >= atelierArmure.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - atelierArmure.nbMateriaux1;
                            bois.cpt = feraille.cpt - atelierArmure.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[1] = "Atelier armure";
                            atelierArmure.AtelierArmureCraft();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }
                }
                break;

            case "barricades":
                bois = new bois();
                feraille = new feraille();
                System.out.println("Barricades");

                Barricades1 barricades1 = new Barricades1();
                if (listAtelier[2]=="Barricades 1 ") {
                    // Barricades1.barricades1Craft();

                } else {
                    System.out.println("Vous pouzer fabriquer une barricade avec :\n" + barricades1.nbMateriaux1 + " "
                            + barricades1.materiau1 + "\n" + barricades1.nbMateriaux2 + " " + barricades1.materiau2);
                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains(bois) && bois.cpt >= barricades1.nbMateriaux1
                                && Inventaire.listeObjet.contains(feraille)
                                && feraille.cpt >= barricades1.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - barricades1.nbMateriaux1;
                            bois.cpt = feraille.cpt - barricades1.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[2] = "Barricades 1";
                            barricades1.Construction();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }

                }
                break;
            case "alchimie":
                bois = new bois();
                feraille = new feraille();
                bouteilleVide bouteilleVide = new bouteilleVide();
                System.out.println("Table d'alchimie");

                AtelierAlchimie atelierAlchimie = new AtelierAlchimie();
                if (listAtelier[3]=="Atelier alchimie") {
                    // atelierAlchimie.AtelierAlchimie();

                } else {
                    System.out.println("Vous pouzer fabriquer un atelier d'alchimie avec :\n"
                            + atelierAlchimie.nbMateriaux1 + " " + atelierAlchimie.materiau1 + "\n"
                            + atelierAlchimie.nbMateriaux2 + " " + atelierAlchimie.materiau2);
                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains(bois) && bois.cpt >= atelierAlchimie.nbMateriaux1
                                && Inventaire.listeObjet.contains(feraille)
                                && feraille.cpt >= atelierAlchimie.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - atelierAlchimie.nbMateriaux1;
                            bois.cpt = feraille.cpt - atelierAlchimie.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[3] = "Atelier alchimie";
                            atelierAlchimie.Alchimie();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }

                }
                break;
            case "cuisine":
                bois = new bois();
                feraille = new feraille();
                System.out.println("Cuisine");
                Cuisine cuisine = new Cuisine();
                if (listAtelier[4]=="Cuisine") {

                    // cuisine.cuisineCraft();
                } else {
                    System.out.println("Vous pouzer fabriquer une cuisine avec :\n" + cuisine.nbMateriaux1 + " "
                            + cuisine.materiau1 + "\n" + cuisine.nbMateriaux2 + " " + cuisine.materiau2);
                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains(bois) && bois.cpt >= cuisine.nbMateriaux1
                                && Inventaire.listeObjet.contains(feraille) && feraille.cpt >= cuisine.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - cuisine.nbMateriaux1;
                            bois.cpt = feraille.cpt - cuisine.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[4] = "Cuisine";
                            cuisine.Cuisiner();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }
                }
                break;
            case "radio":
                bois = new bois();
                feraille = new feraille();
                System.out.println("Radio");
                Radio radio = new Radio();
                if (listAtelier[5]=="Radio") {

                    // radio.RadioCraft();
                } else {
                    System.out.println("Vous pouzer fabriquer une radio avec :\n" + radio.nbMateriaux1 + " "
                            + radio.materiau1 + "\n" + radio.nbMateriaux2 + " " + radio.materiau2);
                    System.out.println("Voulez-vous en fabriquer un ?\n");
                    rep = sc.nextLine();
                    if (("oui").equals(rep)) {
                        if (Inventaire.listeObjet.contains(bois) && bois.cpt >= radio.nbMateriaux1
                                && Inventaire.listeObjet.contains(feraille) && feraille.cpt >= radio.nbMateriaux2) {

                            System.out.println("*...Fabrication de l'atelier...*");
                            bois.cpt = bois.cpt - radio.nbMateriaux1;
                            bois.cpt = feraille.cpt - radio.nbMateriaux2;
                            System.out.println("Atelier fabriquer !");
                            listAtelier[5] = "Radio";
                            radio.Emission();

                        } else {
                            System.out.println("Vous n'avez pas assez d'objets");

                        }
                    } else {
                        System.out.println("tant pis");
                    }
                }
                break;
            case "partir":
                System.out.println("Vous quittez votre abris");
                check = true;
                break;
            }

        }
    }

    public void ViderInventaire(Personnage joueur) {

        List<String> listeObjet2 = listeObjet;
        listeObjetInventaire.addAll(listeObjet2);
        


    }

    public void Inventaire() {

            System.out.println("*...Ouverture de l'inventaire...*");
            System.out.println("---------------");

            TreeMap<String, Integer> tmap = new TreeMap<String, Integer>();
            for (String objetNom : listeObjetInventaire) {
                Integer c = tmap.get(objetNom);
                tmap.put(objetNom, (c == null) ? 1 : c + 1);
            }
            for (Map.Entry m : tmap.entrySet()) {
                System.out.println(m.getKey() + " : " + m.getValue());
            }
        
    }
}
