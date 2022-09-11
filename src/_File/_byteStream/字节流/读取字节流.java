package _File._byteStream.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 读取字节流 {
    //字节流读数据(一次读一个字节数据)需求:把文件fos.txt中的内容读取出来在控制台输出

    //使用字节输入流读数据的步骤;
    //1:创建字节输入流对象
    //2:调用字节输入流对象的读数据方法
    // 3:释放资源
    public static void main(String[] args) throws IOException {
        /*
        FilelnputStream: 从文件系统中的文件获取输入字节
        FilelnputStream(String name):通过打开与实际文件的连接来创建一个FilelnputStream，该文件由文件系统中的路径名name命名
         */
        FileInputStream fis = new FileInputStream("D:\\Java测试\\fos.txt");
        //第一次读取数据
//        int by = fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
//
//        //第二次读取数据
//        by =fis.read();
//        System.out.println(by);
//        System.out.println((char) by);
        //如果文件到达末尾返回的值就是-1


        //用循环来改进读取操作
//        int by = fis.read();
//        while (by != -1) {
//            System.out.print((char) by);
//            by = fis.read();
//        }


        //优化上面的程序
        int by;
        while ((by = fis.read()) != -1){
            System.out.print((char) by);
        }

            //释放资源
            fis.close();

    }
}
