package _算法.数据结构基础.队列;

public class ArrayQueue<E> extends AbstractQueue<E> {
    //底层数组
    Object[] arr = new Object[10];
    //队尾队首下标
    private int head = 0, tail = 0;  //队首队尾一开始都是0

    @Override
    public void offer(E e) {
        int next = (tail + 1) % arr.length;
        if (next == head) return;
        arr[tail] = e;//插入
        tail = next; //tail必须在head的后面

    }

    @Override
    public E poll() {
        E e = (E) arr[head];
        head = (head + 1) % arr.length;
        return null;
    }
}
