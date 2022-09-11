package _算法.基本排序算法;

public class 冒泡排序 {
    public static void main(String[] args) {
        //随便定义一个无序的数组
        int[] arr = {1, 5, 6, 7, 4, 3, 3, 5, 6, 6, 7, 7, 5, 4};
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
