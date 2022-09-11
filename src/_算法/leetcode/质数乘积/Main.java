package _算法.leetcode.质数乘积;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        int[] nums = new int[T];
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            nums[i] = n;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            boolean flag = true;
            for (int j = 2; j < nums[i]; j++) {
                if (nums[i] % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(nums[i]);
            }
        }
        System.out.println(list);
        int sum;
        if (list.size() == 1) {
            sum = 0;
        } else {
            sum = 1;
        }
        for (int num : list) {
            sum *= num;
        }
        System.out.println(sum);
    }
}
