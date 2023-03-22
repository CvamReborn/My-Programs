#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int number=1;
    for(int i=1;i<n+1;i++)
    {
        for(int j=0;j<i;j++)
        {
            cout<<number<<" ";
        }
        cout<<endl;
        number=number+2;
    }
    return 0;
}

