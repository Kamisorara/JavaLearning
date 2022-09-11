package _算法.leetcode.最大公约数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] chars = Integer.toBinaryString(num).toCharArray();
        int n = chars.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] == '1') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}