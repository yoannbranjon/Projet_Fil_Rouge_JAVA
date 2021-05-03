package fr.ibformation.projetFilRouge.DAO;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Film;

public interface FilmDAO {
	
	public List<Film> findAll();
	public Film findById(int idCondition);
	public String create(Film film);
	public String delete(int id);
	public String update(Film filmToUpdate);
}
