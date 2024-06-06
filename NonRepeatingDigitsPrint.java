import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class NonRepeatingDigitsPrint {

    public static void main(String[] args) {
        System.out.println(countOfNumbers(101,200));
    }
    public static int countOfNumbers(int first,int end)
    {
        int count=0;
        for(int i=first;i<=end;i++)
        {
            if(isRepeatedDigit(i)) count++;
        }
        return count;
    }
    public static boolean isRepeatedDigit(int number)
    {
        HashSet<Integer> set=new HashSet<>();
        while(number>0)
        {
            int digit=number%10;
            if(!set.add(digit)) return false;
            number=number/10;
        }
        return true;
    }
}
