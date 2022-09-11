package _算法.leetcode.斐波那契数列;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            if (num == 0) {
                System.out.println("case #" + i + ":");
                System.out.println(0);
            } else {
                long a = 0;
                long b = 1;
                for (int j = 0; j <= num + 1; j++) {
                    a = b;
                    b = a + b;
                    System.out.println(a);
                }

            }
        }
    }
}
