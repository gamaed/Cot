class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void eat() {
        System.out.println(name + " Кушать.");
    }
    public String getName() {
        return name;
    }
}