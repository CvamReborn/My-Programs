#include <iostream>
using namespace std;
struct node
{
    int data;
    node *next;
};
typedef struct node node;
node *head=NULL;
void createNode(int data)
{
    node *new_node=(node *)malloc(sizeof(node));
    new_node->data=data;
    if(head==NULL)
    {
        head=new_node;
        new_node->next=head;
    }
    else
    {
        node *ptr=head;
        while(ptr->next!=head)
        {
            ptr=ptr->next;
        }
        ptr->next=new_node;
        new_node->next=head;
    }
}
void insertInFront(int data)
{
    node *new_node=(node *)malloc(sizeof(node));
    new_node->data=data;
    new_node->next=head;
    node *ptr=head;
    while(ptr->next!=head)
    {
        ptr=ptr->next;
    }
    ptr->next=new_node;
    head=new_node;
}
void insertInMiddle(int data,int pos)
{
    if(pos>1)
    {
        node *new_node=(node *)malloc(sizeof(node));
        new_node->data=data;
        node *ptr=head;
        int i=0;
        pos=pos-2;
        while(i!=pos)
        {
            ptr=ptr->next;
            i++;
        }
        new_node->next=ptr->next;
        ptr->next=new_node;
    }
    else
    {
        cout<<"Please enter a valid position"<<endl;
    }

}
void displayList()
{
    node *ptr=head;
    while(ptr->next!=head)
    {
        cout<<ptr->data<<"\t";
        ptr=ptr->next;
    }
    cout<<ptr->data;
    cout<<endl;
}
int main() {
    createNode(5);
    //createNode(6);
    createNode(8);
    //cout<<"head data:"<<head->data<<endl;
    //insertInMiddle(7,3);
    insertInFront(4);
    //cout<<"head data:"<<head->data<<endl;
    displayList();
    return 0;
}