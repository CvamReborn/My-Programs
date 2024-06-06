import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,4,3,2,1};
        arr=mergeSorting(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] merge(int[] left,int[] right)
    {
        int[] mix=new int[left.length+right.length];
        int i=0;
        int j=0;
        int m=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                mix[m]=left[i];
                i++;
            }
            else
            {
                mix[m]=right[j];
                j++;
            }
            m++;
        }
        while(i<left.length)
        {
            mix[m]=left[i];
            i++;
            m++;
        }
        while(j<right.length)
        {
            mix[m]=right[j];
            j++;
            m++;
        }
        return mix;
    }
    public static int[] mergeSorting(int[] arr)
    {
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=mergeSorting(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSorting(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
}
