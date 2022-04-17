package Assignment7.Four;

import java.util.Calendar;

public class Unicyclefactory implements Cycle {

    public Unicyclefactory() {
        System.out.println("new UniCycle Created");
    }

    @Override
    public void seat() {
        System.out.println("UniCycle needs one seat");
    }

    @Override
    public void tyres() {
        System.out.println("UniCycle require one tyre");

    }

    @Override
    public void handle() {
        System.out.println("UniCycle  doesnot need handle");
    }
}
