package abstract_instance;

public class demo_abstract {
    public static void main(String[] args) {
        //创建实例
        //首先无参构造
        Animal a = new Cat();
        a.setName("fit");
        a.setAge(10);
        a.eat();
        System.out.println(a.getName() + a.getAge());
        //有参构造
        a = new Cat("fff", 5);
        System.out.println(a.getName() + a.getAge());
        a.eat();


    }


}
