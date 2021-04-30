package fr.ibformation.projetFilRouge;
import java.util.List;

import fr.ibformation.projetFilRouge.bo.Room;
import fr.ibformation.projetFilRouge.services.RoomService;
import fr.ibformation.projetFilRouge.services.RoomServiceImpl;

public class Launcher {

	public static void main(String[] args) {

		RoomService roomService = new RoomServiceImpl();
		
		
		  System.out.println("--------- create ----------");
		  String messageReturned = roomService.create(new Room(1, "Paté", 100, 150, "DolbySound"));
		  System.out.println(messageReturned);
		 
		 



		System.out.println("--------- update ----------");
		Room roomToUpdate = new Room(1,"JeTaiCassé", 200, 250, "OuchMesOreilles");
		String messageReturnedUpdate = roomService.update(roomToUpdate);
		System.out.println(roomToUpdate);
		System.out.println(messageReturnedUpdate);



		System.out.println("----------findAll-----------");

		List<Room> roomsListFindAll = roomService.findAll();

		for (Room room : roomsListFindAll) {
			System.out.println(room);
		}
		
		  System.out.println("--------- delete ----------");
		  String messageReturnedDelete = roomService.delete(1);
		  System.out.println(messageReturnedDelete);
		 
		 
	}

}
