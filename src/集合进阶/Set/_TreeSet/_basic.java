package 集合进阶.Set._TreeSet;

import java.util.TreeSet;

public class _basic {
    //TreeSet集合  它是一个具体的类
    //元素有序，这里的顺序不是指存储和取出的顺序，而是按照一定的规则进行排序，具体排序方式取决于构造方法
    //TreeSet():根据其元素的自然排序进行排序
    //TreeSet(Comparator comparator):根据指定的比较器进行排序
    //它没有带索引的方法，所以不能使用普通的for循环遍历  但是可以使用迭代器和增强for进行遍历
    //由于是Set集合所以不包含重复的元素
    public static void main(String[] args) {
        //创建对象
        TreeSet<Integer> ts = new TreeSet<>();
        //添加元素
        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        ts.add(30);
        //遍历TreeSet
        for (Integer i : ts) {
            System.out.println(i);  //发现在输出的时候是有序的
        }
    }
}