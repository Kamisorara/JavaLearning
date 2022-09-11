package _File._byteStream.字节流;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class 字节缓冲流 {
    //字节缓冲流:
    //BufferOutputstream:该类实现缓冲输出流。通过设置这样的输出流，应用程序可以向底层输出流写入字节，而不必为写入的每个字节导致底层系统的调用
    //BufferedInputStream:创建BufferedInputStream将创建一个内部缓冲区数组。当从流中读取或跳过字节时，内部缓冲区将根据需要从所包含的输入流中重新填充，一次很多字节
    public static void main(String[] args) throws IOException {
        //为什么构造方法需要的是字节流，而不是具体的文件或者路径呢?
        //字节缓冲流仅仅提供缓冲区，而真正的读写数据还得依靠基本的字节流对象进行操作
//        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\fos.txt");
//        //字节缓冲输出流:BufferedOutputStream (OutputStream out)
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//        //也有更加简便的写法
////        BufferedOutputStream bos = new BufferedOutputStream(new FilterOutputStream("D:\\Java测试\\fos.txt"));
//
//
//        //接下来写数据
//        bos.write("hello\r\n".getBytes(StandardCharsets.UTF_8));
//        bos.write("world\r\n".getBytes(StandardCharsets.UTF_8));
//        //释放资源
//        bos.close();

        //接下来是字节缓冲输入流
        FileInputStream fis = new FileInputStream("D:\\Java测试\\fos.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);


        //读数据有两种方式
        //1.一次只读取一个字节数据
//        int by;
//        while ((by = fis.read()) != -1) {
//            System.out.println((char) by);
//        }
        //最后不要忘了释放资源
//        bis.close();


        //2.方法2 一次读取一个字节数组的数据
        byte[] bys = new byte[1024];
        int len;
        while ((len =bis.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }
        bis.close();
    }
}
