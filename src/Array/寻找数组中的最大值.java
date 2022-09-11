package Array;

public class 寻找数组中的最大值 {
    public static void main(String[] args) {
        //寻找数组中的最大值
        //定义数组
        //类似于选择排序的方式
        int Max = 0;
        int[] arr = {1, 3, 4, 5, 6, 7, 7, 5, 5, 4, 3};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[Max]) {
                Max = i;
            }
        }
        System.out.println("最大值是" + arr[Max] + "\n它的下标是" + Max);
    }
}
