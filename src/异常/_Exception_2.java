package 异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _Exception_2 {
    /*
    编译时异常:必须显示处理，否则程序就会发生错误，无法通过编译运行时异常:无需显示处理，也,可以和编译时异常一样处理
     */
    //编译时异常，说的是可能出现异常,你要处理
    //方法2  throws异常
    //虽然我们通过try...catch..可以对异常进行处理，但是并不是所有的情况我们都有权限进行异常的处理也就是说，有些时候可能出现的异常是我们处理不了的，这个时候该怎么办呢?
    public static void main(String[] args) {
        //首先下创建一个测试的程序
        System.out.println("开始");
//        methods();
        System.out.println("结束");
    }

    //编译时异常
    public static void methods() throws ParseException { //throws ParseException 针对编译时运行，可以使用throws
        String s = "2000-11-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行时异常
//    public static void methods2() throws ArrayIndexOutOfBoundsException {  //针对运行时异常要是得用try...catch...
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);
//    }  //这个只会抛出异常，想要继续向下运行还是得用try...catch...
}
