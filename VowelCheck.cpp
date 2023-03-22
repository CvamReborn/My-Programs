#include <iostream>
using namespace std;
int main() {
    char ch1[]={'a','p','p','l','e','\0'};
    int i=0;
    int t;
        for(int i=5;i>=0;i--)
        {
            if(ch1[i]=='a' || ch1[i]=='e' || ch1[i]=='i' || ch1[i]=='o' || ch1[i]=='u')
            {
                int j=i;
                int t=j;
                while(ch1[j]!='\0')
                {
                    cout<<ch1[j]<<" ";
                    j++;

                }
                ch1[t]='\0';
                cout<<endl;
            }
            else
            {
                continue;
            }
            string s

        }
    return 0;
}