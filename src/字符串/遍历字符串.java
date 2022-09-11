package 字符串;

import java.util.Scanner;

public class 遍历字符串 {
    public static void main(String[] args) {
        //需求：输入一串字符串，然后在控制台依次遍历   使用charAt()方法来实现
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串");
        String input = sc.nextLine();
        nextString(input);


    }

    public static void nextString(String input) {
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }


    }
}
