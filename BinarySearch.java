public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println(binarySearching(arr,100,0,arr.length-1));
    }
    public static int binarySearching(int[] arr,int key,int start,int end)
    {
        if(start>end) return -1;
        int mid=(start+end)/2;
        if(arr[mid]==key) return mid;
        if(key>mid) return binarySearching(arr,key,mid+1,end);
        else return binarySearching(arr,key,start,mid-1);
    }
}
