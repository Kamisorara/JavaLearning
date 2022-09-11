package CLASS;

public class arguments_test {
    public static void main(String[] args) {
        //创建对象
        arguments ar = new arguments("法外狂徒"); //默认有一个无参构造,你可以在里面传一个参数
        //调用类方法
        ar.show();
    }
}
/*
构造方法的注意事项
如果没有定义构造方法系统将默认给出一个无参构造方法
如果定义了构造方法，系统将不再提供默认的构造方法 这个时候你需要自己去构造
不管是否使用，最好都写一个无参构造方法
 */