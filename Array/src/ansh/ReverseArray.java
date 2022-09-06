package ansh;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = new int[] {2,12,24,40,71};
		
		System.out.println("ORIGINAL ARRAY : ");
		
		for(int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("REVERSE ARRAY : ");
		
		for(int i = ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}

}
