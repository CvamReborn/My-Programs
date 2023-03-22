#include <iostream>
using namespace std;
int arr[100];
int parr[100];
int count;
struct header_node
{
    int power;
    int coeff;
    header_node *next;
};
typedef struct header_node header_node;
header_node *start=NULL;
header_node *start2=NULL;
int terms1,terms2;
void insertValueInSecondPolynomial(int pow,int coeff)
{
        header_node *new_node=(header_node *)malloc(sizeof(header_node));
        new_node->power=pow;
        new_node->coeff=coeff;
        if(start2==NULL)
        {
            start2=new_node;
            new_node->next=start2;
        }
        else
        {
            header_node *ptr=start2;
            while(ptr->next!=start2)
            {
                ptr=ptr->next;
            }
            ptr->next=new_node;
            new_node->next=start2;
        }
}
/*void insertValueInFirstPolynomial()
{
    int pow;
    int coeff;
    cout<<"*******************First Polynomial******************"<<endl;
    cout<<"How many terms are there in First Polynomial:";
    cin>>terms1;
    cout<<endl;

    for(int i=0;i<terms1;i++)
    {
        cout<<"Enter the power of the "<<i+1<<" terms: ";
        cin>>pow;
        cout<<endl;
        cin.ignore();
        cout<<"Enter the coefficient of the "<<i+1<<" terms: ";
        cin>>coeff;
        cin.ignore();
        cout<<endl;
        header_node *new_node=(header_node *)malloc(sizeof(header_node));
        new_node->power=pow;
        new_node->coeff=coeff;
        if(start==NULL)
        {
            new_node->next=start;
            start=new_node;
        }
        else
        {
            header_node *ptr=start;
            while(ptr->next!=start)
            {
                ptr=ptr->next;
            }
            ptr->next=new_node;
            new_node->next=start;
        }

    }
    cout<<"*****************************************************"<<endl;
}*/
void insertValueInFirstPolynomial(int pow,int coeff)
{
        header_node *new_node=(header_node *)malloc(sizeof(header_node));
        new_node->power=pow;
        new_node->coeff=coeff;
        if(start==NULL)
        {
            start=new_node;
            new_node->next=start;
        }
        else
        {
            header_node *ptr=start;
            while(ptr->next!=start)
            {
                ptr=ptr->next;
            }
            ptr->next=new_node;
            new_node->next=start;
        }
}
void addPolynomial()
{
    header_node *ptr1=start;
    header_node *ptr2=start2;
    int k=0;
    for(int i=0;i<terms1;i++)
    {
        for(int j=0;j<terms2;j++)
        {
            if(ptr1->power==ptr2->power)
            {
                arr[k]=ptr1->coeff+ptr2->coeff;
                parr[k]=ptr1->power;
                k++;
                break;
            }
            if(j==terms2-1 && ptr1->power!=ptr2->power)
            {
                arr[k]=ptr1->coeff;
                parr[k]=ptr1->power;
                k++;
            }
            ptr2=ptr2->next;
        }
        ptr1=ptr1->next;
    }
    for(int i=0;i<terms2;i++)
    {
        for(int j=0;j<terms1;j++)
        {
            if(ptr2->power==ptr1->power)
            {
                //arr[k]=ptr2->coeff+ptr1->coeff;
                //k++;
                break;
            }
            if(j==terms1-1 && ptr2->power!=ptr1->power)
            {
                arr[k]=ptr2->coeff;
                parr[k]=ptr2->power;
                k++;
            }
            ptr1=ptr1->next;
        }
        ptr2=ptr2->next;
    }
    count=k;
}
void displayResult()
{
    int pow=start->power;
    cout<<"***********Result************"<<endl;
    for(int i=0;i<count;i++)
    {
        cout<<arr[i]<<"x^"<<parr[i];
        if(i!=count-1)
            cout<<" + ";
        pow--;
    }
    /*while(arr[i]!=-1)
    {
        cout<<arr[i]<<"x^"<<pow;
        if(i!=terms2-1)
            cout<<" + ";
        pow--;
    }*/
    cout<<endl;
    cout<<"*******************************"<<endl;
}
int main() {
    int pow1,pow2;
    int coeff1,coeff2;
    cout<<"*******************First Polynomial******************"<<endl;
    cout<<"How many terms are there in First Polynomial:";
    cin>>terms1;
    cout<<endl;

    for(int i=0;i<terms1;i++) {
        cout << "Enter the power of the " << i + 1 << " terms: ";
        cin >> pow1;
        cout << endl;
        cin.ignore();
        cout << "Enter the coefficient of the " << i + 1 << " terms: ";
        cin >> coeff1;
        cin.ignore();
        cout << endl;
        insertValueInFirstPolynomial(pow1, coeff1);
    }
    cout << "*****************************************************" << endl;
    cout<<"*******************Second Polynomial******************"<<endl;

    cout<<">>How many terms are there in Second Polynomial:";
    cin>>terms2;
    cout<<endl;

    for(int i=0;i<terms2;i++)
    {
        cout<<"Enter the power of the "<<i+1<<" terms: ";
        cin>>pow2;
        cout<<endl;
        cin.ignore();
        cout<<"Enter the coefficient of the "<<i+1<<" terms: ";
        cin>>coeff2;
        cin.ignore();
        cout<<endl;
       insertValueInSecondPolynomial(pow2,coeff2);
    }
    cout<<"*******************************************************"<<endl;

    //insertValueInSecondPolynomial();
    addPolynomial();
    displayResult();
    return 0;
}