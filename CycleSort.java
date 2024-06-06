import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr={4,5,3,2,1};
        System.out.println(Arrays.toString(arr));
        cycleSortUsingRecursion(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int index1,int index2,int[] arr)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void cycleSort(int[] arr)
    {
        int i=0;
        while(i<arr.length) {
            if(arr[i]!=i+1) swap(i,arr[i]-1,arr);
            else i++;
        }
    }
    public static void cycleSortUsingRecursion(int[] arr,int index)//4,5,3,2,1    2,5,3,4,1    5,2,3,4,1    1,2,3,4,5
    {
        if(index==arr.length) return;
        if(arr[index]!=index+1) {
            swap(index,arr[index]-1,arr);
            cycleSortUsingRecursion(arr,index);
        }
        else{
            cycleSortUsingRecursion(arr,index+1);
        }
    }
}
