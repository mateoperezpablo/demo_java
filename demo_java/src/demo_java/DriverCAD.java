package demo_java;

import java.sql.*;
import java.util.ArrayList;

public class DriverCAD {
	public static int insert(Driver d) {
		Connection con = Utils.getCon();
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("INSERT INTO drivers (name, surename, license) VALUES ('"+ d.getName() +"', '"+ d.getSurename() +"', '"+ d.getLicense()+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static ArrayList<Driver> getAll(){
		ArrayList<Driver> arr = new ArrayList<Driver>();
		
		Connection con = Utils.getCon();
				
		Statement s;
		try {
			s = con.createStatement();
			ResultSet rs = s.executeQuery ("select * from drivers");
			while (rs.next())
			{
			    Driver d = new Driver();
			    d.setId(rs.getLong("id"));
			    d.setName(rs.getString("name"));
			    d.setSurename(rs.getString("surename"));
			    d.setLicense(rs.getString("license").charAt(0));
			    arr.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
			return arr;
		}
	
	public static int update(long id, Driver d) {
		Connection con = Utils.getCon();
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("UPDATE drivers SET name = ' " + d.getName() + " ', surename = '"+d.getSurename()+"', license = '"+d.getLicense()+"' where id = " + id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
	
	public static int erase(long id) {
		Connection con = Utils.getCon();
		
		Statement s;
		try {
			s = con.createStatement();
			return s.executeUpdate("DELETE FROM drivers WHERE id=" + id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}
}