package 日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _DateCase {

    //案例：日期工具类
    /*
    需求:定义一个日期工具类(DateUtils)，
    包含两个方法:把日期转换为指定格式的字符串;
    把字符串解析为指定格式的日期，
    然后定义一个测试类(DateDemo)，测试日期工具类的方法
     */
    private _DateCase(){}
    public static Date StringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }

    public static String DateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String ss = sdf.format(date);
        return ss;
    }
}
