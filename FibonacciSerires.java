public class FibonacciSerires {
    public static void main(String[] args) {
        findFibonacciSeries(10);
    }
    public static void findFibonacciSeries(int n)
    {
        System.out.print("0 1 ");
        findFibonacciSeriesCalc(0,1,0,n-2);
    }
    private static void findFibonacciSeriesCalc(int firstNumber,int secondNumber,int i,int n)
    {
        if(i==n) return;
        int sum=firstNumber+secondNumber;
        System.out.print(sum+" ");
        findFibonacciSeriesCalc(secondNumber,sum,i+1,n);
    }
}
