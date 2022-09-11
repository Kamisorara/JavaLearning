package _算法.leetcode.正数负数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 0) {
            System.out.println("Yes");
        } else if (a < 0) {
            System.out.println("No");
        } else {
            System.out.println(0);
        }
    }
}
