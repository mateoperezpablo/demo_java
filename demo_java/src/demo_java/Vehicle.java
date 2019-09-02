package demo_java;

import java.util.ArrayList;
import java.util.Date;

public class Vehicle {
	private long id;
	private String model;
	private String plate;
	private String brand;
	private char licenseRequired;
	
	public Vehicle(long id, String model, String plate, String brand, char licenseRequired) {
		this.id = id;
		this.model = model;
		this.plate = plate;
		this.brand = brand;
		this.licenseRequired = licenseRequired;
	}
	
	public Vehicle() {
		this.id = -1;
		this.model = "";
		this.plate = "";
		this.brand = "";
		this.licenseRequired = 'x';
	}
	
	public static ArrayList<Vehicle> getAll(){
		ArrayList<Vehicle> arr = VehicleCAD.getAll();
		
		return arr;
	}
	
	public static ArrayList<Vehicle> getNotInDate(Date d){
		ArrayList<Vehicle> arr = VehicleCAD.getNotInDate(d);
		
		return arr;
	}
	
	public static Vehicle getFromId(long id) {
		Vehicle v = new Vehicle();
		
		return v;
	}
	
	public static int create(Vehicle v) {
		return VehicleCAD.insert(v);
	}
	
	public static int update(long id, Vehicle v) {
		return VehicleCAD.update(id, v);
	}
	
	public static int erase(long id) {
		return VehicleCAD.erase(id);
	}
	
	public static ArrayList<Vehicle> getNotInDate(){
		ArrayList<Vehicle> arr = VehicleCAD.getAll();
		
		return arr;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public char getLicenseRequired() {
		return licenseRequired;
	}
	public void setLicenseRequired(char licenseRequired) {
		this.licenseRequired = licenseRequired;
	}

}
