package _inherit_2;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void Catch() {
        System.out.println("catch mouse");
    }
}
