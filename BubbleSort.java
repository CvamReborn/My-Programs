import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        bubbleSortUsingRecursion(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSortUsingMyTrick(int outerIndex,int innerIndex,int[] arr)
    {
        if(outerIndex==arr.length) return;
        if(innerIndex==arr.length-1) bubbleSortUsingMyTrick(outerIndex+1,0,arr);
        else{
        if(arr[innerIndex]>arr[innerIndex+1]) swap(innerIndex,innerIndex+1,arr);
        bubbleSortUsingMyTrick(outerIndex,innerIndex+1,arr);}
    }
    public static void bubbleSortUsingForLoop(int[] arr)
    {
        boolean sorted=false;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(j,j+1,arr);
                    sorted=true;
                }
            }
            if(!sorted) return;
        }
    }
    public static void swap(int index1,int index2,int[] arr)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void bubbleSortUsingRecursion(int[] arr,int row,int col)
    {
        if(row==0) return;
        if(col<row) {
            if (arr[col] > arr[col + 1]) swap(col, col + 1, arr);
            bubbleSortUsingRecursion(arr, row, col + 1);
        }
        else bubbleSortUsingRecursion(arr,row-1,0);
    }
}
