package fr.ibformation.projetFilRouge.DAO;

import java.util.List;

import fr.ibformation.projetFilRouge.bo.Room;

public interface RoomDAO {
	
	public List<Room> findAll();
	public Room findById(int idCondition);
	public String create(Room room);
	public String delete(int id);
	public String update(Room roomToUpdate);
	
}
