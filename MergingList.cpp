#include <iostream>
using namespace std;
struct merge_node
{
    int data;
    merge_node *next;
};
struct first_node
{
    int data;
    first_node *next;
};
struct second_node
{
    int data;
    second_node *next;
};
typedef struct first_node first_node;
typedef struct second_node second_node;
typedef struct merge_node merge_node;
first_node *first_nodeHead=NULL;
second_node *second_nodeHead=NULL;
merge_node *merge_nodeHead=NULL;
void insertInFirstNode(int data)
{
    first_node *new_node=(first_node*)malloc(sizeof(first_node));
    new_node->data=data;
    new_node->next=NULL;
    if(first_nodeHead==NULL)
        first_nodeHead=new_node;
    else{
        first_node *ptr=first_nodeHead;
        while(ptr->next!=NULL)
            ptr=ptr->next;
        ptr->next=new_node;
    }
}
void insertInSecondNode(int data)
{
    second_node *new_node2=(second_node*)malloc(sizeof(second_node));
    new_node2->data=data;
    new_node2->next=NULL;
    if(second_nodeHead==NULL)
        second_nodeHead=new_node2;
    else{
        second_node *ptr2=second_nodeHead;
        while(ptr2->next!=NULL)
            ptr2=ptr2->next;
        ptr2->next=new_node2;
    }
}
void displayFirstNode()
{
    first_node *ptr=first_nodeHead;
    while(ptr!=NULL)
    {
        cout<<ptr->data<<"\t";
        ptr=ptr->next;
    }
    cout<<endl;
}
void insertIntoMergeNode(int data)
{

    merge_node *new_node2=(merge_node*)malloc(sizeof(merge_node));
    new_node2->data=data;
    new_node2->next=NULL;
    if(merge_nodeHead==NULL)
        merge_nodeHead=new_node2;
    else{
        merge_node *ptr2=merge_nodeHead;
        while(ptr2->next!=NULL)
            ptr2=ptr2->next;
        ptr2->next=new_node2;
    }
}
void displaySecondNode()
{
    second_node *ptr=second_nodeHead;
    while(ptr!=NULL)
    {
        cout<<ptr->data<<"\t";
        ptr=ptr->next;
    }
    cout<<endl;
}
void mergeList()
{
    first_node *ptr1=first_nodeHead;
    second_node *ptr2=second_nodeHead;
    merge_node *ptr3=merge_nodeHead;
    int i=0;
    while(ptr1!=NULL)
    {
        if(i==0)
        {
            /*if(ptr1->data!=ptr1->next->data) {
            insertIntoMergeNode(ptr1->data);
        }*/
            insertIntoMergeNode(ptr1->data);
            ptr1=ptr1->next;
        }
        else
        {
            if(ptr1->data!=ptr3->data)
                insertIntoMergeNode(ptr1->data);
            ptr1=ptr1->next;
             ptr3=ptr3->next;

        }
        i++;

    }
    while(ptr2!=NULL)
    {
        /*if(ptr2->data!=ptr2->next->data && ptr2->data!=ptr1->data)
        {
            insertIntoMergeNode(ptr2->data);
        }*/
        if(ptr2->data!=ptr3->data)
        insertIntoMergeNode(ptr2->data);
        ptr2=ptr2->next;
        ptr3=ptr3->next;
    }
}
void displayMergeList()
{
    merge_node *ptr=merge_nodeHead;
    while(ptr!=NULL)
    {
        cout<<ptr->data<<"\t";
        ptr=ptr->next;
    }
}
int main()
{
    insertInFirstNode(1);
    insertInFirstNode(2);
    insertInFirstNode(3);
    insertInFirstNode(4);
    insertInSecondNode(5);
    insertInSecondNode(6);
    insertInSecondNode(7);
    displayFirstNode();
    displaySecondNode();
    mergeList();
    displayMergeList();
    return 0;
}