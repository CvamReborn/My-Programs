import java.util.*;

public class RemovingDuplicateNumbers {
    public static void main(String[] args) {
        int[] arr=new int[]{5,2,2,3,3,3};
        System.out.println(Arrays.toString(arr));
        int N=remove_duplicate(arr,arr.length);
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
    }
    static int remove_duplicate(int[] A, int N){
        // code here
        Set<Integer> set=new LinkedHashSet<>();
        for(int element:A)
        {
            set.add(element);
        }
        int i=0;
        System.out.println("set"+set.toString());
        for(int element:set)
        {
            A[i]=element;
            i++;
        }
        return i;
    }
}
