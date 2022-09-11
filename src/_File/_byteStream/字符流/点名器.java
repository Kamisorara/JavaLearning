package _File._byteStream.字符流;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class 点名器 {
    //需求:我有一个文件里面存储了班级同学的姓名，每一个姓名占一行，要求通过程序实现随机点名器
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java测试\\fos.txt");
        BufferedReader br = new BufferedReader(fr);


        //创建ArrayList集合对象
        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {
            array.add(line);
        }
        //释放资源
        br.close();


        Random rd = new Random();
        int index = rd.nextInt(array.size());

        String s = array.get(index);
        System.out.println("今天的幸运者是：" + s);


    }
}
