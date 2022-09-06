package ansh;

import java.sql.*;

public class DataBaseDemo {

	public static void main(String[] args) throws ClassNotFoundException{
		// TODO Auto-generated method stub
       //LOAD THE FILLE
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("SUCCESSFULLY LOADED");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			}

}
