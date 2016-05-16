package jdbconnectorp;
import java.sql.*;
public class Driver {
	public static void main(String[] args) {
			try {
				// create a connection to the DB
		Connection mycons = DriverManager.getConnection ("jdbc:mysql://mysql6.000webhost.com/DBName"
																		, "a8228650_TWbee", "Welcome9");
				// create a statement
// Create a table for 'BP00' users in the DB
// This should store the details: First_Name, Last_Name, Userid (unique), DOB, Gender, Contact_mob, Email_id, Location
// Create another table and store Passwords. Make User name a foreign key to this table.
		Statement mystmt = mycons.createStatement();
				// execute a sql query
		ResultSet myRs = mystmt.executeQuery("select * from BP00 where userid is not null");
				// process the result set
		while (myRs.next()){
			System.out.println(myRs.getString("last_name") + "," + "userid" + "first_name");
		}
			}
				catch (Exception exc) {
						exc.printStackTrace();
				}
	}
}