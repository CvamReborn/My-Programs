import java.util.Scanner;
public class PerfectNumber {
private static int findPerfect(int number) {
	int sum=0,temp=number;
	for(int i=1;i<temp;i++)
	{
		if(number%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==number)
		return 1;
	else
		return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number,res;
		System.out.print("Enter a number: ");
		number=sc.nextInt();
		res=findPerfect(number);
        if(res==1)
        	System.out.print(number+" is a Perfect Number");
        else if(res==0)
        System.out.print(number+" is not a perfect Number");
	}

}
