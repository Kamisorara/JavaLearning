package 进程与线程.多线程;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    //重写run方法

    /**
     * 两个小问题:
     * 为什么要重写run)方法?
     * 因为run()是用来封装被线程执行的代码run()方法和start()方法的区别?
     * run():封装线程执行的代码，直接调用，相当于普通方法的调用start():启动线程;然后由JVM调用此线程的run)方法
     */
    //设置和获取线程名称
    //Thread类中设置和获取线程名称的方法
    //void setName(Stringname):将此线程的名称更改为等于参数name
    // String getName():返回此线程的名称
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}
