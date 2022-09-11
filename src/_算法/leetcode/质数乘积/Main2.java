package _算法.leetcode.质数乘积;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            list.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int target = list.get(i);
            boolean still = true;
            for (int j = 2; j < target; j++) {
                if (target % j == 0) {
                    still = false;
                    break;
                }
            }
            if (still && target != 1) {
                result.add(target);
            }
        }
        //质数提取完毕
        if (result.size() == 0) {
            System.out.println(0);
        } else {
            int sum = 1;
            for (int i = 0; i < result.size(); i++) {
                sum *= result.get(i);
            }
            System.out.println(sum);
        }
    }
}
