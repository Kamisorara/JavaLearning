package _inside_class;

public class demo_OuterAndInner {
    public static void main(String[] args) {
        _Outer ou = new _Outer();
        ou.method();

//        ou.method();
        //创建内部类对象
        //因为无法直接访问内部类
        /*
        System.out.println("------------------------");
        _Outer.Inner oi = new _Outer().new Inner();
        oi.show();
        */
    }
}
