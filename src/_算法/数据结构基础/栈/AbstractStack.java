package _算法.数据结构基础.栈;

/**
 * 抽象类型栈
 */
public abstract class AbstractStack<E> {
    /**
     * 出栈操作
     * return 栈顶元素
     */
    public abstract E pop();

    /**
     * 入栈操作
     */
    public abstract void push(E e);
}
