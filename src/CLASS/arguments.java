package CLASS;

public class arguments {

    private String name;
    private int num;

    public arguments() {
        System.out.println("无参构造");
    } //系统默认无参构造

    public arguments(String name) {
        this.name = name;
        System.out.println("有参构造");

    }

    public void show() {
        System.out.println(name + num);
    }
}
