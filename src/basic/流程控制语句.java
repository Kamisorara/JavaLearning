package basic;
//小小的案例

import java.util.Scanner;

public class 流程控制语句 {
    public static void main(String[] args) {
        //创建实例
        Scanner sc = new Scanner(System.in);

        //接收数据
        System.out.println("请输入你得了多少分?");
        int input = sc.nextInt();
        if (input >= 100 || input <= 0) {
            System.out.println("你输入的信息有误");
        } else if (input >= 95 && input <= 100) {
            System.out.println("奖励你打炮一次");
        } else if (input <= 94 && input >= 90) {
            System.out.println("xxxxxxxxx");
        } else if (input <= 89 && input >= 80) {
            System.out.println("hahahaha");
        } else {
            System.out.println("你丫的揍死你");
        }
    }
}
