import java.util.Scanner;
public class UltimateGCD {

	private static int calcHcf(int arr[])
	{
		int rem1,res=-1,dividend,divisor;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				dividend=arr[i];
				divisor=arr[i+1];
			}
			else {
				dividend=arr[i+1];
				divisor=arr[i];
			}
			do {
				rem1=dividend%divisor;
				dividend=divisor;
				divisor=rem1;
				res=dividend;
			}while(rem1!=0);
			arr[i+1]=res;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int element;
		System.out.print("Enter total number: ");
		element=sc.nextInt();
		int numbers[]=new int[element];
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print("Number["+(i+1)+"]= ");
			numbers[i]=sc.nextInt();
		}
		System.out.println("HCF = "+calcHcf(numbers));

	}

}
