package 集合进阶;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream操作 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        //Stream操作
        list = list
                .stream() //获取流
                .filter(e -> !e.equals("B"))  //只允许有不是B的流水线
                .collect(Collectors.toList());//将流水线中的元素重新收集起来变为List
        System.out.println(list);
    }
}
