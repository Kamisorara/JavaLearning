package CLASS;

public class standard_class_test {
    public static void main(String[] args) {
        //下面介绍了两种方法
        //无参构造方法
        standard_class st1 = new standard_class();
        st1.setName("法外狂徒");
        st1.setNum(1000);
        st1.show();
        //有参构造
        standard_class st2 = new standard_class("法外狂徒", 1000);
        st2.show();

    }
}
