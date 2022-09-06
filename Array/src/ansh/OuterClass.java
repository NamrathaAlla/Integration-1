package ansh;

public class OuterClass {

	private int i = 50;
	
	class Inner{
		
		void msg()
		{
			
			System.out.println("HELLO");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OuterClass oc = new OuterClass();
		
		OuterClass.Inner ob = oc.new Inner();
		
		ob.msg();
	}

}
