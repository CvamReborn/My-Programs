public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNum(1514));
    }
    public static int reverseNum(int number)
    {
        if(number<10) return number;
        int singleDigit=number%10;
        return (singleDigit*(int)Math.pow(10,digitCount(number)-1))+reverseNum(number/10);
    }
    public static int digitCount(int number)
    {
        int count=0;
        while(number>0)
        {
            number=number/10;
            count++;
        }
        return count;
    }
}
