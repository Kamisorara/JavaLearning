package 进程与线程.多线程.售票.同步代码块;



public class ticketSeller {
    public static void main(String[] args) {
        ticketWindow tw = new ticketWindow();
        new Thread(tw,"窗口1").start();
        new Thread(tw,"窗口2").start();
        new Thread(tw,"窗口3").start();
        new Thread(tw,"窗口4").start();

    }
}
