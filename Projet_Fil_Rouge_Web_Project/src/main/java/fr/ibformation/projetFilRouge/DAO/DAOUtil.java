package fr.ibformation.projetFilRouge.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUtil {
	
	public static Connection getConnection() {
		Connection connection = null;
		
		try {
			// Charger le driver de la BDD MySQL
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etablir la connexion
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cinema_database","root","admin"
			); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
}

