package ansh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		//STEP -1 ...
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("DRIVER LOADED...");
		
		//STEP - 2...
		
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/childinfo","root","Ansh");
		
		System.out.println("SUCCESSFULLY CONNECTED..");
		
		//STEP-3...
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("ENETER DETAILS : ");
		
		int id = s.nextInt();
		
		String name = s.next();
		
		int age = s.nextInt();
		
		
		PreparedStatement p = c.prepareStatement("INSERT INTO information VALUES(?,?,?)");
		
		
		
	    p.setInt(1, id);
		
		p.setString(2, name);
		
		p.setInt(3, age);
		
		
		
		//EXECUTION
		
		int i = p.executeUpdate();
		
		if(i>0)
			System.out.println("INSERTION COMPLETED");
		
		//RETRIEVING
		
		
		
		//Statement stmt=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);  
		
       PreparedStatement ps1 = c.prepareStatement("SELECT * FROM information");
        
		//ResultSet s1 = ((java.sql.Statement) c).executeQuery("SELECT * FROM informaation");
        
       PreparedStatement ps2= c.prepareStatement("DELETE FROM information WHERE age = 22");
        
        
        


        
        //ps2.executeUpdate();
        
       System.out.println("DATA IN INFORMATION TABLE : ");
        
       ResultSet rs =  ps1.executeQuery();
              		
		while(rs.next()) {
		
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
		}
		
		//RESULT SET META DATA
		
		
	}

	
	}

	
	


