package _算法.leetcode.减少吵架;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 = s.split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            list.add(Integer.parseInt(s1[i]));
        }
        int x1 = list.get(0);
        int y1 = list.get(1);
        int x2 = list.get(2);
        int y2 = list.get(3);

        //两坐标点之间的距离
        int length = (int) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2)* (y1 - y2));
        System.out.println(length);
    }
}
