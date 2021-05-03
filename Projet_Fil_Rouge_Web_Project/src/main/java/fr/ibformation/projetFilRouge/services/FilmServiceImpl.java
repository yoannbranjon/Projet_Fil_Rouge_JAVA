package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.DAO.FilmDAO;
import fr.ibformation.projetFilRouge.DAO.FilmDAOImpl;
import fr.ibformation.projetFilRouge.bo.Film;


public class FilmServiceImpl implements FilmService{
	
	@Override
	public List<Film> findAll() {
		FilmDAO filmDAO = new FilmDAOImpl();
		return filmDAO.findAll();
	}

	@Override
	public Film findById(int idCondition) {
		FilmDAO filmDAO = new FilmDAOImpl();
		return filmDAO.findById(idCondition);
	}

	@Override
	public String create(Film film) {
		FilmDAO filmDAO = new FilmDAOImpl();
		return filmDAO.create(film);
	}

	@Override
	public String delete(int id) {
		FilmDAO filmDAO = new FilmDAOImpl();
		return filmDAO.delete(id);
	}


	@Override
	public String update(Film filmToUpdate) {
		FilmDAO filmDAO = new FilmDAOImpl();
		return filmDAO.update(filmToUpdate);
	}

}
