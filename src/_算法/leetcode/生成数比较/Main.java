package _算法.leetcode.生成数比较;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        int[] nums = new int[T];
        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }
        Arrays.sort(nums);
        System.out.println(nums[T - 1]);
    }
}
