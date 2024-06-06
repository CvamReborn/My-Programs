public class PrintingNumber {
    public static void main(String[] args) {
        printIt(5);
    }
    public static void printIt(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printIt(n-1);
        System.out.print(n+" ");
    }
}
