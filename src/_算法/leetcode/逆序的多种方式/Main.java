package _算法.leetcode.逆序的多种方式;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            int i1 = scanner.nextInt();
            nums[i] = i1;
        }
        int left = 0, right = 4;
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
