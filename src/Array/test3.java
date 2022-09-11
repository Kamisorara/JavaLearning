package Array;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        //查找数组元素，即输入一个数字，返回返回该数字对应的索引
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要搜索的值:");
        int num = sc.nextInt();  //用户输入要查找的数
        int[] arr = {12, 53, 122, 6, 4, 7, 8, 4, 3, 5};
        int index = arrayIndex(num, arr);
        if (index != -1) {
            System.out.println("索引值是" + index);
        } else {
            System.out.println("找不到该数");
        }
    }

    public static int arrayIndex(int num, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                index = i;
            }
        }
        return index;
    }
}
