package arithmetic_pratice;

public class pratice_2 {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        //先找出横着看和竖着看的最大值，也就是天际线的值
        /*
        输入： grid = [[3,0,8,4],[2,4,5,7],[9,2,6,3],[0,3,1,0]]

输出： 35

解释：

The grid is:

[ [3, 0, 8, 4],

  [2, 4, 5, 7],

  [9, 2, 6, 3],

  [0, 3, 1, 0] ]

从数组竖直方向（即顶部，底部）看“天际线”是：[9, 4, 8, 7]

从水平水平方向（即左侧，右侧）看“天际线”是：[8, 7, 9, 3]

在不影响天际线的情况下对建筑物进行增高后，新数组如下：

gridNew = [ [8, 4, 8, 7],

​ [7, 4, 7, 7],

​ [9, 4, 8, 7],

​ [3, 3, 3, 3] ]

作者：tong-zhu
链接：https://leetcode-cn.com/problems/max-increase-to-keep-city-skyline/solution/tong-ge-lai-shua-ti-la-807-bao-chi-cheng-60bm/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
         */
        int n = grid.length;
        //因为这个数组时nxn的
        //一共存储4个数
        int[] rowMax = new int[n];
        int[] colMax = new int[n];
        //找出每列每行的最大值 ,就是天际线
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        int ans = 0;
        //取最大值，但是又不能影响天际线，所以只能取行列中的最小值
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += Math.min(rowMax[i], colMax[j]) - grid[i][j];

            }
        }
        return ans;


    }
}
