import java.io.*;
class StringEx extends Exception{
	StringEx(String message){
		super(message);
	}
}
public class StringDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		for(int i=0;i<10;i++) {
			try {
				if(i==5) {
					throw new StringEx("5 is wrong input");
				}
			}
			catch(StringEx e) {
				System.out.println("Exception Occured: "+e.getMessage());
			}
		}
		
	}

}
