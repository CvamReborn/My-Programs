import java.util.*;
public class WaysToGetEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(evenResultWays(low,high,k));
    }
    public static int evenResultWays(int low,int high,int k)
    {
        return permutationCalculator(high-low+1,k);
    }
    public static int fact(int n)
    {
        if(n<=1) return 1;
        int res=1;
        for(int i=1;i<=n;i++)
        {
            res*=i;
        }
        return res;
    }
    public static int permutationCalculator(int total ,int selected)
    {
        if(total==selected) return fact(total);
        System.out.println("total:"+total+"and selected:"+ selected);
        int result=1;
        while(selected>0)
        {
            result=result*total;
            total--;
            selected--;
        }
        return result;
    }
}
