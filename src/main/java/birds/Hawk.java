package birds;

public class Hawk implements IBird{
    @Override
    public void eat() {
        System.out.println("I am munching on a small rodent.");
    }

    @Override
    public void fly() {
        System.out.println("I am soaring high above the trees.");
    }
}
