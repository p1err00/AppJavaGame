package com;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sdz.perso.Assault;
import com.sdz.perso.Medecin;
import com.sdz.perso.Personnage;
import com.sdz.perso.Sniper;
import com.sdz.perso.Soutient;
import com.sdz.ville.Paris;

public class Histoire extends JPanel {

    public Histoire(){
        int p = 0;
        Scanner sc = new Scanner(System.in);
        Personnage joueur = null;
        Piece piece = new Piece("", 0, 0, 0);
        SalleAction salleAction;
        JLabel nomLabel,textLabel;
        Graphics g;
 

        


        //////////////////////////////////////// *Fenetre de jeu* ////////////////////////////////////////

        Fenetre fenetre = new Fenetre();

        fenetre.setTitle("title");
        fenetre.setSize(1900,1070);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);

        JPanel jp = new JPanel();
        jp.setBackground(Color.white);

        fenetre.setContentPane(jp);
        fenetre.setVisible(true);

        //////////////////////////////////////// *Fenetre de jeu* ////////////////////////////////////////



        System.out.println("\tBonjour a toi jeune recrue.\n\n\tTu as ete engager par un groupe d'intervention "
                + "du gouvernement afin de combattre une menace Zombie au sein de notre pays.\n\n"
                + "\tTes competences en combat et en survie te seront du aide crucial.\n\tDe plus, nous n'avons "
                + "aucune information au sujet de la zone ou tu seras largué. Tu vas donc etre seul pour "
                + "cette mission.\n\n"
                + "\tIl me faut en revanche quelques informations sur toi.\n\n\tCommence par me donner ton prenom : ");
        String nomJoueur = sc.nextLine();
        
        System.out.println("\n----------------------------------------\n");

        while (p != 1) {
            System.out.println("\tBien " + nomJoueur + ", a present donne moi ta classe :\n"
                    + "Assault\nMedecin\nSoutien\nSniper");

            String rep = sc.nextLine();
            switch (rep) {
            case "Assault":
                joueur = new Assault(nomJoueur);

                System.out.println(joueur.Description());
                p = 1;
                break;
            case "Medecin":
                joueur = new Medecin(nomJoueur);

                System.out.println(joueur.Description());
                p = 1;
                break;
            case "Soutient":
                joueur = new Soutient(nomJoueur);

                System.out.println(joueur.Description());
                p = 1;
                break;
            case "Sniper":
                joueur = new Sniper(nomJoueur);

                System.out.println(joueur.Description());
                p = 1;
                break;
            }
        } 

        
        //////////////////////////////////////// *Prologue* ////////////////////////////////////////

        System.out.println("\t" + joueur.nom + ", nous allons te parachuter dans la zone de conflit."
                + "\n\tNe t'inquiete pas je resterais avec toi à l'oreillette pour et guider.");
        System.out.println("\n\t\t*...Parachutage en cours...*\n");
        System.out.println("\tTe voila arrivé au sol, tu dois etre dans une rue pas loin d'un zombie.\n\n"
                + "Je te propose de lui regler son compte avec ton arme avant de passer à la suite");

        while (joueur.sante > 0) {

            piece = new Piece("une rue deserte", 1, 1, 0);

            salleAction = new SalleAction(piece, joueur);
            

            System.out.println("\tParfait soldat " + joueur.nom + ", vous vous debrouillez bien.\n\tAvez vous "
                    + "remarquer qu'a chaque fois que vous utilisez votre arme principale, vous utilisez "
                    + "une douile.\n\tCeci est valable pour toutes les armes à feu, alors veillez a les utilisés "
                    + "avec precaution\n\n" + "Vous avez ete parachuter dans la banlieu de Paris. Il doit y avoir une "
                    + "petite maison sur votre droite, videz la de ses habitants,"
                    + " nous y etablieront votre abri\n");

            piece = new Piece("salon", 2, 2, 0);
            salleAction = new SalleAction(piece, joueur);

            System.out.println(
                    "*...A l'interieur de la piece se trouve un escalier a droite et un long couloir à gauche.\n"
                            + "Ou voulez-vous aller...* ?\n-gauche-\n-droite-");

            String rep = sc.nextLine();
            switch (rep) {
            case "droite":
                System.out.println("*...Vous allez à droite\nVous montez les escaliers...*");
                piece = new Piece("bureau", 2, 1, 0);
                salleAction = new SalleAction(piece, joueur);

                System.out.println("*...Vous sortez du bureau");
                System.out.println("*...Vous allez a gauche...*");
                piece = new Piece("chambre", 1, 1, 0);
                salleAction = new SalleAction(piece, joueur);
                break;
            case "gauche":
                System.out.println("*...Vous allez a gauche...*");
                piece = new Piece("une chambre", 1, 2, 0);
                salleAction = new SalleAction(piece, joueur);
                System.out.println("Vous sortez de la chambre");
                System.out.println("*...Vous allez à droite\nVous montez les escaliers...*");
                piece = new Piece("un bureau", 2, 1, 0);
                salleAction = new SalleAction(piece, joueur);
                break;
            }

            System.out.println("\tSoldat " + joueur.nom + " je vais devoir vous apprendre encore quelques bases de "
                    + "la survie.\n\tPour commencez nous allons utiliser cette maison afin d'en faire"
                    + "une base de survie potable.\n\tJe te conseil de visiter les environs et de trouver des "
                    + "materiaux pour l'ameliorer et la renforcer.\n");
            System.out.println("\tMaintenant passont à un autre point important :\n"
                    + "\tJe n'ais aucune idee d'ou est la section d'intervention qui devait venir te "
                    + "chercher donc pour l'instant t'es tout seul dans cette galere.\n"
                    + "\tMais ne t'en fait pas je te donne des infos des que j'en ais.\n"
                    + "\tJe n'ais plus grand chose d'autre à te dire pour l'instant. Je te laisse "
                    + "te debrouiller et je te rappel tres vite !");

            Abri abri = new Abri(joueur);


            //////////////////////////////////////// *Debut histoire* ////////////////////////////////////////


            Paris paris = new Paris(joueur);
            paris.Visiter(joueur);

        }
    }
}