package _多线程.线程的启动和创建;

public class main {
    private static int value = 0;

    public static void main(String[] args) throws InterruptedException {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread1");
//            }
//        });   //也可以使用lambda表达式实现Runnable接口

        Thread t1 = new Thread(() -> {
            int sum = 0;
            try {
                Thread.sleep(1000);  //写在里面就是休眠新创建的线程
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10000; i++) {
                value++;
                System.out.println("我是线程1---" + i);
            }
        });

        Thread t2 = new Thread(() -> {
            int sum = 0;
            for (int i = 0; i < 10000; i++) {
                value++;
                System.out.println("我是线程2---" + i);
            }
        });

        Thread t3 = new Thread(() -> {

            while (true) {
                if (Thread.currentThread().isInterrupted()) { //判断是否有中断标志
                    System.out.println("线程中断了...复位");
                    Thread.interrupted();  //在里面进行复位，就可以继续运行
                }
            }

        });

//        t1.start();  //t1.run()  run方法实在本线程执行，而不是新建一个线程
//        t2.start();
        t3.start();
        Thread.sleep(3000);  //主线程停止一秒保证两个线程执行完成   写在外面休眠的就是主线程
        t3.interrupt();
        System.out.println(value);//主线程优先运行

    }
}
