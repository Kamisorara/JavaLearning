package _算法.leetcode.平衡三进制;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T + 1; i++) {
            int num = 0;
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == '-') {
                    num = num * 3 - 1;
                } else if (chars[j] == '0') {
                    num *= 3;
                } else if (chars[j] == '1') {
                    num = num * 3 + 1;
                }
            }
            list.add(num);
        }
        for (int i = 0; i < list.size()-1; i++) {
            System.out.println("case #" + i + ":");
            System.out.println(list.get(i + 1));
        }
    }
}
