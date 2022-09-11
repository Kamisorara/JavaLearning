package _File._byteStream.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class 字节流写数据的两个小问题 {
    //字节流写数据的两个小问题
    /*
    不同的系统之间的换行符是不同
    windows \r\n
    linux \n
    mac \r
     */
    //字节流写数据如何实现追加写入呢?

    /*
    public FileOutputStream(String name,boolean append)
    创建文件输出流以指定的名称写入文件。如果第二个参数strue，则
    则字节将写入文件的末尾而不是开头
     */
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\fos.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\fos.txt",true);


        //写数据
        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.write("\n".getBytes(StandardCharsets.UTF_8));  //写完数据后写换行符
        }
        //释放资源
        fos.close();

    }
}
