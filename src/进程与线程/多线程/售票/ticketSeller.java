package 进程与线程.多线程.售票;

public class ticketSeller {
    public static void main(String[] args) {
        TicketWindow tw =new TicketWindow(); //创建窗口实例对象
        //创建线程名称并启动
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口4").start();
        //使得四个窗口共用一个系统  大多数的系统基本上都会采用这种方式来实现Runnable接口
    }
}
