import java.util.Scanner;
public class ThreeDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int row,col,m;
        System.out.print("Enter number of Row & Col: ");
        row=sc.nextInt();
        col=sc.nextInt();
        System.out.print("Enter the number of matrices: ");
        m=sc.nextInt();
        int arr2d[][]=new int[row][col];
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		arr2d[i][j]=0;
        	}
        }
        int arr3d[][][]=new int[m][row][col];
        for(int i=0;i<m;i++)
        {
        	System.out.println("Enter values of Matrix-"+(i+1)+":-");
        	for(int j=0;j<row;j++)
            {
            	for(int k=0;k<col;k++)
            	{
            		System.out.print("[Row-"+(j+1)+"][Col-"+(k+1)+"]= ");
            		arr3d[i][j][k]=sc.nextInt();
            	}
            	System.out.println();
        }
        	System.out.println();
	}
        System.out.println("*****Resultant Matrix******");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<row;j++)
            {
            	for(int k=0;k<col;k++)
            	{
            		arr2d[j][k]=arr2d[j][k]+arr3d[i][j][k];
            		
            	}
        }
	}
        for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++)
        	{
        		System.out.print(arr2d[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("***************************");

}
}
