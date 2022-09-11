package _算法.leetcode.demo5;

public class Main {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int n1 = i / 100;
            int n2 = i % 100 / 10;
            int n3 = i % 10;
            if (n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3 == i) {
                System.out.println(i);
            }
        }
    }
}
