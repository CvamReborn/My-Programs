#include <iostream>
using namespace std;
int arr[]={64,25,12,22,11};
void selectionSort()
{
    int swap;
    int store=0;
    for(int i=0;i<5;i++)
    {
        for(int j=i+1;j<5;j++)
        {
            if(arr[i]>arr[j])
            {
                store=j;
            }
        }
        if(arr[i]>arr[store+i])
        {
            swap=arr[i];
            arr[i]=arr[store];
            arr[store]=swap;
        }
    }
}
int main() {
    selectionSort();
    for(int i=0;i<5;i++)
    {
        cout<<arr[i]<<"\t";
    }
    return 0;
}