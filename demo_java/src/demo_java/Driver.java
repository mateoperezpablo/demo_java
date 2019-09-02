package demo_java;

import java.util.ArrayList;
import java.util.Date;

public class Driver {
	private long id;
	private String name;
	private String surename;
	private char license;
	
	public static ArrayList<Driver> getAll(){
		ArrayList<Driver> arr = DriverCAD.getAll();
		
		return arr;
	}
	
	public static Driver getFromId(long id) {
		Driver d = new Driver();
		
		return d;
	}
	
	public static int create(Driver d) {
		return DriverCAD.insert(d);
	}
	
	public static int update(long id, Driver d) {
		return DriverCAD.update(id, d);
	}
	
	public static int erase(long id) {
		return DriverCAD.erase(id);
	}
	
	public static ArrayList<Driver> disp(Date d, char license){
		ArrayList<Driver> arr = DriverCAD.disp(d, license);
		
		return arr;
	}
	
	public Driver(long id, String name, String surename, char license) {
		this.id = id;
		this.name = name;
		this.surename = surename;
		this.license = license;
	}

	public Driver() {
		this.id = -1;
		this.name = "";
		this.surename = "";
		this.license = 'x';
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public char getLicense() {
		return license;
	}

	public void setLicense(char license) {
		this.license = license;
	}
	
	
}
