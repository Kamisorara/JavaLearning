package 集合进阶.List;

import java.util.ArrayList;
import java.util.List;

public class _for {
    //列表的增强for 循环 增强for:简化数组和Collection集合的遍历
    public static void main(String[] args) {
        //创建list集合
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("123");
        list.add("123123");
        for (String s : list) {   //其实本质上也还是一个迭代器
            System.out.println(s);
        }
    }

}
