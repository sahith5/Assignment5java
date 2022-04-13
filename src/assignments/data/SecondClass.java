package assignments.data;

public class SecondClass {
    static String str;
    public static SecondClass puts(String s)
    {
        str=s;//nonstatic feilds cannot be used in static functions but viceversa is possible
        return new SecondClass();
    }
    public void gets()
    {
        System.out.println(str);
    }


}
