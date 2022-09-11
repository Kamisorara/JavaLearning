package function;

public class 方法重载 {
    public static void main(String[] args) {
        /*
        多个方法在同一个类中
        多个方法具有同一个方法名
        多个方法的参数不同，类型不同，或者数量不同
         */
        int result1 = sum(10, 20);
        System.out.println(result1);
        double result2 = sum(10, 20);
        System.out.println(result2);
        int result3 = sum(10, 20, 30);
        System.out.println(result3);
//          30
//          30.0
//          60
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
