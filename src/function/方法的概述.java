package function;

import java.util.Scanner;

public class 方法的概述 {
    public static void main(String[] args) {
        //method
        //方法创建和方法的调用
        //方法定义的格式
        //public static void 方法名{
        //      方法体
        // }
        System.out.println("开始执行");
        fuc(); // 调用方法
    }

    public static void fuc() {  //定义一个变量判断是否为偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int user = sc.nextInt();
        if (user % 2 == 0) {
            System.out.println("是偶数");
        } else {
            System.out.println("不是偶数");
        }

    }
}
