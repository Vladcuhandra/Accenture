package module8.activity;
//Needs to be completed
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//The following program throws a checked exception. 
public class SQLExceptionActivity {


	public static void main(String[] args) {
		SQLExceptionActivity obj = new SQLExceptionActivity();

		String url = "jdbc:mysql://localhost/activity1";
		String user = "root";
		String pass = "abcd1234";

		//The following code would not compile unless it's put inside a try catch
		//1 - put it in a try block and handle ClassNotFoundException

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established! \n");

			cn.close();
		}
		//2 - You also need to catch SQLException for it to compile
		catch (ClassNotFoundException expect) {
			//info for myself :-)
			//ClassNotFoundException is the exception class.
			//e is a variable that holds the exception object.
			System.out.println("MySQL JDBC Driver not found. Please include the JDBC driver in your library path.");
		}


		catch (SQLException e) {
			System.out.println("SQL Exception occurred while connecting to the database. Error message: " + e.getMessage());
		}
	}
}
