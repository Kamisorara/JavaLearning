package _interface;

public class demo {
    //接口也是抽象的，不能直接实例化
    //参照多态的方式
    public static void main(String[] args) {
        jumpping j = new Cat();
        j.jump();
    }

}
