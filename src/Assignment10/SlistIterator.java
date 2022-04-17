package Assignment10;

public class SlistIterator<T> {
    Node<T> head;
    Node<T> currnode;
    SlistIterator(Node<T> head)
    {
        this.head=head;
    }

    public void insert(T data)
    {
        currnode=new Node(data);
        if(head==null)
        {
            head=currnode;
        }
        else
        {
            Node<T> temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=currnode;
        }

    }
    void remove()
    {
        Node<T> temp=head;
        if(head.next==null)
        {
            head=null;
        }
        while (temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
}
