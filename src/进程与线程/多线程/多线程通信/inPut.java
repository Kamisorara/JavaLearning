package 进程与线程.多线程.多线程通信;

public class inPut implements Runnable {
    private Storage st;
    private int num;  //定义一个变量num

    //构造一个方法接收一个Storage对象
    inPut(Storage st) {
        this.st = st;
    }


    @Override
    public void run() {
        while (true) {
            st.put(num++);
        }
    }
}
