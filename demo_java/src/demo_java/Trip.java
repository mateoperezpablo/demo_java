package demo_java;

import java.util.ArrayList;
import java.util.Date;

public class Trip {
	private long vehicle;
	private long driver;
	private Date date;
	
	public static ArrayList<Trip> getAll(){
		ArrayList<Trip> arr = TripCAD.getAll();
		
		return arr;
	}
	
	public Trip() {
	}
	
	public Trip(long vehicle, long driver, Date date) {
		this.vehicle = vehicle;
		this.driver = driver;
		this.date = date;
	}
	public long getVehicle() {
		return vehicle;
	}
	public void setVehicle(long vehicle) {
		this.vehicle = vehicle;
	}
	public long getDriver() {
		return driver;
	}
	public void setDriver(long driver) {
		this.driver = driver;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
