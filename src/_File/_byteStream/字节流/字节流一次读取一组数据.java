package _File._byteStream.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 字节流一次读取一组数据 {
    /*
    字节流读数据(一次读一个字节数组数据)
    需求:把文件fos.txt中的内容读取出来在控制台输出
    使用字节输入流读数据的步骤:
    创建字节输入流对象
    调用字节输入流对象的读数据方法释放资源
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java测试\\Test\\fos.txt");

//        //一次读取一个字节数组的数据
//        //int read (byte[] b):从该输入流读取最多b.Length个字节的数据到一个字节数组
//        byte[] bys = new byte[5];
//        //第一次读取数据
//        int len = fis.read(bys);
//        System.out.println(len);
//        //String类里有个方法可以字节数组编程字符串
//        System.out.println(new String(bys));
//
//        //第二次读取数据
//        len = fis.read(bys);
//        System.out.println(len);
//        //String类里有个方法可以字节数组编程字符串
//        System.out.println(new String(bys,0,len));
        byte[] bys = new byte[1024];   //一般给的是1024及其整数倍
        int len;
        while ((len = fis.read(bys)) != -1) {   //实际长度不是-1表示的就是有数据
            System.out.println(new String(bys, 0, len));
        }
        //释放资源
        fis.close();

    }
}
