package _Arraylist;

import java.util.ArrayList;

public class 案例存储学生对象并遍历 {
    public static void main(String[] args) {
        //存储学生对象并遍历 创建一个学生集合，存储三个学生对象，是应用程序在学生对象中遍历该集合
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //创建学生对象
        Student s1 = new Student("张三", 1000);
        Student s2 = new Student("法外狂徒", 1000);
        Student s3 = new Student("哈哈哈", 1000);

        //将学生对象添加进集合中
        array.add(s1);
        array.add(s2);
        array.add(s3);


        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
//            System.out.println(s);  这样的写法是错误的，会输出内存
            System.out.println(s.getName() + "," + s.getAge()); //要以这种方式输出

        }


    }
}
