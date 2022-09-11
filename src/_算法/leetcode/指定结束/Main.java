package _算法.leetcode.指定结束;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            if (a == 0 & b == 0) {
                break;
            } else {
                System.out.println(a+b);
            }
        }
    }
}
