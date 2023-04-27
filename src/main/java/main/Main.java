package main;

import javax.persistence.EntityManager;

import dawicl1.Conn;
import dawicl1.Doctor;


public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em = Conn.getInstancia().getFactory().createEntityManager();
		
		Doctor doctor1 = new Doctor();
		doctor1.setIdDoctor(1253);
		doctor1.setNomDoctor("Julian");
		doctor1.setEspecialidadDoctor("Odontologia");
		
		Doctor doctor2 = new Doctor();
		doctor1.setIdDoctor(1254);
		doctor1.setNomDoctor("Ronald");
		doctor1.setEspecialidadDoctor("Cardiologia");
		
		Doctor doctor3 = new Doctor();
		doctor1.setIdDoctor(1255);
		doctor1.setNomDoctor("Alexia");
		doctor1.setEspecialidadDoctor("Pediatria");
		
		
		em.getTransaction().begin();
		em.persist(doctor1);
		em.persist(doctor2);
		em.persist(doctor3);
		em.getTransaction().commit();	
		
		System.out.println("Se registraron los doctores");
	}

}
