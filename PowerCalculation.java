public class PowerCalculation {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));
    }
    public static int powerCalc(int number,int power)
    {
        if(power==1) return number;
        return number*powerCalc(number,power-1);
    }
    public static double myPow(double x, int n) {
        //return Math.pow(x,n);
        if(n==0) return 1.0;
        if(n>0) return x*myPow(x,n-1);
        else return (1/x) *myPow(1/x,n+1);
    }
}
