package _File._byteStream.集合到文件数据排序;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Studentdemo {
    //需求:键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩)。要求按照成绩总分从高到低写入文本文件
    //格式:姓名,语文成绩,故学成绩英语成绩

    public static void main(String[] args) throws IOException {
        //创建TreeSet集合，使用比较器进行比较
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override   //使用一个匿名内部类的方式
            public int compare(Student s1, Student s2) {
                //成绩总分从高到低
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getEnglish() - s2.getEnglish() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        //键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "位学生的信息");
            String name = sc.nextLine();
            System.out.println("请输入语文成绩:");
            int Chinese = sc.nextInt();
            System.out.println("请输入英语成绩:");
            int English = sc.nextInt();
            System.out.println("请输入数学成绩:");
            int Math = sc.nextInt();

            //创建学生对象
            Student s = new Student();
            s.setName(name);
            s.setChinese(Chinese);
            s.setMath(Math);
            s.setEnglish(English);
            //把学生对象添加到TreeSet集合
            ts.add(s);
        }

        FileWriter fw = new FileWriter("D:\\Java测试\\学生测试2.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getEnglish()).append(",").append(s.getMath()).append(",").append(s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();

    }
}
