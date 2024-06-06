import java.util.*;
public class RotateTheArray {
    public static void main(String args[]) {
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(rotateArray(arr,1)));
    }
    public static int[] rotateArray(int[] arr,int k)
    {
        int[] rotatedArray=new int[arr.length];
        k=k%arr.length;
        for(int i=0;i<arr.length;i++)
        {
            rotatedArray[(i+k)%arr.length]=arr[i];
        }
        return rotatedArray;
    }
}
