package _interface案例_cat_dog;

public class Cat extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("Cat can jump higher than dog.");
    }
}
