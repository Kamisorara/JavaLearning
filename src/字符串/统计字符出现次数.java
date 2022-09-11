package 字符串;

import java.util.Scanner;

public class 统计字符出现次数 {
    public static void main(String[] args) {
        //需求，键盘录入一个字符串，统计该字符串中大小写字母，和数字字符出现的次数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符");
        String userInput = sc.nextLine();
        //定义三种字符出现的个数先都定位0
        int lowerCount = 0;
        int upperCount = 0;
        int numberCount = 0;
        Count(lowerCount, upperCount, numberCount, userInput);


    }

    public static void Count(int lowerCount, int upperCount, int numberCount, String userInput) {
        for (int i = 0; i < userInput.length(); i++) {
            char ch = userInput.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCount++;

            } else if (ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if (ch >= '0' && ch <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字符个数有:" + upperCount);
        System.out.println("小写字符个数有:" + lowerCount);
        System.out.println("数字字符个数有:" + numberCount);

    }

}
