package javaProgramming;
//Using throws keyword in JAVA
public class ThrowsExample {

	static void Division()throws ArithmeticException
	{
		int number=4;
		number=number/0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Division();
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
			
		}

	}

}
