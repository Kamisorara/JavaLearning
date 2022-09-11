package _算法.leetcode.新的字符串;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String s = scanner.nextLine();
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                list2.add(chars[i]);
            } else {
                list1.add(chars[i]);
            }
        }
        list1.addAll(list2); //全搞进去
        for (int i = 0; i < list1.size(); i++) {
            sb.append(list1.get(i));
        }
        String s1 = sb.toString();
        System.out.println(s1);
    }
}
