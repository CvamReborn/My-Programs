public class StrongNumber {
    public static void main(String[] args) {
        int number=14;
        System.out.println(isStrongNumber(number));
    }
    public static int findFactorial(int number)
    {
        int fact=1;
        for(int i=1;i<=number;i++) fact=fact*i;
        return fact;
    }
    public static Boolean isStrongNumber(int number)
    {
        int temp=number;
        int result=0;
        while(temp>0)
        {
            result=result+findFactorial(temp%10);
            temp=temp/10;
        }
        return number==result;
    }
}
