package _算法.leetcode.课代表;

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
        List<String[]> str_list = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            String s = list.get(i);
            String[] s1 = s.split(" ");
            str_list.add(s1);
        }
        int[] Chinese = new int[T];
        int[] Math = new int[T];
        int[] English = new int[T];
        for (int i = 0; i < T; i++) {
            String[] strings = str_list.get(i);
            int chinese = Integer.parseInt(strings[3]);
            Chinese[i] = chinese;
        }
        for (int i = 0; i < T; i++) {
            String[] strings = str_list.get(i);
            int math = Integer.parseInt(strings[5]);
            Math[i] = math;
        }
        for (int i = 0; i < T; i++) {
            String[] strings = str_list.get(i);
            int english = Integer.parseInt(strings[7]);
            English[i] = english;
        }

        int Max_ch = 0;
        for (int i = 0; i < Chinese.length; i++) {
            if (Chinese[i] > Chinese[Max_ch]) {
                Max_ch = i;
            }
        }

        int Max_ma = 0;
        for (int i = 0; i < Math.length; i++) {
            if (Math[i] > Math[Max_ma]) {
                Max_ma = i;
            }
        }

        int Max_en = 0;
        for (int i = 0; i < Math.length; i++) {
            if (English[i] > English[Max_en]) {
                Max_en = i;
            }
        }

        String[] ch = str_list.get(Max_ch);
        String ch_name = ch[0];
        int i = Chinese[Max_ch];

        String[] ma = str_list.get(Max_ma);
        String ma_name = ma[0];
        int i1 = Math[Max_ma];

        String[] en = str_list.get(Max_en);
        String en_name = en[0];
        int english = English[Max_en];

        System.out.println(ch_name + " Chinese " + i);
        System.out.println(ma_name + " Math " + i);
        System.out.println(en_name + " English " + i);
    }
}
