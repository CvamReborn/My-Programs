import java.util.*;
public class TravellingCostCalculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int n=sc.nextInt();
        int r2=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(calculateCost(r1,n,r2,x));
    }
    public static int calculateCost(int r1,int n,int r2,int x)
    {
        int inHours=(int) Math.ceil (x / 60.0);
        System.out.println(inHours);
        if(inHours>n){
            int sum=n*r1;
            sum=sum+((inHours-n)*r2);
            return sum;
        }
        return r1*inHours;
    }
}
