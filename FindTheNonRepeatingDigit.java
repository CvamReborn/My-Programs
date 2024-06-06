import java.util.HashMap;
import java.util.*;

public class FindTheNonRepeatingDigit {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,7,2,2,4,6,7,5,0,0,6,19};
        //System.out.println(findUniqueUsingBitwiseOp(arr));
        System.out.println(findUniqueElementUsingSort(arr));
    }
    public static int findUniqueElementUsingSort(int[] arr)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]) i++;
            else return arr[i];
        }
        return arr[arr.length-1];
    }
    public static int findUniqueUsingBitwiseOp(int[] arr)
    {
        int unique=0;
        for(int element:arr)
        {
            unique^=element;
        }
        return unique;

    }
    public static int findTheUniqueElement(int[] arr)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element:arr) map.put(element,map.getOrDefault(element,0)+1);
        for(int element:map.keySet()) if(map.get(element)==1) return element;
        return 0;
    }
}
