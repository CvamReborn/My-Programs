package javaProgramming;
import java.util.Scanner;
public class AdvanceMatrixAddtion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,row,col;
		System.out.println("Enter the number of matrix to add: ");
		number=sc.nextInt();
		System.out.println("Enter the row size and col size: ");
		row=sc.nextInt();
		col=sc.nextInt();
		Integer resultmatrix[][]=new Integer[row][col];
		Integer bigmatrix[][][]=new Integer[number][row][col];
		for(int i=0;i<number;i++)
		{
			System.out.println("Enter values in Matrix-"+(i+1)+": ");
			for(int j=0;j<row;j++)
			{
				for(int k=0;k<col;k++)
				{
					bigmatrix[i][j][k]=sc.nextInt();
					
				}
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				resultmatrix[i][j]=0;
			}
		}
		for(int i=0;i<number;i++)
		{
			for(int j=0;j<row;j++)
			{
				for(int k=0;k<col;k++)
				{
					resultmatrix[j][k]=resultmatrix[j][k]+bigmatrix[i][j][k];
					
				}
			}
		}
		System.out.println("Resultant Matrix:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(resultmatrix[i][j]+" ");
			}
			System.out.println("");
		}
		

	}

}
