#include <iostream>
using namespace std;
int duplicateArray(int arr[],int size)
{
    for(int i=0;i<size;i++)
    {
        for(int j=0;j<size;j++)
        {
            if(j!=i && arr[j]==arr[i])
            {
                goto end1;
            }
        }
    }
    return 0;
    end1:
    return 1;
}
int main() {
    int number1=5;
    int number2=25;
    int temp;
    int arr[2];
    int j=0;
    for(int i=number1;i<number2;i++)
    {
        temp=i;
        while(temp>0)
        {
            arr[j]=temp%10;
            j++;
            temp=temp/10;
        }
        if(duplicateArray(arr,j)==0)
        {
            cout<<i<<" ";
            for(int i=0;i<j;i++)
            {
                arr[i]=0;
            }
            j=0;
        }
        else
        {
            for(int i=0;i<j;i++)
            {
                arr[i]=0;
            }
            j=0;
        }

    }
    return 0;
}