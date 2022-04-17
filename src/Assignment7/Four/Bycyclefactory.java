package Assignment7.Four;

public class Bycyclefactory implements Cycle{

    public Bycyclefactory() {
        System.out.println("new Bycycle Created");
    }

    @Override
    public void seat() {
        System.out.println("Bycycle needs Seat");
    }

    @Override
    public void tyres() {
 System.out.println("Bycycle needs TwoTyres");
    }

    @Override
    public void handle() {
System.out.println("Bycycle needs Handle");
    }
}
