package _File._byteStream.字符流;

import java.io.*;
import java.util.Arrays;

public class 字符缓冲流复制Java文件 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\Java测试\\demo1.java");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("D:\\Java测试\\Test2\\demo1.java");
        BufferedWriter bw = new BufferedWriter(fw);
        //一次读取一个字符
//        int ch;
//        while ((ch = br.read()) != -1) {
//            bw.write(ch);
//        }
        //一次读取一个字符数组
        int len;
        char[] chars = new char[1024];
        while ((len = br.read(chars)) != -1) {
            bw.write(chars, 0, len);
        }
        br.close();
        bw.close();


    }
}


