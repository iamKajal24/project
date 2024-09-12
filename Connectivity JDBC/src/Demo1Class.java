import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * 1. import---java.sql
 * 2. load and register the Driver
 * 3. Create connection---connection
 * 4. create a statement---statement
 * 5. execute the query
 * 6. process the result
 * 7. close
 */

public class Demo1Class {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
//		String url="jdbc:mysql://localhost:3306/Customers";
//		String username="root";
//		String password="root";
//		String query="select * from Customers where Cust_ID=101; ";
//		
//		Class.forName("com.mysql.jdbc.Driver");//for class
//		 Connection con = DriverManager.getConnection(url,username,password);
//		 Statement st = con.createStatement();
//		 ResultSet rs =st.executeQuery(query);
//		 
//		 rs.next();
//		 String name=rs.getString(username);
//		 System.out.println(name);
//		 
//		 st.close();
//		 con.close();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.
				getConnection("jdbc:mysql://localhost:3306/kajaldb1","root","root");
		
		//System.out.println("connection created :");
		if(con !=null) {
			System.out.println("Successfully connected. ");
		}
		else {
			System.out.println("Failed to connect. ");
		}
		
		con.close();
	}
}
