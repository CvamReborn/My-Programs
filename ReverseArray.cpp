#include <iostream>
using namespace std;
void printArray(int arr[],int size)
{
    cout<<"Print your Array: "<<endl;
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void swap1(int *val1,int *val2)
{
    int temp;
    temp=*val1;
    *val1=*val2;
    *val2=temp;
}
void reverseArray(int arr[],int size)
{
    int start=0;
    int end=size-1;
    while(start<=end)
    {
        swap1(&arr[start],&arr[end]);
        start++;
        end--;
    }
    cout<<"reverse";
}
int main()
{
    int array1[]={1,2,3,4,5};
    int array2[]={11,12,13,14};
    reverseArray(array1,5);
    reverseArray(array2,4);
    printArray(array1,5);
    printArray(array2,4);
    return 0;
}