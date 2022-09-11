package _算法.leetcode.学生信息;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < T + 1; i++) {
            String s = scanner.nextLine();
            list.add(s);
        }
        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i);
            String[] s1 = s.split(" ");
            int a = Integer.parseInt(s1[0]);
            String b = s1[1];
            treeMap.put(a, b);
        }
        //取出Treemap
        Set<Integer> arr = treeMap.keySet();
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            Integer str = it.next();
            System.out.println(str + " " + treeMap.get(str));
        }
    }
}
