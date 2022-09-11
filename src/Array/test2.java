package Array;

public class test2 {
    public static void main(String[] args) {
        //比较两个数组的内容是否相同
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        func(arr1,arr2);
    }

    public static void func(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("不相同");
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            } else {
                System.out.println("不相同");
                break;
            }
        }
        System.out.println("相同");
    }
}
