package IO.FileInoutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class _FileInputStream {

    public static void main(String[] args) {
        //JDK提供了一种新的方式 按照下面这种方式就可以不用写close
        //1.输入流
        try (FileInputStream fileInputStream = new FileInputStream("D:\\Code Learning\\Java测试\\Test\\fos.txt")) {
            byte[] bytes = new byte[fileInputStream.available()];
//            System.out.println((char) fileInputStream.read()); //如果返回的是-1就是表示已经读完了
            System.out.println(fileInputStream.read(bytes)); //一次性读取
            System.out.println(new String(bytes));//通过String(bytes) 构造方法得到新的字符串
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream("D:\\Code Learning\\Java测试\\Test\\fos.txt", true)) {
            fileOutputStream.write("aaaa".getBytes());
                    fileOutputStream.flush(); //强制刷新写进去
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
