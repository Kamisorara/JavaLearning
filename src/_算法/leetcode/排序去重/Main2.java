package _算法.leetcode.排序去重;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int i1 = scanner.nextInt();
            if (set.add(i1)) {
                list.add(i1);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i)+" ");
            }
        }
    }
}
