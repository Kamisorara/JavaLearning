package _算法.leetcode.三的倍数;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num1, num2;
            int sum = 0;
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            int num3 = num1 - 1;
            if (num3 == 0) {
                if (num2 % 3 == 0) {
                    System.out.println("case #" + ":");
                    System.out.println(1);
                } else {
                    System.out.println("case #" + ":");
                    System.out.println(0);
                }
            } else {
                for (int j = (int) Math.pow(10, (num3 - 1)); j < Math.pow(10, (num3)); j++) {
                    if (Integer.parseInt(Integer.toString(j) + Integer.toString(num2)) % 3 == 0) sum++;
                }
            }
            System.out.println("case #" + i + ":");
            System.out.println(sum);
        }
    }
}