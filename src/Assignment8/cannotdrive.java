package Assignment8;

public class cannotdrive extends  Exception{
    public cannotdrive()
    {
        super("you cannot drive because you are too young");
    }
    public cannotdrive(String s)
    {
        super(s);
    }

}
