import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int row,col;
        System.out.print("Enter [row][col]: ");
        row=sc.nextInt();
        col=sc.nextInt();
        int arr[][]=new int [row][col];
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print("[Row-"+(i+1)+"][Col-"+(j+1)+"]= ");
        		arr[i][j]=sc.nextInt();
        	}
        }
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
