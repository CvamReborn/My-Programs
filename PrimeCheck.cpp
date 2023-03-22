#include <iostream>
//Program to not print repeated digit from  a given range
using namespace std;
int main() {
    int start=11;
    int end=22;
    int temp;
    int arr[10];
    int output=0;
    for(int i=start;i<=end;i++)
    {
        temp=i;
        while(temp>0)
        {
            int rem=temp%10;
            arr[rem]=arr[rem]+1;
            temp=temp/10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>1)
                break;
            else if(i==9 && arr[i]<=1)
                output++;

        }
        for(int i=0;i<10;i++)
        {
            arr[i]=0;
        }
    }
    cout<<output;
    return 0;
}