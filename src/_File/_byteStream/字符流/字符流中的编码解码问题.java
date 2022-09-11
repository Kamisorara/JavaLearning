package _File._byteStream.字符流;

import _File.File类创建功能;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class 字符流中的编码解码问题 {
    //字符流抽象基类
    //Reader:字符输入流的抽象类
    //Writer:字符输出流的抽象类

    /*
    InputStreamReader:是从字节流到字符流的桥梁
    它读取字节,并使用指定的编码将其解码为字符
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
    OutputStreamWriter:是从字符流到字节流的桥梁
    是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
    它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
     */

    public static void main(String[] args) throws IOException {
        //字符流中和编码解码问题相关的两个类
        //InputStreamReader
        //OutputStreamWriter
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\fos.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
//        osw.write("哈哈哈");
        //写入一个字符数组
//        String s = "哈哈哈哈";
//        byte[] bys = s.getBytes(StandardCharsets.UTF_8);
//        osw.write(new String(bys));
        //3.5字符流写数据的5种方式
        //void write(int c)
        //写一个字符
        //void write(char[] cbuf)
        //写入一个字符数组
        char [] a= {'a','b','c','d'};
        osw.write(a);

        //void write(char[] cbuf, int off, int len)
        //写入字符数组的一部分
        //void write(String str)
        //写一个字符串
//        String s= "法外狂徒";
//        osw.write(s,0,2);
//        //void write(String str,int off, int len)
//        //写一个字符串的一部分
        osw.close();
//方法名
//说明
//flush()
//刷新流，还可以继续写数据
//关闭流，释放资源,
//但是在关闭之前会先刷新流。一旦
//close()
//关闭，就不能再写数据
        //--------------------------------------------------------------------------
        FileInputStream fis = new FileInputStream("D:\\Java测试\\fos.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read())!=-1){
            System.out.print((char) ch);
        }
        isr.close();

    }
}
