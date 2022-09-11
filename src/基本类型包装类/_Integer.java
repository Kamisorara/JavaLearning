package 基本类型包装类;

public class _Integer {
    //Integer：包装一个对象中的原始类型的int值
    public static void main(String[] args) {
//        Integer i1 = new Integer(100);  //这种方式过时了 ，不推荐这么使用
//        System.out.println(i1);
        //推荐使用下面的这个方法
        Integer i1 = Integer.valueOf(100);
        System.out.println(i1);
        //或者将一个字符串类转换为字符串类型
        String s1 = "100";
        Integer i2 = Integer.valueOf(s1);
        System.out.println(i2);


        //int 和String 类型的转换
        //先从int------>String
        //方式1
        int number = 101;
        String ss = " " + number;
        System.out.println(ss);
        //方式2
        //String 中也有VolueOf(int i ) 方法
        String ss1 = String.valueOf(number);  //这种方法就显得非常好用
        System.out.println(ss1);
        //String --->int
        //方式1 Stirng --->Integer--->int   通过Integer作为桥梁进行转换
        String ss2 = "10000";
        Integer ii1 = Integer.valueOf(ss2);
        int x =ii1.intValue();
        System.out.println(x);
        //方式2 直接进行转换
        int y = Integer.parseInt(ss2);    //parseInt () 是一个静态方法
        System.out.println(y);


        String date = "2019-01-09";
        int year = Integer.parseInt(date.substring(8));   //这个是管头不管尾的  如果只有一个的话，就是获取这个下标余下的数
        System.out.println(year);

    }
}
