package birds;

class Ostrich extends Bird implements WalkingBirds{

    @Override
    public void walk() {
        System.out.println("I can walk");
    }

    public void eat() {
        System.out.println("Ostrich is eating.");
    }
}
