package _算法.leetcode.中间数;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        int[] nums = new int[T];
        for (int i = 0; i < T; i++) {
            int i1 = scanner.nextInt();
            nums[i] = i1;
        }

        Arrays.sort(nums);
        int mid = T / 2;
        System.out.println(nums[mid]);
    }
}
