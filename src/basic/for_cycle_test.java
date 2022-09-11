package basic;


public class for_cycle_test {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;  //百位
            int b = (i / 10) % 10;
            int c = i % 10;   //个位

            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                count++;  //等价于count +=1
                System.out.println(i + "是水仙花数");
            }
        }
        System.out.println("一共有:" + count + "个数");
    }
}
