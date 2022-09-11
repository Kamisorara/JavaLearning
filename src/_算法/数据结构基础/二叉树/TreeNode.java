package _算法.数据结构基础.二叉树;

/**
 * 设计一个二叉树的节点类
 * @param <E>
 */
public class TreeNode<E> {
    E e;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E e) {
        this.e = e;
    }
}
