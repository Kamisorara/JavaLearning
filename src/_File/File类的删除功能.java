package _File;

import java.io.File;
import java.io.IOException;

public class File类的删除功能 {
    //public boolean delete()
    //删除由此抽象路径名表示的文件或目录
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\Java测试\\test3.txt");
        f1.createNewFile();
        System.out.println(f1.delete());  //输出true的话就是删除成功
        //绝对路径和相对路径的区别
        //绝对路径:完整的路径名，不需要任何其他信息就可以定位它所表示的文件。
        // 例如: E:\\itcast\ljava.txt相对路径:必须使用取自其他路径名的信息进行解释。例: myFilelyava.txt
        File f2 = new File("Java学习\\demo1.txt");//在当前模块目录下创建文件
        System.out.println(f2.createNewFile());
        System.out.println(f2.delete());
        //删除目录时的注意事项:
        //如果一个目录中有内容(目录，文件)，不能直接删除。应该先删除目录中的内容，最后才能删除目录

    }
}
