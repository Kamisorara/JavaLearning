package _inherit;

public class demo_Student_Teacher {
    public static void main(String[] args) {
        //创建teacher对象  先通过无参构造方法
        Teacher t1 = new Teacher();
        t1.setName("张三");
        t1.setAge("1000");
        System.out.println(t1.getName() + t1.getAge());
        t1.teach();
        //再通过带参构造
        Teacher t2 = new Teacher("法外狂徒", "1000");
        System.out.println(t2.getName() + t2.getAge());
        t2.teach();
    }
}
