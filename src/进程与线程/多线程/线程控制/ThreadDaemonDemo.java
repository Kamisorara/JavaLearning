package 进程与线程.多线程.线程控制;

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("线程1");
        td2.setName("线程2");

        //设置主线程
        Thread.currentThread().setName("线程3");

        //设置守护线程
        td1.setDaemon(true);
        td2.setDaemon(true);


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);   //线程3会先挂掉  因为设置了守护线程，所以当主线程挂掉的时候
            //其余两个守护线程都会挂掉,但是守护线程不会马上挂掉
        }
    }
}
