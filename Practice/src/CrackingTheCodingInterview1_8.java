import java.util.Scanner;

/**
 * 
 */

/**
 * @author faraz
 *
 */
public class CrackingTheCodingInterview1_8 {

	
	public static void main(String[] args) {
		int n=4,m=3;
		int[][] matrix=new int[m][n];
		int[] row=new int[m];
		int[] col=new int[n];
		for(int i=0;i<n;i++)
			col[i]=1;
		for(int i=0;i<m;i++)
			row[i]=1;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(matrix[i][j]==0)
				{
					row[i]=0;
					col[j]=0;
				}
			}
		}
	
		for(int i=0;i<n;i++)
		{
			if(col[i]==0)
			{
				for(int j=0;j<m;j++)
				{
					matrix[j][i]=0;
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<m;i++)
			if(row[i]==0)
			{
				for(int j=0;j<n;j++)
				{
					matrix[i][j]=0;
				}
			}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
