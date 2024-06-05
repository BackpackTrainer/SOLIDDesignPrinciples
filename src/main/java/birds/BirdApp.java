package birds;

public class BirdApp {

    public static void main(String[] args) {

            Bird bird = new Bird();
            Hawk hawk = new Hawk();
            Ostrich ostrich = new Ostrich();

            bird.eat();
            bird.fly();

            hawk.eat();
            hawk.fly();

            ostrich.eat();
            ostrich.fly();
    }
}
