package Assignment8;

public class CannotVote extends Exception {
    public CannotVote()
    {
        super("cannot vote");
    }
    public CannotVote(String s)
    {
        super(s);
    }
}
