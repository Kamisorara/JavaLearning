package _算法.数据结构基础.队列;

public abstract class AbstractQueue<E> {
    /**
     * 进队操作
     */
    public abstract void offer(E e);

    /**
     * 出队操作
     */
    public abstract E poll();
}
