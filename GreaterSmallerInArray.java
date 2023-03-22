import java.util.Scanner;
public class GreaterSmallerInArray {

	static void findGreaterSmallerInArray(int arr[])
	{
		int large=arr[1],small=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(large<arr[i])
			{
				large=arr[i];
			}
			if(small>arr[i])
			{
				small=arr[i];
			}
		}
		System.out.println("Largest value: "+large);
		System.out.println("Smallest value: "+small);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int len;
        System.out.print("Enter the length of Array: ");
        len=sc.nextInt();
        int arr[]=new int[len];
        System.out.println("Enter values in Array:-");
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        findGreaterSmallerInArray(arr);
	}

}
