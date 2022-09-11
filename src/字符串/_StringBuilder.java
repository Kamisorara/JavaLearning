package 字符串;

import org.w3c.dom.DOMStringList;

public class _StringBuilder {
    public static void main(String[] args) {
        //StringBulider的作用是，因为在Java中每次都进行字符串的拼接，都会创建一个新的字符串对象在常量池中，这样又浪费时间又浪费空间，
        //可以使用StringBulider 类来解决这个问题
        //StringBulider是一个可变的字符串类
        //创建对象
        StringBuilder sb = new StringBuilder();
//        StringBuilder sb2 = sb.append("hello");
//        System.out.println("sb:" + sb);
//        System.out.println("sb2:" + sb2);
//        System.out.println(sb == sb2);
        /*
        sb:hello
        sb2:hello
        true
         */

        sb.append("hello");
        sb.append("world");
        sb.append(100);
        System.out.println(sb);
        //因为append 返回的是对象本身，所以是对象就可以继续调方法
        //链式编程
        sb.append("hello").append("hello").append("hello");
        sb.reverse();
        System.out.println(sb);  //reverse方法直接实现了字符串的反转
        System.out.println("-----------------------------------------------------------");
        {
            //StringBulider 和String之间的相互转换
            //1.把StringBuilder 转换为String 通过toString()
            //2.把String转换为StringBuilder 通过构造方法 public StringBuilder(String s )

            //接下来实现第一个
            StringBuilder st1 = new StringBuilder();
            st1.append("hello");
            String sb1 = st1.toString();
            System.out.println(sb1);

            //***接下来实现第二个 将String 转换为StringBulider
            String s = "hello";
            StringBuilder st2 = new StringBuilder(s);
            System.out.println(st2);


        }


    }
}
