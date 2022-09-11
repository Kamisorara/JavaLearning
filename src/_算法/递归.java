package _算法;

public class 递归 {
    //递归解决问题，首先就是要定义一个方法:
    //定义一个方法f(n):表示第n个月的兔子对数
    //那么，第n-1个月的兔子对数该如何表示呢?f(n-1)同理，第n-2个月的兔子对数该如何表示呢?f(n-2)
    public static void main(String[] args) {
        System.out.println(f(20));  //StackOverflowError会发生一个错误这是一个error类型 递归太深了  递归要有出口
    }

    //定义一个方法f(n)
    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;

        } else {
            return f(n - 1) + f(n - 2);  //递归解决问题一定要有出口
        }
    }
}
