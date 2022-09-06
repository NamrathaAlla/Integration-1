package ansh;

import java.util.Scanner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionEstablishing {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
       //STEP - 1 : LOAD DRIVER
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("DRIVER LOADED SUCCESSFULLY");
		try {
			//STEP - 2 : CONNECTION
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","Ansh");
			
			System.out.println("CONNECTED..");
			
			//STEP - 3 : STATEMENT CREATION
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("ENTER DETAILS : ");
			
			int id = sc.nextInt();
			
			String name = sc.next();
			
			String city = sc.next();
			
			
			
			PreparedStatement ps = c.prepareStatement("INSERT INTO  person values (?,?,?)");
			
			ps.setInt(1, id);
			
			ps.setString(2, name);
			
			ps.setString(3, city);
			//STEP - 4:EXECUTE STATEMENT
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("INSERTION COMPLETED");
			}
			else
			{
				System.out.println("NOT INSERTED");
			}
			
			//STEP - 5 : CLOSE 
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
