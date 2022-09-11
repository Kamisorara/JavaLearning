package 集合进阶;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class _Collection_Iterator {
    //集合的遍历，使用迭代器的方式
    //Iterator也是一个接口，   Iterator <E>   迭代器是通过集合的iterator方法返回的

    //E next() 返回迭代的下一个元素
    //boolean hasNext()  如果迭代具有更多元素，返回true

    public static void main(String[] args) {
        //在测试时先创建对象
        Collection<String> c = new ArrayList<>();
        //添加元素
        c.add("Hello");
        c.add("World");
        c.add("Java");
        //得到迭代器
        Iterator<String> it = c.iterator();
        //使用E next()返回
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        if (it.hasNext()) {   //不存在
//            System.out.println("存在");
//        } else {
//            System.out.println("不存在");
//        }
        //使用循环改进上述代码
        while (it.hasNext()) {
//            System.out.println(it.next());  //一般来说也不是这么使用 接下来介绍通用方法
            String s = it.next();
            System.out.println(s);
        }
    }
}
