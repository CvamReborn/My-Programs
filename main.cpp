#include <iostream>
using namespace std;
#define size 10
struct node
{
    int data;
    node *next;
};
typedef struct node node;
node *start=NULL;
node *top=NULL;
void display()
{
    if(top==NULL)
    {
        cout<<"Please enter value in stack!!"<<endl;
    }
    else
    {
        node *ptr=start;
        for(int i=0;i<top;i++)
        {
            cout<<ptr->data<<"\t";
        }
        cout<<endl;
    }

}
void push(int data)
{
    node *new_node=(node *)malloc(sizeof(node));
    new_node->data=data;
    if(top==siz)
    {
        cout<<"Stack Overflow!!"<<endl;
    }
    else {
        if (start == NULL) {
            start = new_node;
            top++;
        } else {
            node *ptr = start;
            while (ptr->next != NULL)
                ptr = ptr->next;
            ptr->next = new_node;
            top=new_node;
        }
    }
}
int main() {
    push(8);
    push(10);
    display();
    return 0;
}