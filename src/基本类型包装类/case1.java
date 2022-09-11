package 基本类型包装类;

import java.util.Arrays;

public class case1 {
    //字符串中数据排序
    //有一个字符串,"91 27 46 38 50"  程序最终输出的也是一个字符串类型的数据已经排列好的数据
    //首先定义一个字符串
    //把字符串中的数字存储到一个int 类型中的数组中
    //要得到字符串中的每一个数据，就要对字符串进行拆分
    //public String [] split(String regex)  这种存储的数组就是一个字符串的数据
    //还要通过进行parseInt()静态方法转换(String s)
    //对数组进行排序，最后通过StringBuilder 来实现结果
    //最后输出结果
    public static void main(String[] args) {
        String s1 = "91 27 46 38 50";
        String[] strArray = s1.split(" ");   //这样拆分后得到一个String Array数组

        //定义一个int 数组，把String[] 数组中的每一个元素存储到int[] 中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);   //直接赋值肯定不行，要转换为int 类型
        }
        //对数组进行排序
        Arrays.sort(arr);   //使用Arrays 这个工具类
        //最后采用StringBulider进行拼接
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(" ");
            }
        }
        //注意这样好了之后还是一个int类型的
        //最后还要将StringBuilder转换为String 类型
        String s = sb.toString();
        System.out.println("result:" + s);
    }
}
