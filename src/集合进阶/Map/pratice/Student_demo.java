package 集合进阶.Map.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student_demo {
    public static void main(String[] args) {
        //用HashMap存储学生对象并遍历
        Map<String, Student> map = new HashMap<>();
        Student s1 = new Student("张三", 10);
        Student s2 = new Student("法外狂徒", 20);
        map.put("ling001", s1);
        map.put("ling002", s2);

        //通过键找值的方式 ：方式1
        Set<String> student = map.keySet();
        for (String s : student) {
            Student student1 = map.get(s);
            String name = student1.getName();
            int age = student1.getAge();
            System.out.println(name + age);
        }


        //遍历Student对象 获取整个键值对对象的方式：方式2
//        Set<Map.Entry<String, Student>> entry = map.entrySet();
//        for (Map.Entry<String, Student> entry1 : entry) {
//            String key = entry1.getKey();
//            Student value = entry1.getValue();
//            System.out.println("k---" + key + "---v---" + value.getName() + value.getAge());
//        }
    }
}
