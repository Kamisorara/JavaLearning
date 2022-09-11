package _常用API;


import java.util.Arrays;

public class _Arrays {
    //常用的方法
    //toSting(int[] a ) 返回一个标准数组的形式
    //sort()排序方法
    //先定义一个数组
    public static void main(String[] args) {
        int[] arr = {1, 4, 65, 6, 5, 4, 5};
        System.out.println("排序前" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后" + Arrays.toString(arr));
        //Arrays 就是一个工具类
        //构造方法用private修饰

    }
}
