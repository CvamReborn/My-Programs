import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class CountSort {
    public static void main(String[] args) {
        int[] arr={10,4,13,2,1};
        System.out.println(Arrays.toString(arr));
        countSortUsingTreeMap(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int findMaxValue(int[] arr)
    {
        int maxValue=arr[0];
        for(int element:arr) maxValue=Math.max(element,maxValue);
        return maxValue;
    }
    public static void countSortUsingArray(int[] arr)
    {
        int maxValue=findMaxValue(arr);
        int[] sortedArray=new int[maxValue+1];
        for (int element : arr) sortedArray[element] = sortedArray[element] + 1;
        int j=0;
        for(int i=0;i<sortedArray.length;i++)
        {
            if(sortedArray[i]!=0)
            {
                arr[j]=i;
                sortedArray[i]--;
                j++;
            }
            else continue;
        }
    }
    public static void countSortUsingTreeMap(int[] arr)
    {
        TreeMap<Integer, Integer> map=new TreeMap<>();
        for(int element:arr) map.put(element,map.getOrDefault(element,0)+1);
        int j=0;
        for(int key:map.keySet())
        {
            if(map.get(key)!=0)
            {
                arr[j]=key;
                j++;
                map.put(key,map.get(key)-1);
            }
            else continue;
        }

    }
    public static void countSortUsingMap(int[] arr)
    {
        int maxValue=findMaxValue(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int element:arr) map.put(element,map.getOrDefault(element,0)+1);
        int j=0;
        for(int i=0;i<=maxValue;i++)
        {
            if(map.containsKey(i))
            {
                if(map.get(i)!=0)
                {
                    arr[j]=i;
                    j++;
                    map.put(i,map.get(i)-1);
                }
                else continue;
            }
        }
    }
}
