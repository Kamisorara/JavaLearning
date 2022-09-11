package _File;

import java.io.File;
import java.io.IOException;

public class File类的判断和获取功能 {
    //File类判断和获取功能
    //方法名
    //说明
    //public boolean isDirectory()
    //测试此抽象路径名表示的File是否为目录
    //public boolean isFile)
    //测试此抽象路径名表示的File是否为文件
    //public boolean exists)
    //测试此抽象路径名表示的File是否存在
    //public String getAbsolutePath()
    //返回此抽象路径名的绝对路径名字符串
    //public String getPath(
    //将此抽象路径名转换为路径名字符
    //串
    //public String getName(
    //返回由此抽象路径名表示的文件或
    //目录的名称
    //public String[] list()
    //返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
    //public File[]listFiles(
    //返回此抽象路径名表示的目录中的文件和目录的File对象数组
    public static void main(String[] args) throws IOException {
        //创建一个File对象
        File f1 = new File("D:\\Java测试\\java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("------------------");
        //首先测试文件存在
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());  //是否是文件
        System.out.println(f1.exists());  //是否存在
        System.out.println("------------------");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());
        System.out.println("-------------------------------------------------");


        File f2 = new File("D:\\Java测试");
        String[] list = f2.list(); //[Ljava.lang.String;@776ec8df
        System.out.println(list);
        for (String s : list) {
            System.out.println(s);
        } //这种方式输出更加简洁
        System.out.println("--------------------------------------------------");
        File[] file = f2.listFiles();
        for (File file1 : file) {
//            System.out.println(file1);
            if (file1.isFile()) {
                System.out.println(file1.getName()); //得到所有文件的名称
            }
        }
    }
}
