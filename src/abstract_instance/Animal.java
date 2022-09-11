package abstract_instance;

public abstract class Animal {
    private String name;
    private int age;
    //一定要无参构造
    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //接下来是抽象构造
    public abstract void eat();
}
