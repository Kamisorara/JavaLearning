package _多态;

public class demo_animalOperator {
    public static void main(String[] args) {
        //创建对象
        AnumalOpeator ao = new AnumalOpeator();
        Cat c = new Cat();
        ao.useAnimal(c);
        Dog d = new Dog();
        ao.useAnimal(d);


    }


}
