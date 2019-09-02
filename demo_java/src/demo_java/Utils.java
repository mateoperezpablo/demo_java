package demo_java;
import java.sql.*;

public class Utils {
	public static Connection getCon() {
		try {
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/demojava","root","");
		return con;
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		return null;
	}
}
