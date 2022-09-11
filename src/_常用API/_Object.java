package _常用API;

public class _Object {


    //Object类 是 每个类的超类，所有的对象（包括数组）都实现了这个方法
    public static void main(String[] args) {
        //建议每个类都重写toSting()方法

        //Object 类里面的equals()方法默认比的是内存地址，也建议每次在创建类的时候在也重写这个方法，这样就可以确保覆盖到每个子类
        //在使用快捷重写的时候会生成两个，删掉第二个，就实现了对equals()方法的重写


    }
}
