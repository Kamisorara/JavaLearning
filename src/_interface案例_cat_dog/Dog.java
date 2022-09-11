package _interface案例_cat_dog;

public class Dog extends Animal implements Jumping {
    @Override
    public void eat() {
        System.out.println("eat meet");
    }

    @Override
    public void jump() {
        System.out.println("dog jump lower than Cat.");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
