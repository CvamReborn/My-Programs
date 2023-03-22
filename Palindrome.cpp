#include <iostream>
using namespace std;
/*int palindromeCheck(int n)
{
    int reverse=0;
    int temp=n;
    while(temp>0)
    {
        reverse=(reverse*10)+temp%10;
        temp=temp/10;
    }
    if(reverse==n)
        return 1;
    else
        return 0;
}*/
int palindromeCheck(int n)
{
    if(n>0) {
        int reverse;
        reverse = (n % 10) * 10;
        palindromeCheck(reverse + n / 10);
    }
}
int main() {
    //121 1331
    int number;
    cin>>number;
    if(palindromeCheck(number)==1)
    {
        cout<<"Yes";
    }
    else
        cout<<"No";
    return 0;
}