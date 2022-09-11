package _算法.leetcode.滚动字母;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = chars.length;
        char last = chars[n - 1];
        String lastOne = String.valueOf(last);
        sb.append(lastOne);
        for (int i = 0; i < n - 1; i++) {
            char aChar = chars[i];
            String s1 = String.valueOf(aChar);
            sb.append(s1);
        }
        System.out.println(sb.toString());
    }
}
