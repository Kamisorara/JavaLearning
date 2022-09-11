package 日期类;

import java.util.Calendar;
import java.util.Scanner;

public class FeburaryDay {
    //需求：获取任意一年的二月有多少天
    //键盘录入任意年份
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意年份:");
        int year = sc.nextInt();


        //设置日期
        //日期设置为三月份的1日
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        //把3月1日往前推一天计算二月天数
        c.add(Calendar.DATE, -1);
        int days = c.get(Calendar.DATE); //最后再获取天数
        System.out.println(year + "年的2月有" + days + "天");


    }
}
