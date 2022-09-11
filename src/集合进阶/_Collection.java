package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合根接口Collection
 */
public class _Collection {
    //Collection集合 集合类的特点:提供一种存储空间可变的存储模型，存储的数据容量可以随时发生改变  主要作用就是用来存储和取出数据
    //Collection是单列集合  在单列集合中可以分为数据可重复的List集合，和数据不可重复的Set集合
    //Lst主要学习ArrayList 和LinkedList
    //Set主要学习HashSet和TreeSet
    //Map是双列集合  Map主要学习HashMap
    //当然了这里的Collection Map List Set 接口
    //再下面的才是实现类


    //Collection集合的概述 它是一个接口，如果要使用，是要进行导包的Interface Collection <E>  它没有直接的实现类,要通过Set 和List
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<String> c = new ArrayList<String>();
        //添加数据
        c.add("Hello");
        c.add("World");
        //输出集合对象
        System.out.println(c);//[Hello, World]  输出这样的形式，说明在arraylist中重写了toString方法
        //常用方法
        //boolean add(E e)
        //添加元素
        //boolean remove(Object o)
        //从集合中移除指定的元素
        //void clear()
        //清空集合中的元素
        //boolean contains(Object o)
        //判断集合中是否存在指定的元素
        //boolean isEmptyo
        //判断集合是否为空
        //int size()
        //集合的长度，也就是集合中元素的个数
        if (c.isEmpty()){
            System.out.println("不为空");
        }
        System.out.println(c.size());
        if (c.contains("Hello")){
            System.out.println("包含Hello");
        }
        c.clear();
        if (c.isEmpty()){
            System.out.println("不为空");
        }else {
            System.out.println("为空");
        }
        //调用add方法，返回值是true表示的是元素添加成功，所以add方法推荐直接使用
        System.out.println(c.remove("World"));  //因为上面已经清空过了，所以这里显示移除失败

    }
}
