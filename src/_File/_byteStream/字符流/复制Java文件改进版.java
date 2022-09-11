package _File._byteStream.字符流;

import java.io.*;

public class 复制Java文件改进版 {
    public static void main(String[] args) throws IOException {
        //需求:把模块目录下的“ConversionStreamDemo.java”复制到模块目录下的“Copyjava"
        //分析:
        //转换流的名字比较长，而我们常见的操作都是按照本地默认编码实现的，所以，为了简化书写，转换流提供了对应的子类
        /*
        FileReader:用于读取字符文件的便捷类
        FileReader(String fileName)

        3FileWriter:用于写入字符文件的便捷类
        FileWriter(String fileName)
        为了简化书写可以这么写
         */

        //根据数据源创建字符输八流对象
        FileReader fr = new FileReader("D:\\Java测试\\demo1.java");
        //根据目的创建字符输出流对象
        FileWriter fw = new FileWriter("D:\\Java测试\\Test\\这只是测试.java");


        //读写数据，复制文件
//        int ch;
//        while ((ch = fr.read()) != -1) {
//            fw.write(ch);
//        }

        //一次一个字符数组的方式
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(chs, 0, len);
        }


        //释放资源
        fr.close();
        fw.close();


    }
}
