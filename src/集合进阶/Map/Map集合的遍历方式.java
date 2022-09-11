package 集合进阶.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map集合的遍历方式 {
    //Map集合的遍历(方式1)
    public static void main(String[] args) {
//        获取所有键的集合。用keySet()方法实现
        //遍历键的集合，获取到母一个键。用增强for实现根据键去找值。用get(Object key)方法实现

        //首先创建Map集合
//        Map<String, Integer> map = new HashMap<>();
//        map.put("zhangsan", 01);
//        map.put("fawaikuangtu", 02);

        //首先获取所有键的集合
//        Set<String> k = map.keySet();
//        for (String keyset : k) {
//            //根据键去找值
//            Integer i = map.get(keyset);
//            System.out.println(i);
//            //2
//            //1
//        }
        //Map集合的遍历(方式2)
        Map<String, Integer> map = new HashMap<>();
        map.put("zhangsan", 01);
        map.put("fawaikuangtu", 02);
        map.forEach((k, v) -> System.out.println(k + v));

        //获取所有键值对对象的集合
        Set<Map.Entry<String, Integer>> entryset = map.entrySet();
        for (Map.Entry<String, Integer> entries : entryset) {
            String key = entries.getKey();
            Integer value = entries.getValue();
            System.out.println("k---" + key + "---v---" + value);
        }
        //forEach方式

    }
}
