package _File._byteStream.字符流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class 文件到集合 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        FileReader fr = new FileReader("D:\\Java测试\\fos.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!=null){
            array.add(line);
        }
        br.close();
        System.out.println(array);
        //遍历集合
        for (String s:array){
            System.out.println(s);
        }

    }
}
