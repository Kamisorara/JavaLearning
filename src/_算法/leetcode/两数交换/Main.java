package _算法.leetcode.两数交换;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y = 0;
        while (sc.hasNext()) {
            x = sc.nextInt();
            y = sc.nextInt();
        }
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);
    }
}