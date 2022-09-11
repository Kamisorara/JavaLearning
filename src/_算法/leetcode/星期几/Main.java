package _算法.leetcode.星期几;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("Mon")) {
            System.out.println("Monday");
        } else if (s.equals("Tue")) {
            System.out.println("Tuesday");
        } else if (s.equals("Wed")) {
            System.out.println("Wednesday");
        } else if (s.equals("Fri")) {
            System.out.println("Friday");
        } else if (s.equals("Sat")) {
            System.out.println("Saturday");
        } else if (s.equals("Sun")) {
            System.out.println("Sunday");
        } else if (s.equals("Thu")) {
            System.out.println("Thursday");
        }
    }
}
