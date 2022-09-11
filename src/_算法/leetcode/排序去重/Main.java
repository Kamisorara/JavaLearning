package _算法.leetcode.排序去重;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String arr_str = scanner.nextLine();
        String[] s1 = arr_str.split(" ");
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            if (set.add(i1)) {
                list1.add(i1);
            }
        }
        if (s.equals("A")) { //升序
            Collections.sort(list1);
            for (int i = 0; i < list1.size(); i++) {
                if (i == list1.size() - 1) {
                    System.out.print(list1.get(i));
                } else {
                    System.out.print(list1.get(i) + " ");
                }
            }
        } else {
            list1.sort(Collections.reverseOrder());
            for (int i = 0; i < list1.size(); i++) {
                if (i == list1.size() - 1) {
                    System.out.print(list1.get(i));
                } else {
                    System.out.print(list1.get(i) + " ");
                }
            }
        }
    }
}

