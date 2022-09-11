package _算法.动态规划;

public class _01背包问题 {
    /**
     * 动态规划实现01背包问题
     */
    static int[] w = {1, 3, 4, 5};
    static int[] v = {1, 4, 5, 7};
    static int totalWeight = 7;

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        /**
         * 0/1背包问题，这里创建的二维数组把0也包括在里面
         * 所以两个循环都从1开始，不把0算进去
         */
        int[][] arr = new int[w.length + 1][totalWeight + 1];
        //从1开始是为了把有0的一排也打印出来
        for (int i = 1; i <= w.length; i++) {
            for (int j = 1; j <= totalWeight; j++) {
                if (w[i - 1] <= j) { //如果当前的重量比现背包的重量还重，就不用算进去因为没有意义
                    //这里的w[i-1] 因为i 和 j 都是从1开始的，为了防止越界 之后写出状态转换方程
                    arr[i][j] = Math.max(arr[i - 1][j], arr[i - 1][j - w[i - 1]] + v[i - 1]); //写在前面的是上一排的最大的，比较两个谁更大
                } else {
                    arr[i][j] = arr[i - 1][j];
                }
            }
        }
        //输出这个二维数组
        for (int[] ints : arr) {
            for (int num : ints) {
                System.out.print(num + " ");
            }
            System.out.println(); //换行
        }
    }
}
