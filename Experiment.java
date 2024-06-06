import java.util.*;

public class Experiment {
    public static void main(String[] args) {
        int[] arr =new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        rotateArr(arr,2,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int [] tempArr=new int[n];
        int j=0;
        for(int i=2;i<n;i++)
        {
            tempArr[j]=arr[i];
            j++;
        }
        for(int i=0;i<d;i++)
        {
            tempArr[j]=arr[i];
            j++;
        }
        for(int i=0;i<n;i++) arr[i]=tempArr[i];

    }
}
