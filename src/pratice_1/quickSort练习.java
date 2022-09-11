package pratice_1;

public class quickSort练习 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 4, 9, 1};
        quickSort(arr, 0, arr.length - 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        //基准数k
        int k = arr[start];
        int low = start;
        int high = end;
        while (low < high) {
            while (k <= arr[high] && low < high) {
                high--;
            }
            arr[low] = arr[high]; //把最小的放前面
            while (k >= arr[low] && low < high) {
                low++;
            }
            arr[high] = arr[low]; //把最大的放后面
        }
        arr[high] = k;

        quickSort(arr, high + 1, end);
        quickSort(arr, start, high - 1);
    }
}
