package _File._byteStream.字符流.文件到集合升级版;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 从文件到集合 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java测试\\学生信息存储.txt");
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Student> array = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            //用split进行分割 得到一个字符串数组
            String[] strArray = line.split(",");
            //创建学生对象
            Student s = new Student();
            s.setNumber(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));
            s.setLocation(strArray[3]);
            array.add(s);

        }
        br.close();


        for (Student s : array) {
            System.out.println(s.getNumber() + "," + s.getName() + "," + s.getAge() + "," + s.getLocation());
        }
    }
}
