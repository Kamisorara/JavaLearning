package 集合进阶.Map.pratice5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class 统计字符串中每个字符出现的次数 {
    //统计字符串中每个字符出现的次数
    public static void main(String[] args) {
        //需求:键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
        //举例:键盘录入“aababcabcdabcde"
        //在控制台输出:“a(5)b(4)c(3)d(2)e(1)
        // 使用Map的知识"
        //创建HashMap


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String s = sc.nextLine();
        //创建集合 键是Character 值是Integer
        Map<Character, Integer> map = new HashMap<>();
        //遍历字符串得到每一个字符
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);

            Integer value = map.get(key);
            if (value == null) {
                //如果返回值是null:说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
                map.put(key, 1);
            } else {
                value++;
                map.put(key, value);
            }

        }
        //最后就是按照要求遍历集合遍历集合获取结果
        //按要求进行拼接
        StringBuilder sb = new StringBuilder();
        Set<Character> keys = map.keySet();
        for (Character i : keys) {
            Integer integer = map.get(i);
            sb.append(i).append("(").append(integer).append(")");
        }
        String s1 = sb.toString();
        System.out.println(s1);


    }
}
