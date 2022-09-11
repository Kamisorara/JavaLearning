package 集合进阶.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class _pratice_2 {
    public static void main(String[] args) {
        //分别使用ArrayList和LinkedList完成存储字符串并遍历
        ArrayList<String> array = new ArrayList<>();
        array.add("张三");
        array.add("法外狂徒");
        //1.使用迭代器
        Iterator<String> it1 = array.iterator();
        while (it1.hasNext()) {
            String s = it1.next();
            System.out.println(s);
        }
        System.out.println("--------------------------");
        //2.使用for
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        System.out.println("----------------------------");
        //3.增强for   这种是最方便的
        for (String s : array) {
            System.out.println(s);
        }
        //LinkedList的常用功能

        //public void addFirst(Ee)
        //在该列表开头插入指定的元素
        //public void addLast(E e)
        //将指定的元素追加到此列表的末尾
        //public E getFirst()
        //返回此列表中的第一个元素
        //public E getLast()
        //返回此列表中的最后一个元素
        //public E removeFirst()
        //从此列表中删除并返回第一个元素
        //public E removeLast()
        //从此列表中删除并返回最后一个元素
        System.out.println("---------------------------");
        //创建LinkedList
        LinkedList<String> link = new LinkedList<>();
        link.add("张三");
        link.add("法外狂徒");
        //1.使用迭代器
        Iterator<String> lt2 = link.iterator();
        while (lt2.hasNext()){
            String s2 = lt2.next();
            System.out.println(s2);
        }
        System.out.println("---------------------------");
        //2。使用for
        for (int i = 0;i<link.size();i++){
            String s = link.get(i);
            System.out.println(s);
        }
        System.out.println("----------------------------");
        //3.增强for
        for (String s :link){
            System.out.println(s);
        }
    }


}
