package _inside_class;

public class _局部内部类 {
    //在方法里面定义一个类
    private int num = 10;

    public void show_method() {
        method();
    }

    public void method() {
        //局部内部类，在外界也是无法直接访问的
        class Inner {
            public void show() {
                System.out.println(num);
            }
        }
        //在method里面创建一个Inner对象
        Inner i = new Inner();
        i.show();
    }
}
