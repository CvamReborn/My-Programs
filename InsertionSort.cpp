#include <iostream>
using namespace std;
int main() {
    int array[]={78,65,91,55,23,66};
    int temp;
    int large_pos=0;
    for(int j=0;j<6;j++)
    {
        for(int i=j;i<6;i++)
        {
            if(array[large_pos]<array[i])
            {
                large_pos=i;
            }
        }
        temp=array[j];
        array[j]=array[large_pos];
        array[large_pos]=temp;
    }
    for(int i=0;i<6;i++)
    {
        cout<<array[i]<<" ";
    }
    return 0;
}