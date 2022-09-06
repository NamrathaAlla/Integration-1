package ansh;

public class ReturningArray {

	static int[] get()
	{
		
		return new int[] {10,23,43,54} ;
	}
	
	public static void main(String []args)
	{
		
		int arr[] = get();
		
		for(int i = 0;i<arr.length;i++)
			
			System.out.println(arr[i]);
	}

}
