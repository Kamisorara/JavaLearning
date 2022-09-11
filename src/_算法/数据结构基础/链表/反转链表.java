package _算法.数据结构基础.链表;

public class 反转链表 {

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

//1->3 ->5 ->7(head) ->9(head.next)转换为9->7 ->5->3 ->1
    public static Node reverse(Node head) {
        //递归终止条件
        if (head.next == null) {
            return head;
        }
        //新的头节点  就是reverse 回来的新的头节点
        Node newHead = reverse(head.next);   //递归先是到最深层，所以第一个头节点就是9所以head.next 就是9 而head就是7
        Node next = head.next;
        next.next = head;
        head.next = null; //这里其实写不写都无所谓，每一次指针都是要改变的，但是最后尾节点要指向null
        return newHead; //依次传新的头接节点
    }
}
