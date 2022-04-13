package Assignments.main;

import assignment.singleton.firstclass;
import assignments.data.SecondClass;

public class Main {
    public static void main(String[] args) {
        firstclass firstclassobj=new firstclass();
        firstclassobj.localfunction();
        firstclassobj.printvariables();
        SecondClass secondClassobj=SecondClass.puts("hello");
        secondClassobj.gets();

    }
}
