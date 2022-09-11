package _算法.leetcode.吵架;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        int x1 = Integer.parseInt(s1[0]);
        int y1 = Integer.parseInt(s1[1]);
        int x2 = Integer.parseInt(s1[2]);
        int y2 = Integer.parseInt(s1[3]);
        double length = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //输出No的情况 要么都是在y轴上要么都是在x轴上，并且相差的值如果大于1就不会输出No
        if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) {
            if (x1 == 0 & x2 == 0) {
                if (Math.abs(y1 - y2) <= 1) {
                    System.out.println("NO");
                }
            } else {
                if (Math.abs(x1 - x2) <= 1) {
                    System.out.println("NO");
                }
            }
        } else {

        }
    }
}
