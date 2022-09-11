package 异常;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int score = sc.nextInt();
        Exception_demo ex = new Exception_demo();
        try {
            ex.checkScore(score);
        } catch (ScoreException e) {
            e.printStackTrace();
        }
    }
}
