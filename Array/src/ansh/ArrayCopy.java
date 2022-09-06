package ansh;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar1 = new int[] { 2,71,24 ,12,40};
		
		int ar2[] = new int[ar1.length];
		
		for(int i = 0;i<ar1.length;i++)
		{
			
			ar2[i] = ar1[i];
		}
		
		System.out.println("ELEMENTS IN ORIGINAL ARRAY : ");
		
		for(int i =0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		
		System.out.println();
		
		
		System.out.println("ELEMENTS OF NEW ARRAY : ");
		
		for(int i = 0;i<ar2.length;i++)
		{
			System.out.println(ar2[i]);
		}
	}

}
