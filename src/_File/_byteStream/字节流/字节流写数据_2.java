package _File._byteStream.字节流;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class 字节流写数据_2 {
    /*
        构造方法:
        FileOutputStream (String name):创建文件输出流以指定的名称写入文件
        FileOutputStream (File file):创建文件输出流以写入由指定的
        FiLe对象表示的文件写数据的三种方式:
        void write (int b):将指定的字节写入此文件输出流一次写一个字节数据
        void write (byte[] b):将 b.length字节从指定的字节数组写入此文件输出流一次写一个字节数组数据
        void write (byte[] b, int off，int len):将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据
     */
    public static void main(String[] args) throws IOException {
        //第一种构造方法
        FileOutputStream fos  = new FileOutputStream("D:\\Java测试\\fos.txt");
        //第二种构造方法
//        File file = new File("D:\\Java测试\\fos_2.txt");
//        FileOutputStream fos2 = new FileOutputStream(file);
        //简便的写法是
        FileOutputStream fos2 = new FileOutputStream(new File("D:\\Java测试\\fos_2.txt"));
        //---------------------------------------------------------------------------------
        //void write (int b):将指定的字节写入此文件输出流一次写一个字节数据
//        fos2.write(11);
//        fos2.write(22);
//        fos2.write(33);
//        fos2.write(44);
//        fos2.write(55);
//        fos2.close();

//        void write (byte[] b):将 b.length字节从指定的字节数组写入此文件输出流一次写一个字节数组数据
        //在调用上述方法是要有一个字节数组
//        byte [] bytes ={11,22,33,44,55,66,77,88,99};
//        fos2.write(bytes);
        //还有一另外一种方法
        byte [] bys = "abcde".getBytes(StandardCharsets.UTF_8);
//        fos2.write(bys);
        //void write (byte[] b, int off，int len):将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流一次写一个字节数组的部分数据
        fos2.write(bys,1,bys.length-1);  //输出长度为len的数据
        fos2.close();


    }
}
