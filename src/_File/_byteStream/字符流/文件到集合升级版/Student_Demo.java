package _File._byteStream.字符流.文件到集合升级版;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Student_Demo {
    //需求:把ArrayList集合中的学生数据写入到文本文件。要求:每一个学生对象的数据作为文件中的一行数据
    //格式:学号,姓名,年龄,居往地

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Java测试\\学生信息存储.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        ArrayList<Student> array = new ArrayList<>();
        //创建学生类对象
        Student s1 = new Student("ka01", "Kamisora", 20, "翻斗大街翻斗花园");
        Student s2 = new Student("ka02", "张三", 33, "翻斗大街222");
        Student s3 = new Student("ka03", "老王", 44, "翻斗大街123");
        Student s4 = new Student("ka04", "法外狂徒", 20, "翻斗大街111");
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //遍历集合添加进文件里
        for (Student s : array) {
            //把学生对象拼接成指定字符串格式
            StringBuilder sb = new StringBuilder();
            sb.append(s.getNumber()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getLocation());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();


    }
}
