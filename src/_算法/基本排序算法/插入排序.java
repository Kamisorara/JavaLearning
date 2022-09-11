package _算法.基本排序算法;

public class 插入排序 {

    public static void main(String[] args) {
        int[] arr = {1, 7, 5, 9, 4, 6, 2};
        test(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

}
