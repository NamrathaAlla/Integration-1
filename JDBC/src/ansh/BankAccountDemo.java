package ansh;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BankException extends Exception
{
	public BankException(String str)
	{
		super(str);
	}
}

public class BankAccountDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
        //STEP : 1..
		
		
		//STEP-2:
		
			/*Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("LOADED");
			Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Ansh");
			
			System.out.println("CONNECTED..");
			
			PreparedStatement ps = c1.prepareStatement("INSERT INTO accountholder1 VALUES(100,'ANSH',2021,1005,3000)");
			
			ps.executeUpdate();
			
			PreparedStatement ps1 = c1.prepareStatement("INSERT INTO accountholder1 VALUES(102,'HANVITH',2017,67890,3000)");
			
			ps1.executeUpdate();
			
			System.out.println("INSERTED..");*/	
		    
		
			      Scanner s = new Scanner(System.in);
			   
		    	  System.out.println("******WELCOME******");
		  		while(true) {
		    	  System.out.println(" 1.WITHDRAW   2.DEPOSIT  3.BALANCE  4.EXIT ");
		  		
		        System.out.println("PLEASE CHOOSE AN OPTION : ");
		        
		        int option = s.nextInt();
	             
//		        switch(option) 
//		        {
//		        case : 1
//		            //  PreparedStatement get_bal = c.prepare  
//		        }
	}}

}
