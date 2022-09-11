package CLASS;

public class standard_class {
    //标准类的制作
    private String name;
    private int num;

    //构造方法
    public standard_class() {
    } //构造无参方法

    public standard_class(String name, int num) {
        this.name = name;
        this.num = num;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void show() {
        System.out.println(name + num);
    }
}
