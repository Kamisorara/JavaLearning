package _算法.leetcode.多行固定且无固定个数;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s;
            s = scanner.nextLine();
            String[] s1 = s.split(" ");
            int sum = 0;
            for (int i = 1; i < s1.length; i++) {
                int i1 = Integer.parseInt(s1[i]);
                sum += i1;
            }
            System.out.println(sum);
        }
    }
}
