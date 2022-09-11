package _多线程.线程锁;

import _算法.KMP算法.Main;

public class _synchronized2 {
    //synchronized也可以作用在方法上
    private static int value = 0;

    private static synchronized void add() {
        value++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                System.out.println("我是线程1---" + i);
                value++;
            }
        });
        Thread t2 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                System.out.println("我是线程2---" + i);
                value++;
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);
    }



}
