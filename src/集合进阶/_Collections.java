package 集合进阶;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _Collections {
    //Collection 类 针对集合进行操作   这个类里的方法是用都是静态修饰的
    //Collections类的概述
    //是针对集合操作的工具类
    //Collections类的常用方法
    //public static <T extends Comparable<? super T>> void sort(List<T> list):将指定的列表按升序排序
    //public static void reverse(List<?> list):反转指定列表中元素的顺序
    //public static void shuffle(List<?> list):使用默认的随机源随机排列指定的列表
    public static void main(String[] args) {
        //创建集合对象
        List<Integer> list = new ArrayList<>();

        //添加元素
        list.add(30);
        list.add(20);
        list.add(10);
        list.add(50);
        list.add(60);
        System.out.println(list);
        //1.
        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------");
        //2.
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("----------------------");
        //3.
        Collections.shuffle(list);
        System.out.println(list);


    }

}
