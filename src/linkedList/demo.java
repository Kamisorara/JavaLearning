package linkedList;

public class demo {
    public static void main(String[] args) {
        ListNode<String> listNode = new ListNode<>();
        listNode.add("张三");
        listNode.add("wyf");
        listNode.add("kamisora");
        System.out.println(listNode.size());
        System.out.println(listNode.get(1));
    }
}
