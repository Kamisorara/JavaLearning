package _算法.基本排序算法;

public class 快速排序 {
    //递归分治  类似于双指针的方法
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        //设置递归终止条件
        if (start >= end) {
            return;
        }

        int k = arr[start]; //k作为基准数
        int low = start;
        int high = end;
        while (low < high) {  //从后往前，再从前往后
            while (k <= arr[high] && low < high) {
                high--;
            }
            arr[low] = arr[high];
            while (low < high && k >= arr[low]) {
                low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = k;  //最后当两个指针重合的时候，这时候基准数就在左右指针上面，因为这里反正都重合了，都一样!
        //最后用递归的方式来实现
        /**
         * 一个基准数进入正确的位置之后就不会再参与就会拆分成两份
         * 使用递归的方式继续进行拆分，然后再拆分，这样排序会更加有效率
         */
        quickSort(arr, start, high - 1);
        quickSort(arr, high + 1, end);
    }
}
