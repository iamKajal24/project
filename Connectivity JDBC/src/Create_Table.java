import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.Query;
import com.mysql.cj.jdbc.JdbcConnection;
import com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute;

public class Create_Table {
	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;

		String query ="CREATE TABLE Student ("
                + "id INT PRIMARY KEY AUTO_INCREMENT, "
                + "name VARCHAR(100), "
                + "age INT, "
                + "email VARCHAR(100)"
                + ")";

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kajaldb1", "root", "root");
			Statement stmt = conn.createStatement();
			//stmt.execute("Create Table student(rollno int(10) NOT NULL, Name varchar(20), Address varchar(50)");
            
			stmt.execute(query);
			
			// close connection
			stmt.close();
			conn.close();

			System.out.println("Table created successfully.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
