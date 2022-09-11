package function;

public class 遍历数组 {
    public static void main(String[] args) {
        //遍历数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        arrAy(arr);
    }

    public static void arrAy(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");

    }
}
