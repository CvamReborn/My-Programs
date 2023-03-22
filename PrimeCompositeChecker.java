import java.util.Scanner;
public class PrimeCompositeChecker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number=sc.nextInt();
        if(number==1 || number==2)
        {
        	if(number==1)
        		System.out.println(">>1 is neither Prime nor Composite!");
        	else
        		System.out.println(">>2 is a Prime Number");
        }
        else
        {
        	for(int i=2;i<number;i++)
        	{
        		if(number%i==0)
        		{
        		    System.out.println(">>" + number + " is an Composite Number");
        			break;
        		}
        		else
        		{
        			if(i==number-1 && number%i!=0)
        		    {
        			    System.out.println(">>"+number+" is a Prime Number");
        		    }
        		}
        	}
        }
        
        	
	}

}
