import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        reverseArrayUsingRecursion(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseArrayUsingRecursion(int[] arr,int start,int end)
    {
        if(start>end) return;

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

        reverseArrayUsingRecursion(arr,start+1,end-1);
    }
}
