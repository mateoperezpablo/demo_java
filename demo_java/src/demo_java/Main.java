package demo_java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void lVehicles(Scanner sc) {
		System.out.println("Listado de veh�culos: ");
		System.out.println("ID\tMODELO\t\tMARCA\t\tMATRICULA\tLICENCIA");
		ArrayList<Vehicle> arr = Vehicle.getAll();
		for(int i=0;i<arr.size();i++) {
			Vehicle v = arr.get(i);
			System.out.println(v.getId() + "\t" + v.getModel() +"\t\t" + v.getBrand() + "\t\t" + v.getPlate() + "\t" + v.getLicenseRequired());
		}
		
		int opt = -1;
		
		System.out.println("Selecciona una opci�n (cualquier otro n�mero saldr� del men�): ");
		System.out.println("1. Nuevo veh�culo");
		System.out.println("2. Modificar veh�culo");
		System.out.println("3. Borrar veh�culo");
		opt=sc.nextInt();
		
		if(opt==1) {
			//Crear veh�culo
			Vehicle v = new Vehicle();
			System.out.println("Introduce el modelo: ");
			v.setModel(sc.next());
			System.out.println("Introduce la marca: ");
			v.setBrand(sc.next());
			System.out.println("Introduce la matr�cula: ");
			v.setPlate(sc.next());
			System.out.println("Introduce la licencia del veh�culo: ");
			v.setLicenseRequired(sc.next().charAt(0));
			//CREAR
			System.out.println(Vehicle.create(v));
		}
		else if (opt==2) {
			System.out.println("Introduce la ID del veh�culo a modificar:" );
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
				System.out.println("Introduce la matr�cula: ");
				v.setPlate(sc.next());
				System.out.println("Introduce la licencia del veh�culo: ");
				v.setLicenseRequired(sc.next().charAt(0));
				//ACTUALIZAR
				Vehicle.update(id, v);
				System.out.println("Veh�culo actualizado");
			}
			else {
				System.out.println("Veh�culo no encontrado");
			}
		}
		else if (opt==3) {
			//Borrar veh�culo
			System.out.println("Introduce la ID del veh�culo a borrar:" );
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
				System.out.println("Veh�culo borrado");
			}
			else {
				System.out.println("Veh�culo no encontrado");
			}
		}
		
		
	}
	
	public static void lDrivers(Scanner sc) {
		System.out.println("Conductores");
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
			System.out.println("Por favor, selecciona una opci�n (cualquier otro n�mero saldr� del programa): ");
			System.out.println("1. Listado de veh�culos");
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
		
		
		
		System.out.println("Adi�s");
	}
}
