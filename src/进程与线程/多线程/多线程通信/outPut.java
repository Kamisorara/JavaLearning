package 进程与线程.多线程.多线程通信;

public class outPut implements Runnable {  //输出线程类
    private Storage st;

    outPut(Storage st) {
        this.st = st;
    }

    @Override
    public void run() {
        while (true) {
            st.get();  //循环取出元素
        }
    }
}
