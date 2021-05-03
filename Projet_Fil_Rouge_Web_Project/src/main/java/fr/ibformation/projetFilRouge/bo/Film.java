package fr.ibformation.projetFilRouge.bo;

public class Film {
	private int id ;
	private String name ;
	private int duration;
	private String filmVersion;
	private String display;
	
	public Film(int id, String name, int duration, String filmVersion, String display) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.filmVersion = filmVersion;
		this.display = display;
	}

	
	/*
	 * METHODE AFFICHAGE TOSTRING
	 */
	
	
	@Override
	public String toString() {
		return "Film [id=" + id + ", name=" + name + ", duration=" + duration + ", filmVersion=" + filmVersion
				+ ", display=" + display + "]";
	}

	/*
	 * GETTER/SETTER 
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getFilmVersion() {
		return filmVersion;
	}

	public void setFilm_version(String filmVersion) {
		this.filmVersion = filmVersion;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	
}
