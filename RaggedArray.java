import java.util.Scanner;
public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[][]=new int[5][];
		array[0]=new int[4];
		array[1]=new int[3];
		array[2]=new int[5];
	    array[3]=new int[7];
	    array[4]=new int[9];
	    for(int i=0;i<array.length;i++)
	    {
	    	for(int j=0;j<array[i].length;j++)
	    	{
	    		System.out.print("Array["+(i+1)+"]["+(j+1)+"]= ");
	    		array[i][j]=sc.nextInt();
	    	}
	    }
	    for(int i=0;i<array.length;i++)
	    {
	    	for(int j=0;j<array[i].length;j++)
	    	{
	    		System.out.print(array[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	}

}
