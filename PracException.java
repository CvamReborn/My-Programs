//Implementation of try,catch and finally keyword
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class PracException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String message;
		int number=0;
		System.out.println("Enter a number: ");
		try {
			message=br.readLine();
			number=Integer.parseInt(message);
		}
		catch(IOException eg)
		{
			System.out.println("Exception Occured: "+eg.getMessage());
		}
		finally {
			System.out.println("Value of number: "+(number++));
		}
		
	}

}
