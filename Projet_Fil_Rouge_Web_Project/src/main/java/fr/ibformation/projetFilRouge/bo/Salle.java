package fr.ibformation.projetFilRouge.bo;

public class Salle {
	
	 private int id;
	 private String nom;
	 private int nbr_siege;
	 private int capacite_max;
	 private String systeme_audio;
	 
	 
	public Salle(int id, String nom, int nbr_siege, int capacite_max, String systeme_audio) {
		this.id = id;
		this.nom = nom;
		this.nbr_siege = nbr_siege;
		this.capacite_max = capacite_max;
		this.systeme_audio = systeme_audio;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNbr_siege() {
		return nbr_siege;
	}


	public void setNbr_siege(int nbr_siege) {
		this.nbr_siege = nbr_siege;
	}


	public int getCapacite_max() {
		return capacite_max;
	}


	public void setCapacite_max(int capacite_max) {
		this.capacite_max = capacite_max;
	}


	public String getSysteme_audio() {
		return systeme_audio;
	}


	public void setSysteme_audio(String systeme_audio) {
		this.systeme_audio = systeme_audio;
	}


	@Override
	public String toString() {
		return "Room [Id=" + id + ", nom=" + nom + ", nbr_siege=" + nbr_siege + ", capacite_max=" + capacite_max
				+ ", systeme_audio=" + systeme_audio + "]";
	}


	}

