import java.util.Scanner;
public class ArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str[]=new String[3];
		for(int i=0;i<str.length;i++)
		{
			System.out.print("[String val-"+(i+1)+"]= ");
			str[i]=sc.next();
		}
		for(String i:str)
		{
			System.out.print(i+" ");
		}

	}

}
