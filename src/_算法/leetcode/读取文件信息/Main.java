package _算法.leetcode.读取文件信息;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s;
            s = scanner.nextLine();
            if (s.charAt(0) != '#') {
                System.out.println(s);
            }
        }
    }
}


//        List<String> list = new ArrayList<>();
//
//        for (int i = 0; i < 100; i++) {
//            String s = scanner.nextLine();
//            list.add(s);
//        }
//        List<String> str_list = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            if (!list.get(i).equals("")) {
//                str_list.add(list.get(i));
//            }
//        }
//        List<String> target = new ArrayList<>();
//        for (int i = 0; i < str_list.size(); i++) {
//            String s = str_list.get(i);
//            if (s.charAt(0) != '#') {
//                target.add(s);
//            }
//        }
//
//        for (int i = 0; i < target.size(); i++) {
//            System.out.println(target.get(i));
//        }