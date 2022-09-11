package 集合进阶.Set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Work {
    //露求:
    //编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
    public static void main(String[] args) {
        //创建Set集合对象
//        Set<Integer> set = new HashSet<>();//如果这里不使用HashSet而改用TreeSet  那么出来的集合的顺序就会是有序的
        Set<Integer> set = new TreeSet<>();

        //创建随机数对象
        Random r = new Random();
        //首先判断集合长度
        while (set.size()<10){
            int num = r.nextInt(20) + 1;
            set.add(num);
        }
        //直接输出，或者遍历集合
        System.out.println(set);
        for (int i :set){
            System.out.println(i);
        }
    }
}