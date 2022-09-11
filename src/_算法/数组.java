package _算法;

public class 数组 {
    public static void main(String[] args) {
        int[][][] arr = new int[1][2][3];
        test(12, 3, 4, 5, 6);
    }

    //可变长参数
    public static void test(int... test) {
        System.out.println(test[2]);
    }
}
