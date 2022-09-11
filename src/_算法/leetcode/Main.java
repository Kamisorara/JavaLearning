package _算法.leetcode;

import java.util.Scanner;
//种小麦
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T; //组数
        T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int n;
            n = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                int m;
                m = scanner.nextInt();
                if (m <= 10) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
