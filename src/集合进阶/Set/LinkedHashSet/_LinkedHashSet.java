package 集合进阶.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class _LinkedHashSet {
    //LinkedHashSet集合特点
    //哈希表和链表实现的Set接口，具有可预测的迭代次序
    //由链表保证元素有序，也就是说元素的存储和取出顺序是一致的由哈希表保证元素唯一，也就是说没有重复的元素
    public static void main(String[] args) {
        //创建对象
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("张三");
        lhs.add("法外狂徒");
        lhs.add("hahaha");
        lhs.add("哈哈哈哈哈");
        lhs.add("张三");

        for (String s : lhs) {
            System.out.println(lhs); //有唯一的顺序并且去重
        }
    }
}
