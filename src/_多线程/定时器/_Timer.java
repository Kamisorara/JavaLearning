package _多线程.定时器;

import java.util.Timer;
import java.util.TimerTask;

public class _Timer {
    public static void main(String[] args) {
        Timer timer = new Timer();  //创建定时器对象
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                timer.cancel();//结束线程
            }
        }, 1000); //延时1秒

    }
}
