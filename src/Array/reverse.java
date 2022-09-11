package Array;

public class reverse {
    public static void main(String[] args) {
        //反转数组常常使用双指针的的方式
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left, right, tmp;
        left = 0;
        right = arr.length - 1;
        while (left < right) {
            tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
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
