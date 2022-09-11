package _inherit;

public class Teacher extends Student {

    public Teacher() {
    }

    //因为被继承的是一个私有的 所以可以通过super
    public Teacher(String name, String age) {
        super(name, age);  //继承父类的name 和age
    }


    public void teach() {
        System.out.println("teach");
    }
}
