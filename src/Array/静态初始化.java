package Array;

public class 静态初始化 {
    public static void main(String[] args) {
        //静态初始化就是指定每个数组元素的初始值，由系统决定数组长度
        //格式:数据类型 []  变量名 = new 数据类型[] {数据1,数据2,数据3,......};
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(arr[6]);


        //当然还有一种简化的方式  推荐以这种方式进行创建数组
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};  //不用手动开辟内存空间，系统会自动分配
        System.out.println(arr2[0]);
        //任何数组都会出现一些问题，比如数组越界啥的
//        arr2 = null;
//        System.out.println(arr2[0]);// NullPointerException 空指针异常


    }
}
