import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        selectionSortUsingRecursion(arr,0,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int index1,int index2,int[] arr)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void selectionSortUsingForLoop(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int minIndex=i;
            for(int j=i;j<arr.length;j++) minIndex=arr[minIndex]>arr[j]?j:minIndex;
            swap(minIndex,i,arr);
        }
    }
    public static void selectionSortUsingRecursion(int[] arr,int outerIndex,int innerIndex,int minIndex)
    {
        if(outerIndex==arr.length) return;
        if(innerIndex==arr.length)
        {
            swap(minIndex,outerIndex,arr);
            return;
        }
        minIndex=arr[minIndex]>arr[innerIndex]?innerIndex:minIndex;
        selectionSortUsingRecursion(arr,outerIndex,innerIndex+1,minIndex);
        selectionSortUsingRecursion(arr,outerIndex+1,outerIndex+1,outerIndex+1);
    }
}
