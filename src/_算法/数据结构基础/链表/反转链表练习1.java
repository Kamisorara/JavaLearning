package _算法.数据结构基础.链表;

import java.awt.*;

public class 反转链表练习1 {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);

        head = reverse(head);
        //打印
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    //首先，反转链表要使用递归的方式
    public static Node reverse(Node head) {
        //递归条件终止条件
        if (head.next == null) {
            return head;
        }
        Node newHead = reverse(head.next);
        Node next = head.next;
        next.next = head;
        head.next = null;
        return newHead;
    }
}
