package pack;

public class TestEquals2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ANSH";
		
		String s2 = "ANSH";
		
		String s3 = new String("ANSH");
		
		String s4 = "TEJ";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
	}

}
