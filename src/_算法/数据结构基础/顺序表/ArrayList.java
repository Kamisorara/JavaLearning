package _算法.数据结构基础.顺序表;

/**
 * 顺序表的底层:数组操作
 *
 * @param <E>
 */
public class ArrayList<E> extends AbstractList<E> {
    //底层数组
    Object[] arr = new Object[10];
    //长度
    private int size = 0; //默认的长度为0

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e, int index) {
        if (index > size) { //加入一个安全检查
            throw new IllegalArgumentException("非法插入的位置"); //抛出一个异常
        }
        //判断数组是否要扩容
        if (size >= arr.length) {  //扩容
            Object[] arr = new Object[this.arr.length + 10];    //this.arr是访问上面的arr  下面的arr是自己定义的
            for (int i = 0; i < this.arr.length; i++) {  //把上面arr有的给搬过来
                arr[i] = this.arr[i];
            }
            this.arr = arr;
        }
        //在插入进来之后，要把后面的元素向后移
        int i = size - 1;//最后一个元素
        while (i >= index) {
            arr[i + 1] = arr[i];
            i--;
        }
        //把要插入的元素放入对应位置
        arr[index] = e;//插入操作
        size++;
    }

    @Override
    public E remove(int index) {
        //移除也要判断是否合法
        if (index > size - 1) {
            throw new IllegalArgumentException("非法插入位置");
        }
        E e = (E) arr[index];  //保存返回值
        //前移后面的元素
        int i = index;
        while (i < size - 1) {
            arr[i] = arr[i + 1];
            i++;
        }
        size--;
        return e; //这个remove要求有返回值返回删除的这个元素
    }

    @Override
    public E remove(E element) {
        return null;
    }

    @Override
    public E get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("无法访问，下标异常!");
        }
        return (E) arr[index];
    }
}
