package abstract_class;

public class Cat extends Animal{
    //抽象类的子类，要么自己是一个抽象类，要么就重写抽象类的方法
    @Override
    public void eat() {
        System.out.println("eat fish");
    }
}
