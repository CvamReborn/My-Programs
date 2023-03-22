#include <iostream>
using namespace std;
struct node
{
    int val;
    struct node *next;
};
struct node *start=NULL;
void createList()
{
    int num;
    cout<<"Enter a number: "<<endl;
    cin>>num;
    struct node *new_node;
    new_node=(struct node*)malloc(sizeof(struct node));
    new_node->val=num;
    new_node->next=NULL;
    if(start==NULL)
    {

        start=new_node;
        cout<<"New node has been inserted!!"<<endl;
    }
    else{
        struct node *ptr;
        ptr=start;
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        ptr->next=new_node;
        cout<<"New node has been inserted!!"<<endl;
    }
}
void insertFront()
{
    if(start==NULL)
        cout<<"Create a list first!!"<<endl;
    else{
        int num;
        cout<<"Enter a number: "<<endl;
        cin>>num;
        struct node *new_node;
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->val=num;
        new_node->next=start;
        start=new_node;
    }
}
void insertEnd()
{
    if(start==NULL)
    {
        cout<<"Please create a list first!!"<<endl;
    }
    else{
        int num;
        cout<<"Enter a number: "<<endl;
        cin>>num;
        struct node *new_node;
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->val=num;
        new_node->next=NULL;
        struct node *ptr=NULL;
        ptr=start;
        while(ptr->next!=NULL)
        {
            ptr=ptr->next;
        }
        ptr->next=new_node;
    }

}
void insertMiddle()
{
    if(start==NULL)
    {
        cout<<"Please create a list first!!"<<endl;
    }
    else{
        int num;
        int pos;
        cout<<"Enter a number: "<<endl;
        cin>>num;
        cout<<"Enter the position: "<<endl;
        cin>>pos;
        struct node *new_node;
        new_node=(struct node*)malloc(sizeof(struct node));
        new_node->val=num;
        struct node* ptr=start;
        for(int i=0;i<pos-1;i++)
        {
            ptr=ptr->next;
        }
        ptr->next=new_node;
        ptr=ptr->next;
        ptr=ptr->next;
        new_node->next=ptr;
        cout<<"Element has been inserted!!!"<<endl;
    }


}
void search()
{
    if(start==NULL)
    {
        cout<<"Please create a list first Idiot!!"<<endl;
    }
    else
    {
        int num;
        cout<<"Enter a number: "<<endl;
        cin>>num;
        struct node *ptr=start;
        while(ptr->next!=NULL)
        {
            if(num==ptr->val)
            {
                cout<<">>Search Founded!!"<<endl;
            }
            else if(num!=ptr->val && ptr->next->next==NULL)
            {
                cout<<">>Match Not Founded!!"<<endl;
            }
            ptr=ptr->next;
        }
    }
}
void display()
{
    struct node *ptr=start;
    cout<<"*********************Linked List*************************"<<endl;
    while(ptr!=NULL)
    {
        cout<<ptr->val<<"\t";
        ptr=ptr->next;
    }
    cout<<endl;
    cout<<"**********************************************************"<<endl;
}
int main()
{
    int opt;
    cout<<"**********************List of Operations********************"<<endl;
    cout<<"1.Create Linked List"<<endl;
    cout<<"2.Insert in the beginning"<<endl;
    cout<<"3.Insert in the middle"<<endl;
    cout<<"4.Insert int the end"<<endl;
    cout<<"5.Delete from the front"<<endl;
    cout<<"6.Delete from the middle"<<endl;
    cout<<"7.Delete from the end"<<endl;
    cout<<"8.Search()"<<endl;
    cout<<"9.Display()"<<endl;
    cout<<"*********************************************************"<<endl;
    cout<<"Choose an option: "<<endl;
    cin>>opt;
    do{
        switch(opt )
        {
            case 1:
                createList();
                break;
            case 2:
                insertFront();
                break;
            case 3:
                insertMiddle();
                break;
            case 4:
                insertEnd();
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                search();
            case 9:
                display();
                break;
        }
        cout<<"**********************List of Operations********************"<<endl;
        cout<<"1.Create Linked List"<<endl;
        cout<<"2.Insert in the beginning"<<endl;
        cout<<"3.Insert in the middle"<<endl;
        cout<<"4.Insert int the end"<<endl;
        cout<<"5.Delete from the front"<<endl;
        cout<<"6.Delete from the middle"<<endl;
        cout<<"7.Delete from the end"<<endl;
        cout<<"8.Search()"<<endl;
        cout<<"9.Display()"<<endl;
        cout<<"*********************************************************"<<endl;
        cout<<"Choose an option: "<<endl;
        cin>>opt;
        cin.clear();
    }while(opt!=-1);
    return 0;
}