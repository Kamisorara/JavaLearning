package basic;

public class 循环语句 {
    public static void main(String[] args) {
        //首先执行for 循环
        for (int i = 1; i <= 5; i++) {
            System.out.println("哈哈哈");
        }
        {
            //输出数据 输出5-1
            for (int j = 5; j >= 1; j--) {
                System.out.println(j);
            }
            for (int k = 1; k <= 5; k++) {
                System.out.println(k);
            }
        }
        {
            //求和
            int sum = 0;
            for (int m = 1; m <= 100; m+=3) {
                if (m % 2 == 0) {
                    sum += m;
                }
            }
            System.out.println(sum);
        }

    }
}
