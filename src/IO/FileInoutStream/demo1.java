package IO.FileInoutStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        try (FileOutputStream outputStream = new FileOutputStream("D:\\Code Learning\\Java测试\\Test\\text.txt");
             FileInputStream inputStream = new FileInputStream("D:\\Code Learning\\Java测试\\Test\\fos.txt")) {
            byte[] bytes = new byte[1024];  //选择适用长度为1024的byte[]作为传输介质
            int tmp; //存储本地读取数字
            while ((tmp = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, tmp);
            }
            outputStream.flush(); //保险起见
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
