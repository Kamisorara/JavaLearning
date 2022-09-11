package basic;

public class 逻辑运算符 {
    public static void main(String[] args) {
        /*
        如果说你要表示一个关系运算符
        6<x<7
        你要先进行拆解
        x>6 x<7
        最后进行合并，最后的写法是
        x>6 && x<7
         */
        {
            //定义变量
            //逻辑与 &  与就是同1出1
            int i = 1;
            int j = 2;
            int m = 3;
            //当然了就是

            System.out.println(j>i&&j<m);
            //当然了也可以写成
            System.out.println((j>i)&(j<m));

        }
        {
            //接下来就是 逻辑或 |
            //只有都为false 的时候才为false 否则为true
            //逻辑异或 ^  两个结果不同为 true 相同为false
            //逻辑非 ! 就是反一下
        }
        {
            //短路逻辑运算符  有 && 和 ||
        }
        {
            //短路 和基本逻辑的区别 基本相同，但是有短路效果，逻辑与无论左边真假，右边都会执行，短路与左边如果有问题，右边就不执行了


        }
    }
}
