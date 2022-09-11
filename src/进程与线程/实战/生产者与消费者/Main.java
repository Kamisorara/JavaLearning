package 进程与线程.实战.生产者与消费者;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    /**
     * 模拟一个餐厅的2个厨师和3个顾客，假设厨师炒出一个菜的时间为3秒，顾客吃掉菜品的时间为4秒。
     * 出菜的时候柜台同时只能有一个人才操作
     */
    //柜台
    public static final List<Object> counter = new ArrayList<>();

    public static void main(String[] args) {
        Thread c1 = new Thread(Main::add);
        c1.setName("厨师1号");
        Thread c2 = new Thread(Main::add);
        c2.setName("厨师2号");
        Thread s1 = new Thread(Main::take);
        s1.setName("老八1号");
        Thread s2 = new Thread(Main::take);
        s2.setName("老八2号");
        Thread s3 = new Thread(Main::take);
        s3.setName("老八3号");

        //启动线程
        c1.start();
        c2.start();
        s1.start();
        s2.start();
        s3.start();
    }


    //出菜
    private static void add() {
        //无限上菜
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //加一把锁
            synchronized (counter) {
                counter.add(new Object());
                counter.notify();//有菜了之后就唤醒
                System.out.println(new Date() + Thread.currentThread().getName() + "上菜了!");
            }
        }
    }

    //端菜
    private static void take() {
        while (true) {
            try {
                //加一把锁同步拿菜的过程
                synchronized (counter) {
                    while (counter.isEmpty()) {
                        //如果柜台是空的就让count wait掉，直到有菜端上来未知
                        counter.wait();
                    }
                    System.out.println(new Date() + Thread.currentThread().getName() + "把菜吃掉了!");
                    counter.remove(0);
                }
                Thread.sleep(4000); //吃菜需要四秒钟
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
