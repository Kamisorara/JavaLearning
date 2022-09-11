package 集合进阶.pratice1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Student_demo {
    public static void main(String[] args) {
        //测试学生类对象
        //创建Collection对象
        Collection<Student> c = new ArrayList<Student>();

        //创建学生对象
        Student st1 = new Student("张三", 10);
        Student st2 = new Student("法外狂徒", 100);
        Student st3 = new Student("hahaha", 10);

        c.add(st1);
        c.add(st2);
        c.add(st3);
        //获取迭代器
        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s= it.next();
//            System.out.println(s);//不能直接这样输出
            System.out.println(s.getName()+s.getAge());

        }


    }
}
