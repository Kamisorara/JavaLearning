package _算法.数据结构基础.顺序表;

/**
 * 线性表抽象类
 */
public abstract class AbstractList<E> {  //泛型，上节是Object类，所以数据不能用基本类型

    /**
     * 获取表的长度
     *
     * @return 顺序表的长度
     */
    public abstract int size();

    /**
     * 添加一个元素
     */
    public abstract void add(E e, int index);

    /**
     * 移除指定索引元素
     */

    public abstract E remove(int index);


    public abstract E remove(E element);

    /**
     * 获取指定位置元素
     */

    public abstract E get(int index);

}
