package _多线程.线程锁;

import _算法.KMP算法.Main;

public class _synchronized {

    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                System.out.println("我是线程1---" + i);
                /**
                 * 当一个线程进入同步代码块时就会获取到当前的锁
                 * 同样锁的同步代码快要等当前同步代码块的内容执行完毕才会自动释放这把锁
                 * 实际上synchronized是一种悲观锁
                 */
                synchronized (Main.class) {   //同步代码块
                    value++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                System.out.println("我是线程2---" + i);
                synchronized (Main.class) {
                    value++;
                }
            }
        });
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(value);
    }
}
