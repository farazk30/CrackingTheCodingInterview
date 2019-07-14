import java.util.Scanner;

/**
 * 
 */

/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview1_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n=4;
		int[][] matrix=new int[n][n];	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int layer=0;layer<n/2;layer++)
		{
			int first=layer;
			int last=n-1-layer;
			for(int i=first;i<last;i++)
			{
				int offset=i-first;
				int top=matrix[first][i];// save top
				matrix[first][i]=matrix[last-offset][first];//left->top
				matrix[last-offset][first]=matrix[last][last-offset];//bottom->left
				matrix[last][last-offset]=matrix[i][last];//right->bottom
				matrix[i][last]=top;//saved top->right
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
