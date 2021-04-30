package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Salle;

public interface SalleService {
	public List<Salle> findAll();
	public Salle findById(int idCondition);
	public String create(Salle salle);
	public String delete(int id);
	public String update(Salle salleToUpdate);

}
