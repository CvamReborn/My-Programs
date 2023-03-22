import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Console;
public class InputtingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number1;
		System.out.print("Enter a number1: ");
		number1=sc.nextInt();
		System.out.println("number1: "+number1);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String number2;
		int number3;
		System.out.print("Enter a number2: ");
		try {
			number2=br.readLine();
			number3=Integer.parseInt(number2);
			System.out.println("number3: "+number3);
		}
		catch (IOException e){
			System.out.println("IO Exception has occured....");
		}
		/*String number4;//Eclipse does'nt support
		try {
		number4=System.console().readLine();
		System.out.println("number4: "+number4);
		}
		catch(NullPointerException eg)
		{
			System.out.print("Null Pointer Exception....");
		}*/
	
	}

}
