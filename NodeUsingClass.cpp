#include <iostream>
using namespace std;
class node
{
public:
    int data;
    node *next;
};
node *start=NULL;
void createList(int data) {
    node *newnode=new node;
    newnode->data=data;
    newnode->next=NULL;
    if(start==NULL)
    {
        start=newnode;
        cout<<"##Node inserted!!"<<endl;
    }
    else
    {
        node *ptr=start;
        while(ptr->next!=NULL)
            ptr=ptr->next;
        ptr->next=newnode;
        cout<<"##Node inserted!!"<<endl;
    }
}
void displayList()
{
    node *ptr=start;
    cout<<">>Your list>>"<<endl;
    while(ptr!=NULL)
    {
        cout<<ptr->data<<"\t";
        ptr=ptr->next;
    }
    cout<<endl;
    cout<<"***************"<<endl;
}
int main() {
    createList(5);
    createList(6);
    displayList();
    return 0;
}