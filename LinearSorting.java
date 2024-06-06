import java.util.*;
public class LinearSorting {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        //selectionSortUsingRecursion(arr,4,0,0,arr[0]);
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSortUsingRecursion(int[] arr,int row,int col,int minIndex)
    {

    }
    public static void bubbleSortUsingRecursion(int[] arr,int row,int col)
    {
        if(row==0) return;
        if(col<row)
        {
            if(arr[col]>arr[col+1])
            {
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSortUsingRecursion(arr,row,col+1);
        }
        else bubbleSortUsingRecursion(arr,row-1,0);
    }
    public static void cycleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==i+1)
                continue;
            else
            {
                int temp=arr[arr[i]-1];
                arr[arr[i]-1]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        int j=1;
        int i=0;
        while(i<=arr.length-2)
        {
            j=i+1;
            while(j>0)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else break;
                j--;
            }
            i++;
        }
    }
    public static void selectionSort(int[] arr)
    {
        int large=arr[0];
        int largeIndex=0;
        for(int i = 0;i<arr.length; i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
               if(large<arr[j]) {
                   largeIndex = j;
                   large=Math.max(large,arr[j]);
               }
            }
            int temp=arr[largeIndex];
            arr[largeIndex]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
            largeIndex=0;
            large=arr[0];
        }
    }
    public static void bubbleSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
