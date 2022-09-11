package 集合进阶.List.pratice2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Student_demo {
    //List集合存储学生对象用三种方式遍历
    public static void main(String[] args) {
        //创建List集合并添加元素
        List<Student> list = new ArrayList<>();

        Student s1 = new Student("张三", 10);
        Student st2 = new Student("法外狂徒", 20);
        list.add(s1);
        list.add(st2);

        //1.使用Iterator迭代
        Iterator<Student> lit = list.iterator();
        while (lit.hasNext()) {
            Student s = lit.next();
            System.out.println(s.getName() + s.getAge());
        }

        //2.使用for循环
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + s.getAge());

        }
        //3.使用增强for
        for (Student s :list){
            System.out.println(s.getName()+s.getAge());
        }

    }
}
