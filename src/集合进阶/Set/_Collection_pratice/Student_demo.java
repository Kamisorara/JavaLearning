package 集合进阶.Set._Collection_pratice;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_demo {
    public static void main(String[] args) {
        //创建ArrayList集合对象
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("luolaoshi", 20);
        Student s3 = new Student("hahaha", 30);
        Student s4 = new Student("zhejiang", 40);
        Student s5 = new Student("shanghai", 40);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        //使用Collections对ArrayList进行排序
        //sort (List<T> list,Comparator<? super T> c)
        Collections.sort(list, new Comparator<Student>() {    //添加比较器，用匿名内部类的方式
            @Override
            public int compare(Student s1, Student s2) {
                //按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
//                return 0;
                int num = s2.getAge() - s1.getAge();

                //接下来进行操作如果年龄相同就对名字的字母顺序进行排序
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //遍历集合
        for (Student s : list) {
            System.out.println(s.getName() + s.getAge());
        }
    }

}
