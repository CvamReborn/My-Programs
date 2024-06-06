public class CircularLinkedList {
    private class Node
    {
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int size;
    public CircularLinkedList()
    {
        this.size=0;
    }
    public void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            newnode.next=head;
            tail=newnode;
        }
        else
        {
            newnode.next=head;
            tail.next=newnode;
            tail=newnode;
        }
        size++;
    }
    public void print()
    {
        if(head==null) return;
        else {
            Node temp=head;
            do{
                System.out.print(temp.data+"->");
                temp=temp.next;
            }while(temp!=head);
            System.out.println("End");
        }
    }
}
