package javaProgramming;
import java.util.Scanner;
//Creating multiple catch statement
public class MultiCatchStatement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=0;
		try
		{
			number=number/0;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
