package 集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _introduce {
    //List集合
    //List是一个接口 继承自Collection接口
    //List集合有索引
    //最主要的是List集合允许重复

    public static void main(String[] args) {
        //创建对象
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");
        l.add("World");
        System.out.println(l);
        System.out.println("---------------------------");
        //因为List继承自Collection 所以List也可以使用迭代器
//        Iterator<String> it = l.iterator();
//        while (it.hasNext()) {
//            String s1 = it.next();
//            System.out.println(s1);
        //当然了也可以使用List特有的方式遍历
        //void add(int index,E element)
        //在此集合中的指定位置插
        //入指定的元素
        //E remove(int index)
        //删除指定索引处的元素，返回被删除的元素
        //E set(int index,E element)
        //修改指定索引处的元素，返回被修改的元素
        //E get(int index)
        //返回指定索引处的元素
        //和ArrayList里的类似
        l.add(1, "哈哈");
        l.remove(1);
        l.set(1, "哈哈哈");     //修改指定索引处元素
        System.out.println(l);


        //使用List有的方式遍历集合
        for (int i = 0; i < l.size(); i++) {
            String s = l.get(i);
            System.out.println(s);
        }
    }
}
