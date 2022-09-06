package ansh;

public class MatrixMuli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int b[][] = {{3,2,1},{6,5,4},{9,8,7}};
		
		int c[][] = new int[3][3];
		
		System.out.println("MATRIX MULTIPLICATION IS : ");
		
		for(int i =0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				c[i][j] = 0;
				
				for(int k =0;k<3;k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				
				System.out.print(c[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
