package _算法.leetcode.n的求和;

import java.text.DecimalFormat;
import java.util.Scanner;

//失败！
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        float sum = 0;
        for (int j = 1; j < i + 1; j++) {
            sum += Math.pow(-1, i + 1) * (float) (1 / (i * (i + 1)));
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String format = decimalFormat.format(sum);
        System.out.println(format);
    }
}
