package _多线程.多线程实战;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Object> list = new ArrayList<>(); //List充当容器

    public static void main(String[] args) {
        /**
         * 生产者与消费者模型
         * 模拟一个餐厅的两个厨师和三个顾客
         * 厨师炒出菜的时间为3000ms ,顾客吃掉的时间为4000ms
         */
        Thread c1 = new Thread(() -> {

        });
        Thread c2 = new Thread(() -> {

        });
        Thread s1 = new Thread(() -> {

        });
        Thread s2 = new Thread(() -> {

        });
        Thread s3 = new Thread(() -> {

        });

    }

    private static void add() {  //出彩
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (list) {  //处理并发
                list.add(new Object());
                list.notify();//唤醒
            }

        }
    }

    private static void take() throws InterruptedException {  //端菜


        try {
            synchronized (list) {
                while (list.isEmpty()) {
                    list.wait();
                }
                list.remove(0);
            }
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
