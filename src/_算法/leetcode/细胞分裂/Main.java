package _算法.leetcode.细胞分裂;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("0")) {
            int minute = scanner.nextInt();
            int sum = 0;
            if (minute < 4) {
                System.out.println(1);
            } else if (minute == 4) {
                System.out.println(2);
            } else if (minute == 5) {
                System.out.println(3);
            } else if (minute == 6) {
                System.out.println(4);
            } else {
                int stage_1 = 2;
                int stage_2 = 1;
                int stage_3 = 1;
                int stage_4 = 2;
                for (int i = 7; i <= minute; i++) {
                    stage_1 += stage_2;
                    stage_3 = stage_4-1;
                    stage_2 = stage_3 - 1;
                    stage_4 = stage_1 ;
                }
                sum = stage_1 + stage_2 + stage_3 + stage_4;
            }
            System.out.println(sum);
        }
    }
}
