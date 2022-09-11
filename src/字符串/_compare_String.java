package 字符串;

public class _compare_String {
    public static void main(String[] args) {
        //字符串的比较
        /*
        1.使用 == 比较 如果是基本数据类型的话,比较的是数据值是否相同，
        2.如果是引用类型 比较的就是内存地址是否相同
         */
        /*
        字符串是对象，它比较的内容是否想相同，通过一个方法来实现
        equals()

         */
        //1.通过构造方法得到对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        //2.通过直接赋值得到对象
        String s3 = "abc";
        String s4 = "abc";


        //比较字符串地址是否相同
        System.out.println(s1 == s2);//false
        System.out.println(s2 == s3);//false
        System.out.println(s3 == s4);//true
        System.out.println("--------------------------");
        //比较字符串内同是否相同
        System.out.println(s1.equals(s2));//会发现三次比较都是对的
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));


    }

}
