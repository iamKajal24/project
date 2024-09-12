import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class updateDb {
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;

		String query ="UPDATE Student SET name = 'kajal', age='25' ,email = 'kajal@example.com' WHERE id = '2'";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb1", "root", "root");
			Statement stmt = conn.createStatement();
			//stmt.execute("Create Table student(rollno int(10) NOT NULL, Name varchar(20), Address varchar(50)");
            
			stmt.execute(query);
			
			// close connection
			stmt.close();
			conn.close();

			System.out.println("Student Record Successfully Updated.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
