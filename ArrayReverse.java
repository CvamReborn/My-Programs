//program to reverse the numbers in array
import java.util.Scanner;
public class ArrayReverse 
{
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		int n,j,temp,array[];
		System.out.println("enter the number of elements");
		n = obj.nextInt();
		array = new int[n];
		System.out.println("enter "+n+" numbers");
		for(int i=0;i<n;i++)
		{
			array[i]=obj.nextInt();
			
		}
		System.out.print("the array is ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		int i=0;
		while(i<n/2)
		{ 
			temp=array[i];
			array[i]=array[(n-1)-i];
			array[(n-1)-i]=temp;
			i++;
		}
		System.out.print("the reverse array is ");
		for(i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
			
		}
		
		
		
	}

}