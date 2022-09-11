package 进程与线程.多线程.线程控制;

public class ThreadSleep extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);    //睡眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
