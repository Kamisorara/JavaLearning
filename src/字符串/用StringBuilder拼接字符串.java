package 字符串;

public class 用StringBuilder拼接字符串 {
    //    public static void main(String[] args) {
//        //使用StringBuilder拼接字符串   以[1,2,3]这种方式返回
//        //先定义数组
//        int[] arr = {1, 2, 3};
//        //先创建Stringbuilder 对象
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < arr.length; i++) {
//            sb.append(arr[i]);
//
//        }
//        //最后将StringBuilder对象转换为为String
//        String s = sb.toString();
//        System.out.println(s);
//    }
    //通过构造方法
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrToString(arr);
        System.out.println("拼接后结果是:" + s);

    }

    public static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);

            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        //转换为String类
        String s = sb.toString();
        return s;
    }
}
