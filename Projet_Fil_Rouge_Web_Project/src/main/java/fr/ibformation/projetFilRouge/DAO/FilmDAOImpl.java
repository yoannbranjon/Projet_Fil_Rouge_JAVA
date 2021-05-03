package fr.ibformation.projetFilRouge.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.ibformation.projetFilRouge.bo.Film;

public class FilmDAOImpl implements FilmDAO {

	
	/*
	 *  METHODE POUR CREER UN FILM
	 */
	
	
	@Override
	public String create(Film film) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "INSERT INTO films (name, duration, film_version, display) VALUES(?,?,?,?) ";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setString(1, film.getName()); // 1er ?
			prepareStmt.setInt(2, film.getDuration()); // 2eme ?
			prepareStmt.setString(3, film.getFilmVersion());// 3eme ?
			prepareStmt.setString(4, film.getDisplay());// 4eme ?

			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();
			return "La création s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La création ne s'est pas bien passée";
		}

	}

	
	/*
	 *  METHODE POUR MODIFIER UN FILMS
	 */
	
	
	@Override
	public String update(Film filmToUpdate) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "UPDATE films SET name = ?, duration = ?, film_version = ?, display = ? WHERE id = ?";
		
		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			
			// Mettre les paramètres
			prepareStmt.setString(1, filmToUpdate.getName()); //1er?
			prepareStmt.setInt(2, filmToUpdate.getDuration()); // 2eme ?
			prepareStmt.setString(3, filmToUpdate.getFilmVersion());// 3eme ?
			prepareStmt.setString(4, filmToUpdate.getDisplay());// 4eme ?
			prepareStmt.setInt(5, filmToUpdate.getId()); // 5eme ?
			
			prepareStmt.executeUpdate(); // Car on fait une modification
			
			connection.close();
			return "La mise à jour s'est bien passée";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La mise à jour ne s'est pas bien passée";
		}
	}
	

	/*
	 *  METHODE POUR RECUPERER UN ID FILMS
	 */
	
	
	@Override
	public Film findById(int idCondition) {
		Film film = null;

		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM films WHERE id = ?";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setInt(1, idCondition);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				film = new Film(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getInt("duration"),
						resultSet.getString("film_version"),
						resultSet.getString("display"));
			}
			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return film;
	}
	
	
	/*
	 *  METHODE POUR RECUPERER LA TOTALITE DES FILMS
	 */
	
	
	@Override
	public List<Film> findAll() {
		List<Film> filmsList = new ArrayList<Film>();
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM films";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				Film film = new Film(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getInt("duration"),
						resultSet.getString("film_version"),
						resultSet.getString("display"));
				filmsList.add(film);
			}

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filmsList;
	}
	
	
	/*
	 *  METHODE POUR SUPPRIMER UN FILM
	 */
	
	
	public String delete(int id) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "DELETE FROM films WHERE id = ?";

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
	
}
