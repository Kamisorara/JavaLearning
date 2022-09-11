package _算法.leetcode.泰波拿切;

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
            } else if (num == 1 || num == 2) {
                System.out.println("case #" + i + ":");
                System.out.println(1);
            } else {
                long[] arr = new long[num + 1];
                arr[0] = 0;
                arr[1] = 1;
                arr[2] = 1;
                for (int j = 3; j < num + 1; j++) {
                    arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
                }
                System.out.println("case #" + i + ":");
                System.out.println(arr[num]);
            }

        }
    }
}
