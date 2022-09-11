package 集合进阶.List.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class _ListIterator_demo {
    public static void main(String[] args) {
        //创建List集合
        List<String> list = new ArrayList<>();

        list.add("张三");
        list.add("法外狂徒");

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("张三")) {
                lit.add("Javaee");   //这里就不会出现ConcurrentModificationException
            }
        }
        System.out.println(list); //[张三, Javaee, 法外狂徒]
    }
}
