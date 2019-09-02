package demo_java;

import java.sql.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class VehicleCAD {
	public static int insert(Vehicle v) {
		Connection con = Utils.getCon();
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("INSERT INTO vehicles (model, brand, plate, license) VALUES ('"+ v.getModel() +"', '"+ v.getBrand() +"', '"+ v.getPlate() +"', '"+ v.getLicenseRequired()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static ArrayList<Vehicle> getAll(){
	ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
	
	Connection con = Utils.getCon();
			
	Statement s;
	try {
		s = con.createStatement();
		ResultSet rs = s.executeQuery ("select * from vehicles");
		while (rs.next())
		{
		    Vehicle v = new Vehicle();
		    v.setId(rs.getLong("id"));
		    v.setModel(rs.getString("model"));
		    v.setBrand(rs.getString("brand"));
		    v.setPlate(rs.getString("plate"));
		    v.setLicenseRequired(rs.getString("license").charAt(0));
		    arr.add(v);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			
		return arr;
	}
	
	public static ArrayList<Vehicle> getNotInDate(Date d){
		ArrayList<Vehicle> arr = new ArrayList<Vehicle>();
		
		Connection con = Utils.getCon();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		String sd = formatter.format(d);
				
		Statement s;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("SELECT DISTINCT id,brand,model,plate,license FROM trips INNER JOIN vehicles ON trips.vehicle = vehicles.id AND NOT trips.date = '" + sd + "'");
			while (rs.next())
			{
			    Vehicle v = new Vehicle();
			    v.setId(rs.getLong("id"));
			    v.setModel(rs.getString("model"));
			    v.setBrand(rs.getString("brand"));
			    v.setPlate(rs.getString("plate"));
			    v.setLicenseRequired(rs.getString("license").charAt(0));
			    arr.add(v);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			return arr;
		}
	
	public static int erase(long id) {
		Connection con = Utils.getCon();
		
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("DELETE FROM vehicles WHERE id=" + id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int update(long id, Vehicle v) {
		Connection con = Utils.getCon();
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("UPDATE vehicles SET brand = ' " + v.getBrand() + " ', model = '"+v.getModel()+"', plate = '"+v.getPlate()+"', license = '"+v.getLicenseRequired()+"' where id = " + id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
