package Assignment10;

public class Main {
    public static void main(String[] args) {
        Slist<String> list1=new Slist<>();
        SlistIterator iterator1=list1.iterator();
        iterator1.insert("hello");
        iterator1.insert("hello2");

        System.out.println(list1);
    }


}
