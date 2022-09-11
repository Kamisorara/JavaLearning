package 进程与线程.多线程;

public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread m1 = new MyThread();
//        MyThread m2 = new MyThread();
//
//        m1.setName("Ka");
//        m2.setName("Ha");
        //接下来使用带参构造方法
        MyThread m1 = new MyThread("Kaaaa");
        MyThread m2 = new MyThread("Ha");
        MyThread m3 = new MyThread("K");

        //public final void setPriority(int newPriority):更改此线程的优先级
        //设置线程优先级
        /**
         * 线程的优先等级越高只能表示抢占到的Cpu的控制权更高，不能是每次都会对cpu获取控制
         * 要区分开来
         */
        m1.setPriority(10);
        m2.setPriority(5);
        m3.setPriority(1);


        m1.start();
        m2.start();
        m3.start();
        //如何获取main()方法所在的线程名称?
        //public static Thread currentThread():返回对当前正在执行的
        System.out.println(Thread.currentThread().getName());
    }
}
