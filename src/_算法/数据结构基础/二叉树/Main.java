package _算法.数据结构基础.二叉树;

public class Main {
    public static void main(String[] args) {
        //创建根节点
        TreeNode<String> root = new TreeNode<>("A");
        root.left = new TreeNode<>("B");
        root.right = new TreeNode<>("E");
        root.left.left = new TreeNode<>("C");
        root.left.right = new TreeNode<>("D");
        root.right.right = new TreeNode<>("F");
//        test1(root);
//        test2(root);
        test3(root);

    }

    //前序遍历  使用递归的一种方式
    private static void test1(TreeNode<String> root) {
        if (root == null) { //递归终止条件
            return;
        }
        System.out.print(root.e);//进来就打印一个元素
        test1(root.left);
        test1(root.right);
    }

    //中序遍历
    private static void test2(TreeNode<String> root) {
        if (root == null) { //递归终止条件
            return;
        }
        test2(root.left);
        System.out.print(root.e);
        test2(root.right);
    }

    //后续遍历
    private static void test3(TreeNode<String> root) {
        if (root == null) { //递归终止条件
            return;
        }
        test3(root.left);
        test3(root.right);
        System.out.print(root.e);
    }
}
