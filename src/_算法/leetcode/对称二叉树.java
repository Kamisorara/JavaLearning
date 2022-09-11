package _算法.leetcode;

public class 对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root, root);
    }

    boolean dfs(TreeNode p, TreeNode q) {
        //第一种情况
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        //两棵子树镜像对称
        return p.val == q.val && dfs(p.left, q.right) && dfs(p.right, q.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
