#include <iostream>
using namespace std;
void showInsteresction(int store[],int size)
{
    cout<<"Intersection Values: ";
    for(int i=0;i<size;i++)
    {
        cout<<store[i]<<" ";
    }
    cout<<endl;
}
void printArray(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
void findIntersection(int arr1[],int size1,int arr2[],int size2)
{
    int storesize=0;
    if(size1>=size2)
    {
        int store[size1];
        int k=0;
        for(int i=0;i<size2;i++)
        {
            for(int j=0;j<size1;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    store[k]=arr1[i];
                    storesize++;
                    k++;
                }
            }
        }
        showInsteresction(store,storesize);
    }
    else
    {
        int store[size2];
        int k=0;
        for(int i=0;i<size1;i++)
        {
            for(int j=0;j<size2;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    store[k]=arr1[i];
                    storesize++;
                    k++;
                }
            }
        }
        showInsteresction(store,storesize);
    }

}
int main() {
    int array1[]={5,1,4,7,8,2};
    printArray(array1,6);
    int array2[]={1,4,8,3,5,9,10};
    printArray(array2,7);
    findIntersection(array1,6,array2,7);
    return 0;
}