package Assignment7.Four;

public class TrycycleFactory implements Cycle{
    public TrycycleFactory() {
        System.out.println("new Trycycle created");
    }

    @Override
    public void seat() {
        System.out.println("trycycle neeeds Two Seats");
    }

    @Override
    public void tyres() {
        System.out.println("trycycle needs 3 Tyres");
    }

    @Override
    public void handle() {
        System.out.println("trycycle needs One Handle");
    }
}
