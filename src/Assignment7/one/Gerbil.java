package Assignment7.one;

import javax.swing.plaf.synth.SynthUI;

public class Gerbil extends Rodents{

    public  Gerbil()
    {
        System.out.println("Gerbil class");
    }
    @Override
    public void eats() {
        System.out.println("eats less and Slowly");
    }

    @Override
    public void runs() {
        System.out.println("runs Slowly");
    }
}
