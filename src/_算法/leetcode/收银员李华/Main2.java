package _算法.leetcode.收银员李华;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int[] next = new int[7];
        float sum = 0;
        int n = 0;
        while (sum < f && n < 6) {
            n++;
            while (sum + 1 <= f) {
                next[6] += 1;
                sum += 1;
            }
            while (sum + 0.5 <= f) {
                next[5] += 1;
                sum += 0.5;
            }
            while (sum + 0.2 <= f) {
                next[4] += 1;
                sum += 0.2;
            }
            while (sum + 0.1 <= f) {
                next[3] += 1;
                sum += 0.1;
            }
            while (sum + 0.05 <= f) {
                next[2] += 1;
                sum += 1;
            }
            while (sum + 0.02 <= f) {
                next[1] += 1;
                sum += 0.02;
            }
            while (sum + 0.01 <= f) {
                next[0] += 1;
                sum += 0.01;
            }
        }
        for (int i = 0; i < next.length; i++) {
            if (i == next.length - 1) {
                System.out.print(next[i]);
            } else if (i == 0) {
                if (n == 6 && f<64) {
                    System.out.print(next[i] + 1 + " ");
                } else if (n==6 ){
                    System.out.print(next[i] + " ");
                }
            } else {
                System.out.print(next[i] + " ");
            }

        }
    }
}

