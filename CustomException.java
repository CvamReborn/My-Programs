//Implementation of Custom Exception(throw keyword)
import java.util.Scanner;
import java.lang.Exception;
class MyException extends Exception{
	MyException(String s)
	{
		super(s);
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter Your Age: ");
		try {
			age=sc.nextInt();
			if(age<18)
			{
				throw new MyException("Person is not ADULT....");
			}
		}
		catch(MyException eg) {
			System.out.println("Exception: "+eg.getMessage());
		}
		finally {
			System.out.println("This block will always get executed!!");
		}

	}

}
