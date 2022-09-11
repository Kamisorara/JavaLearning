package _算法.leetcode.IPaddress;

import java.awt.*;
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
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            int a = 0, b = 0, c = 0, d = 0;
            String s = list.get(i);
            char[] chars = s.toCharArray();

            for (int j = 0; j < 8; j++) {
                sb1.append(chars[j]);
            }
            for (int j = 8; j < 16; j++) {
                sb2.append(chars[j]);
            }
            for (int j = 17; j < 25; j++) {
                sb3.append(chars[j]);
            }
            for (int j = 25; j <=32; j++) {
                sb4.append(chars[j]);
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            String s3 = sb3.toString();
            String s4 = sb4.toString();
            a = Integer.parseInt(s1, 2);
            b = Integer.parseInt(s2, 2);
            c = Integer.parseInt(s3, 2);
            d = Integer.parseInt(s4, 2);
            System.out.println(a + "." + b + "." + c + "." + d);
        }
    }
}
