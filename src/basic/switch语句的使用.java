package basic;
import java.util.Scanner;
public class switch语句的使用 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        System.out.println("请输入现在是几月");
        int input = a.nextInt();

        switch (input){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            default:
                System.out.println("您输入的季节有误");
                break;
        }
        System.out.println("结束");


    }
}
