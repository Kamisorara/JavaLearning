package linkedList;

/**
 * created by 吴逸风
 * 单项链表的事件及其方法
 * 整体采用递归的方式实现
 */
public class ListNode<T> {
    private int foot;  //头节点索引的位置
    private int size; //链表的长度
    private Node head;

    //用内部类的方式实现链接点类
    private class Node {
        private T val; //以泛型的方式存储 val代表数据
        private Node next; //下一个节点的引用  c 和C++用指针，java么用引用就好了

        public Node(T val) {
            this.val = val;
        }


        //添加节点
        private void add(T val) {
            if (this.next == null) {  //如果当前的这个节点的next 为null 那么就创建一个新的节点添加进去
                this.next = new Node(val);
            } else {
                this.next.add(val);  //如果下一个节点存在，那么就递归调用（递归方便）
            }
        }

        //删除节点 (根据索引)
        private void remove(Node node, int index) {
            if (ListNode.this.foot++ == index) {
                node.next = this.next; //这里的this表示当前要删除的节点，删除节点就是把上一个节点的指向指向下下个节点
                this.next = null; //把当前的节点的指向指为空
                ListNode.this.size--;
                return;
            } else {
                this.next.remove(this, index); //递归得进行删除
            }
        }

        //删除节点 (根据指定的值删除)
        private void remove(Node node, T val) {
            if (this.val.equals(val)) { //找到该元素
                node.next = this.next;
                this.next = null;
                ListNode.this.size--;
                return;
            } else { //这里需要考虑两种情况，1.在链表没到头时，继续下一个元素进行查找，2.如果到头了，还是没有找到就返回空
                if (this.next != null) {
                    this.next.remove(this, val);
                } else {
                    return;
                }
            }
        }

        //修改数据，输入一个新数据，替换掉旧的那个数据
        private void replace(T oldVal, T newVal) {
            if (this.val.equals(oldVal)) {
                this.val = newVal;
            } else {
                this.next.replace(oldVal, newVal);
            }
        }

        //修改数据（根据索引）
        private void replace(int index, T Val) {
            if (ListNode.this.size-- == index) {
                this.val = Val;
            } else {
                this.next.replace(index, Val);
            }
        }

        //查看链表是否包含某节点
        private boolean contains(T val) {
            if (this.val.equals(val)) {
                return true;
            } else {
                if (this.next == null) {
                    return false;
                } else {
                    return this.next.contains(val); //递归调用
                }
            }
        }

        //查询节点
        private T get(int index) {
            if (ListNode.this.size-- == index) {
                return this.val;
            } else {
                return this.next.get(index);
            }
        }
    }

    //无参构造
    public ListNode() {

    }

    //判断链表是否为空
    private boolean isEmpty() {
        if (size == 0 || this.head == null) {
            return true;
        } else {
            return false;
        }
    }


    //获取链表的长度
    public int size() {
        return this.size;
    }

    //往链表里添加
    public void add(T val) {
        if (this.isEmpty()) {
            this.head = new Node(val);
        } else {
            this.head.add(val);
        }
        this.size++;
    }


    //按索引删除
    public void remove(int index) {
        if (this.isEmpty()) {
            return;
        }
        //这里排除一下用户的异常输入
        if (index < 0 || this.size <= index) {
            return;
        }
        if (index == 0) {
            //如果删除的是头节点
            Node temp = this.head;
            this.head = this.head.next;
            temp.next = null;
            this.size--;
        } else {
            this.foot = 0;
            this.head.remove(this.head, index); //这里的remove 是链接点类里面的remove方法
        }
    }

    //根据值删除
    public void remove(T val) {
        if (this.isEmpty()) {
            return;
        }
        if (this.head.val.equals(val)) {   //如果删除的节点正好是头节点
            Node temp = this.head;
            this.head = this.head.next;
            temp.next = null;
            this.size--;
        } else {
            this.head.remove(this.head, val);
        }
    }

    //根据索引修改
    public void replace(int index, T newVal) {
        if (this.isEmpty()) {
            return;
        }
        if (index < 0 || this.size <= index) {
            return;
        }
        this.foot = 0;
        this.head.replace(index, newVal);
    }

    //根据索引查找
    public T get(int index) {
        if (this.isEmpty()) {
            return null;
        }
        this.foot = 0;
        return this.head.get(index);
    }

    //是否包含
    public boolean contains(T data) {
        if (this.isEmpty()) {
            return false;
        }
        return this.head.contains(data);
    }


    //把链表打印出来，以 array 的形式
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        int length = this.size;
        Object[] list = new Object[length];
        for (int i = 0; i < length; i++) {
            list[i] = this.get(i);
        }
        return list;
    }
}
