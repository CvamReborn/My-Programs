#include <iostream>
using namespace std;
int main() {
    int array[]={45,33,21,55,20,72,12};
    int temp;
    for(int i=0;i<6;i++)
    {
        for(int j=0;j<6;j++)
        {
            if(array[j]>array[j+1])
            {
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
    for(int i=0;i<7;i++)
    {
        cout<<array[i]<<" ";
    }
    return 0;
}