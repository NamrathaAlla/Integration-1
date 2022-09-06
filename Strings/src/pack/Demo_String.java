package pack;

public class Demo_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="ANSH";
		
		char ch[] = {'A','N','S','H'};
		
		String s2 = new String(ch);
		
		String s3 = new String("HANVITH");
		
		System.out.println(s);
		
		System.out.println(s2);
	
		System.out.println(s3);
	
	    s.concat("TEJANSH");
	    
	    System.out.println(s);
	    
	   // s = s3.concat(s);
	    System.out.println(s);
	    
	    System.out.println(s.equals(s2));
	    
	    String a = "nammu";
	    
	    String b ="NAMMU";
	    
	    System.out.println(a.equals(b));
     
	    System.out.println(a.equalsIgnoreCase(b));
	    
	    System.out.println(s == s2);
	    
	    String r = "Rinku";
	    
	    String t = "Rinku";
	    
	    String e = " Pinku";
	    
	    
	    System.out.println(r.compareTo(t));
	    
	    System.out.println(r.compareTo(e));
	    
	    System.out.println(r+e);
	    
	    System.out.println(r.concat(e));
	}

}
