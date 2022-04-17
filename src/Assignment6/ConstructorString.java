package Assignment6;

public class ConstructorString {
    public static void main(String[] args) {

        method2[] ref=new method2[3];
        ref[0]=new method2("sahith");
        ref[1]=new method2("sahith2");
        ref[2]=new method2("sahith3");


    }


}

class  method2{
    public method2(String name)
    {
        System.out.println(name);
    }
}