package Assignment7.Four;

import Assignment7.two.Trycycle;
import Assignment7.two.Unicycle;

public class Main {
    public static void main(String[] args) {
        Bycyclefactory btcycle=new Bycyclefactory();
        Unicyclefactory unicycle=new Unicyclefactory();
        TrycycleFactory trycycle=new TrycycleFactory();
        btcycle.handle();
        btcycle.seat();
        btcycle.tyres();
        unicycle.handle();
        unicycle.seat();
        unicycle.tyres();
        trycycle.handle();
        trycycle.seat();
        trycycle.tyres();
    }
}
