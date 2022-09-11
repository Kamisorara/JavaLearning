package 基本类型包装类;

public class 装箱与拆箱 {
    public static void main(String[] args) {
        //装箱就是指把基本数据类型转换为包装类类型
        //例如
        Integer i = Integer.valueOf(10);
        //还有一种方法叫自动装箱
        Integer ii = 100;   //现在推荐使用这种写法


        //拆箱：把包装类类型转换为基本数据类型
//        ii = ii.intValue() + 200;  //ii.intValue()这个叫做拆箱  当然这是一种手动拆箱
        ii += 200;   //这样叫做自动拆箱，同时又有自动装箱  相当于是调用了上面的方法 i = i + 200;i.+200自动拆箱; i = i + 200;是自动装箱
        System.out.println(ii);


        //接下来介绍一种情况
//        Integer iii = null; //Cannot invoke "java.lang.Integer.intValue()" because "iii" is null
//        iii+=100;
//        System.out.println(iii);//会报错
        //只要是一个对象建议先进行判断
        Integer iii = null;
        if (iii != null) {
            iii += 100;

        }
    }
}
