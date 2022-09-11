package 字符串;

import java.util.Scanner;

public class login_method {
    public static void main(String[] args) {
        //用String类实现用户登录 有三次机会  已知用户名密码
        String userName = "法外狂徒";
        String passWord = "zhangsan";
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i < 3) {
            System.out.println("请输入账号");
            String user = sc.nextLine();
            System.out.println("请输入密码");
            String pass = sc.nextLine();
            if (userName.equals(user) && passWord.equals(pass)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("你的机会用尽了");
                } else {
                    System.out.println("账号或密码输入错误" + "你还有" + (2 - i) + "次机会");
                }
                i++;
            }
        }

    }

}
