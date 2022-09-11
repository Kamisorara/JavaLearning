package 进程与线程.多线程.售票.同步代码块;

public class _basic {
    /**
     * 线程的同步代码块其实实际意义上就就是当多个线程同时处理一个代码块的时候会出现一个安全问题，多个线程会同时去处理一个问题
     * 导致了程序的出错，处理这种问题的方式非常类似与python中的互斥锁，来保证共享资源一次只有一个线程来处理问题
     * 使用  synchronized关键字进行修饰
     * synchronized(lock){
     *     操作共享资源的代码块
     * }
     *
     *
     *
     * 使用synchronized定义的方法可以有效解决线程的安全问题，在方法前面使用synchronized进行修饰可以实现和同步代码块相同的功能
     * synchronized 返回值类型 方法名 ([参数1,......]){}
     * 被synchronized修饰的方法在某一时刻只允许一个线程访问，而其他的访问线程都会发生阻塞，只有当当前线程访问完毕后其他线程才有机会执行访问方法
     *
     */
}
