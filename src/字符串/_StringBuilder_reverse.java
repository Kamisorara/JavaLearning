package 字符串;

import java.util.Scanner;

public class _StringBuilder_reverse {
    //通过StringBuilder实现字符串反转,要定义一个方法来实现
    public static void main(String[] args) {
        //通过键盘输入字符串实现反转
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String s = sc.nextLine();
        String s2 = reverse(s);
        System.out.println("反转后的结果是:" + s2);
    }

    public static String reverse(String s) {
        //将String对象转换为StringBuilder对象，通过reverse()方法来实现字符串反转，然后再转换为String对象返回
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//        //再转换回去
//        String s2 = sb.toString();
//        return s2;
        //可以通过一行实现
        return new StringBuilder(s).reverse().toString();   //只要它还是一个对象，就可以直接调用方法


    }
}
