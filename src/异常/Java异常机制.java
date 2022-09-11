package 异常;

import java.io.File;
import java.io.IOException;

public class Java异常机制 {

    static int a = 0;

    public static void main(String[] args) {
        System.out.println(test(2));
    }

    public static int test(int n) {
        try {
            int b = n / a;
            return b;
        } catch (ArithmeticException e) {   //捕获异常名称并给出答复
            System.out.println("你的计算中存在错误!（除数或被除数为0）");
            return -1;
        }
    }

    public static void test2() throws IOException {  //这里通过throws抛出IOException异常
        /**
         * 异常分为编译时异常和运行异常
         */

        File file = new File("test.txt");
        file.createNewFile();
    }

    public static void test3() {
        /**
         * 错误类型可以进行多重捕获类似于if-else if 的语句结构
         * 并且父类异常类型只能放在最后
         */
        try {
            int b = 2 / a;

        } catch (ArithmeticException e) {   //捕获异常名称并给出答复
            System.out.println("你的计算中存在错误!（除数或被除数为0）");

        } catch (Exception e) {
            System.out.println("最后的是父类");
        }

        /**
         * 也可以进行隔开 用|
         */

    }


    public static void test4(){
        /**
         * 最后有一个finally关键字
         * 不管有没有错误都会去执行的一个关键字
         * 这个就很好理解了
         */
    }

}
