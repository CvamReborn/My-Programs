#include <iostream>
//Duplicate value in Array
using namespace std;
void showDuplicate(int store[],int size)
{
    cout<<"Duplicate Values: ";
    for(int i=0;i<size;i++)
    {
        cout<<store[i]<<" ";
    }
    cout<<endl;
}
void duplicateValInArray(int arr[],int size)
{
    int count=0;
    int key;
    int k=0;
    int store[size];
    int keystore[size];
    int store_actualsize=0;
    int t=0;
    for(int i=0;i<size;i++)
    {
        if(i==0)
        {
            key=arr[i];
            keystore[t]=key;
            t++;
            for(int j=0;j<size;j++)
            {
                if(j!=i && arr[j]==key)
                {
                    count++;
                }
            }
            if(count>0)
            {
                store[k]=arr[i];
                k++;
                count=0;
                store_actualsize++;
            }
        }
        else
        {
            key=arr[i];
            for(int l=0;l<size;l++)
            {
                if(keystore[l]==key)
                {
                    goto end1;
                }
                else if(l==size-1 && keystore[l]!=key)
                {
                    keystore[t]=key;
                    t++;
                    for(int j=0;j<size;j++)
                    {
                        if(j!=i && arr[j]==key)
                        {
                            count++;
                        }
                    }
                    if(count>0)
                    {
                        store[k]=arr[i];
                        k++;
                        count=0;
                        store_actualsize++;
                    }
                }
            }
        }
        end1:
        continue;
    }
    showDuplicate(store,store_actualsize);
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
    int array[]={1,1,2,2,5,5};
    printArray(array,6);
    duplicateValInArray(array,6);
    return 0;
}