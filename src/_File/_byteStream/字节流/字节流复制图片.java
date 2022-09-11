package _File._byteStream.字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流复制图片 {
    //其实复制图片的过程和复制文档的过程类似，图片实际上也是又字节组成
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\python学习项目\\p1.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Java测试\\p1.jpg");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            //将读取到的字节数组写入新的文件中
            fos.write(bys,0,len); //不用经过任何转换，直接将字节码数组写入就完成了复制
        }
        //释放内存
        fis.close();
        fos.close();
    }
}
