public class PatternProblems {
    public static void main(String[] args) {
        //printPattern(5);
        //printPatternUsingRecursion(0,0,5);
        printUpwardPatternUsingRecursion(5,0);
        //printPatternUsingRecursion(0,0,5);
    }
    public static void printUpwardPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }
    public static void printUpwardPatternUsingRecursion(int row,int col)
    {
        if(row==0) return;
        if(col<row)
        {
            printUpwardPatternUsingRecursion(row,col+1);
            System.out.print("* ");
        }
        else{
            printUpwardPatternUsingRecursion(row-1,0);
            System.out.println();
        }
    }
    public static void printDownwardPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printDownwardPatternUsingRecursion(int row,int col)
    {
        if(row==0) return;
        if(col<row)
        {
            System.out.print("* ");
            printUpwardPatternUsingRecursion(row,col+1);
        }
        else{
            System.out.println();
            printUpwardPatternUsingRecursion(row-1,0);
        }
    }
}
