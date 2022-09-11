package function;


public class rest3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("说pass" + i);
                sum++;
            }
        }
        System.out.println("一共有" + sum + "个数");
    }
}
