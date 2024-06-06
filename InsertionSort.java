import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        insertionSortUsingRecursion(arr,1,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int index1,int index2,int[] arr)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void insertionSortUsingForLoop(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0)
            {
                if(arr[j]<arr[j-1]) swap(j,j-1,arr);
                else break;
                j--;
            }
        }
    }
    public static void insertionSortUsingRecursion(int[] arr,int outerIndex,int innerIndex)
    {
        if(outerIndex==arr.length) return;
        if(innerIndex==0)
        {
            insertionSortUsingRecursion(arr,outerIndex+1,outerIndex+1);
            return;
        }
        if(arr[innerIndex]<arr[innerIndex-1]) swap(innerIndex,innerIndex-1,arr);
        insertionSortUsingRecursion(arr,outerIndex,innerIndex-1);
    }
}
