package _算法.leetcode.demo3;

import java.util.Scanner;

//进制转换
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int num1;
            int num2;
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            String s = Integer.toString(num1, num2);
            if (num2 > 10) {
                String s1 = s.toUpperCase();
                System.out.println(s1);
            } else {
                System.out.println(s);
            }

        }
    }
}
