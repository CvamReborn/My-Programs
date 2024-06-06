import java.util.HashSet;

public class SumOfTwoNumbersPrime {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,1,0,5};
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]<arr[j] && i<j) if(isPrime(arr[i]+arr[j])) set.add(arr[i]+arr[j]);
            }
        }
        System.out.println(set.toString());
        System.out.println(set.size());
    }
    public static boolean isPrime(int number)
    {
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number%i==0) return false;
        }
        return true;
    }
}
