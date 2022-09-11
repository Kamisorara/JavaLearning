package _算法.leetcode.打工;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day;
        String a, b;
        day = scanner.nextInt();
        String full = scanner.nextLine();
        a = scanner.nextLine();
        b = scanner.nextLine();

        int[] a_arr = new int[day];
        int[] b_arr = new int[day];


        List<Integer> a_list = new ArrayList<>();
        List<Integer> b_list = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c != ' ') {
                a_list.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (c != ' ') {
                b_list.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        boolean still = true;
        int[] surplus = new int[a_list.size()];
        for (int i = 0; i < a_list.size(); i++) {
            int cost = b_list.get(i);
            int earn = a_list.get(i);
            surplus[i] = earn - cost;
        }
        for (int i = 0; i < surplus.length - 1; i++) {
            if (surplus[0] == 0) {
                System.out.println(1);
                still = false;
                break;
            }
            if (surplus[i] + surplus[i + 1] < 0) {
                System.out.println("Game Over!");
                still = false;
                break;
            } else {
                System.out.println(i + 1);
                still = false;
                break;
            }
        }
        if (still) {
            System.out.println("Game Over!");
        }
    }
}
