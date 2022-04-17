package Assignment7.one;

public class Hamster extends Rodents {

    public Hamster()
    {
        System.out.println("Hamstar class");
    }

    @Override
    public void eats() {
        System.out.println("Eats more and Fastly");
    }


    @Override
    public void runs() {
    System.out.println("runs fastly ");
    }
}
