package _File._byteStream.字符流;

import java.io.*;

public class 复制java文件 {
    //  案例:使用字符流复制Java文件
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java测试\\demo1.java");
        InputStreamReader isr = new InputStreamReader(fis);
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\Test\\被复制的.java");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            //写入
//            osw.write(ch);
//        }

        //一次写入一个字符字符数组
        char[] ch = new char[1024];
        int len;
        while ((len = isr.read()) != -1) {
            osw.write(ch, 0, len);
        }
        isr.close();
        osw.close();

    }
}
