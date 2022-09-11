package _算法.leetcode.输入7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < T + 1; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }

        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i);
            String[] s1 = s.split(" ");
            int sum = 0;
            for (int j = 1; j < s1.length; j++) {
                sum += Integer.parseInt(s1[j]);
            }
            System.out.println(sum);
        }
    }
}