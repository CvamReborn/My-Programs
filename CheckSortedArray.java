import java.util.*;
public class CheckSortedArray {
    public static void main(String[] args) {
      int[] arr=new int[]{1,1,1,0};
        System.out.println(Arrays.toString(arr));
        System.out.println(isSortedThroughRecursion(arr,0));
    }
    public static boolean isSorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]) return false;

        }
        return true;
    }
    public static boolean isSortedThroughRecursion(int[] arr,int i)
    {
        if(i==arr.length-1) return true;
        return isSortedThroughRecursion(arr,i+1) && arr[i]>arr[i+1];
    }

}
