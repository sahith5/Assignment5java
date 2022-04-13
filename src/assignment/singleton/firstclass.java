package assignment.singleton;

public class firstclass {
    int a;
    char c;
    public void  printvariables()
    {
        System.out.println("a is "+a);
        System.out.println("c is "+c);
    }
    public  void localfunction()
    {
        int localmember1;
        int localmember2;
       // System.out.println(localmember1,localmember2);//printing localvariables without initializing is not possible in java
    }
}
