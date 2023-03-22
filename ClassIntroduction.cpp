#include <iostream>
using namespace std;
class quad
{
public:
    int length;
    int breadth;
public:
    void area();
    quad(int l,int b);
    quad();
};
quad::quad(int l,int b)
{
    this->length=l;
    this->breadth=b;
}
quad::quad()
{
}
void quad::area()
{
    cout<<"Area= "<<(this->length)*(this->breadth)<<endl;
}
int main() {
    //quad q1(2,3);
    //q1.area();
    quad qarray[5];
    for(int i=0;i<5;i++)
    {
        cout<<"Enter q"<<i+1<<" length: ";
        cin>>qarray[i].length;
        cout<<endl;
        cout<<"Enter q"<<i+1<<" breadth: ";
        cin>>qarray[i].breadth;
        cout<<endl;
    }
    for(int i=0;i<5;i++)
    {
        qarray[i].area();
    }
    return 0;
}