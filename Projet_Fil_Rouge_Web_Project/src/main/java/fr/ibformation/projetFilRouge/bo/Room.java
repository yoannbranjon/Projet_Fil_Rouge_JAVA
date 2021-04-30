package fr.ibformation.projetFilRouge.bo;

public class Room {
	
	 private int id;
	 private String name;
	 private int sit_number;
	 private int max_capacity;
	 private String audio_system;
	 
	 
	public Room(int id, String name, int sit_number, int max_capacity, String audio_system) {
		this.id = id;
		this.name = name;
		this.sit_number = sit_number;
		this.max_capacity = max_capacity;
		this.audio_system = audio_system;
	}


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


	public int getSit_number() {
		return sit_number;
	}


	public void setSit_number(int sit_number) {
		this.sit_number = sit_number;
	}


	public int getMax_capacity() {
		return max_capacity;
	}


	public void setMax_capacity(int max_capacity) {
		this.max_capacity = max_capacity;
	}


	public String getAudio_system() {
		return audio_system;
	}


	public void setAudio_system(String audio_system) {
		this.audio_system = audio_system;
	}


	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", sit_number=" + sit_number + ", max_capacity=" + max_capacity
				+ ", audio_system=" + audio_system + "]";
	}
	
	
	 
	 
	 
	 

	}

