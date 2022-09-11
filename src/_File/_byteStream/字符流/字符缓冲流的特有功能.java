package _File._byteStream.字符流;

import java.io.*;

public class 字符缓冲流的特有功能 {
    //BufferedWriter:
    //void newLine():写一行行分隔符，行分隔符字符串由系统属性定义
    //BufferedReader:
    //publicString readLine():读一行文字。结果包含行的内容的字符串，不包括任何行终止字符，
    // 如果流的结尾已经到达，则为null
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\Java测试\\fos.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        FileReader fr = new FileReader("D:\\Java测试\\fos.txt");
        BufferedReader br = new BufferedReader(fr);
        //写数据
        for(int i = 0;i<10;i++){
            bw.write("哈哈哈");
            bw.newLine(); //换行
        }
        String line;
        while ((line =br.readLine())!=null){
            System.out.println(line);
        }
        bw.close();
        br.close();


    }
}
