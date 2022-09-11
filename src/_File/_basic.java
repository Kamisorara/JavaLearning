package _File;

import java.io.File;

public class _basic {
    //File:它是文件和目录路径名的抽象表示
    //文件和目录是可以通过File封装成对象的
    //对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。它可以是存在的，也可以是不存在的.将来是要通过具体的操作把这个路径的内容转换为具体存在的
    //File(File parent,String child)
    //从父抽象路径名和子路径名字符串创建新的File实例。
    //File(String pathname)
    //通过将给定的路径名字符串转换为抽象路径名来创建新的Eile实例。
    //,File(String parent,String child)
    //从父路径名字符串和子路径名字符串创建新的File实例。
    public static void main(String[] args) {
        //通过给定路径名来创建File对象
        File f1 = new File("D:\\java学习\\test1.txt");
        System.out.println(f1);

        File f2 = new File("D:\\java学习", "test1.txt");
        System.out.println(f2);


        File f3 = new File("D:\\Java学习");
        File f4 = new File(f3, "test1.txt");
        System.out.println(f4);

    }
}
