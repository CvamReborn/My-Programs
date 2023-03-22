#include <iostream>
#define SIZE 10
using namespace std;
int queue[SIZE];
int rear=-1;
int front=-1;
void insertFront(int data)
{
    if(front<=0)
    {
        cout<<">>Queue Overflow"<<endl;
    }
    else
    {
        front--;
        queue[front]=data;
        cout<<"element inserted"<<endl;
    }
}
void deleteRear()
{
    if(rear==-1 || rear==SIZE-1)
    {
        cout<<">>Queue Underflow"<<endl;
        rear=-1;
        front=-1;
    }
    else
    {
        queue[rear]=-1;
        rear--;
    }
}
void enqueue(int data)
{
    if(rear==SIZE-1)
    {
        cout<<">>Queue is full"<<endl;
    }
    else
    {
        front=0;
        rear++;
        queue[rear]=data;
    }
}
void dequeue()
{
    if(front==-1 || front>rear)
    {
        cout<<">>Queue is empty";
        front=-1;
        rear=-1;
    }
    else
    {
        queue[front]=-1;
        front++;
    }
}
void display()
{
    if(front==-1 || front>rear)
    {
        cout<<">>No element in queue"<<endl;
        front=-1;
        rear=-1;
    }
    else
    {
        for(int i=front;i<=rear;i++)
        {
            cout<<queue[i]<<"\t";
        }
        cout<<endl;
    }
}
int main()
{
    enqueue(5);
    enqueue(6);
    display();
    dequeue();
    display();
    dequeue();
    display();
    enqueue(5);
    display();
    deleteRear();
    display();
    deleteRear();
    insertFront(5);
    insertFront(4);
    display();
    return 0;
}