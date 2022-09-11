package 集合进阶.Map;

import java.util.HashMap;
import java.util.Map;

public class _basic {
    public static void main(String[] args) {
        //lnterface Map<K,V>K:键的类型;V:值的类型   因为它是一个接口不能直接实现，用多态的形式可以通过HashMap实现
        //将键映射到值的对象;不能包含重复的键;每个键可以映射到最多一个值
        //创建集合对象
        Map<String, String> map = new HashMap<>();
        //V put (K key, V value）将指定的值与该映射中的指定键相关联   这个操作进行添加元素
        map.put("张三", "01");
        map.put("法外狂徒", "02");   //键和值通过等于号拼接
        map.put("张三","03");  //键是有唯一性
        //输出集合对象
        System.out.println(map);
        //Map集合的基本功能
        //方法名
        //说明
        //V put(K key,V value)
        //添加元素
        //V remove(Object key)
        //根据键删除键值对元素
        //void clear)
        //移除所有的键值对元素
        //boolean containsKey(Object key)
        //判断集合是否包含指定的键
        //boolean containsValue(Object value)
        //判断集合是否包含指定的值
        //boolean isEmpty0
        //判断集合是否为空
        //int size(
        //集合的长度，也就是集合中键值对的个数
        System.out.println("----------------");
//        map.remove("张三");  //返回删除的键对应的值
//        System.out.println(map);
//        map.clear();
//        System.out.println(map); //就空了
        System.out.println(map.containsKey("张三"));
        System.out.println(map.containsValue("01"));
        System.out.println(map.size());//键值对的个数
        System.out.println(map.isEmpty());//判断集合是否为空

        //Map集合的获取功能
        //V get(Object key)
        //根据键获取值
        //Set<K> keySet()
        //获取所有键的集合
        //Collection<V> values(
        //获取所有值的集合
        //Set<Map.Entry<K,V> > entrySet()
        //获取所有键值对对象的集合
    }
}
