package _算法.leetcode;

public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        //题目开头给出的数组是升序的
        //取出根节点
        //本体要求高度平衡
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int low, int high) {
        //终止条件
        if (low > high) {
            return null;
        }
        //取数组中止，要注意防止溢出
        int mid = low + (high - low) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        //开始递归
        treeNode.left = dfs(nums, low, mid - 1);
        treeNode.right = dfs(nums, mid + 1, high);
        return treeNode;
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
