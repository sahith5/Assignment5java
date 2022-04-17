package Assignment7.one;

public class Rats extends Rodents{

    public Rats()
    {
        System.out.println("rats Class");
    }

    @Override
    public void eats() {
            System.out.println("Eats more and slowly");
    }

    @Override
    public void runs() {
            System.out.println("Runs Fast");
    }
}
