package 集合进阶.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _basic {
    public static void main(String[] args) {
        //Set集合  是一个没有重复的集合，它不带索引的方法，所以不能使用for 遍历
        //创建集合对象
        Set<String> set = new HashSet<>();   //HashSet在底层其实是由哈希表支持   不保证存储或取出的元素保持一致
        set.add("World");
        set.add("Hello");
        set.add("Hello");

        Set<Integer> sets = new HashSet<>();
        sets.add(1);
        System.out.println("Sfdasd"+sets.add(1));




        //遍历
        //1.迭代器
        Iterator<String>it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        //2.增强for
        for (String s:set){
            System.out.println(s);  //hashset对存储的顺序不保证
        }
    }
}
