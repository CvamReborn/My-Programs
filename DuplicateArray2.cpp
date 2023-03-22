#include <iostream>
using namespace std;
int main()
{
    int arr[]={1,2,2,3,4};
    int temp[10];
    int k=0;
    for(int i=0;i<5;i++)
    {
        int count=0;
        for(int j=0;j<5;j++)

        {
            if(count<1 && arr[i]==arr[j])
            {
                temp[k]=arr[i];
                count++;
                k++;
            }
        }
    }
    cout<<"Your array without duplicates"<<endl;
    for(int i=0;i<5;i++)
    {
        cout<<temp[i]<<"\t";
    }
    return 0;
}