package Assignment7.two;

public class Main {
    public static void main(String[] args) {
        Cycle[] c=new Cycle[3];
        c[0]=new bicycle();
        c[0].balence();
        c[1]=new Trycycle();
        c[1].balence();
        c[2]=new Unicycle();
        c[2].balence();
        Unicycle unicycle=(Unicycle) c[2];
        unicycle.balence();
        bicycle by=(bicycle) c[0];
        by.balence();
        Trycycle trycycle=(Trycycle)c[1];
        trycycle.balence();
    }
}
