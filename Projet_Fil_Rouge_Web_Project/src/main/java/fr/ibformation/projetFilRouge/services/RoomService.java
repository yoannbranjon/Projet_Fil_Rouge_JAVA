package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Room;

public interface RoomService {
	public List<Room> findAll();
	public Room findById(int idCondition);
	public String create(Room room);
	public String delete(int id);
	public String update(Room roomToUpdate);

}
