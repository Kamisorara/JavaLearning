package _算法.leetcode.demo4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for (int k = 0; k < T; k++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            for (int i = num1; i > 0; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    System.out.println("case #" + k + ":");
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
