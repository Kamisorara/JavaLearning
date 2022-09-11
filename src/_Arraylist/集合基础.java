package _Arraylist;

import java.util.ArrayList;

public class 集合基础 {
    public static void main(String[] args) {
        //编程时候需要存储多个数据，使用长度固定的数组存储格式，不一定满足我们的要求，所以可以使用集合
        //集合类提供了一种空间可变存储类型，存储的数据容量可以发生改变  ArrayList就是其中一种
        //ArrayList<E>  这是一种 可调整大小的数组的实现  <E>是一种特殊的数据类型，泛型
        //E的类型可以使用数据类型替代 ArrayList<String> 或者Array<Student> 这里的Student对象类型


        //创建一个集合对象
        ArrayList<String> array = new ArrayList<>();
//        System.out.println(array.add("hello"));  //add 返回值是一个boolean类型，来判断有无添加成功
        array.add("hello");
        array.add("world");
        array.add("hhh");

        //输出结合
        System.out.println("array:" + array);  //没有元素就返回空[]

        //在集合中的指定位置出添加指定的元素
        array.add(3, "this is my world");  //注意了这里添加的位置不能超过这个索引值的最大值+1, 不然就会报错,索引不能越界
        System.out.println(array);
        System.out.println("-------------------------------------------");

        //ArrayList集合常用的方法
        ArrayList<String> array2 = new ArrayList<>();

        //1.删除指定元素public boolean remove(Object o)方法 返回boolean 是否删除成功
        //2public E remove(int index) 方法 删除指定索引处元素,返回被删除元素
        //3.public E set(int index ,E element) 修改指定索引处元素，返回修改的元素
        //4. public E get(int index ) 指定索引处元素
        //5. public int size() 返回集合中元素的格式 是一个int形式
        array2.add("元素1");
        array2.add("元素2");
        array2.add("element3");
        array2.add("element4");
        //method_1
        System.out.println("有指定删除元素会返回:"+array2.remove("元素1"));
        System.out.println("如果没有指定元素会返回:"+array.remove("元素3"));
        System.out.println(array2);
        //method_2
        System.out.println(array2.remove(0)); //注意删除的时候索引也千万不要越界
        System.out.println(array2);
        //method_3
        System.out.println(array2.set(0, "元素3"));
        System.out.println(array2);
        //method_4
        System.out.println(array2.get(1));
        //method_5
        System.out.println(array2.size());


    }
}
