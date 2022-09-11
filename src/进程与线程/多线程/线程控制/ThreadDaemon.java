package 进程与线程.多线程.线程控制;

public class ThreadDaemon extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }

    //创建线程
    public static void main(String[] args) {
        Object o1 = new Object();

        Thread thread = new Thread(() -> {
            synchronized (o1) {         //同步代码块
                try {
                    sleep(1000);
                    System.out.println("Thread run now");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
        System.out.println("---main Thread run now---");
    }


}
