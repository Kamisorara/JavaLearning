package _算法.leetcode.细胞分裂;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            int num = scanner.nextInt();
            int standard_1 = 1;
            int standard_2 = 0;
            int standard_3 = 0;
            int standard_4 = 0;
            if (num > 0 && num < 4) {
                System.out.println(1);
            } else {
                for (int i = 0; i < num - 3; i++) {
                    standard_1 = standard_1 + standard_2;
                    standard_2 = standard_3;
                    standard_3 = standard_4;
                    standard_4 = standard_1;
                }
                System.out.println(standard_1 + standard_2 + standard_3 + standard_4);
            }
        }
    }
}
