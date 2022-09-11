package basic;

public class 三元运算符 {
    public static void main(String[] args) {
        {
            int a = 10;
            int b = 20;
            int max = a >b ? a : b;
            System.out.println("输出结果:"+max);
            //关系表达式1 ? 表达式1:表达式2


            //如果表达式1 的 值是true 那么左边就是结果
            //如果左边是false 那么右边就是运算的结果
        }
        {
            //一个小小的案例
            int w = 1;
            int w2 = 2;
            boolean w3  =  w == w2 ? true:false;
            System.out.println(w3);


        }

    }
}
