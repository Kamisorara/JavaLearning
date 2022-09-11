package _算法.leetcode.回文数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
//        String s = Integer.toString(nums);
        int left = 0, right = s.length() - 1;
        boolean still = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                System.out.println("No");
                still = false;
                break;
            }
            left++;
            right--;
        }
        if (still) {
            System.out.println("Yes");
        }
    }
}
