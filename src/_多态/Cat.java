package _多态;

public class Cat extends Animal {
    //重写
    @Override  //标记
    public void eat() {
        System.out.println("Cat eat fish");
    }
}
