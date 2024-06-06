public class EvenOrOddUsingBinary {
    public static void main(String[] args) {
        System.out.println(isOddOrEven(9));
    }
    public static String isOddOrEven(int number)
    {
        return (number & 1)==1?"Odd":"Even";
    }
}