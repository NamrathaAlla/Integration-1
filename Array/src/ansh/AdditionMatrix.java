package ansh;

public class AdditionMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][] = {{15,26,27},{9,21,8},{2,8,4}};
		
		int B[][] = {{11,2,8},{20,23,6},{21,5,2}};
		
		int C[][] = new int[3][3];
		
		System.out.println("ADDITION OF TWO MATRICES : ");
		
		for(int i = 0;i<3;i++)
		{ 
			for(int j = 0;j<3;j++)
			{
				
				C[i][j] = A[i][j] + B[i][j];
				
				System.out.print(C[i][j]+" ");
			}
		System.out.println();
		
		
	}}

}
