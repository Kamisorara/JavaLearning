package _算法.leetcode.字符串的组成;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        boolean still = true;
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if (aChar >= '0' && aChar <= '9' || aChar >= 'a' && aChar <= 'z') {
                still = true;
            } else {
                still = false;
                break;
            }
        }
        if (still) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
