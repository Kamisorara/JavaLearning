package 日期类;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = _DateCase.DateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);//2021年12月16日 10:58:31

        //测试第二种
        String s = "1111年11月11日 11:11:11";
        Date dd = _DateCase.StringToDate(s, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(dd);//Sat Nov 11 11:11:11 CST 1111


    }
}
