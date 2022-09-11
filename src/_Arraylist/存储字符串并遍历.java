package _Arraylist;

import java.util.ArrayList;

public class 存储字符串并遍历 {
    public static void main(String[] args) {
        //实现实例，存储字符串并遍历
        //创建一个存储字符串的集合，存储3个字符串元素，使程序在集合中遍历，并且在字符串中输出
        ArrayList<String> array = new ArrayList<>();
        array.add("element1");
        array.add("element2");
        array.add("element3");
        //现在在集合中已经有三个元素了
//        getIndex(array);
        //遍历集合的通用格式
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }

    }

//    public static void getIndex(ArrayList<String> array) {
//        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
//        }
//    }


}
