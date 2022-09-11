package _算法.基本排序算法;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 9, 4, 6, 2};
        test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int Max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[Max]) {
                    Max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[Max];
            arr[Max] = temp;
        }
    }
}
