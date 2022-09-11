package 字符串;

import java.util.Scanner;

public class 实现字符串反转 {
    public static void main(String[] args) {
        //键盘输入字符串，输出字符串反转结果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String userInput = sc.nextLine();
        System.out.println("反转后的结果是:" + reversed(userInput));

    }

    public static String reversed(String userInput) {
        //其实倒着遍历就好
        String s = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            s += userInput.charAt(i);

        }
        return s;


    }
}
