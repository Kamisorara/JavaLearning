package IO.字节缓冲流;

import java.io.*;

public class demo {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Code Learning\\Java测试\\Test\\text.txt"))) {
            System.out.println((char) bis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
