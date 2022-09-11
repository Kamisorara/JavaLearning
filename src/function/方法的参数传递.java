package function;

public class 方法的参数传递 {
    public static void main(String[] args) {
        //方法的参数传递
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] arrS) {   //对于引用类型的参数。形参的改变，影响实际参数的值
        arrS[0] = 10;
    }
}





