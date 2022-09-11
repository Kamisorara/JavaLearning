package _多态;

public class demo_Cat {
    public static void main(String[] args) {
        //由父类引用指向子类对象
        Animal a = new Cat();   //Cat类是Animal 类的子类
        a.eat();
    }

}