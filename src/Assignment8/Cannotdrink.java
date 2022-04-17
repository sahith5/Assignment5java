package Assignment8;

public class Cannotdrink extends Exception{
    public Cannotdrink()
    {
        super("cannot  drink");
    }
    public Cannotdrink(String s)
    {
        super(s);
    }
}
