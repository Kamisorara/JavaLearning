package 集合进阶.Set._HashSet_pratice;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        //创建一个HashSet
        HashSet<Studentss> hashSet = new HashSet<>();
        Studentss st1 = new Studentss("张三", 10);
        Studentss st2 = new Studentss("法外狂徒", 10);
        Studentss st3 = new Studentss("法外狂徒", 10);

        hashSet.add(st1);
        hashSet.add(st2);
        hashSet.add(st3); //为了确保数据的唯一性，可以重写里面的方法  这样就确保了数据的唯一性

        //遍历
        for (Studentss s : hashSet) {
            System.out.println(s.getName() + s.getAge());
        }


    }


}
