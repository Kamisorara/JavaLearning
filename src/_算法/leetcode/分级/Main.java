package _算法.leetcode.分级;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i >= 90 && i <= 100) {
            System.out.println("A");
        } else if (i >= 80 && i < 90) {
            System.out.println("B");
        } else if (i >= 60 && i < 80) {
            System.out.println("C");
        } else if (i < 60 && i >= 0) {
            System.out.println("D");
        }
    }
}
