package function;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //设计一个程序，引用参数，判断两个参数的最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("输入第一个数:");
        int num1 = sc.nextInt();
        System.out.println("输入第二个数:");
        int num2 = sc.nextInt();
        int c = isMax(num1, num2);
        System.out.println("最大值是" + c);
    }

    public static int isMax(int num1, int num2) {
        if (num1 < num2) {
            return num2;
        } else {
            return num1;
        }
    }
    //方法的注意事项
    //和python 不一样，方法不能嵌套
    //void表示 无返回值 可以忽略return ,也可以单独书写return 不带任何东西
    /*
    方法的通用格式
     public static 返回值类型 方法名 （参数）{
            方法体;
            return 数据;

        }
     */
    //在接收方法时 void 类型的方法，直接调用就可以了，非void类型的方法，推荐使用变量接收调用
}


