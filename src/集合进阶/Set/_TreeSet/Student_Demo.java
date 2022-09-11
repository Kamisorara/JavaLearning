package 集合进阶.Set._TreeSet;

import java.util.TreeSet;

public class Student_Demo{
    public static void main(String[] args) {
        //创建TreeSet对象
        TreeSet<Student> ts = new TreeSet<Student>();
        //创建Student对象
        Student s1 = new Student("张三", 11);
        Student s2 = new Student("法外狂徒", 12);
        Student s3 = new Student("哈哈哈", 13);
        Student s4 = new Student("haha",13);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student s : ts) {
            System.out.println(s.getName() + s.getAge()); //ClassCastException  该接口对实现它的每个类的对象强加一个整体排序。这个排序被称为类的旨然排序﹐类的compareTo方法被称为其自然比较方法。
        }
    }
}
