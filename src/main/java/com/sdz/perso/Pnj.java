package com.sdz.perso;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pierr
 */
public class Pnj extends Personnage {
    
    protected String nomPnj;
	private int statut;
	private int statutPnj;
	
	public String getNomPnj() {return nomPnj;}
	public int getStatut() {return statut;}
	public int getStatutOnj() {return statutPnj;}
	
	public void setNomPnj(String nomPnj) {this.nomPnj = nomPnj;}
	public void setStatut(int statut){this.statut = statut;}
	public void setStatutPnj(int statutPnj) {this.statutPnj = statutPnj;}
	
	public Pnj() {
		super("Pnj");
		String nomPnj;
		int statut;
		int statutPnj;
	}
	public String Civil() {
		
		return "acab";
	}
	public String Marchand() {
		
		return "acab";
	}
	public String Soldat() {
	
		return "acab";
	}
	public String Survivaliste() {
	
		return "acab";
	}
	public String Enfant() {
	
		return "acab";
	}
	public String Vieu() {
	
		return "acab";
	}
	public String Dirigeant() {
	
		return "acab";
	}
}
