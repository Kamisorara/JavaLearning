package 集合进阶.List;

import 日期类._simpleDateFormat;

import java.util.ArrayList;
import java.util.List;

public class Student_demo {
    public static void main(String[] args) {
        //创建List对象
        List<Student> list = new ArrayList<>();

        //创建Student对象
        Student s1 = new Student("张三", 10);
        Student s2 = new Student("法外狂徒", 20);
        Student s3 = new Student("哈哈哈", 30);
        list.add(s1);
        list.add(s2);
        list.add(s3);


        //遍历学生List
        for (int i = 0; i < list.size(); i++) {
            Student st = list.get(i);
            System.out.println(st.getName() + st.getAge());
        }

    }


}
