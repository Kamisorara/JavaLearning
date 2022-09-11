package abstract_class;

public class demo_animal {
    public static void main(String[] args) {
        //创建抽象类对象
        //抽象类虽然不能直接实例化，但是能通过多态的方式，创建实例
        Animal a = new Cat();
        a.eat();
        a.sleep();


    }


}
