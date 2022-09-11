package _interface案例_cat_dog;

public class demo_Cat_Dog {
    public static void main(String[] args) {
        //创建对象
        Jumping j = new Cat();
        j.jump();
        System.out.println("---------------------------");
        //首先采用无参构造
        Animal a = new Cat();
        a.setName("fit");
        a.setAge(10);

        System.out.println(a.getName() + a.getAge());
        //采用带参数构造
        a = new Cat("fit Cat", 100);
        System.out.println(a.getName() + a.getAge());
        //上面发现接口只能调用接口的方法，而类只能调用类的方法
        System.out.println("---------------------------");
        //回到以前创建实例的方法
        Cat c = new Cat();
        c.eat();
        c.jump();
        c.setName("fit");
        c.setAge(1000);
        System.out.println(a.getName() + a.getAge());
        /*
        eat fish
        Cat can jump higher than dog.
        fit Cat100
         */
        //最终在使用时候还是使用子类，这样有最多的使用方法
        System.out.println("------------------------");
        Dog d = new Dog();
        d.eat();
        d.jump();


    }


}
