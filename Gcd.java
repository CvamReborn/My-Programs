public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcdCalc(4,6));
        System.out.println(gcdUsingRecursion(4,6));
    }
    public static int gcdCalc(int number1,int number2) {
        int divisor=Math.min(number1, number2);
        int dividend=Math.max(number1,number2);
        while (divisor>0)
        {
            int rem=dividend%divisor;
            dividend=divisor;
            divisor=rem;
        }
        return dividend;
    }
    public static int gcdUsingRecursion(int number1,int number2)
    {
        if(number1==0) return number2;
        int rem=number2%number1;
        return gcdUsingRecursion(rem,number1);
    }
}
