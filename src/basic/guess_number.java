package basic;

import java.util.Scanner;
import java.util.Random;

public class guess_number {
    public static void main(String[] args) {
        System.out.println("-----------游戏开始-----------");
        Scanner num = new Scanner(System.in);
        Random n = new Random();

        int guessNumber = n.nextInt(100) + 1;
        int i = 0;
        while (i <= 5) {
            System.out.println("请猜数字:(范围1-100)");
            int nums = num.nextInt();
            if (nums > guessNumber) {
                System.out.println("大了");
                i++;
            } else if (nums < guessNumber) {
                System.out.println("小了");
                i++;
            } else if (nums == guessNumber) {
                System.out.println("正好，你对了!");
                break;
            }
        }
        System.out.println("游戏结束");



    }
}
