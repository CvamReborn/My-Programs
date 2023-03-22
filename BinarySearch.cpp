#include <iostream>
using namespace std;
int BinarySearch(int arr[],int key,int size)
{
    int start=0;
    int End=size-1;
    int mid=((start+End)/2);
    while(start<=End)
    {
        if(arr[mid]==key)
        {
            return mid;
        }
        if(key>arr[mid])
        {
            start=mid+1;
        }
        else{
            End=mid-1;
        }
        mid=(start+End)/2;
    }
    return -1;
}
int main(){
    int arr[]={1,15,19,20,36};
    cout<<BinarySearch(arr,16,5);
    return 0;
}