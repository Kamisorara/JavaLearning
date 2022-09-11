package 日期类;

import java.util.Calendar;

public class _Calendar {
    /*
    CaLendar为某一时刻和一组日历字段之间的转换提供了一些方法，并为操作日历字段提供了一些方法
    Calendar提供了一个类方法 getInstance用于获取caLendar对象，其日历字段已使用当前日期和时间初始化。
    CaLendar rightNow = CaLendar.getInstance( );
     */

    public static void main(String[] args) {
        //获取对象
        Calendar c = Calendar.getInstance();
//        System.out.println(c);
//        //Calendar里的月份是从0开始的，所以在使用get 的时候要加1
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日");


        //常用方法
        /*
        1.public int get(int field)返回给定日历字段的值
        2.public abstract void add(int field, int amount)根据日历的规则，将指定的时间量添加或减去给定的日历字段
        3.public final void set(int year,int month,int date)设置当前日历的年月日
         */
//        c.add(Calendar.YEAR, -3);
//        int year = c.get(Calendar.YEAR);
//        int month = c.get(Calendar.MONTH) + 1;
//        int date = c.get(Calendar.DATE);
//        System.out.println(year + "年" + month + "月" + date + "日"); //输出结果2018年12月16日


        //第三种设置日期
        c.set(2020, 1, 1);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日"); //2020年2月1日  设置当前日历的年月表
    }
}
