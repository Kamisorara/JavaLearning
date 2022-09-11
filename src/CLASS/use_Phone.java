package CLASS;

public class use_Phone {
    public static void main(String[] args) {
        //引用同一个包内的类
        //创建对象
        Phone p = new Phone();
        //使用对象
        p.setBrand("Apple");
//        p.price = 1999;
        p.setPrice(5000);
        System.out.println(p.getBrand());  //使用成员变量
        System.out.println(p.getPrice());
//        System.out.println(p.price);
        p.call();   //使用成员方法
        p.snedMeaaage();  //使用成员方法


    }
}
