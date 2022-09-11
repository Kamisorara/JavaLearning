package 字符串;

public class 拼接字符串 {
    public static void main(String[] args) {
        //定义一个字符串把int数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法并在控制台输出结果
        //定义一个数组
        int[] arr = {1, 2, 3};
        System.out.println("拼接之后的字符是" + arrToString(arr));


    }

    public static String arrToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i] + ",";
            }
        }
        s += "]";
        return s;

    }

}
