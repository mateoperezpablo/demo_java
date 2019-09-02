package demo_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void lVehicles(Scanner sc) {
		System.out.println("Listado de vehículos: ");
		System.out.println("ID\tMODELO\t\tMARCA\t\tMATRICULA\tLICENCIA");
		ArrayList<Vehicle> arr = Vehicle.getAll();
		for(int i=0;i<arr.size();i++) {
			Vehicle v = arr.get(i);
			System.out.println(v.getId() + "\t" + v.getModel() +"\t\t" + v.getBrand() + "\t\t" + v.getPlate() + "\t" + v.getLicenseRequired());
		}
		
		int opt = -1;
		
		System.out.println("Selecciona una opción (cualquier otro número saldrá del menú): ");
		System.out.println("1. Nuevo vehículo");
		System.out.println("2. Modificar vehículo");
		System.out.println("3. Borrar vehículo");
		opt=sc.nextInt();
		
		if(opt==1) {
			//Crear vehículo
			Vehicle v = new Vehicle();
			System.out.println("Introduce el modelo: ");
			v.setModel(sc.next());
			System.out.println("Introduce la marca: ");
			v.setBrand(sc.next());
			System.out.println("Introduce la matrícula: ");
			v.setPlate(sc.next());
			System.out.println("Introduce la licencia del vehículo: ");
			v.setLicenseRequired(sc.next().charAt(0));
			//CREAR
			System.out.println(Vehicle.create(v));
		}
		else if (opt==2) {
			System.out.println("Introduce la ID del vehículo a modificar:" );
			long id = sc.nextLong();
			Vehicle v = new Vehicle();
			for(Vehicle ve:arr) {
				if(ve.getId()==id) {
					v.setBrand(ve.getBrand());
					v.setModel(ve.getModel());
					v.setPlate(ve.getPlate());
					v.setId(ve.getId());
					v.setLicenseRequired(ve.getLicenseRequired());
				}
			}
			if(v.getId()!=-1) {
				System.out.println("Introduce el modelo: ");
				v.setModel(sc.next());
				System.out.println("Introduce la marca: ");
				v.setBrand(sc.next());
				System.out.println("Introduce la matrícula: ");
				v.setPlate(sc.next());
				System.out.println("Introduce la licencia del vehículo: ");
				v.setLicenseRequired(sc.next().charAt(0));
				//ACTUALIZAR
				Vehicle.update(id, v);
				System.out.println("Vehículo actualizado");
			}
			else {
				System.out.println("Vehículo no encontrado");
			}
		}
		else if (opt==3) {
			//Borrar vehículo
			System.out.println("Introduce la ID del vehículo a borrar:" );
			long id = sc.nextLong();
			Vehicle v = new Vehicle();
			for(Vehicle ve:arr) {
				if(ve.getId()==id) {
					v.setBrand(ve.getBrand());
					v.setModel(ve.getModel());
					v.setPlate(ve.getPlate());
					v.setId(ve.getId());
					v.setLicenseRequired(ve.getLicenseRequired());
				}
			}
			if(v.getId()!=-1) {
				//Borrar
				Vehicle.erase(id);
				System.out.println("Vehículo borrado");
			}
			else {
				System.out.println("Vehículo no encontrado");
			}
		}
		
		
	}
	
	public static void lDrivers(Scanner sc) {
		System.out.println("Listado de conductores: ");
		System.out.println("ID\tNOMBRE\t\tAPELLIDO\tLICENCIA");
		ArrayList<Driver> arr = Driver.getAll();
		for(int i=0;i<arr.size();i++) {
			Driver d = arr.get(i);
			System.out.println(d.getId() + "\t" + d.getName() +"\t\t" + d.getSurename() + "\t\t" + d.getLicense());
		}
		
		int opt = -1;
		
		System.out.println("Selecciona una opción (cualquier otro número saldrá del menú): ");
		System.out.println("1. Nuevo conductor");
		System.out.println("2. Modificar conductor");
		System.out.println("3. Borrar conductor");
		opt=sc.nextInt();
		
		if(opt==1) {
			//Crear conductor
			Driver d = new Driver();
			System.out.println("Introduce el nombre: ");
			d.setName(sc.next());
			System.out.println("Introduce el apellido: ");
			d.setSurename(sc.next());
			System.out.println("Introduce la licencia del vehículo: ");
			d.setLicense(sc.next().charAt(0));
			//CREAR
			System.out.println(Driver.create(d));
		}
		else if (opt==2) {
			System.out.println("Introduce la ID del conductor a modificar:" );
			long id = sc.nextLong();
			Driver d = new Driver();
			for(Driver de:arr) {
				if(de.getId()==id) {
					d.setName(de.getName());
					d.setSurename(de.getSurename());
					d.setLicense(de.getLicense());
					d.setId(de.getId());;
				}
			}
			if(d.getId()!=-1) {
				System.out.println("Introduce el nombre: ");
				d.setName(sc.next());
				System.out.println("Introduce el apellido: ");
				d.setSurename(sc.next());
				System.out.println("Introduce la licencia del conductor: ");
				d.setLicense(sc.next().charAt(0));
				//ACTUALIZAR
				Driver.update(id, d);
				System.out.println("Conductor actualizado");
			}
			else {
				System.out.println("Conductor no encontrado");
			}
		}
		else if (opt==3) {
			//Borrar conductor
			System.out.println("Introduce la ID del conductor a borrar:" );
			long id = sc.nextLong();
			Driver d = new Driver();
			for(Driver de:arr) {
				if(de.getId()==id) {
					d.setName(de.getName());
					d.setSurename(de.getSurename());
					d.setLicense(de.getLicense());
					d.setId(de.getId());;
				}
			}
			if(d.getId()!=-1) {
				//Borrar
				Driver.erase(id);
				System.out.println("Conductor borrado");
			}
			else {
				System.out.println("Conductor no encontrado");
			}
		}
	}
	
	public static void lTrips(Scanner sc) {
		System.out.println("Viajes");
	}
	
	public static void newTrip(Scanner sc) {
		System.out.println("Nuevo");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido");
		System.out.println();
		
		int opt = -1;
		
		do {
			System.out.println("Por favor, selecciona una opción (cualquier otro número saldrá del programa): ");
			System.out.println("1. Listado de vehículos");
			System.out.println("2. Listado de conductores");
			System.out.println("3. Listado de viajes");
			System.out.println("4. Nuevo viaje");
			Utils.getCon();
			
			opt = sc.nextInt();
			
			switch(opt) {
			  case 1:
				  lVehicles(sc);
				  	break;
			  case 2:
				  lDrivers(sc);
				    break;
			  case 3:
				  lTrips(sc);
				    break;
			  case 4:
				  newTrip(sc);
				    break;
			  default:
			}
			
		}while(opt<=4 && opt>=1);
		
		
		
		System.out.println("Adiós");
	}
}
