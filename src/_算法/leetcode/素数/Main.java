package _算法.leetcode.素数;

import java.util.*;

//素数
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T;
        T = scanner.nextInt();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            int num = scanner.nextInt();
            arr[i] = num;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            boolean flag = true;
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    flag = false;
                }
            }
            if (flag == false) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
