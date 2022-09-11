package IO.转换流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class basic {
    public static void main(String[] args) {
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("D:\\Code Learning\\Java测试\\Test\\text.txt"))) {
            writer.write("lbwnb");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
