package _常用API;

public class _Math {
    //里面的方法都是被静态修饰的，所以不需要创建对象就可以直接使用
    //执行数字运行的方法
    /*
    Math 常用的方法
    ceil (double a )返回一个大于或等于这个数的最大整数

    floor(double a )返回一个小于等于个数的最大整数
    round (double a )返回最接近这个数的值
    random()  这里的random返回的是[0.0,1.0) 1取不到

     */
    //别的常用方法应该是已经很熟悉的了
    public static void main(String[] args) {
        System.out.println(Math.abs(-88));
        System.out.println(Math.pow(2, 3)); // 这个返回的是一个double的类型
        System.out.println("----------------------------");
        System.out.println(Math.ceil(9.11)); //10.0
        System.out.println(Math.floor(9.11));//9.0
        System.out.println(Math.random());//0.7423890066938268  随机的
        System.out.println(Math.random()*100);//45.99255090680233
        //也可以强转为int类型
        System.out.println((int)(Math.random()*100));//83


    }
}
