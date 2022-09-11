package 多态实例;

public class demo_Animal {
    public static void main(String[] args) {
        //采用多态的形式进行创建
        //首先采用无参构造
        Animal a = new Cat();
        a.setName("fet cat");
        a.setAge(10);
        System.out.println(a.getName() + "," + a.getAge());
        //使用带参构造
        a = new Cat("haha", 5);
        System.out.println(a.getName() + "," + a.getAge());


    }
}
