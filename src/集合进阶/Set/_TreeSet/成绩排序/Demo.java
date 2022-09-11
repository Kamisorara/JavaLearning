package 集合进阶.Set._TreeSet.成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        //创建TreeSet对象
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override  //使用匿名内部类的方法
            public int compare(Student s1, Student s2) {
//                return 0;//这里默认就是0
                int num = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getMath());  //分数高的排在上面
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });
        //创建Student对象
        Student s1 = new Student("zhangsan", 101, 101);
        Student s2 = new Student("fawai", 102, 103);
        Student s3 = new Student("kuangtu", 104, 104);
        Student s4 = new Student("haha", 105, 105);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        for (Student s : ts) {
            System.out.println(s.getName() + "--" + s.getChinese() + "--" + s.getMath());
        }
    }
}
