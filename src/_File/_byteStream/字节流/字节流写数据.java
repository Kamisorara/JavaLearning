package _File._byteStream.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流写数据 {
    //字节流抽象基类
    //InputStream:这个抽象类是表示字节输入流的所有类的超类
    // OutputStream:这个抽象类是表示字节输出流的所有类的超类
    //子类名特点:子类名称都是以其父类名作为子类名的后缀


    /*
    FileOutputStream:文件输出流用于将数据写入File
    FileQutputStream(String name):创建文件输出流以指定的名称写入文件
     */
    //创建文件输出流以指定的名称写入文件
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\fos.txt");
        /*
        做了三件事情:
        A:调用系统功能创建了文件
        B:创建了字节输出流对象
        C:让字节输出流对象指向创建好的文件
         */
        //void write (int b):将指定的字节写入此文件输出流
        fos.write(97);  //最后会转换ascii所对应的a   write方法一次就是写入一个字节的数据


        //最后要释放资源
        fos.close();


    }

}
