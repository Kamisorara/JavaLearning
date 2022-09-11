package _算法.leetcode.咳咳NOMAn;

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
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i);
            if (!s.endsWith("1")) {
                list1.add(s);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            String s = list1.get(i);
            String[] s1 = s.split(" ");
            System.out.println(s1[0]);
        }
    }
}


