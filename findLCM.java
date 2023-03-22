import java.util.Scanner;
public class findLCM {

	private static int find(int arr[]) {
		int res1=5;
		for(int i=0;i<arr.length-1;i++)
		{
			int j=1;
			while(true)
			{
				if(j%arr[i]==0 && j%arr[i+1]==0)
				{
					res1=j;
					break;
				}
				j=j+1;
			}
			arr[i+1]=res1;
		}
		return res1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers LCM you want?: ");
		int total=sc.nextInt();
		int number[]=new int[total];
		for(int i=0;i<number.length;i++)
		{
			System.out.print("Number["+(i+1)+"]= ");
			number[i]=sc.nextInt();
		}
		System.out.println("LCM = "+(find(number)));
		sc.close();
	}

}
