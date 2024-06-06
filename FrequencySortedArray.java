import java.util.*;
public class FrequencySortedArray {
    public static void main(String[] args) {
        int[] arr=new int[]{9,9,9,2,2,2,2,5};
        ArrayList<Integer> list=frequencySorting(arr);
        System.out.println(list.toString());
    }
    public static ArrayList<Integer> frequencySorting (int[] arr) {
        //code
        ArrayList<Integer> list=new ArrayList<>();
        int removekey=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int element:arr) map.put(element,map.getOrDefault(element,0)+1);
        int large=Integer.MIN_VALUE;
        int mapLength=map.size();
        for(int j=0;j<mapLength;j++)
        {
            for(int key:map.keySet())
            {
                if(map.get(key)>large)
                {
                    large=map.get(key);
                    removekey=key;
                }
            }
            map.remove(removekey);
            for(int i=0;i<large;i++) list.add(removekey);
            large=Integer.MIN_VALUE;
        }
        return list;
    }
}
