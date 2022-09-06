package ansh;

public class MinArray {

	static void min(int ar[])
	{
		
		int min = ar[0];
		
		for(int i = 1; i<ar.length;i++)
			
			if(min>ar[i])
				
				min = ar[i];
		System.out.println("MINIMUM ELEMENT IS : "+min);
	}
	public static void main(String []args) {
		
		int a[] = {21,15,26,9,11,5};
		
		min(a);
	}
}
