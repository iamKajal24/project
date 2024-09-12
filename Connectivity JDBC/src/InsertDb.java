import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDb {
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;

		String query ="INSERT INTO Student (name, age, email) VALUES "
                + "('John Doe', 20, 'john.doe@example.com'), "
                + "('Jane Smith', 22, 'jane.smith@example.com')";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb1", "root", "root");
			Statement stmt = conn.createStatement();
			//stmt.execute("Create Table student(rollno int(10) NOT NULL, Name varchar(20), Address varchar(50)");
            
			stmt.execute(query);
			
			// close connection
			stmt.close();
			conn.close();

			System.out.println("Record inserted Successfully.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
