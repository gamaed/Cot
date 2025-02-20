public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Степка как в титанике");
        Animal dog = new Dog("Брутальный сибек");
        cat.eat();
        dog.eat();
        new DravaCat().setVisible(true);
    }
}

