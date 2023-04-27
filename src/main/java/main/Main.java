package main;

import java.util.Scanner;

import javax.persistence.EntityManager;

import dawicl1.Cita;
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
		
		//HOLA PROFE AQUI ME SALE EL ERROR detached entity passed to persist :(
		
		System.out.println("Se registraron los doctores");
		
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion;
	        
	       while(!salir){
	            
	           System.out.println("1. Ingresar Cita");
	           System.out.println("2. Mostrar citas del doctor");
	           System.out.println("3. Salir");
	            
	           System.out.println("Escribe el número de la opción que deseas realizar");
	           opcion = sn.nextInt();
	           
	           switch(opcion){
               case 1:
            	   System.out.println("Ingrese el numero de cita:");
            	   int numcita = sn.nextInt();
            	   
            	   System.out.println("Ingrese la fecha:");
            	   String fechacita = sn.nextLine(); 
            	   
            	   System.out.println("Ingrese el nombre del paciente:");
            	   String nompaciente = sn.nextLine(); 
            	   
            	   System.out.println("Ingrese el nombre del doctor:");
            	   String nomdoctor = sn.nextLine(); 
            	   
            	   Cita cita = new Cita();
           			cita.setNumCita(numcita);
           			cita.setFechaCita(fechacita);
           			cita.setNomPacienteCita(nompaciente);
           			cita.setDoctor(doctor1);
           			
           			System.out.println("Cita registrada");
           			
                   break;
                   
               case 2:
                   System.out.println("Ingrese el nombre del doctor");
                   String nombredoctor = sn.nextLine();
                   
                   
                   break;
                   
                case 3:
                   salir = true;
                   break;
              
               
                
	}
	
	}
	
	}
}
