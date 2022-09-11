package _inherit_2;

public class demo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("small cat");
        c1.setAge(1);
        System.out.println(c1.getName() + c1.getAge());
        c1.Catch();
        Cat c2 = new Cat("big cat", 10);
        System.out.println(c2.getName() + c2.getAge());
        c1.Catch();
        Dog d1 = new Dog();
        d1.watchdoor();

    }

}
