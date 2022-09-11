package _算法.leetcode.Count;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sub = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() + 1 - sub.length(); i++) {
            if (s.substring(i, sub.length() + i).equals(sub)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
