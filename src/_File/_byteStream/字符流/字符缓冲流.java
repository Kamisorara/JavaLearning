package _File._byteStream.字符流;

import javax.swing.*;
import java.io.*;

public class 字符缓冲流 {
    /*
    字符缓冲流:
        BufferedWriter:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效与人，可以指定缓冲区大小，或者可以接受默认大小。默认值足够大，可用于大多数用途
        BufferedReader:从字符输入流读取文本，缓冲字符，以提供字符,
        数组和行的高效读取，可以指定
        缓冲区大小，或者可以使用默认大小。默认值足够大，可用于大多数用途
     */
    public static void main(String[] args) throws IOException {

//        FileWriter fw = new FileWriter("D:\\Java测试\\demo1.txt");
//        BufferedWriter bw = new BufferedWriter(fw);
//        bw.write("哈哈哈");
//        bw.close();

        FileReader fd = new FileReader("D:\\Java测试\\demo1.txt");
        BufferedReader br = new BufferedReader(fd);
//        int ch;   //一次读取一个字符
//        while ((ch = br.read()) != -1) {
//            System.out.print((char) ch);
//        }
        //一次读取一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs)) != -1) {
            System.out.println(new String(chs,0,len));
        }
    }


}
