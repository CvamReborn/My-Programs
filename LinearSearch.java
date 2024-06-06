import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearSearch {
    public static ArrayList<Integer> list;
    public static void main(String[] args) {
     int[]  arr=new int[]{1,2,4,7,8,7};
     int key=7;
        System.out.println(linearSearchThroughRecursionWithoutList(arr,0,key));
    }
    public static int linearSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key) return i;
        }
        return -1;
    }

    public static void linearSearchThroughRecursion(int[] arr, int i, int key,ArrayList<Integer> list)
    {
        if(i==arr.length) return;
        if( arr[i]==key) list.add(i);
        linearSearchThroughRecursion(arr,i+1,key,list);
    }
    public static ArrayList<Integer> linearSearchThroughRecursionWithoutList(int[] arr,int i,int key)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==arr.length) return list;
        if(arr[i]==key) list.add(i);
        list.addAll(linearSearchThroughRecursionWithoutList(arr,i+1,key));
        return list;
    }
}
