package 日期类;

import java.util.Date;

public class _date {
    //Date表示了一个特定的时间精确到毫秒，有一个无参构造，和一个带参构造
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        //直接输入d1在控制台输出的是
        //带参构造方法 public Date(long date); 分配一个Date对象将其初始化从基准时间起的指定毫秒数
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);


        //Date类的常用方法
        //1. public long getTime()   获取从1970年1月1日0：00到现在的精确毫秒值
        //2. public  void setTime(long time)  设置时间给的是毫秒值


        Date D = new Date();
        System.out.println(D.getTime());  //获取毫秒数

        //接下来演示第二种
        long time = System.currentTimeMillis();
        D.setTime(time);
        System.out.println(D);
    }
}
