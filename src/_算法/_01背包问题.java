package _算法;

public class _01背包问题 {
    static int[] w = {2, 3, 4, 5};
    static int[] v = {3, 4, 5, 6};
    static int capacity = 8;

    /**
     * 回溯法,剪枝/
     */
    public static void main(String[] args) {
        System.out.println(test(0, 0));
    }

    static int test(int index, int weight) { //返回值是最佳重量
        //递归终止条件
        if (index >= 4) {
            return 0;
        }

        if (capacity < weight + w[index]) {
            return 0;
        }
        return Math.max(v[index] + test(index + 1, weight + w[index]), test(index + 1, weight));
    }
}
