package 集合进阶.Set;

import java.util.HashSet;

public class _HashSet {
    public static void main(String[] args) {
        //HashSet存储字符串并遍历
        HashSet<String> hashset = new HashSet<>();
        hashset.add("张三");
        hashset.add("法外狂徒");
        hashset.add("啊哈哈哈");

        //用增强for 遍历
        for (String s : hashset) {
            System.out.println(s);  //输出的顺序不能保证一致

        }
    }
}