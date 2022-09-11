package _算法.数据结构基础.栈;

public class ArrayStack<E> extends AbstractStack<E> {

    //底层数组
    Object[] arr = new Object[10];
    //长度
    private int size = 0; //默认的长度为0

    @Override
    public E pop() {
        //出栈
        return (E) arr[(size--) - 1];
    }

    @Override
    public void push(E e) {
        //判断数组是否要扩容
        if (size >= arr.length) {  //扩容
            Object[] arr = new Object[this.arr.length + 10];    //this.arr是访问上面的arr  下面的arr是自己定义的
            for (int i = 0; i < this.arr.length; i++) {  //把上面arr有的给搬过来
                arr[i] = this.arr[i];
            }
            this.arr = arr;
        }
        //入栈
        arr[size] = e;
        size++;
    }
}
