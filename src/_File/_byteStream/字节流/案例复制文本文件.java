package _File._byteStream.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class 案例复制文本文件 {
    //复制其实就是数据读取和写入的操作的过程
    public static void main(String[] args) throws IOException {
        //首先读取数据
        FileInputStream fis = new FileInputStream("D:\\Java测试\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\Test\\fos.txt");
        int by;
        while ((by = fis.read()) != -1) {
            fos.write((char) by);
        }

        fis.close();
        fos.close();
        //这样就可以把txt复制过来了

    }
}
