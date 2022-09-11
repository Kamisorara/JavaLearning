package _算法.leetcode.BMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float height = 0, weight = 0;
        height = scanner.nextFloat();
        weight = scanner.nextFloat();
        float standard = height - 100;
        if ((height - 100) * (1 - 0.05) <= weight && (height-100)*(1+0.05)>=weight){
            System.out.println("Health");
        }else {
            System.out.println("ill health");
        }
    }
}
