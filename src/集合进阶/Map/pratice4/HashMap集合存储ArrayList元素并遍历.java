package 集合进阶.Map.pratice4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap集合存储ArrayList元素并遍历 {
    //HashMap集合存储ArrayList元素并遍历
    //创建一个HashMap集合，存储三个键值对元素，每一个键值对元素的键是String，值是ArrayList每一个ArrayList的元素是String，并遍历
    public static void main(String[] args) {
        //首先创建HashMap集合
        Map<String, ArrayList<String>> map = new HashMap<>();

        //创建ArrayList 集合对象
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("张三");
        arr1.add("法外狂徒");
        map.put("浙江", arr1);


        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("哈哈哈");
        map.put("广州", arr2);

        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("浙江");
        map.put("江西", arr3);


        //接下来遍历Hashmap
        Set<String> strings = map.keySet();
        for (String s:strings){
            System.out.println(s);
            ArrayList<String> value = map.get(s);
            for (String i :value){
                System.out.println("ArrayList里面"+i);
            }
            System.out.println(s+"\t"+value);
        }

    }
}
