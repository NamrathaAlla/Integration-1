package ansh;
import java.util.*;
import java.sql.*;
class DibbiException extends Exception{
	public DibbiException(String str) {
		super(str);
	}
	
}

public class DabbaBank { 
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("DRIVER LOADED...");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dabbabank","root","Ansh");
	System.out.println("CONNECTION ESTABLISHED...");
	//PreparedStatement ps = con.prepareStatement("insert into personinfo1 values(1,'nammu',12345,'nammu@123',10000)");
	//ps.executeUpdate();
	//System.out.println("INSERTED");
//    PreparedStatement ps1 = con.prepareStatement("insert into personinfo1 values(2,'ansh',67890,'ansh@123',10000)");
//    ps1.executeUpdate();
//    System.out.println("INSERTED");
//    con.close();
	int flag = 1;
	int tempBal =0;
	char Read; 
//	
	
	
	
	
	
    int tempPswd=0;
	System.out.println("******************");
	
	while(flag==1)
	{
		System.out.println("WELCOME TO DABBA BANK");
		System.out.println("PLEASE SELECT THE FOLLOWING OPTIONS...");
		System.out.println("1.WITHDRAW");
		System.out.println("2.DEPOSIT");
		System.out.println("3.BALANCE");
		System.out.println("4.TRANSFER");
		System.out.println("5.EXIT");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		System.out.println("***PROCESSING***");
		switch(x)
		{
		case 1:
			System.out.println("Enter amount  to withdraw:");
		   int	withdrawlamount=input.nextInt();
			input.close();
			Statement PS_getBal = con.createStatement();
			ResultSet rs = PS_getBal.executeQuery("select Balance from personinfo1 where ACCOUNT_ID = 1");
			while(rs.next()) {
				tempBal=rs.getInt(1);
			}		
		    try {
		    	 if(withdrawlamount<tempBal)
		    	 { 
		    		 System.out.println("YOUR WITHDRAWL AMOUNT RS."+withdrawlamount);
		    		 PreparedStatement Ps_update = con.prepareStatement("update personinfo1 set Balance=?-? where ACCOUNT_ID=1");
		    		 Ps_update.setInt(1,tempBal);
		    		 Ps_update.setInt(2,withdrawlamount);
		    		 Ps_update.executeUpdate();	 
		    	 }
		    	 else
		    		 throw new DibbiException("Insufficient Balance.");
		    }
		    catch (DibbiException ex) {
	     
	            System.out.println(ex.getMessage());
		    }
		    break;
		case 2:
			System.out.println("ENTER AMOUNT TO DEPOSIT:");
			int Deposit=input.nextInt();
			input.close();
		    try {
		    	 
		    	 if(Deposit<100)
		    	 	throw new DibbiException("Amount is less than 100,PLEASE ENTER MORE THAN 100!");
		    	 else
		    		{
		    		 System.out.println("Rs:"+Deposit+" is deposited");
		    		 PreparedStatement Ps_update = con.prepareStatement("update personinfo1  set Balance=Balance+? where  ACCOUNT_ID=1");
		    		 Ps_update.setInt(1,Deposit);
		    		 Ps_update.executeUpdate();	 
		    		}
		    }
		    catch (DibbiException ex) {
	     
	            System.out.println(ex.getMessage());
		    }
		    break;
		case 3:
			System.out.println("Please enter your password:");
			int password=input.nextInt();
			input.close();
			Statement PS_getPswd = con.createStatement();
			ResultSet rs2 = PS_getPswd.executeQuery("select PASSWORD from personinfo1 where ACCOUNT_ID=1 = 1");
			while(rs2.next()) {
				tempPswd=rs2.getInt(1);
			}
		    try {
		    	 if(password==tempPswd)
		    		{
		    		 Statement PS_getBal2 = con.createStatement();
		 			 ResultSet rs3 = PS_getBal2.executeQuery("select Balance from personinfo1 where  ACCOUNT_ID=1 = 1");
		 			 while(rs3.next()) {
		 				tempBal=rs3.getInt(1);
		 			}
		    		 System.out.println("your account balance is:"+tempBal);
		    		}
		    	 else
		    		throw new DibbiException("Wrong password!");
		    }
		    catch (DibbiException ex) {
	     
	            System.out.println(ex.getMessage());
		    }	
		    break;
//		case 4:
//			
//				System.out.println("Enter Your Account Number:");
//				int Acn_num =input.nextInt();   
//				System.out.println("Enter  recipient account number to transfer:");
//				int r_acc_no = input.nextInt();
//				Statement PS_getAcn = con.createStatement();
//				ResultSet rs4 = PS_getAcn.executeQuery("select Account_no,name from users");
//				try {
//					while(rs4.next())
//					{       
//						//System.out.println("Hello");
//					    	if(r_acc_no==rs4.getInt("Account_no")) 
//					    	{   
//					    		
//					    		 System.out.println(rs4.getString("name"));
//					    		System.out.println("Did you like to transfer Money to "+ rs4.getString("name")+ ":Y/N");
//							    Read = input.next().charAt(0);
//							    if(Read=='y')
//							    {
//						    	System.out.println("Enter amount to transfer:");
//						    	int Tf_amnt = input.nextInt();
//						    	System.out.println("Amount transferred Succesfully!");
//						    	PreparedStatement Ps_update = con.prepareStatement("update users set Balance=Balance+? where Account_No=?");
//					    		Ps_update.setInt(1,Tf_amnt);
//					    		Ps_update.setInt(2,Racn);
//					    		Ps_update.executeUpdate();	 
//					    		PreparedStatement Ps_update1 = con.prepareStatement("update users set Balance=Balance-? where Account_No=?");
//					    		Ps_update1.setInt(1,Tf_amnt);
//					    		Ps_update1.setInt(2,your_Acn);
////					    		Ps_update.executeUpdate();
////						       }
////						}
////						else
////							throw new DibbiException("Invalid Account Number!");
////				}
////				
////				}
////				catch (DibbiException ex) {
////				     
////			            System.out.println(ex.getMessage());
////				  }	
////			break;
////		case 5:
////			System.out.println("Thankyou for visiting Dabbabank");
////			flag=0;
////			break;
//			
//		}
//		
//		//input.close();
//		System.out.println("******************");
}
	

	}

}}