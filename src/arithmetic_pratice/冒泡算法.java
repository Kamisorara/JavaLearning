package arithmetic_pratice;

public class 冒泡算法 {
    //要实现冒泡排序
    //先定义一个数组
    public static void main(String[] args) {
        int tmp;
        int[] arr = {1, 5, 6, 778, 6, 243, 534, 5, 245, 34, 346};
        //然后就是按冒泡排序进行操作了
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //在排序完了之后再遍历一遍数组
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



