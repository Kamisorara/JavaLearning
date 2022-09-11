package 进程与线程.多线程.多线程通信;

public class demo {
    public static void main(String[] args) {
        Storage st = new Storage();
        inPut input = new inPut(st);
        outPut output = new outPut(st);
        new Thread(input).start(); //开启新线程
        new Thread(output).start();

    }
}
