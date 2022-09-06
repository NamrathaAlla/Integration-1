package ansh;

public class MaxArray {

	static void max(int ar[])
	{
		int max = ar[0];
		
		for(int i = 1; i<ar.length;i++)
			
			if(max<ar[i])
				
				max = ar[i];
		
		System.out.println("MAX ELEMENT IS : "+ max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {71,24,2,12,40};
		
		max(a);
	}

}
