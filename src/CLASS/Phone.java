package CLASS;

public class Phone {
    //创建成员变量
    private String brand;
    //    int price;
    private int price;

    //使用了get/set 方法来使用  set用于设置，get用于获取值
    public void setPrice(int a) {   //开头是要大写的
        if (a < 0 || a > 100000) {
            System.out.println("您输入的信息有误");
        } else {
            price = a;

        }
    }

    public void setBrand(String brand) {
        this.brand = brand;

    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void call() {
        System.out.println("Call");
    }

    public void snedMeaaage() {
        System.out.println("sendMessage");
    }

}
