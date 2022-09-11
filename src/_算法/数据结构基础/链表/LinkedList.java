package _算法.数据结构基础.链表;

import _算法.数据结构基础.顺序表.AbstractList;

public class LinkedList<E> extends AbstractList<E> {
    //头节点
    private Node<E> head = new Node<>(null); //头届点什么什么都没有，所以填null
    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e, int index) {
        if (index > size) {                 //加入一个安全检查
            throw new IllegalArgumentException("非法插入的位置"); //抛出一个异常
        }
        Node<E> node = head;                //一开始什么都没有就是head
        Node<E> temp;                       //暂时存储后面一个节点的引用
        for (int i = 0; i < index; i++) {   //一直循环到index
            node = node.next;
        }
        temp = node.next;  //前驱节点后一个节点的引用
        //创建一个新的节点
        node.next = new Node<>(e);
        node.next.next = temp;              //这样就相当于已经插入了
        size++;
    }

    @Override   //根据索引删除
    public E remove(int index) {
        if (index > size - 1) {
            throw new IllegalArgumentException("非法插入位置");
        }
        Node<E> node = head, temp;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        temp = node.next;  //temp 就是被删除的元素
        node.next = node.next.next;  //直接略过中间的那个节点
        size--;
        return temp.e;
    }

    @Override
    public E remove(E element) {
        return null;
    }


    @Override
    public E get(int index) {
        if (index >= size) {  //位置是否合法
            throw new IndexOutOfBoundsException("无法访问，下标异常!");
        }
        Node<E> node = head.next; //从一个元素开始，第一个元素是head.next
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.e;
    }

    /**
     * 使用内部类的形式
     *
     * @param <E> 元素
     */
    private static class Node<E> {  //创建一个节点对象，如果需要添加元素，直接可以new一个新的节点对象出来
        private E e; //元素
        private Node<E> next;  //节点

        public Node(E e) {
            this.e = e;
        }
    }
    /**
     * 最后写完会发现，需要查找元素时，ArrayList会更快，而修改元素时LinkedList会更快
     */
}
