class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушать, как сабака: круто и брутако.");
    }
}