package _File._byteStream.字符流;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;


//—个汉字存储:
//如果是GBK编码，占用2个字节如果是UTF-8编码，占用3个字节
public class _basic {
    public static void main(String[] args) {
        String s = "张三"; //[-27, -68, -96, -28, -72, -119]
        byte[] bys = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bys));
    }
}
