package 进程与线程.多线程.售票;

public class TicketWindow implements  Runnable{
    public int tickets = 100;

    @Override
    public void run() {
        while (true){
            if (tickets>0){
                Thread th = Thread.currentThread();   //获取当前线程
                String th_name = th.getName();
                System.out.println(th_name+"当前正在发售"+tickets--+"张票");
            }
        }
    }
}
