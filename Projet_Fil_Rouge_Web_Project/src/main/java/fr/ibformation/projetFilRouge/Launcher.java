package fr.ibformation.projetFilRouge;
import java.util.List;

import fr.ibformation.projetFilRouge.bo.Salle;
import fr.ibformation.projetFilRouge.services.SalleService;
import fr.ibformation.projetFilRouge.services.SalleServiceImpl;

public class Launcher {

	public static void main(String[] args) {

		SalleService salleService = new SalleServiceImpl();
		
		
		  System.out.println("--------- create ----------");
		  String messageReturned = salleService.create(new Salle(1, "Paté", 100, 150, "DolbySound"));
		  System.out.println(messageReturned);
		 
		 



		System.out.println("--------- update ----------");
		Salle salleToUpdate = new Salle(1,"JeTaiCassé", 200, 250, "OuchMesOreilles");
		String messageReturnedUpdate = salleService.update(salleToUpdate);
		System.out.println(salleToUpdate);
		System.out.println(messageReturnedUpdate);



		System.out.println("----------findAll-----------");

		List<Salle> sallesListFindAll = salleService.findAll();

		for (Salle salle : sallesListFindAll) {
			System.out.println(salle);
		}
		
		  System.out.println("--------- delete ----------");
		  String messageReturnedDelete = salleService.delete(1);
		  System.out.println(messageReturnedDelete);
		 



	}

}
