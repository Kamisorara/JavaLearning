package _算法.leetcode.直角三角形;

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
            int c = a * a + b * b;
            System.out.println((int) (Math.sqrt(c)));
        }
    }
}
