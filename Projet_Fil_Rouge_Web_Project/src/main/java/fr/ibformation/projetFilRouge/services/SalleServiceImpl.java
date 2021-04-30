package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.DAO.SalleDAO;
import fr.ibformation.projetFilRouge.DAO.SalleDAOImpl;
import fr.ibformation.projetFilRouge.bo.Salle;

public class SalleServiceImpl implements SalleService {

	@Override
	public List<Salle> findAll() {
		SalleDAO salleDAO = new SalleDAOImpl();
		return salleDAO.findAll();
	}

	@Override
	public Salle findById(int idCondition) {
		SalleDAO salleDAO = new SalleDAOImpl();
		return salleDAO.findById(idCondition);
	}

	@Override
	public String create(Salle salle) {
		SalleDAO salleDAO = new SalleDAOImpl();
		return salleDAO.create(salle);
	}

	@Override
	public String delete(int id) {
		SalleDAO salleDAO = new SalleDAOImpl();
		return salleDAO.delete(id);
	}


	@Override
	public String update(Salle salleToUpdate) {
		SalleDAO salleDAO = new SalleDAOImpl();
		return salleDAO.update(salleToUpdate);
	}



}
