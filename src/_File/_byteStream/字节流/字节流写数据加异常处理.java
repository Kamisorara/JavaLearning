package _File._byteStream.字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class 字节流写数据加异常处理 {
    public static void main(String[] args) {
        //可以加入finally 来释放资源
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("D:\\Java测试\\fos.txt", true);
            fos.write("hello".getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //finally:在异常处理时提供finally块来执行所有清除操作。比如说IO流中的释放资源特点:被finally控制的语句一定会执行，除非JVM退出
        /*
        try{
可能出现异常的代码;}catch(异常类名变量名){
异常的处理代码;}finally{
执行所有清除操作;
}
         */


    }
}
