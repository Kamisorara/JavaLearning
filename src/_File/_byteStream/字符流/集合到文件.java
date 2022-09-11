package _File._byteStream.字符流;

import java.io.*;
import java.util.ArrayList;

public class 集合到文件 {
    //需求:把ArrayList集合中的字符串数据写入到文本文件。要求:每一个字符串元素作为文件中的一行数据
    public static void main(String[] args) throws IOException {
        //创建ArrayList
        ArrayList<String> array = new ArrayList<>();
        //往集合存储字符串元素
        array.add("hello");
        array.add("world");


        FileWriter fr = new FileWriter("D:\\Java测试\\fos.txt");
        BufferedWriter br = new BufferedWriter(fr);
        for (String s : array) {
            br.write(s);
            br.newLine();
            br.flush();
        }
        br.close();
    }
}
