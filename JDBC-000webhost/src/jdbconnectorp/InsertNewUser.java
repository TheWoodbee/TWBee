package jdbconnectorp;
import java.sql.*;
public class InsertNewUser {
	public static void main(String[] args) {
		try {
			// create connection to DB
		Connection mycons = DriverManager.getConnection("jdbc:mysql://mysql6.000webhost.com/DBName",
																			 "a8228650_TWbee" , "Welcome9");
			//Need to Update the table User as new registration has been triggered
		Statement mystmt = mycons.createStatement();
			// Write a sql statement in a static variable, Execute
		String sql = "insert into employee"
						+ "first_name, last_name, userid, DOB, gender, contact_mob, email_id, location"
						+ "values ('John', 'Smith', 'JSmith', '10/10/1980', '', 'testpollyhop@gmail.com', 'Dallas' )";
		mystmt.executeUpdate(sql);
		System.out.println("Welcome Aboard! User created successfully.");		
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
	}
}
