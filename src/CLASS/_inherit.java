package CLASS;

public class _inherit {
    public static void main(String[] args) {
        //继承的基本格式
        //public class 子类名 extends 父类名 {}
        //只能进行单个继承

        {
            //super关键字  super 访问的是父类的成员变量
            //this访问的是本类的成员变量

            //继承中构造方法的特点
            /*
            子类中所有的构造方法默认都会去访问父类中的无参构造方法
             */

            /*
            继承中成员方法的访问特点
            子类继承父类的成员方法
            但是首先是子类从自己这里找方法
            然后子类再去父类的范围里找
            如果找不到就报错（不考虑父类的父类）
             */

        }
    }
}
