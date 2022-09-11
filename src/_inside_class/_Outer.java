package _inside_class;

public class _Outer {
    private String name;
    private int num = 10;
    //外部类要访问内部类，就必须创建对象
    //一般来说内部类的修饰符是private
//    public class Inner {
//        public void show() {
//            System.out.println(num);
//        }
//
//    }
    private class Inner {
        public void show() {
            System.out.println(num);
        }

    }

    public void method(){
        Inner i = new Inner();
        i.show();
    }

}
