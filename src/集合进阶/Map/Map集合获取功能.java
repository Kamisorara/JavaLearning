package 集合进阶.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map集合获取功能 {
    //Map集合的获取功能
    //V get(Object key)
    //根据键获取值
    //Set<K> keySet()
    //获取所有键的集合
    //Collection<V> values(
    //获取所有值的集合
    //Set<Map.Entry<K,V> > entrySet()
    //获取所有键值对对象的集合

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("zhangsan", "01");//01
        map.put("fawakungtu", "02");
        map.put("hahaha", "03");
        //1.根据键获取值
        System.out.println(map.get("zhangsan"));//01
        System.out.println(map.get("张三"));//null
        //2.获取所有键的集合
//        System.out.println(map.keySet());//可以直接进行输出
//        Set<String> keyset = map.keySet();
//        for (String key : keyset) {
//            System.out.println(key);
//        }
        //3.获取所有值的集合
        Collection<String> values = map.values();
        for (String value:values){
            System.out.println(value);
        }

    }
}
