package _File;

import java.io.File;
import java.io.IOException;

public class File类创建功能 {
    //File类创建功能:
    //public boolean createNewFiLe():当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
    //public boolean mkdir():创建由此抽象路径名命名的目录
    //public boolean mkdirs( ):创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
    public static void main(String[] args) throws IOException {
        //需求1:我要在E: \litcast目录下创建一个文件java.txt
        File f1 = new File("D:\\Java学习\\test2.txt");
        System.out.println(f1.createNewFile()); //如果返回true就表示创建成功  如果文件存在则会返回false


        //需求2:我要在E: \litcast目录下创建一个目录JavaSE
        File f2 = new File("D:\\Java测试\\Test");
        System.out.println(f2.mkdir());


        //需求3:我要在E:\litcast目录下创建一个多级目录JavawEB \\HTML
        File f3 = new File("D:\\Java测试\\JavawEB\\HTML");
        System.out.println(f3.mkdirs());


        //需求4:我要在E: \ litcast目录下创建一个文件javase.txt
        File f4 = new File("D:\\Java测试\\javase.txt");
        System.out.println(f4.createNewFile());


    }
}
