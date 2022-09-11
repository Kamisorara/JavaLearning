package abstract_class;

public abstract class Animal {
    //如果一个方法内没有方法体，就要定义为抽象

    public abstract void eat();  //这就是一个抽象的方法

    //一个抽象的方法一定要定义在抽象类里面
    public void sleep() {
        System.out.println("sleep");
    }
}
