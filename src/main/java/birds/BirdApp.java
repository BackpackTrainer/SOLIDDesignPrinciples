//TODO:  As written, this code throws an unexpected exception when the ostrich is told to fly.
//Refactor the code so that no client will receive an unexpected exception.
//Note that lots of birds (kiwis, penguins, etc.) can't fly.

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
