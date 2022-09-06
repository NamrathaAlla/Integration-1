package ansh;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[] {2,24,71,12,40};
		
		int max = a[0];
		
		for (int i =0;i<a.length;i++)
		{
			if(a[i] >max)
				
				max = a[i];
				
		}
		
		System.out.println("LARGEST ELEMENT IS : "+max);
	}

}
