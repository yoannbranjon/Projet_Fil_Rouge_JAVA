package fr.ibformation.projetFilRouge.services;

import java.util.List;

import fr.ibformation.projetFilRouge.DAO.RoomDAO;
import fr.ibformation.projetFilRouge.DAO.RoomDAOImpl;
import fr.ibformation.projetFilRouge.bo.Room;

public class RoomServiceImpl implements RoomService {

	@Override
	public List<Room> findAll() {
		RoomDAO roomDAO = new RoomDAOImpl();
		return roomDAO.findAll();
	}

	@Override
	public Room findById(int idCondition) {
		RoomDAO roomDAO = new RoomDAOImpl();
		return roomDAO.findById(idCondition);
	}

	@Override
	public String create(Room room) {
		RoomDAO roomDAO = new RoomDAOImpl();
		return roomDAO.create(room);
	}

	@Override
	public String delete(int id) {
		RoomDAO roomDAO = new RoomDAOImpl();
		return roomDAO.delete(id);
	}


	@Override
	public String update(Room roomToUpdate) {
		RoomDAO roomDAO = new RoomDAOImpl();
		return roomDAO.update(roomToUpdate);
	}



}
