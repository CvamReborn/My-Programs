#include <iostream>
using namespace std;
int i=0;
int print(int a,int size)
{
    if(i==size)
        cout<<a<<"\t";
    print(a,5);

}
int main() {
    int array[]={1,2,3,4,5};
    print(&array[0],5);
    return 0;
}