package 集合进阶.Map.pratice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Student_demo {
    public static void main(String[] args) {
        Map<Student, String> map = new HashMap<>();
        //先创建Student 对象
        Student s1 = new Student("张三", 10);
        Student s2 = new Student("法外狂徒", 20);
        Student s3 = new Student("张三", 11);

        map.put(s1, "浙江");
        map.put(s2, "广州");
        map.put(s3, "浙江");

        //获取键值对
        Set<Student> student = map.keySet();

        for (Student st : student) {
            String s = map.get(st);
            System.out.println(s + st.getName() + st.getAge());
        }
    }
}
