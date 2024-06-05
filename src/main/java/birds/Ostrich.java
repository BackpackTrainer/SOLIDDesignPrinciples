package birds;

class Ostrich implements IBird {
    @Override
    public void eat() {
        System.out.println("I am pecking at the ground for food.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly.");
    }
}
