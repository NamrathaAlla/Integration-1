package ansh;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y[] = new int[] {2,6,9,33,24};
		
		int sum = 0;
		
		for(int x = 0;x<y.length;x++)
		{
			sum = sum + y[x];
			
							
		}
		
		System.out.println("SUM OF ELEMENTS : "+sum);
	}

}
