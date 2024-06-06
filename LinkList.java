public class LinkList {
    private class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.next=null;
            this.data=data;
        }
    }
    int size;
    Node head;
    Node tail;
    LinkList()
    {
        this.size=0;
        tail=null;
        head=null;
    }
    public void insertFirst(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            tail=newnode;
            size++;
        }
        else
        {
            newnode.next=head;
            head=newnode;
            size++;
        }
    }
    public void insertLast(int data)
    {
        if(head==null)
            insertFirst(data);
        else
        {
            tail.next= new Node(data);
            tail=tail.next;
            size++;
        }
    }
    public void insert(int data)
    {
        if(head==null)
            insertFirst(data);
        else
        {
            insertLast(data);
        }
    }
    public void insertBetween(int data,int position)
    {
        if(head==null || position==1)
            insertFirst(data);
        else
        {
            if(position<=size)
            {
                Node newnode=new Node(data);
                Node prev=getPrevNode(position);
                newnode.next=prev.next;
                prev.next=newnode;
                size++;
            }
            else
                System.out.println("Enter valid position BC");
        }
    }
    // Dangerous Function always return something
    public Node getPrevNode(int nodePosition)
    {
            Node temp=head;
            for(int i=1;i<nodePosition-1;i++)
                temp=temp.next;
            return temp;
    }
    public void deleteFirst()
    {
        if(head==null)
            System.out.println("List is delete");
        else
        {
            if(head==tail)
            {
                head=null;
                tail=null;
            }
            else
                head=head.next;
        }
        size--;
    }
    public void deleteLast()
    {
        if(head==null)
            System.out.println("List is empty");
        else
        {
            if(head==tail)
                deleteFirst();
            else
            {
                Node prev=getPrevNode(size);
                prev.next=null;
                tail=prev;
                //System.out.println("deletion done");
                size--;
            }
        }
    }
    public void deleteBetween(int position)
    {
        if(head==null)
            System.out.println("List is empty");
        else
        {
            if(head==tail)
                deleteFirst();
            else if(position==size)
                deleteLast();
            else
            {
                if(position<size)
                {
                    Node prev=getPrevNode(position);
                    prev.next=prev.next.next;
                    size--;
                }
                else System.out.println("Please enter valid position");
            }
        }
    }
    public void display()
    {
        if(head==null)
            System.out.println("List is empty");
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("End");
        }
    }
}
