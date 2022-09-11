package _算法.leetcode.圆;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r = scanner.nextFloat();
        double perimeter, acreage;
        perimeter = (2 * 3.14 * r);
        acreage = (3.14 * (r * r));
        DecimalFormat per = new DecimalFormat("0.00");
        String r1 = per.format(perimeter);
        String r2 = per.format(acreage);
        System.out.println(r1);
        System.out.println(r2);
    }
}
