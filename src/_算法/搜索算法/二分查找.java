package _算法.搜索算法;

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};  //二分查找的数组一定要是有序的
        System.out.println(binarySearch(arr, 3));
    }

    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (num == arr[middle]) {
                return middle;
            }
            if (num > arr[middle]) {
                left = middle + 1;
            }
            if (num < arr[middle]) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
