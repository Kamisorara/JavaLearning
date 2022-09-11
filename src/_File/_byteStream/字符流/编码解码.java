package _File._byteStream.字符流;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class 编码解码 {
    //编码;
    //byte[] getBytes(String charsetName):使用指定的字符集将该 string编码为一系列字节，将结果存储到新的字节数组中
    //解码;
    //String(byte[ ] bytes):通过使用平台的默认字符集解码指定的字节数组来构造新的 String
    //String(byte[] bytes,String charsetName):通过指定的字符集解码指定的字节数组来构造新的String
    public static void main(String[] args) {
        //首先定义一个字符
        String s = "张三";

        //编码
        byte[] bys = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bys));
        System.out.println(new String(bys)); //解码操作
    }
}
