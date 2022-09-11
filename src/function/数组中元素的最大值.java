package function;

public class 数组中元素的最大值 {
    public static void main(String[] args) {
        //寻找数组中元素的最大值
        int[] arr = {234, 22, 6546, 123, 5, 46, 46, 234, 12, 123, 12, 3123, 2312};
        int a = findMax(arr);
        System.out.println("最大值是"+a);
    }

    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
    return max;
    }

}
