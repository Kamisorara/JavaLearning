package _算法;

public class 使用递归求阶乘 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    //定义一个方法求阶乘
    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }
}
