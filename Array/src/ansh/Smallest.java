package ansh;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b[] = new int[] {71,2,24,40,12};
		
		int min = b[0];
		
		for(int j = 0; j<b.length;j++)
		{
			if(b[j] < min)
				
				min = b[j];
			
			  
				
				
		}
		System.out.println("SMALLEST NUMBER : "+min);
	}

}
