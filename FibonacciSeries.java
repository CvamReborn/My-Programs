public class FibonacciSeries {
    public static void main(String[] args) {
        fiboCalc(5);
    }
    public static void fiboCalc(int n)
    {
        int firstTerm=0;
        int secondTerm=1;
        int sum=0;
        System.out.print("Fibonacci Series: ");
        System.out.print(firstTerm+" ");
        System.out.print(secondTerm+" ");
        for(int i=0;i<n;i++)
        {
            sum=firstTerm+secondTerm;
            System.out.print(sum+" ");
            firstTerm=secondTerm;
            secondTerm=sum;
        }
        System.out.println("End");
    }
}
