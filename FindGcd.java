import java.util.Scanner;
public class FindGcd {

	private static int findGCD(int number1,int number2) {
		int dividend,divisor,rem;
		if(number1>number2)
		{
			dividend=number1;
			divisor=number2;
		}
		else
		{
			dividend=number2;
			divisor=number1;
		}
		do
		{
			rem=dividend%divisor;
			dividend=divisor;
			divisor=rem;
		}while(rem!=0);
			return dividend;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1,number2;
		System.out.println(">>Enter two numbers: ");
        number1=sc.nextInt();
        number2=sc.nextInt();
        System.out.println("GCD of "+number1+" and "+number2+" is "+findGCD(number1,number2));
	}

}
