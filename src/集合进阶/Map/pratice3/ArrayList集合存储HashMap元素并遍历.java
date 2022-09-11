package 集合进阶.Map.pratice3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayList集合存储HashMap元素并遍历 {
    public static void main(String[] args) {
        //ArrayList集合存储HashMap元素并遍历
        //首先创建Arraylist集合
        ArrayList<Map<String, String>> array = new ArrayList<>();
        //创建Hashmap对象
        Map<String, String> map1 = new HashMap<>();
        map1.put("张三", "001");
        map1.put("哈哈", "002");
        array.add(map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("法外狂徒", "003");
        map2.put("哈哈哈", "004");
        array.add(map2);
        Map<String, String> map3 = new HashMap<>();
        map3.put("Kamisora", "005");
        map3.put("哈哈哈哈", "006");
        array.add(map3);

        for (Map<String, String> arr:array){
            Set<String> strings = arr.keySet();
            for (String s:strings){
                String s1 = arr.get(s);
                System.out.println(s+"-----------"+s1);
            }
        }
    }
}
