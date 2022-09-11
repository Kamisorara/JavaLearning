package 字符串;

import java.lang.invoke.SwitchPoint;
//推荐使用直接赋值的方式获取字符串
public class String_class {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1"+s1);

        System.out.println("--------------------------------------");
        //public String(char [] chs ) 根据字符串的内容创建字符串对象
        char []  chs = {'a','b','c'};
        String s2 = new String(chs);
        System.out.println("s2"+s2); //s2abc
        System.out.println("------------------------------------------");
        //字节数组创建字符串
        byte [] bys ={97,98,99};
        String s3 = new String(bys);
        System.out.println("s3"+s3); //s3abc
        System.out.println("--------------------------------------------");
        String s4 = "abc";
        System.out.println("s4"+s4);

    }
    //String类在java.lang包下，使用的时候不用导包
    //Java中的所有双引号字符串都是String类的对象
    //字符串的特点，它们的值的创建后不可修改,就是说字符串不可变,他们可以被共享
    //字符串在效果上相当于char [] （字符数组）  但是其底层是byte [] （字节数组）
    //String的构造方法
    /*
    public String() 创建一个空白字符串对象，不包含任何内容
    public String(char [] chs ) 根据字符串的内容创建字符串对象
     */


//String 对象的特点
    /*
    以“ ”方式给出的字符串，只要字符序列相同无论代码出现几次，都会在JVM的内存池中进行维护，就是在堆内存中进行维护
     */
}
