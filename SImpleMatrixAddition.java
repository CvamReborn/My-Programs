package javaProgramming;
import java.util.Scanner;
public class SImpleMatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row1,row2,col1,col2;
		System.out.println("Enter number of rows and columns for Matrix1:");
		row1=sc.nextInt();
		col1=sc.nextInt();
		System.out.println("Enter number of rows and columns for Matrix2:");
		row2=sc.nextInt();
		col2=sc.nextInt();
		if(row1!=row2 && col1!=col2)
		{
			System.out.println("Please enter same rows and columns");
		}
		else
		{
			int arr1[][]=new int[row1][col1];
			int arr2[][]=new int[row2][col2];
			System.out.println("Enter the values in Matrix-1:-");
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					arr1[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the values in Matrix-2:-");
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					arr2[i][j]=sc.nextInt();
				}
			}
			//Matrix Addition
			System.out.println("Result of the Additon(Matrix-3:-)");
			int arr3[][]=new int[row1][col1];
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					arr3[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println("");
				
			}
		}
		

	}

}
