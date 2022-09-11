package _算法.leetcode.重力加速度;

import _多态.AnumalOpeator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            int i = scanner.nextInt();
            float s = 0;
            if (i == 1) {
                s = 5;
            } else if (i == 2) {
                s = 10;
            } else {
                s = 11.75F;
                for (int j = 3; j < i + 1; j++) {
                    s += 3;
                }
                float t_2 = (float) ((2 * s) / 9.8);
                System.out.printf("%.3f",Math.sqrt(t_2));
            }
        }
    }
}
