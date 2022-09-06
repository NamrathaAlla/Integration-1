package ansh;

public class AnonymousArray {
	
	static void print(int ar[])
	  
	{
		for(int i = 0;i<ar.length;i++)
		
			System.out.println(ar[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print(new int[] {2,4,85,89});
	}

}
