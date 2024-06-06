import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(canExpressedAsPrime(4));
    }
    public static Boolean canExpressedAsPrime(int number)
    {
        ArrayList<Integer> list=primeCalc(number);
        boolean flag=false;
        for(int i=0;i<list.size();i++)
        {
            int otherPair=number-list.get(i);
            if(list.contains(otherPair)) return true;
        }
        return flag;
    }
    public static boolean isPrime(int number)
    {
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number%2==0) return false;
        }
        return true;
    }
    public static ArrayList<Integer> primeCalc(int number)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=2;i<number;i++)
        {
            if(isPrime(i)) list.add(i);
        }
        return list;
    }

}
