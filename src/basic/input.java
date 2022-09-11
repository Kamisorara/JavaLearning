package basic;
import java.util.Scanner;  //导入数据输入的包
//要先导包
public class input {
    public static void main(String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接收数据
        System.out.println("请输入你要输入的值：");
        int x = sc.nextInt();
        //输出数据
        System.out.println("x:"+x);

    }
}
