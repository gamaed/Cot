class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println(getName() + " кушать, как кот: И очень брутико.");
    }
}