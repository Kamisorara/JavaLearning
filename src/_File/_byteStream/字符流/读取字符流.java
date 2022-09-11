package _File._byteStream.字符流;

import java.io.*;

public class 读取字符流 {
    //构造方法:
    //InputStreamReader (InputStream in):创建一个使用默认字符集的InputStreamReader
    //读数据的2种方式:
    //int read ():一次读—个字符数据
    //int read ( char[] cbuf):一次读一个字符数组数据
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java测试\\fos.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        //int read() 一次读取一个字符数据
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print((char) ch);
//        }
        //一次读取一个字符数组数据
        char[] chars = new char[1024];
        int len;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        //释放资源
        isr.close();

    }
}
