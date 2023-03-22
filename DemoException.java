//Implementation of throws keyword
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DemoException {

	private static String inputMessage() throws IOException {
		String message;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Message: ");
		message=br.readLine();
		return message;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message="";
		try {
			message=inputMessage();
		}
		catch(IOException e)
		{
			System.out.println("Exception has occured....");
		}
		finally {
			System.out.println(message);
		}

	}

}
