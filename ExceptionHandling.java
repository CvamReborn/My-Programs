package javaProgramming;
import java.util.*;
//Program for Exception Handling
class MyException extends Exception
{
	MyException(String str)
	{
		super(str);
		
	}
}
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		try {
		System.out.println("Enter the age of the person: ");
		age=sc.nextInt();
		if(age<18)
		{
				throw new MyException("You are not eligible");
		}
		}
		catch(Exception e)
		{
			System.out.println("Caught my exception");
			System.out.println(e.getMessage());
		}
		
		
	}
}
