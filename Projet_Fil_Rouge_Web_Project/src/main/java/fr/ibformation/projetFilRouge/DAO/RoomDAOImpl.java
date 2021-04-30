package fr.ibformation.projetFilRouge.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import fr.ibformation.projetFilRouge.bo.Room;

public class RoomDAOImpl implements RoomDAO {

	@Override
	public List<Room> findAll() {
		List<Room> roomsList = new ArrayList<Room>();
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM rooms";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				Room room = new Room(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getInt("sit_number"),
						resultSet.getInt("max_capacity"),
						resultSet.getString("audio_system"));
				roomsList.add(room);
			}

			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return roomsList;
	}

	@Override
	public Room findById(int idCondition) {
		Room room = null;

		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "SELECT * FROM rooms WHERE id = ?";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setInt(1, idCondition);

			// 3 -  Executer la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Tant que j'ai des lignes de résultats
			while(resultSet.next()) {
				room = new Room(
						resultSet.getInt("id"),
						resultSet.getString("name"),
						resultSet.getInt("sit_number"),
						resultSet.getInt("max_capacity"),
						resultSet.getString("audio_system"));
			}

			connection.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return room;
	}


	@Override
	public String create(Room room) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "INSERT INTO rooms (name, sit_number, max_capacity, audio_system) VALUES(?,?,?,?) ";

		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);

			// Mettre les paramètres
			prepareStmt.setString(1, room.getName()); // 1er ?
			prepareStmt.setInt(2, room.getSit_number()); // 2eme ?
			prepareStmt.setInt(3, room.getMax_capacity());// 3eme ?
			prepareStmt.setString(4, room.getAudio_system());// 4eme ?

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
		String request = "DELETE FROM rooms WHERE id = ?";

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
	public String update(Room roomToUpdate) {
		// 1 - Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// 2 - Préparation de la requete
		// Fabrication de la requête
		String request = "UPDATE rooms SET name = ?, sit_number = ?, max_capacity = ?, audio_system = ? WHERE id = ?";
		
		try {
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			
			// Mettre les paramètres
			prepareStmt.setString(1, roomToUpdate.getName()); //1er?
			prepareStmt.setInt(2, roomToUpdate.getSit_number()); // 2eme ?
			prepareStmt.setInt(3, roomToUpdate.getMax_capacity());// 3eme ?
			prepareStmt.setString(4, roomToUpdate.getAudio_system());// 4eme ?
			prepareStmt.setInt(5, roomToUpdate.getId()); // 5eme ?
			
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
