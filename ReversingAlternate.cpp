#include <iostream>
//Reversing Alternate Number in Array
using namespace std;
void reverseAlt(int arr[],int size)
{
    for(int i=0;i<size-1;i+=2)
    {
        swap(arr[i],arr[i+1]);
    }
}
void printArray(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main() {
    int array[]={1,2,3,4,5,6};
    reverseAlt(array,6);
    printArray(array,6);
    return 0;
}