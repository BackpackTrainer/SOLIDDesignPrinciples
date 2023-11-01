package birds;

public class Sparrow extends Bird implements FlyingBird{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    public void eat() {
        System.out.println("Sparrow is eating.");
    }
}
