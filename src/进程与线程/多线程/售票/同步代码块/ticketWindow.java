package 进程与线程.多线程.售票.同步代码块;

import java.util.Objects;

public class ticketWindow implements Runnable {
    public int tickets = 10000;

    @Override
    public void run() {
        while (true) {
            saleTicket();  //调用下面的售票方法
            if (tickets < 0) {
                break;
            }
        }
    }
    //定义一个同步方法
    public synchronized void saleTicket() {
        if (tickets>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"---卖出的票"+tickets--);
        }
    }
    //上面是使用synchronized的另一个方法
//    final Object lock = new Object();   //定义任意一个对象用作同步代码块的锁

//    @Override
//    public void run() {
//        while (true){
//            synchronized (lock){  //定义同步代码块
//                try {
//                    Thread.sleep(10);    //经过的线程休眠10ms
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                if (tickets>0){
//                    System.out.println(Thread.currentThread().getName()
//                    +"---卖出的票"+tickets--);
//                }else {
//                    break;
//                }
//            }
//        }
//    }
}
