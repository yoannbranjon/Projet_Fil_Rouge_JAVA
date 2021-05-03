package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Room;

public interface RoomService {
	public String create(Room room);
	public String update(Room roomToUpdate);
	public Room findById(int idCondition);
	public List<Room> findAll();
	public String delete(int id);
	
}
