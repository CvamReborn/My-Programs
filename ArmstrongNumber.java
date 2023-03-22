import java.util.Scanner;
public class ArmstrongNumber {

	static int pow(int n,int p)
{
	int res=1;
	for(int i=0;i<p;i++)
	{
		res=res*n;
	}
	return res;
}
	static int checkArmstrong(int number)
{
	int rem,result=0,temp=number;
	int count=0;
	while(temp>0)
	{
		temp=temp/10;
		count++;
	}
	temp=number;
	while(temp>0)
	{
		rem=temp%10;
		result=result+pow(rem,count);
		temp=temp/10;
	}
	if(number==result)
		return 1;
	else
		return 0;
}
	public static void main(String agrs[])
	{
		Scanner sc=new Scanner(System.in);
		int number,res;
		System.out.print("Enter a number: ");
		number=sc.nextInt();
		res=checkArmstrong(number);
		if(res==1)
			System.out.println(number+" is Armstrong");
		else
			System.out.println(number+" is not an Armstrong");
	}
}
