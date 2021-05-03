package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Film;

public interface FilmService {
	public String create(Film film);
	public String update(Film filmToUpdate);
	public Film findById(int idCondition);
	public List<Film> findAll();
	public String delete(int id);
	
}
