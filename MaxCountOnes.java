import java.util.Arrays;

public class MaxCountOnes {
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,1,0,1,1,1,0};
        StringBuffer sb=new StringBuffer();
        for(int digit:arr)
        {
            if(digit==0) sb.append(" ");
            else sb.append(digit);
        }
        maxCount(sb.toString());
    }
    public static void maxCount(String s)
    {
        String[] str=s.trim().split(" ");
        System.out.println(Arrays.toString(str));
    }
}
