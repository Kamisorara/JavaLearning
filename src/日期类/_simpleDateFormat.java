package 日期类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _simpleDateFormat {
    //simpleDateFormat是一个具体的类于以区域设置敏感的方式格式化和解析日期。我们重点学习日期格式化和解析。
    //于以区域设置敏感的方式格式化和解析日期。我们重点学习日期格式化和解析
    //常用的模式字母的表示如下
    /*
    y   年
    M   月
    d   日
    H   时
    m   分
    s   秒
     */

    //有无参和带参两种构造方法
    /*
    public SimpleDateFormat() 构造一个SimpleDateFormat，使用默认模式和日期格式
    public SimpleDateFormat(String pattern)构造一个SimpleDateFormat使用给定的模式和默认的日期格式

    1.格式化(从Date到 String )
    public final String format(Date date):将日期格式化成日期/时间字符串

    2.解析(从String到 Date )
    public Date parse(String source):从给定字符串的开始解析文本以生成日期   最终得到日期对象
     */

    public static void main(String[] args) throws ParseException {
        //首先是格式化从Date 到String
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat();   //创建SimpleDateFormat 对象
        //使用带参构造
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String s = sdf.format(d);
        System.out.println(s);  //最后就格式化出这样的时间:2021/12/16 上午10:27

        //接下来是从 String 到Date  给出一个String时间
        String ss = "2021-9-9 10:10:10";
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");  //不能写成这样 要和字符串的一致
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date2 = sdf2.parse(ss);
        System.out.println(date2);
    }
}
