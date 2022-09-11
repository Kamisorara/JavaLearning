package 集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//ConcurrentModificationException:是一个runtimeException 并发修改异常
//迭代器遍历的过程中，通过集合对象修改了集合中元素的长度，造
//成了迭代器获取元素中判断预期修改值和实际修改值不一致


public class _List_Exception {
    public static void main(String[] args) {
        //创建一个一个
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
//        //遍历集合查看是否有"world"元素，如果没有就添加一个
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String s = it.next();
//            if (s.equals("World")) {
//                list.add("javaee");
//            }
//        }
//        System.out.println(list); //ConcurrentModificationException:是一个runtimeException 并发修改异常

        //通过for循环遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("World")) {
                list.add("Javaee");
            }
        }
        System.out.println(list); //[Hello, World, Javaee]
    }
}
