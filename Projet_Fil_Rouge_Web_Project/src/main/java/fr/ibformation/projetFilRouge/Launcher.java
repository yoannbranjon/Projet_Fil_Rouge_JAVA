package fr.ibformation.projetFilRouge;
import java.util.List;

import fr.ibformation.projetFilRouge.bo.Film;
import fr.ibformation.projetFilRouge.bo.Room;
import fr.ibformation.projetFilRouge.services.FilmService;
import fr.ibformation.projetFilRouge.services.FilmServiceImpl;
import fr.ibformation.projetFilRouge.services.RoomService;
import fr.ibformation.projetFilRouge.services.RoomServiceImpl;

public class Launcher {

	public static void main(String[] args) {

		/*
		 *  AFFICHAGES METHODES DAO ROOM 
		 */
		
		//Instanciation de l'objet RoomService
		RoomService roomService = new RoomServiceImpl();
		
		System.out.println("--------- create ----------");
		String messageReturnedRoom = roomService.create(new Room(1, "Paté", 100, 150, "DolbySound"));
		System.out.println(messageReturnedRoom);
		 
		 
		System.out.println("--------- update ----------");
		Room roomToUpdate = new Room(1,"JeTaiCassé", 200, 250, "OuchMesOreilles");
		String messageReturnedUpdateRoom = roomService.update(roomToUpdate);
		System.out.println(roomToUpdate);
		System.out.println(messageReturnedUpdateRoom);

		
		System.out.println("--------- findById ----------");
		Room roomFindById = roomService.findById(8);
		System.out.println(roomFindById);
		
		
		System.out.println("---------- findAll -----------");
		List<Room> roomListFindAll = roomService.findAll();
		for (Room room : roomListFindAll) {
			System.out.println(room);
		}
		
		
		System.out.println("---------- delete -----------");
		String messageReturnedDeleteRoom = roomService.delete(8);
		System.out.println(messageReturnedDeleteRoom);
		 
		
		/*
		 *  AFFICHAGES METHODES DAO FILM 
		 */
		
		//Instanciation de l'objet FilmService
		FilmService filmService = new FilmServiceImpl();
				
		System.out.println("--------- create ----------");
		String messageReturnedFilm = filmService.create(new Film(1, "Batman", 95, "VF", "Chauve-souris"));
		System.out.println(messageReturnedFilm);
				 
				 
		System.out.println("--------- update ----------");
		Film filmToUpdate = new Film(1,"James Bond", 140, "VO", "007");
		String messageReturnedUpdateFilm = filmService.update(filmToUpdate);
		System.out.println(filmToUpdate);
		System.out.println(messageReturnedUpdateFilm);

		
		System.out.println("--------- findById ----------");
		Film filmFindById = filmService.findById(5);
		System.out.println(filmFindById);

		
		System.out.println("---------- findAll -----------");
		List<Film> filmListFindAll = filmService.findAll();
		for (Film film : filmListFindAll) {
			System.out.println(film);
		}
				
		System.out.println("---------- delete -----------");
		String messageReturnedDeleteFilm = filmService.delete(5);
		System.out.println(messageReturnedDeleteFilm);
	}

}
