package _File._byteStream.字节流;

import java.io.*;

public class 字节流复制视频 {
    //复制视频的方式其实和复制图片的方式类似，只是视频的字节流比图片大得多，所以需要设置缓冲
    public static void main(String[] args) throws IOException {
        //记录开始时间
        long startTime = System.currentTimeMillis();

//        method1();  //一共耗时6毫秒
//            method2();//一共耗时1毫秒
        //这样就可以感受到字节缓冲的作用了


        //结束时间
        long endTime = System.currentTimeMillis();
        System.out.println("一共耗时" + (endTime - startTime) + "毫秒");

    }

    //method 1 不带字节缓冲流得
    public static void method1() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java测试\\demo1.mp4");
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\Test\\测试复制视频.mp4");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }
        fis.close();
        fos.close();
    }

    //method 2 带字节缓冲
    public static void method2() throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Java测试\\demo1.mp4");
        BufferedInputStream bis = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\Test\\测试复制视频.mp4");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bis.close();
        bos.close();
    }
}
