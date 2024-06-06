public class BinarySearchAlgo {
    public static void main(String[] args) {
     int[] arr=new int[]{1,2,3,4,5};
        System.out.println(binarySearch(0,arr.length-1,8,arr));
    }
    public static boolean binarySearch(int start,int end,int key,int[]arr)
    {
        int mid=(start+end)/2;
        if(start>end) return false;
        if(arr[mid]==key) return true;
        if(key>arr[mid])
        {
            return binarySearch(mid+1,end,key,arr);
        }
        else
        {
            return binarySearch(start,mid-1,key,arr);
        }
    }
}
