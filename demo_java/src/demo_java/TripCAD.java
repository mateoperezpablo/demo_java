package demo_java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class TripCAD {
	public static ArrayList<Trip> getAll(){
		ArrayList<Trip> arr = new ArrayList<Trip>();
		
		Connection con = Utils.getCon();
				
		Statement s;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("select * from trips");
			while (rs.next())
			{
				Trip t = new Trip();
			    t.setVehicle(rs.getLong("vehicle"));
			    t.setDriver(rs.getLong("driver"));
			    t.setDate(rs.getDate("date"));
			    arr.add(t);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			return arr;
		}
	
	public static int insert(Trip t) {
		Connection con = Utils.getCon();
		Statement s;
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		
		String sd = formatter.format(t.getDate());
		
		try {
			s = con.createStatement();
			return s.executeUpdate("INSERT INTO trips (vehicle, driver, date) VALUES ('"+ t.getVehicle() +"', '"+ t.getDriver() +"', '"+ sd +"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}
