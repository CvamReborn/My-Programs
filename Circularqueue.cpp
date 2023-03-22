#include <iostream>
#define SIZE 5
using namespace std;
//Implementation of Circular Queue
int queue[5];
int rear=-1,front=-1;
void enqueue(int data)
{
    if(front==0 && rear==SIZE-1)
    {
        cout<<"Overflow!!"<<endl;
        exit(0);
    }
    else if(rear==-1 && front==-1)
    {
        rear=front=0;
    }
    else if(front!=0 && rear==SIZE-1)
    {
        rear=0;
    }
    else
    {
        rear++;
    }
    queue[rear]=data;
}
void dequeue()
{
    if(front==-1)
    {
        cout<<"Underflow!!"<<endl;
        exit(0);
    }
    else if(front==rear)
    {
        front=-1;
        rear=-1;
    }
    else if(front==SIZE-1)
    {
        front=0;
    }
    else
    {
        front++;
    }
}
void display()
{
    if(front==-1)
    {
        cout<<"No element in Queue"<<endl;
    }
    else
    {
        if(front<rear)
        {
            for(int i=front;i<=rear;i++)
            {
                cout<<queue[i]<<"\t";
            }
            cout<<endl;
        }
        else
        {
            for(int i=front;i<SIZE;i++)
            {
                cout<<queue[i]<<"\t";
            }
            for(int i=0;i<=rear;i++)
            {
                cout<<queue[i]<<"\t";
            }
            cout<<endl;
        }
    }
}
int main() {
    enqueue(5);
    enqueue(6);
    enqueue(7);
    enqueue(8);
    enqueue(9);
    display();
    dequeue();
    display();
    enqueue(10);
    display();
    return 0;
}