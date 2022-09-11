package 进程与线程.多线程.线程控制;

public class ThreadJoin extends Thread {
    @Override
    public void run() {
        for(int i = 0;i<10;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
