package fr.ibformation.projetFilRouge.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import fr.ibformation.projetFilRouge.bo.Salle;

public class SalleDAOImpl implements SalleDAO {

	@Override
	public List<Salle> findAll() {
		List<Salle> sallesList = new ArrayList<Salle>();
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM salles";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				Salle room = new Salle(
						resultSet.getInt("id"),
						resultSet.getString("nom"),
						resultSet.getInt("nbr_siege"),
						resultSet.getInt("capacite_max"),
						resultSet.getString("systeme_audio"));
				sallesList.add(room);
			}

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return sallesList;
	}

	@Override
	public Salle findById(int idCondition) {
		Salle salle = null;

		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM salles WHERE id = ?";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setInt(1, idCondition);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				salle = new Salle(
						resultSet.getInt("id"),
						resultSet.getString("nom"),
						resultSet.getInt("nbr_siege"),
						resultSet.getInt("capacite_max"),
						resultSet.getString("systeme_audio"));
			}

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return salle;
	}


	@Override
	public String create(Salle salle) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "INSERT INTO salles (nom, nbr_siege, capacite_max, systeme_audio) VALUES(?,?,?,?) ";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setString(1, salle.getNom()); // 1er ?
			prepareStmt.setInt(2, salle.getNbr_siege()); // 2eme ?
			prepareStmt.setInt(3, salle.getCapacite_max());// 3eme ?
			prepareStmt.setString(4, salle.getSysteme_audio());// 4eme ?

			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();
			return "La création s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La création ne s'est pas bien passée";
		}

	}

	public String delete(int id) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "DELETE FROM salles WHERE id = ?";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setInt(1, id); // 1er ?

			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();
			return "La supression s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La supression ne s'est pas bien passée";
		}
	}
	
	@Override
	public String update(Salle salleToUpdate) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "UPDATE salles SET nom = ?, nbr_siege = ?, capacite_max = ?, systeme_audio = ? WHERE id = ?";
		
		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			
			// Mettre les paramètres
			prepareStmt.setString(1, salleToUpdate.getNom()); //1er?
			prepareStmt.setInt(2, salleToUpdate.getNbr_siege()); // 2eme ?
			prepareStmt.setInt(3, salleToUpdate.getCapacite_max());// 3eme ?
			prepareStmt.setString(4, salleToUpdate.getSysteme_audio());// 4eme ?
			prepareStmt.setInt(5, salleToUpdate.getId()); // 5eme ?
			
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			return "La mise à jour s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La mise à jour ne s'est pas bien passée";
		}
	}


}
