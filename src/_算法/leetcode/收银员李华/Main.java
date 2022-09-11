package _算法.leetcode.收银员李华;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        double[] k = {1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (i <= 6) {
            int v = (int) (n / k[i]);
            n -= (v * k[i]);
            list.add(v);
            i++;
        }

        for (int j = list.size() - 1; j >= 0; j--) {
            if (j == 0) {
                System.out.print(list.get(j));
            } else {
                System.out.print(list.get(j) + " ");
            }
        }
    }
}
