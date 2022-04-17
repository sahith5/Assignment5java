package Assignment10;

public class Slist <T>{

    SlistIterator iterator;

    SlistIterator<T> iterator()
    {
        iterator=new SlistIterator(null);
        return iterator;
    }
    public String toString()
    {
        Node head=iterator.head;
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        return " ";
    }



}
