import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutoboxingDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		Integer number=0;
		int num=0;
		System.out.print("Enter a number: ");
		try {
			str=br.readLine();
			number=Integer.valueOf(str);//converting string to integer object
			num=number;//autoboxing
		}
		catch(IOException e){
			System.out.println("Exception Ocurred: "+e.getMessage());
		}
		finally {
			System.out.println(num);
		}

	}

}
