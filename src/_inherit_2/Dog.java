package _inherit_2;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void watchdoor() {
        System.out.println("看门");
    }
}
